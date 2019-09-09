package com.zhangkai.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * @ClassName: Financing
 * @Description: TODO
 * @author: ZK
 * @date: 2019年8月20日 上午9:37:24
 */
public class Financing implements Serializable {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 5309985959080625066L;
	/**
	 * @fieldName: id
	 * @fieldType: Integer
	 * @Description: 主键
	 */
	private Integer id;
	/**
	 * @fieldName: userId
	 * @fieldType: Integer
	 * @Description: 借钱的用户
	 */
	private Integer userId;

	/**
	 * @fieldName: userName
	 * @fieldType: String
	 * @Description: TODO
	 */
	private String userName;
	/**
	 * @fieldName: ammount
	 * @fieldType: BigDecimal
	 * @Description: 借款的金额
	 */
	private BigDecimal ammount;
	/**
	 * @fieldName: interest
	 * @fieldType: BigDecimal
	 * @Description: 利息(利息的周期自己定义)
	 */
	private BigDecimal interest;
	/**
	 * @fieldName: repayType
	 * @fieldType: Integer
	 * @Description: 还款类型
	 */
	private Integer repayType;
	/**
	 * @fieldName: rname
	 * @fieldType: String
	 * @Description: 还款类型名称
	 */
	private String rname;
	/**
	 * @fieldName: useName
	 * @fieldType: String
	 * @Description: 用途名称
	 */
	private String useName;
	/**
	 * @fieldName: useIds
	 * @fieldType: String
	 * @Description: TODO
	 */
	private Integer[] useIds;
	/**
	 * @fieldName: title
	 * @fieldType: String
	 * @Description: 借款标题
	 */
	private String title;
	/**
	 * @fieldName: useId
	 * @fieldType: String
	 * @Description: TODO
	 */
	private String useId;

	/**
	 * @fieldName: desc
	 * @fieldType: String
	 * @Description: 描述 小心这个字段是关键字 需要加反单引号
	 */
	private String desc;
	/**
	 * @fieldName: idCardImg
	 * @fieldType: String
	 * @Description: 显示身份证照片的url地址 或者 存储的相对路径
	 */
	private String idCardImg;

	/**
	 * @fieldName: dieLine
	 * @fieldType: Date
	 * @Description: 期限
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dieLine;
	/**
	 * @fieldName: status
	 * @fieldType: Integer
	 * @Description: 融资中、融资完成、还款中 还款完毕。
	 */
	private Integer status;
	/**
	 * @fieldName: receivedMoney
	 * @fieldType: BigDecimal
	 * @Description: 已经借到多少钱
	 */
	private BigDecimal receivedMoney;
	/**
	 * @fieldName: startDate
	 * @fieldType: Date
	 * @Description: 开始日期
	 */

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startDate;

	public String getUserName() {
		return userName;
	}
	
	
	

	public String getUseId() {
		return useId;
	}




	public void setUseId(String useId) {
		this.useId = useId;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer[] getUseIds() {
		return useIds;
	}

	public void setUseIds(Integer[] useIds) {
		this.useIds = useIds;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getUseName() {
		return useName;
	}

	public void setUseName(String useName) {
		this.useName = useName;
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

	public BigDecimal getAmmount() {
		return ammount;
	}

	public void setAmmount(BigDecimal ammount) {
		this.ammount = ammount;
	}

	public BigDecimal getInterest() {
		return interest;
	}

	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	public Integer getRepayType() {
		return repayType;
	}

	public void setRepayType(Integer repayType) {
		this.repayType = repayType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getIdCardImg() {
		return idCardImg;
	}

	public void setIdCardImg(String idCardImg) {
		this.idCardImg = idCardImg;
	}

	public Date getDieLine() {
		return dieLine;
	}

	public void setDieLine(Date dieLine) {
		this.dieLine = dieLine;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public BigDecimal getReceivedMoney() {
		return receivedMoney;
	}

	public void setReceivedMoney(BigDecimal receivedMoney) {
		this.receivedMoney = receivedMoney;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Financing() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ammount == null) ? 0 : ammount.hashCode());
		result = prime * result + ((desc == null) ? 0 : desc.hashCode());
		result = prime * result + ((dieLine == null) ? 0 : dieLine.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idCardImg == null) ? 0 : idCardImg.hashCode());
		result = prime * result + ((interest == null) ? 0 : interest.hashCode());
		result = prime * result + ((receivedMoney == null) ? 0 : receivedMoney.hashCode());
		result = prime * result + ((repayType == null) ? 0 : repayType.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Financing other = (Financing) obj;
		if (ammount == null) {
			if (other.ammount != null)
				return false;
		} else if (!ammount.equals(other.ammount))
			return false;
		if (desc == null) {
			if (other.desc != null)
				return false;
		} else if (!desc.equals(other.desc))
			return false;
		if (dieLine == null) {
			if (other.dieLine != null)
				return false;
		} else if (!dieLine.equals(other.dieLine))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idCardImg == null) {
			if (other.idCardImg != null)
				return false;
		} else if (!idCardImg.equals(other.idCardImg))
			return false;
		if (interest == null) {
			if (other.interest != null)
				return false;
		} else if (!interest.equals(other.interest))
			return false;
		if (receivedMoney == null) {
			if (other.receivedMoney != null)
				return false;
		} else if (!receivedMoney.equals(other.receivedMoney))
			return false;
		if (repayType == null) {
			if (other.repayType != null)
				return false;
		} else if (!repayType.equals(other.repayType))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	public Financing(Integer userId, BigDecimal ammount, BigDecimal interest, Integer repayType, String title,
			String desc, String idCardImg, Date dieLine, Integer status, BigDecimal receivedMoney, Date startDate) {
		super();
		this.userId = userId;
		this.ammount = ammount;
		this.interest = interest;
		this.repayType = repayType;
		this.title = title;
		this.desc = desc;
		this.idCardImg = idCardImg;
		this.dieLine = dieLine;
		this.status = status;
		this.receivedMoney = receivedMoney;
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "Financing [id=" + id + ", userId=" + userId + ", ammount=" + ammount + ", interest=" + interest
				+ ", repayType=" + repayType + ", title=" + title + ", desc=" + desc + ", idCardImg=" + idCardImg
				+ ", dieLine=" + dieLine + ", status=" + status + ", receivedMoney=" + receivedMoney + ", startDate="
				+ startDate + "]";
	}

}
