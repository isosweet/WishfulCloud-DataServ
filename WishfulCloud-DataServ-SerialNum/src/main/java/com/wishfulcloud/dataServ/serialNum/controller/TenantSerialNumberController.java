package com.wishfulcloud.dataServ.serialNum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wishfulcloud.commons.model.ResponseResult;
import com.wishfulcloud.commons.valid.ValidationResult;
import com.wishfulcloud.commons.valid.ValidationUtils;
import com.wishfulcloud.dataServ.serialNum.entity.TenantSerialNumber;
import com.wishfulcloud.dataServ.serialNum.message.SerialNumMessage;
import com.wishfulcloud.dataServ.serialNum.service.TenantSerialNumberService;

@RestController
@RequestMapping("tenantSerialNumber")
public class TenantSerialNumberController {
	
	@Autowired
	private TenantSerialNumberService tenantSerialNumberService;
	
	/**
	 * 保存 租户的编号规则
	 * 
	 * @param tenantSerialNumber
	 * @return
	 * @throws Exception
	 */
	@PostMapping("saveTenantSerialNum")
	public ResponseResult saveTenantSerialNum(TenantSerialNumber tenantSerialNumber) throws Exception{
		
		ValidationResult validationResult = ValidationUtils.validateEntity(tenantSerialNumber);
		if (validationResult.isHasErrors()){
			return SerialNumMessage.buildResponseResult(true, "", "输入参数未校验通过", validationResult.getErrorMsg());
		}
		
		TenantSerialNumber tsn = tenantSerialNumberService.getTenantSerialNumberByTenantCode(tenantSerialNumber.getTenantCode());
		if (tsn != null){
			return SerialNumMessage.buildResponseResult(true, "", "一个租户编号只能有一种生成规则");
		}
		
		String tenantSerialNumberId = tenantSerialNumberService.saveTenantSerialNum(tenantSerialNumber);
		if (null == tenantSerialNumberId){
			return SerialNumMessage.buildResponseResultFail();
		}
		return SerialNumMessage.buildResponseResultSuccess(tenantSerialNumberId);
		
	}
	
}
