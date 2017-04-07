package com.wishfulcloud.dataServ.serialNum.mapper;

import org.apache.ibatis.annotations.Param;

import com.wishfulcloud.commons.persistent.CrudDao;
import com.wishfulcloud.dataServ.serialNum.entity.TenantSerialNumber;

public interface TenantSerialNumberMapper extends CrudDao<TenantSerialNumber>{
	
	/**
	 * 根据租户编号查询 
	 * 
	 * @param tenantCode
	 * @return
	 */
	TenantSerialNumber getTenantSerialNumberByTenantCode(@Param("tenantCode") String tenantCode);
	
}
