package com.zhangkai.service;
/**
 * 
 * @ClassName: UseService 
 * @Description: 用途业务层
 * @author: ZK
 * @date: 2019年8月20日 上午10:27:54
 */

import java.util.List;

import com.zhangkai.domain.Use;

public interface UseService {

	/**
	 * @Title: getUse
	 * @Description: 获得用途列表
	 * @return
	 * @return: List<Use>
	 */
	List<Use> getUse();
}
