package com.wishfulcloud.dataServ.serialNum.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wishfulcloud.commons.model.ResponseResult;
import com.wishfulcloud.commons.utils.DateUtils;
import com.wishfulcloud.dataServ.serialNum.entity.SerialNumberCreateRule;
import com.wishfulcloud.dataServ.serialNum.entity.TenantSerialNumber;
import com.wishfulcloud.dataServ.serialNum.repository.SerialNumberCreateRuleRepos;
import com.wishfulcloud.dataServ.serialNum.repository.TenantSerialNumberRepos;

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
	private TenantSerialNumberRepos tenantSerialNumberRepos;
	@Autowired
	private SerialNumberCreateRuleRepos serialNumberCreateRuleRepos;
	
//	public ResponseResult genSerialNumber(String tenantCode) throws Exception{
//		
//		//
//		TenantSerialNumber tenantSerialNumber = tenantSerialNumberRepos.getTenantSerialNumberByTenantCode(tenantCode);
//		if (tenantSerialNumber == null){
//			
//		}
//		
//		// 
//		SerialNumberCreateRule serialNumberCreateRule = serialNumberCreateRuleRepos.getById(tenantSerialNumber.getRuleId());
//		
//		
//	}
//	
//	
//	
//	private String incrementSerialNumber(){
//		
//	}
//	
//	
//	
//	
//	private String[] generateMode(SerialNumberCreateRule serialNumberRule, String tenantId, String text){
//
//		String[] mode = null;
//		switch (serialNumberRule.getCreateType()) {
//		case 1: // 时间戳
//			mode = new String[1];
//			mode[0] = String.valueOf(new Date().getTime());
//			break;
//		case 2: // 年度+序号
//			mode = new String[2];
//			mode[0] = DateUtils.getDate("yyyy"); // 年度
//			mode[1] = getCountCalcDetail(tenantId, serialNumberRule.getDigits(), serialNumberRule.getNumberStart()); // 序号
//			break;
//		case 3: // 年度+月度+序号
//			mode = new String[3];
//			mode[0] = DateUtils.getDate("yyyy"); // 年度
//			mode[1] = DateUtils.getDate("MM"); // 月度
//			mode[2] = getCountCalcDetail(tenantId, serialNumberRule.getDigits(), serialNumberRule.getNumberStart()); // 序号
//			break;
//		case 4: // 年度+月度+日+序号
//			mode = new String[4];
//			mode[0] = DateUtils.getDate("yyyy"); // 年度
//			mode[1] = DateUtils.getDate("MM"); // 月度
//			mode[2] = DateUtils.getDate("dd"); // 日
//			mode[3] = getCountCalcDetail(tenantId, serialNumberRule.getDigits(), serialNumberRule.getNumberStart()); // 序号
//			break;
//		case 5: // 时间戳+序号
//			mode = new String[2];
//			mode[0] = String.valueOf(new Date().getTime()); // 时间戳
//			mode[1] = getCountCalcDetail(tenantId, serialNumberRule.getDigits(), serialNumberRule.getNumberStart()); // 序号
//			break;
//		case 6: // 文本（传入）+序号
//			mode = new String[2];
//			mode[0] = text; // 文本（传入）
//			mode[1] = getCountCalcDetail(tenantId, serialNumberRule.getDigits(), serialNumberRule.getNumberStart()); // 序号
//			
//			break;
//		case 0: // 自增长序号
//			mode = new String[1];
//			mode[0] = getCountCalcDetail(tenantId, serialNumberRule.getDigits(), serialNumberRule.getNumberStart()); // 序号
//			break;
//
//		default:
//			break;
//		}
//		
//		return mode;
//	}
//	
	
	
	
	
	
	
	
	
	
	
}
