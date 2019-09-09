package com.zhangkai.domain;

import java.io.Serializable;

/**
 * 
 * @ClassName: Fun 
 * @Description: TODO
 * @author: ZK
 * @date: 2019年8月16日 下午7:15:49
 */
public class Fun  implements Serializable{
	
	
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 383042868744709653L;
	
	/**
	 * @fieldName: id
	 * @fieldType: Integer
	 * @Description: TODO
	 */
	private Integer id;
	/**
	 * @fieldName: name
	 * @fieldType: String
	 * @Description: TODO
	 */
	private String name;
	/**
	 * @fieldName: url
	 * @fieldType: String
	 * @Description: TODO
	 */
	private String url;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Fun [id=" + id + ", name=" + name + ", url=" + url + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
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
		Fun other = (Fun) obj;
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
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}
	
}
