package com.sanhao.tech.teacherfeed.web;

import com.sanhao.tech.teacherfeed.dao.UserDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@RestController
@EnableAutoConfiguration
public class JobContoller
{
	private static final Logger logger = LoggerFactory.getLogger("teacherfeed");

	@Autowired
	private UserDAO userDAO;

	@Autowired
	private DataSource dataSource;

	private static int  LOOP_SIZE = 1;

	@RequestMapping("/mybatis")
	public String dump(){
		long start = System.currentTimeMillis();
		logger.info("mybatis start ==========>");

		for(int i = 0; i < LOOP_SIZE;i++){
			userDAO.getUsers();
		}
		long end = System.currentTimeMillis();
		logger.info("mybatis end ==========>");
		return "mybatis user time(ms) :" + (end - start);
	}

	@RequestMapping("/jdbc")
	public String update() throws SQLException {
		long start = System.currentTimeMillis();
		logger.info("jdbc start ==========>");

		for(int i = 0; i < LOOP_SIZE;i++) {
			Connection connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement("select * from ysyy_user where 1=1");
			ResultSet rs = ps.executeQuery();
		}

		long end = System.currentTimeMillis();
		logger.info("jdbc end ==========>");
		return "jdbc user time(ms) :" + (end - start);
	}
}
