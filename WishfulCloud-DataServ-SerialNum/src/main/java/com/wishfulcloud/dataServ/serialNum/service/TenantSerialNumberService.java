package com.wishfulcloud.dataServ.serialNum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wishfulcloud.commons.utils.IdGen;
import com.wishfulcloud.dataServ.serialNum.entity.TenantSerialNumber;
import com.wishfulcloud.dataServ.serialNum.mapper.TenantSerialNumberMapper;

@Service
@Transactional
public class TenantSerialNumberService {
	
	@Autowired
	private TenantSerialNumberMapper tenantSerialNumberMapper;
	
	/**
	 * 根据租户编号查询 
	 * 
	 * @param tenantCode
	 * @return
	 */
	public TenantSerialNumber getTenantSerialNumberByTenantCode(String tenantCode){
		return tenantSerialNumberMapper.getTenantSerialNumberByTenantCode(tenantCode);
	}
	
	
	/**
	 * 保存 租户的编号规则
	 * 
	 * @param tenantSerialNumber
	 * @return 成功返回 id,失败返回 null
	 * @throws Exception
	 */
	public String saveTenantSerialNum(TenantSerialNumber tenantSerialNumber) throws Exception{
		
		String id = IdGen.uuid();
		tenantSerialNumber.setId(id);
		
		boolean saveFlag = tenantSerialNumberMapper.insert(tenantSerialNumber);
		
		if (saveFlag) return id;
		
		return null;
	}
	
	
}
