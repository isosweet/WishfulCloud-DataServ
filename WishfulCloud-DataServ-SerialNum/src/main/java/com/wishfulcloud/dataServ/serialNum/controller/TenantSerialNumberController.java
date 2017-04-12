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

/**   
 * @Title: 
 * @Description:  租户的编号规则
 * @author wangxuezheng
 * @date 2017年4月7日 下午5:23:55
 * @version V1.0   
 *
 */
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

		return tenantSerialNumberService.saveTenantSerialNum(tenantSerialNumber);
	}
	
}
