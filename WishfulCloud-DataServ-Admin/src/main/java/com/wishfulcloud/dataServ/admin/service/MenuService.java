package com.wishfulcloud.dataServ.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wishfulcloud.commons.utils.IdGen;
import com.wishfulcloud.dataServ.admin.entity.Menu;
import com.wishfulcloud.dataServ.admin.mapper.MenuMapper;

@Service
@Transactional
public class MenuService {
	
	@Autowired
	private MenuMapper menuMapper;
	
	public String saveMenu(Menu menu) throws Exception{
		
		String id = IdGen.uuid();
				
		menu.setId(id);
		
		boolean saveFlag = menuMapper.insert(menu);
		
		System.out.println("---------save menu------------->" + saveFlag);
		
		return id;
	}
	
}