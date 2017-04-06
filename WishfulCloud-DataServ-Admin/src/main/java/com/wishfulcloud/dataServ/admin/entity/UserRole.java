package com.wishfulcloud.dataServ.admin.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Model class of 用户-角色.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class UserRole implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 主键. */
	private String id;

	/** 用户编号. */
	private String userId;

	/** 角色编号. */
	private String roleId;

	/** 创建时间. */
	private Date createDate;

	/** 更新时间. */
	private Date updateDate;

	/** 备注信息. */
	private String remarks;

	/** 删除标记. */
	private String delFlag;

	/**
	 * Constructor.
	 */
	public UserRole() {
	}

	/**
	 * Set the 主键.
	 * 
	 * @param id
	 *            主键
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Get the 主键.
	 * 
	 * @return 主键
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Set the 用户编号.
	 * 
	 * @param userId
	 *            用户编号
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * Get the 用户编号.
	 * 
	 * @return 用户编号
	 */
	public String getUserId() {
		return this.userId;
	}

	/**
	 * Set the 角色编号.
	 * 
	 * @param roleId
	 *            角色编号
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	/**
	 * Get the 角色编号.
	 * 
	 * @return 角色编号
	 */
	public String getRoleId() {
		return this.roleId;
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
		UserRole other = (UserRole) obj;
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
