package com.wishfulcloud.dataServ.serialNum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wishfulcloud.commons.utils.IdGen;
import com.wishfulcloud.dataServ.serialNum.entity.SerialNumberCreateRule;
import com.wishfulcloud.dataServ.serialNum.entity.TenantSerialNumber;
import com.wishfulcloud.dataServ.serialNum.mapper.SerialNumberCreateRuleMapper;
import com.wishfulcloud.dataServ.serialNum.mapper.TenantSerialNumberMapper;

/**
 * 
 * 
 * @author wangxuezheng
 *
 */
@Service
@Transactional
public class SerialNumberService {
	
	@Autowired
	private SerialNumberCreateRuleMapper serialNumberCreateRuleMapper;
	@Autowired
	private TenantSerialNumberMapper tenantSerialNumberMapper;
	
	/**
	 * 保存 编号生成规则
	 * 
	 * @param rule
	 * @return  成功返回 id,失败返回 null
	 * @throws Exception
	 */
	public String createRule(SerialNumberCreateRule rule) throws Exception{
		
		String id = IdGen.uuid();
		rule.setId(id);
		
		boolean saveFlag = serialNumberCreateRuleMapper.insert(rule);
		
		if (saveFlag) return id;
		
		return null;
	}
	
	
	
}
