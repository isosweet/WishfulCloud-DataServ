package com.wishfulcloud.dataServ.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wishfulcloud.commons.model.ResponseResult;
import com.wishfulcloud.commons.valid.ValidationResult;
import com.wishfulcloud.commons.valid.ValidationUtils;
import com.wishfulcloud.dataServ.admin.entity.Menu;
import com.wishfulcloud.dataServ.admin.message.AdminResultMessage;
import com.wishfulcloud.dataServ.admin.service.MenuService;

@RestController
@RequestMapping("menu")
public class MenuController {
	
	@Autowired
	private MenuService menuService;
	
	@PostMapping("saveMenu")
	public ResponseResult saveMenu(Menu menu) throws Exception{
		
		ValidationResult validResult = ValidationUtils.validateEntity(menu);
		if (validResult.isHasErrors()){
			return AdminResultMessage.buildResponseResult(true, "-1", validResult.getErrorMsg());
		}
		
		String id = menuService.saveMenu(menu);
		if (null == id){
			
		}
		
		return AdminResultMessage.buildResponseResultSuccess(id);
		
	}
	
}
