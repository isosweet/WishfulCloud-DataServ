package com.wishfulcloud.dataServ.serialNum.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wishfulcloud.commons.persistent.CrudDao;
import com.wishfulcloud.dataServ.serialNum.entity.SerialNumberCreateRule;
import com.wishfulcloud.dataServ.serialNum.mapper.SerialNumberCreateRuleMapper;

/**   
 * @Title: 
 * @Description: 编号生成规则
 * @author wangxuezheng
 * @date 2017年4月12日 下午4:36:21
 * @version V1.0   
 *
 */
@Repository
public class SerialNumberCreateRuleRepos implements CrudDao<SerialNumberCreateRule>{

	@Autowired
	private SerialNumberCreateRuleMapper mapper;

	
	@Override
	public boolean insert(SerialNumberCreateRule entity) throws Exception {
		return mapper.insert(entity);
	}

	@Override
	public boolean update(SerialNumberCreateRule entity) throws Exception {
		return mapper.update(entity);
	}

	@Override
	public SerialNumberCreateRule getById(String id) throws Exception {
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
