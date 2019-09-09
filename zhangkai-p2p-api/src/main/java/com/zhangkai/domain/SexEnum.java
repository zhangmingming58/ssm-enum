package com.zhangkai.domain;

/**
 * 
 * @ClassName: SexEnum
 * @Description: 性别枚举
 * @author: ZK
 * @date: 2019年8月22日 上午11:16:40
 */
public enum SexEnum {

	男, 女;

	public String getName() {
		return this.name();
	}

	public  int getValue() {
		for (int i = 0; i < SexEnum.values().length; i++) {
			if (this.equals(SexEnum.values()[i])) {
				return i;
			}
		}
		return -1;
	}

}
