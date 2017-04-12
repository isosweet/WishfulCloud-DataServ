package com.wishfulcloud.dataServ.serialNum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wishfulcloud.commons.utils.IdGen;
import com.wishfulcloud.dataServ.serialNum.entity.SerialNumberCreateRule;
import com.wishfulcloud.dataServ.serialNum.repository.SerialNumberCreateRuleRepos;

/**   
 * @Title: 
 * @Description: 编号生成规则
 * @author wangxuezheng
 * @date 2017年4月12日 下午4:35:41
 * @version V1.0   
 *
 */
@Service
@Transactional
public class SerialNumberCreateRuleService {
	
	@Autowired
	private SerialNumberCreateRuleRepos repos;;
	
	
	/**
	 * 保存 编号生成规则
	 * 
	 * @param rule
	 * @return  成功返回 id,失败返回 null
	 * @throws Exception
	 */
	public String saveSerialNumberCreateRule(SerialNumberCreateRule rule) throws Exception{
		
		String id = IdGen.uuid();
		rule.setId(id);
		
		boolean saveFlag = repos.insert(rule);
		
		if (saveFlag) return id;
		
		return null;
	}
	
	
	
	
	
}
