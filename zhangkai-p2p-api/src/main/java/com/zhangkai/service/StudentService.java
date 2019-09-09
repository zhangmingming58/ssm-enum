package com.zhangkai.service;

import java.util.List;

import com.zhangkai.domain.Student;
import com.zhangkai.domain.StudentVo;

/**
 * 
 * @ClassName: StudentService
 * @Description: TODO
 * @author: ZK
 * @date: 2019年8月22日 上午11:19:39
 */
public interface StudentService {

	/**
	 * @Title: add
	 * @Description: TODO
	 * @param student
	 * @return
	 * @return: int
	 */
	int add(Student student);

	/**
	 * @Title: select
	 * @Description: TODO
	 * @param vo
	 * @return
	 * @return: List<Student>
	 */
	List<Student> select(StudentVo vo);

}
