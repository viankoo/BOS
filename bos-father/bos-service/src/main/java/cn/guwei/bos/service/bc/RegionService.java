package cn.guwei.bos.service.bc;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;

import cn.guwei.bos.domain.bc.Region;

public interface RegionService {

	void save(List<Region> regions);

	Page<Region> findAll(PageRequest pageable);

	Region findRegionById(String id);

	Region findRegionByPostcode(String postcode);

	void add(Region model);

	Page<Region> findAll(PageRequest pageRequest, Specification<Region> spec);

	List<Region> findAll(String q);

	List<Region> findAll();

	String pageQueryByRedis(PageRequest pageRequest, Specification<Region> spec);

}
