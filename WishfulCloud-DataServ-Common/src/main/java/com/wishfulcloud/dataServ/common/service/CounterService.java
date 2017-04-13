package com.wishfulcloud.dataServ.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wishfulcloud.commons.utils.IdGen;
import com.wishfulcloud.dataServ.common.entity.Counter;
import com.wishfulcloud.dataServ.common.repository.CounterRepos;

/**   
 * @Title: 
 * @Description: 
 * @author wangxuezheng
 * @date 2017年4月13日 上午10:41:11
 * @version V1.0   
 *
 */
@Service
public class CounterService {
	
	@Autowired
	private CounterRepos counterRepos;
	
	public String saveCounter(Counter counter) throws Exception{
		
		String id = IdGen.uuid();
		counter.setId(id);
		counterRepos.insert(counter);
		return id;
	}
	
	
}
