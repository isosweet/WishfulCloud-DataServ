package com.wishfulcloud.dataServ.serialNum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wishfulcloud.commons.model.ResponseResult;
import com.wishfulcloud.commons.valid.ValidationResult;
import com.wishfulcloud.commons.valid.ValidationUtils;
import com.wishfulcloud.dataServ.serialNum.entity.SerialNumberCreateRule;
import com.wishfulcloud.dataServ.serialNum.message.SerialNumMessage;
import com.wishfulcloud.dataServ.serialNum.service.SerialNumberCreateRuleService;

/**   
 * @Title: 
 * @Description: 编号生成规则
 * @author wangxuezheng
 * @date 2017年4月12日 下午4:31:44
 * @version V1.0   
 *
 */
@RestController
@RequestMapping("serialNumberCreateRule")
public class SerialNumberCreateRuleController {
	
	@Autowired
	private SerialNumberCreateRuleService serv;
	
	@PostMapping("saveSerialNumberCreateRule")
	public ResponseResult saveSerialNumberCreateRule(SerialNumberCreateRule rule) throws Exception{
		
		ValidationResult validationResult = ValidationUtils.validateEntity(rule);
		if (validationResult.isHasErrors()){
			return SerialNumMessage.buildResponseResult(true, "", "", validationResult.getErrorMsg());
		}
		
		String ruleId = serv.saveSerialNumberCreateRule(rule);
		if (null == ruleId){
			return SerialNumMessage.buildResponseResultFail();
		}
		return SerialNumMessage.buildResponseResultSuccess(ruleId);
	}
	
}
