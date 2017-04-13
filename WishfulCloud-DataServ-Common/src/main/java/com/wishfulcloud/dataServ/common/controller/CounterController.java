package com.wishfulcloud.dataServ.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wishfulcloud.dataServ.common.entity.Counter;
import com.wishfulcloud.dataServ.common.service.CounterService;

/**   
 * @Title: 
 * @Description: 
 * @author wangxuezheng
 * @date 2017年4月13日 上午10:43:53
 * @version V1.0   
 *
 */
@RestController
@RequestMapping("counter")
public class CounterController {
	
	@Autowired
	private CounterService serv;
	
	@PostMapping("saveCounter")
	public String saveCounter(Counter counter) throws Exception{
		serv.saveCounter(counter);
		return "ok";
	}
	
}
