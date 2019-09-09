package com.zhangkai.service;
/**
 * 
 * @ClassName: FinancingService 
 * @Description: 借款业务层接口
 * @author: ZK
 * @date: 2019年8月20日 上午10:07:06
 */

import com.github.pagehelper.PageInfo;
import com.zhangkai.domain.Financing;
import com.zhangkai.domain.FinancingVo;

public interface FinancingService {
	/**
	 * 
	 * @Title: selectFins
	 * @Description: 条件查询融资列表
	 * @param vo
	 * @return
	 * @return: List<Financing>
	 */
	PageInfo<Financing> selectFins(Integer pageNum, Integer pageSize, FinancingVo vo);

	/**
	 * @Title: insert
	 * @Description: 添加融资
	 * @param financing
	 * @return
	 * @return: int
	 */
	int insert(Integer[] integers, Financing financing);

	/**
	 * 
	 * @Title: selectFinById
	 * @Description: 根据Id获取借款记录
	 * @param id
	 * @return
	 * @return: Financing
	 */
	Financing selectFinById(Integer id);

	/**
	 * @Title: deleteFin
	 * @Description: 批量删除借款记录
	 * @param ids
	 * @return
	 * @return: int
	 */
	int deleteFin(Integer[] ids);

	/**
	 * @Title: updateFin
	 * @Description: 修改
	 * @param financing
	 * @return
	 * @return: int
	 */
	int updateFin(Financing financing);

}
