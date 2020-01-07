package com.wuwei.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wuwei.cms.pojo.Article;
import com.wuwei.cms.pojo.User;

public interface BaseDao<T> {
	/** 
	 * @Title: select 
	 * @Description: 按条件查询
	 * @param user
	 * @return
	 * @return: List<User>
	 */
	List<User> select(T t1);
	/** 
	 * @Title: selectById 
	 * @Description: 根据Id查询
	 * @param id
	 * @return
	 * @return: User
	 */
	User selectById(Integer id);
	/** 
	 * @Title: insert 
	 * @Description: 新增
	 * @param user
	 * @return
	 * @return: int
	 */
	int insert(T t1);
	/** 
	 * @Title: update 
	 * @Description: 修改
	 * @param user
	 * @return
	 * @return: int
	 */
	int update(T t1);
	/** 
	 * @Title: delete 
	 * @Description: 删除
	 * @param ids
	 * @return
	 * @return: int
	 */
	int delete(@Param("ids") String ids );
	
}
