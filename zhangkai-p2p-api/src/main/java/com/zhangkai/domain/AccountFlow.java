package com.zhangkai.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * 
 * @ClassName: AccountFlow 
 * @Description: 流水实体类
 * @author: ZK
 * @date: 2019年8月16日 下午7:13:16
 */
/**
 * @ClassName: AccountFlow
 * @Description: TODO
 * @author: ZK
 * @date: 2019年8月16日 下午7:13:29
 */
public class AccountFlow implements Serializable {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = -4390587262782581868L;
	/**
	 * @fieldName: id
	 * @fieldType: Integer
	 * @Description: 主键
	 */
	private Integer id;
	/**
	 * @fieldName: userId
	 * @fieldType: Integer
	 * @Description: 用户
	 */
	private Integer userId;
	/**
	 * @fieldName: flowVary
	 * @fieldType: BigDecimal
	 * @Description: 流水金额
	 */
	private BigDecimal flowVary;
	/**
	 * @fieldName: flowType
	 * @fieldType: Integer
	 * @Description: 流失类型
	 */
	private Integer flowType;
	/**
	 * @fieldName: flowDesc
	 * @fieldType: String
	 * @Description: 描述
	 */
	private String flowDesc;
	/**
	 * @fieldName: flowDate
	 * @fieldType: Date
	 * @Description: 日期
	 */
	private Date flowDate;

	public AccountFlow() {

	}

	public AccountFlow(Integer userId, BigDecimal flowVary, Integer flowType, String flowDesc) {
		this.userId = userId;
		this.flowVary = flowVary;
		this.flowType = flowType;
		this.flowDesc = flowDesc;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public BigDecimal getFlowVary() {
		return flowVary;
	}

	public void setFlowVary(BigDecimal flowVary) {
		this.flowVary = flowVary;
	}

	public Integer getFlowType() {
		return flowType;
	}

	public void setFlowType(Integer flowType) {
		this.flowType = flowType;
	}

	public String getFlowDesc() {
		return flowDesc;
	}

	public void setFlowDesc(String flowDesc) {
		this.flowDesc = flowDesc;
	}

	public Date getFlowDate() {
		return flowDate;
	}

	public void setFlowDate(Date flowDate) {
		this.flowDate = flowDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flowDate == null) ? 0 : flowDate.hashCode());
		result = prime * result + ((flowDesc == null) ? 0 : flowDesc.hashCode());
		result = prime * result + ((flowType == null) ? 0 : flowType.hashCode());
		result = prime * result + ((flowVary == null) ? 0 : flowVary.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountFlow other = (AccountFlow) obj;
		if (flowDate == null) {
			if (other.flowDate != null)
				return false;
		} else if (!flowDate.equals(other.flowDate))
			return false;
		if (flowDesc == null) {
			if (other.flowDesc != null)
				return false;
		} else if (!flowDesc.equals(other.flowDesc))
			return false;
		if (flowType == null) {
			if (other.flowType != null)
				return false;
		} else if (!flowType.equals(other.flowType))
			return false;
		if (flowVary == null) {
			if (other.flowVary != null)
				return false;
		} else if (!flowVary.equals(other.flowVary))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AccountFlow [id=" + id + ", userId=" + userId + ", flowVary=" + flowVary + ", flowType=" + flowType
				+ ", flowDesc=" + flowDesc + ", flowDate=" + flowDate + "]";
	}

}
