package com.zhangkai.service;

import java.math.BigDecimal;

import com.zhangkai.domain.AccountFlow;

/**
 * 
 * @ClassName: AccountService
 * @Description: TODO
 * @author: ZK
 * @date: 2019年8月16日 下午7:54:53
 */
public interface AccountService {

	/**
	 * @Title: createAcc
	 * @Description: 创建用户的账户
	 * @param userId
	 * @return
	 * @return: boolean
	 */
	boolean createAcc(Integer userId);

	/**
	 * @Title: updateBanlance
	 * @Description: 修改个人余额
	 * @param userId
	 * @param changeMoney
	 * @return
	 * @return: boolean
	 */
	boolean updateBanlance(Integer userId, BigDecimal changeMoney);

	/**
	 * @Title: createAccFlow
	 * @Description: 生成资金流水
	 * @param accountFlow
	 * @return
	 * @return: boolean
	 */
	boolean createAccFlow(AccountFlow accountFlow);
}
