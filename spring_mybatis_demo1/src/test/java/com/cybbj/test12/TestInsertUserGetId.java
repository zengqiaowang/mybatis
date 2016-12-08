/**   
 * 类名：TestInsertUserGetId
 *
 */
package com.cybbj.test12;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cybbj.test7.User;

/** 
 * TestInsertUserGetId: 插入用户数据并获取刚插入主键
 * 
 * @version 1.0
 * @author 15989
 * @modified 2016-12-8 v1.0 15989 新建 
 */
public class TestInsertUserGetId {

	
	private InputStream inputStream = null;
	private SqlSession sqlSession = null;
	
	@Before
	public void init() {
		String resource = "conf.xml";
	
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			sqlSession = sqlSessionFactory.openSession(true);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void userTest() {
		User user = new User(0, "插入获主键", 13);
		sqlSession.insert("com.cybbj.test12.insertUseGetID.insertUserGetId", user);
		System.out.println(">>>get new id :" + user.getId());
	}
	
	@After
	public void destroy() {
		if (sqlSession!=null) {
			sqlSession.close();
		}
		if (inputStream!=null) {
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
