package com.zhangkai.service;

import com.zhangkai.domain.User;
import com.zhangkai.domain.UserVo;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @author: ZK
 * @date: 2019年8月14日 下午2:26:45
 */
public interface UserService {

	/**
	 * @Title: insert
	 * @Description: 注册用户，并返回当前注册的用户
	 * @param user
	 * @return
	 * @return: User
	 */
	User insert(User user);

	/**
	 * @Title: findUser
	 * @Description: 根据查询条件查找用户
	 * @param vo
	 * @return
	 * @return: User
	 */
	User findUser(UserVo vo);

	/**
	 * @Title: login
	 * @Description: 根据用户名查找用户
	 * @param user
	 * @return
	 * @return: User
	 */
	User login(User user);

	/**
	 * @Title: delete
	 * @Description: 删除用户
	 * @param id
	 * @return
	 * @return: int
	 */
	int delete(Integer id);

	/**
	 * @Title: findUserByName
	 * @Description: 登录
	 * @param name
	 * @return
	 * @return: User
	 */
	User findUserByName(String name);

}
