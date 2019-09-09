package com.zhangkai.service;
/**
 * 
 * @ClassName: RepayTypeService 
 * @Description: 还款类型业务层
 * @author: ZK
 * @date: 2019年8月20日 上午10:27:54
 */

import java.util.List;

import com.zhangkai.domain.RepayType;

public interface RepayTypeService {

	/**
	 * @Title: geRepayTypes
	 * @Description: 获得用途列表
	 * @return
	 * @return: List<RepayType>
	 */
	List<RepayType> geRepayTypes();
}
