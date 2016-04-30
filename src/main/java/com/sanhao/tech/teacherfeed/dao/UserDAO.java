package com.sanhao.tech.teacherfeed.dao;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sanhao.tech.teacherfeed.model.User;

/**
 * 用户表相关操�?
 * @author sanhao
 *
 */
public interface UserDAO {
	
	@Select("select * from ysyy_user where 1=1")
	List<User> getUsers();

}
