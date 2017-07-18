package cn.guwei.bos.web.action.user;


import java.util.concurrent.TimeUnit;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.interceptor.annotations.InputConfig;

import cn.guwei.bos.domain.user.User;
import cn.guwei.bos.service.facede.FacedeService;
import cn.guwei.bos.utils.RandStringUtil;
import cn.guwei.bos.web.action.BaseAction;
import redis.clients.jedis.Jedis;
@Controller("userAction")
@Scope("prototype")
@Namespace("/user")
@ParentPackage("mavenbos")
public class UserAction extends BaseAction<User> {

	

	@Action(value="validateCodeAjax",results={@Result(name="validateCode",type="json")})
	public String validateCodeAjax(){
		String inputcode = getParameter("checkcode");
		String sessioncode = (String) getSessionAttribute("key");
		if (inputcode.equalsIgnoreCase(sessioncode)) {
			push(true);
		} else {
			push(false);
		}
		return "validateCode";
	}
	
	@Action(value="login",results={@Result(name="login_success",type="redirect",location="/index.jsp"),
									@Result(name="login_fail",location="/login.jsp"),
									@Result(name="login_exception",location="/login.jsp")})
	@InputConfig(methodName="login",resultName="login_input")
	public String login(){
		String inputcode = getParameter("checkcode");
		String sessioncode = (String) getSessionAttribute("key");
		if (StringUtils.isNotBlank(inputcode) && inputcode.equalsIgnoreCase(sessioncode)) {
			removeSessionAttribute("key");
			User exitUser = facedeService.getUserService().findUserByEmailAndPassword(model.getEmail(), model.getPassword());
			if (exitUser==null) {
				addActionError(this.getText("login.emailorpassword.error"));
				return "login_fail";
			} else {
				setSessionAttribute("loginUser", exitUser);
				return "login_success";
			}
		} else {
             addActionError(this.getText("login.exception"));
             return "login_exception";
		}
	}
	
	@Action(value="loginOut",results={@Result(name="loginout",type="redirect",location="/login.jsp")})
	public String loginOut(){
		removeSessionAttribute("loginUser");
		
		return "loginout";
	}
	
	
	@Action(value="sendSmsAjax",results={@Result(name="sendSms",type="json")})
	public String sendSmsAjax(){
		try {
			final String code = RandStringUtil.getCode();
			final String tel = model.getTelephone();
			//把验证码放入redis
			redisTemplate.opsForValue().set(tel, code, 1200000, TimeUnit.SECONDS);
			System.out.println(code+"------"+tel);
			//把验证码放入消息队列
			jmsQueueTemplate.send("bos_sms", new MessageCreator() {
				
				@Override
				public Message createMessage(Session session) throws JMSException {
					MapMessage message = session.createMapMessage();
					message.setString("telephone", tel);
					message.setString("code", code);
					return message;
				}
			});
			push(true);
			
		} catch (JmsException e) {
			e.printStackTrace();
			push(false);
		}
		return "sendSms";
	}
	
	@Action(value="tocheckCode",results={@Result(name="tocheckCode",type="json")})
	public String tocheckCode(){
		System.out.println("into----Ajax");
		
		String tel = getParameter("telephone");
		
		User user = facedeService.getUserService().findUserByTelephone(tel);
		if (user==null) {
			System.out.println("user没找到");
			push(false);
		} else {
			String reidscode = redisTemplate.opsForValue().get(tel);
			//Jedis jedis = new Jedis("localhost",6379);  不能new，要使用同一个对象模板
			//System.out.println(jedis);
			//System.out.println(tel);
			//String reidscode = jedis.get(tel);
			//System.out.println(reidscode);
			String code = getParameter("checkcode");
			//System.out.println(code);
			if (StringUtils.isNotBlank(reidscode)) {
				if (reidscode.equals(code)) {
					push(true);
					//jedis.del(code);
					redisTemplate.delete(tel);
				} else {
					push(false);
					System.out.println("验证码不相等");
				}
			} else {
				push(false);
				System.out.println("code过期");
			}
		}
		return "tocheckCode";
	}
	
	
	@Action(value="updatePwd",results={@Result(name="updatePwd",type="json")})
	public String updatePwd(){
			try {
				facedeService.getUserService().updatePassword(model.getTelephone(),model.getPassword());
				push(true);
				System.out.println("修改成功");
			} catch (Exception e) {
				push(false);
				e.printStackTrace();
			}
		return "updatePwd";
	}
	
	@Action(value="editPwd",results={@Result(name="editPwd",type="json")})
	public String editPwd(){
			try {
				User user = (User)getSessionAttribute("loginUser");
				facedeService.getUserService().editPassword(user.getEmail(),model.getPassword());
				push(true);
				System.out.println("修改成功");
			} catch (Exception e) {
				push(false);
				e.printStackTrace();
			}
		return "editPwd";
	}
	
}
