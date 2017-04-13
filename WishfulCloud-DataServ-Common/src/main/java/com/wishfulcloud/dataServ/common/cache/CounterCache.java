package com.wishfulcloud.dataServ.common.cache;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.wishfulcloud.commons.persistent.CacheDao;
import com.wishfulcloud.dataServ.common.entity.Counter;

/**   
 * @Title: 
 * @Description: 
 * @author wangxuezheng
 * @date 2017年4月13日 上午10:19:34
 * @version V1.0   
 *
 */
@Component
public class CounterCache implements CacheDao<Counter>{
	
	@Autowired
	private RedisTemplate<Object, Object> redisTemplate;

	
	@Override
	public Boolean saveOrUpdate(Counter entity, String id, int seconds) {
		String key  = entity.getClass().getSimpleName().toLowerCase() + ":" + id;
		redisTemplate.opsForSet().add(key, entity);
		redisTemplate.expire(key, seconds, TimeUnit.SECONDS);
		return null;
	}

	@Override
	public Counter getById(Class<Counter> clazz, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteEntity(Class<Counter> clazz, String id) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}
