package com.wishfulcloud.dataServ.common.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wishfulcloud.commons.persistent.CrudDao;
import com.wishfulcloud.dataServ.common.cache.CounterCache;
import com.wishfulcloud.dataServ.common.entity.Counter;
import com.wishfulcloud.dataServ.common.mapper.CounterMapper;

/**   
 * @Title: 
 * @Description: 
 * @author wangxuezheng
 * @date 2017年4月13日 上午9:33:44
 * @version V1.0   
 *
 */
@Repository
public class CounterRepos implements CrudDao<Counter>{

	@Autowired
	private CounterMapper mapper;
	@Autowired
	private CounterCache chache;
	
	@Override
	public boolean insert(Counter entity) throws Exception {
		
		boolean booFlag = mapper.insert(entity);
		if (booFlag){
			chache.saveOrUpdate(entity, entity.getId(), 20000);
		}
		
		return booFlag;
	}

	@Override
	public boolean update(Counter entity) throws Exception {
		return mapper.update(entity);
	}

	@Override
	public Counter getById(String id) throws Exception {
		return mapper.getById(id);
	}

	@Override
	public boolean logicDelete(String id) throws Exception {
		return mapper.logicDelete(id);
	}

	@Override
	public boolean delete(String id) throws Exception {
		return mapper.delete(id);
	}

	@Override
	public long totalCount() throws Exception {
		return mapper.totalCount();
	}

}
