package com.wishfulcloud.dataServ.serialNum.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wishfulcloud.commons.model.ResponseResult;
import com.wishfulcloud.dataServ.serialNum.message.SerialNumMessage;

/**   
 * @Title: 
 * @Description:  生成编号规则
 * @author wangxuezheng
 * @date 2017年4月7日 下午5:23:55
 * @version V1.0   
 *
 */
@RestController
@RequestMapping("serialNumber")
public class SerialNumberController {
	
	
	/**
	 * 生成一个编号
	 * 
	 * @param tenantCode 租户编号 (一对一)
	 * @return
	 */
	public ResponseResult genSerialNumber(String tenantCode){
		
		
		
		return SerialNumMessage.buildResponseResultSuccess();
	}
	
	
}
