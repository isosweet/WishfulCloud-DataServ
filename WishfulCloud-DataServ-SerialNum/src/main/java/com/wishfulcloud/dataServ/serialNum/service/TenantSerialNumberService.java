package com.wishfulcloud.dataServ.serialNum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wishfulcloud.commons.model.ResponseResult;
import com.wishfulcloud.commons.utils.IdGen;
import com.wishfulcloud.dataServ.serialNum.entity.TenantSerialNumber;
import com.wishfulcloud.dataServ.serialNum.message.SerialNumMessage;
import com.wishfulcloud.dataServ.serialNum.repository.TenantSerialNumberRepos;

@Service
@Transactional
public class TenantSerialNumberService {
	
	@Autowired
	private TenantSerialNumberRepos tenantSerialNumberRepos;
	
	/**
	 * 根据租户编号查询 
	 * 
	 * @param tenantCode
	 * @return
	 */
	public TenantSerialNumber getTenantSerialNumberByTenantCode(String tenantCode){
		return tenantSerialNumberRepos.getTenantSerialNumberByTenantCode(tenantCode);
	}
	
	
	/**
	 * 保存 租户的编号规则
	 * 
	 * @param tenantSerialNumber
	 * @return 成功返回 id,失败返回 null
	 * @throws Exception
	 */
	public ResponseResult saveTenantSerialNum(TenantSerialNumber tenantSerialNumber) throws Exception{
		
		// 一个租户只能对应一个编号规则
		TenantSerialNumber tsn = tenantSerialNumberRepos.getTenantSerialNumberByTenantCode(tenantSerialNumber.getTenantCode());
		if (tsn != null){
			return SerialNumMessage.buildResponseResult(true, "", "一个租户只能对应一个编号规则");
		}
		
		// 编号规则是否存在
		// TODO
		
		String id = IdGen.uuid();
		tenantSerialNumber.setId(id);
		
		boolean saveFlag = tenantSerialNumberRepos.insert(tenantSerialNumber);
		
		if (saveFlag) return SerialNumMessage.buildResponseResultFail();
		
		return SerialNumMessage.buildResponseResultSuccess(id);
	}
	
	
}
