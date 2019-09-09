package com.zhangkai.domain;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.Length;

/**
 * 
 * @ClassName: User
 * @Description: TODO
 * @author: ZK
 * @date: 2019年8月14日 下午2:16:15
 */
public class User implements Serializable {
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = -2616260376121066228L;
	/**
	 * @fieldName: id
	 * @fieldType: Integer
	 * @Description: 主键
	 */
	private Integer id;
	/**
	 * @fieldName: name
	 * @fieldType: String
	 * @Description: 用户名
	 */
	@Length(max=10,min=6,message="长度不合适")
	private String name;
	/**
	 * @fieldName: passwd
	 * @fieldType: String
	 * @Description: 密码
	 */
	private String passwd;
	/**
	 * @fieldName: recommenderId
	 * @fieldType: Integer
	 * @Description: 推荐人
	 */
	private Integer recommenderId;
	/**
	 * @fieldName: mobile
	 * @fieldType: String
	 * @Description: 电话
	 */
	private String mobile;
	/**
	 * @fieldName: registedDate
	 * @fieldType: Date
	 * @Description: 注册时间
	 */
	private Date registedDate;
	/**
	 * @fieldName: lastLoginDate
	 * @fieldType: Date
	 * @Description: 最后登录时间
	 */
	private Date lastLoginDate;
	/**
	 * @fieldName: registerIp
	 * @fieldType: String
	 * @Description: 注册地址
	 */
	private String registerIp;
	/**
	 * @fieldName: lastLoginIp
	 * @fieldType: String
	 * @Description: 最后登录地址
	 */
	private String lastLoginIp;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Integer getRecommenderId() {
		return recommenderId;
	}

	public void setRecommenderId(Integer recommenderId) {
		this.recommenderId = recommenderId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getRegistedDate() {
		return registedDate;
	}

	public void setRegistedDate(Date registedDate) {
		this.registedDate = registedDate;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getRegisterIp() {
		return registerIp;
	}

	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public User(Integer id, String name, String passwd, Integer recommenderId, String mobile, Date registedDate,
			Date lastLoginDate, String registerIp, String lastLoginIp) {
		super();
		this.id = id;
		this.name = name;
		this.passwd = passwd;
		this.recommenderId = recommenderId;
		this.mobile = mobile;
		this.registedDate = registedDate;
		this.lastLoginDate = lastLoginDate;
		this.registerIp = registerIp;
		this.lastLoginIp = lastLoginIp;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", passwd=" + passwd + ", recommenderId=" + recommenderId
				+ ", mobile=" + mobile + ", registedDate=" + registedDate + ", lastLoginDate=" + lastLoginDate
				+ ", registerIp=" + registerIp + ", lastLoginIp=" + lastLoginIp + "]";
	}

}
