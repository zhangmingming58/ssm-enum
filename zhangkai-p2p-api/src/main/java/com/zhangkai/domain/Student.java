package com.zhangkai.domain;

import java.io.Serializable;

/**
 * 
 * @ClassName: Student
 * @Description: 枚举测试实体类
 * @author: ZK
 * @date: 2019年8月22日 上午11:15:41
 */
public class Student implements Serializable {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 6864098763051742642L;
	private Integer id;
	private String name;
	private SexEnum sex;

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

	public SexEnum getSex() {
		return sex;
	}

	public void setSex(SexEnum sex) {
		this.sex = sex;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, SexEnum sex) {
		super();
		this.name = name;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + "]";
	}

}
