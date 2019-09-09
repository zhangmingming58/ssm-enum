package com.zhangkai.service;
/**
 * 
 * @ClassName: FunService 
 * @Description: TODO
 * @author: ZK
 * @date: 2019年8月16日 下午7:30:08
 */

import java.util.List;

import com.zhangkai.domain.Fun;

public interface FunService {

	/**
	 * @Title: getFunList
	 * @Description: 通过userId或的当前User的操作权限
	 * @param userId
	 * @return
	 * @return: List<Fun>
	 */
	List<Fun> getFunList(Integer userId);

}
