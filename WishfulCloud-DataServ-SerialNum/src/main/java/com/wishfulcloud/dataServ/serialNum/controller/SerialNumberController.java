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
import com.wishfulcloud.dataServ.serialNum.service.SerialNumberService;

@RestController
@RequestMapping("serialNumber")
public class SerialNumberController {
	
	@Autowired
	private SerialNumberService  serialNumberService;
	
	@PostMapping("createRule")
	public ResponseResult createRule(SerialNumberCreateRule rule) throws Exception{
		
		ValidationResult validationResult = ValidationUtils.validateEntity(rule);
		if (validationResult.isHasErrors()){
			return SerialNumMessage.buildResponseResult(true, "", "", validationResult.getErrorMsg());
		}
		
		String ruleId = serialNumberService.createRule(rule);
		if (null == ruleId){
			return SerialNumMessage.buildResponseResultFail();
		}
		return SerialNumMessage.buildResponseResultSuccess(ruleId);
	}
	
	
}
