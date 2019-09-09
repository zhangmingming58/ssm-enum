package com.zhangkai.domain;

import java.io.Serializable;

/**
 * 
 * @ClassName: Use
 * @Description: 用途
 * @author: ZK
 * @date: 2019年8月20日 上午10:02:48
 */
public class Use implements Serializable {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 4757832817978588308L;
	/**
	 * @fieldName: id
	 * @fieldType: Integer
	 * @Description: 主键
	 */
	private Integer id;
	/**
	 * @fieldName: name
	 * @fieldType: String
	 * @Description: 用途类型
	 */
	private String name;

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

	public Use() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RepayType [id=" + id + ", name=" + name + "]";
	}

}
