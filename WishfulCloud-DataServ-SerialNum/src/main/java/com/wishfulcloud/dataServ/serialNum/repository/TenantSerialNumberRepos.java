package com.wishfulcloud.dataServ.serialNum.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wishfulcloud.commons.persistent.CrudDao;
import com.wishfulcloud.dataServ.serialNum.entity.TenantSerialNumber;
import com.wishfulcloud.dataServ.serialNum.mapper.TenantSerialNumberMapper;

/**   
 * @Title: 
 * @Description: 
 * @author wangxuezheng
 * @date 2017年4月7日 下午5:23:55
 * @version V1.0   
 *
 */
@Repository
public class TenantSerialNumberRepos implements CrudDao<TenantSerialNumber>{

	@Autowired
	private TenantSerialNumberMapper mapper;
	
	/**
	 * 根据租户编号查询 
	 * 
	 * @param tenantCode
	 * @return
	 */
	public TenantSerialNumber getTenantSerialNumberByTenantCode(String tenantCode){
		
		TenantSerialNumber entity = mapper.getTenantSerialNumberByTenantCode(tenantCode);
		
		return entity;
	}
	
	@Override
	public boolean insert(TenantSerialNumber entity) throws Exception {
		
		boolean flag = mapper.insert(entity);
		
		return flag;
	}

	@Override
	public boolean update(TenantSerialNumber entity) throws Exception {
		
		boolean flag = mapper.update(entity);
		
		return flag;
	}

	@Override
	public TenantSerialNumber getById(String id) throws Exception {
		
		TenantSerialNumber entity = mapper.getById(id);
		
		return entity;
	}

	@Override
	public boolean logicDelete(String id) throws Exception {
		
		boolean flag = mapper.logicDelete(id);
		
		return flag;
	}

	@Override
	public boolean delete(String id) throws Exception {
		
		boolean flag = mapper.delete(id);
		
		return flag;
	}

	@Override
	public long totalCount() throws Exception {
		
		long count = mapper.totalCount();
		
		return count;
	}
	
	
	
	
}
