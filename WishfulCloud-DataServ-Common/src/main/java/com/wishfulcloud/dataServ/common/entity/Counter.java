package com.wishfulcloud.dataServ.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Model class of 计数器.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Counter implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** id. */
	private String id;

	/** 计数器的key. */
	private String countKey;

	/** 租户编号. */
	private String tenantCode;

	/** 计数类型. */
	private String countType;

	/** 用户id. */
	private String userId;

	/** 某对象的id. */
	private String objectId;

	/** 计数的值. */
	private Long countValue;

	/** 创建时间. */
	private Date createDate = new Date();

	/** 更新时间. */
	private Date updateDate = new Date();

	/** 备注信息. */
	private String remarks = " ";

	/** 删除标记. */
	private String delFlag = "0";

	/**
	 * Constructor.
	 */
	public Counter() {
	}

	/**
	 * Set the id.
	 * 
	 * @param id
	 *            id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Get the id.
	 * 
	 * @return id
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Set the 计数器的key.
	 * 
	 * @param countKey
	 *            计数器的key
	 */
	public void setCountKey(String countKey) {
		this.countKey = countKey;
	}

	/**
	 * Get the 计数器的key.
	 * 
	 * @return 计数器的key
	 */
	public String getCountKey() {
		return this.countKey;
	}

	/**
	 * Set the 租户编号.
	 * 
	 * @param tenantCode
	 *            租户编号
	 */
	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

	/**
	 * Get the 租户编号.
	 * 
	 * @return 租户编号
	 */
	public String getTenantCode() {
		return this.tenantCode;
	}

	/**
	 * Set the 计数类型.
	 * 
	 * @param countType
	 *            计数类型
	 */
	public void setCountType(String countType) {
		this.countType = countType;
	}

	/**
	 * Get the 计数类型.
	 * 
	 * @return 计数类型
	 */
	public String getCountType() {
		return this.countType;
	}

	/**
	 * Set the 用户id.
	 * 
	 * @param userId
	 *            用户id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * Get the 用户id.
	 * 
	 * @return 用户id
	 */
	public String getUserId() {
		return this.userId;
	}

	/**
	 * Set the 某对象的id.
	 * 
	 * @param objectId
	 *            某对象的id
	 */
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	/**
	 * Get the 某对象的id.
	 * 
	 * @return 某对象的id
	 */
	public String getObjectId() {
		return this.objectId;
	}

	/**
	 * Set the 计数的值.
	 * 
	 * @param countValue
	 *            计数的值
	 */
	public void setCountValue(Long countValue) {
		this.countValue = countValue;
	}

	/**
	 * Get the 计数的值.
	 * 
	 * @return 计数的值
	 */
	public Long getCountValue() {
		return this.countValue;
	}

	/**
	 * Set the 创建时间.
	 * 
	 * @param createDate
	 *            创建时间
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * Get the 创建时间.
	 * 
	 * @return 创建时间
	 */
	public Date getCreateDate() {
		return this.createDate;
	}

	/**
	 * Set the 更新时间.
	 * 
	 * @param updateDate
	 *            更新时间
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * Get the 更新时间.
	 * 
	 * @return 更新时间
	 */
	public Date getUpdateDate() {
		return this.updateDate;
	}

	/**
	 * Set the 备注信息.
	 * 
	 * @param remarks
	 *            备注信息
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * Get the 备注信息.
	 * 
	 * @return 备注信息
	 */
	public String getRemarks() {
		return this.remarks;
	}

	/**
	 * Set the 删除标记.
	 * 
	 * @param delFlag
	 *            删除标记
	 */
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	/**
	 * Get the 删除标记.
	 * 
	 * @return 删除标记
	 */
	public String getDelFlag() {
		return this.delFlag;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Counter other = (Counter) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

}
