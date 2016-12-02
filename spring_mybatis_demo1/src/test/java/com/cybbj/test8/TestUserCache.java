/**   
 * 类名：TestUserCache
 *
 */
package com.cybbj.test8;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cybbj.test7.ConditionUser;
import com.cybbj.test7.User;

/** 
 * TestUserCache: 测试一级与二级缓存
 * 
 * @version 1.0
 * @author 15989
 * @modified 2016-12-1 v1.0 15989 新建 
 */
public class TestUserCache {

	
	private InputStream inputStream = null;
	private SqlSession sqlSession = null;
	SqlSessionFactory sqlSessionFactory = null;
	
	@Before
	public void init() {
		String resource = "conf.xml";
	
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			sqlSession = sqlSessionFactory.openSession(true);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * cacheOneTest: 测试一级缓存需把UserMapper.xml文件中的<cache></cache>去掉
	 * 
	 * @return 
	 * @throws
	 */
/*	@Test
	public void cacheOneTest() {
		ConditionUser conditionUser = new ConditionUser("劲", 20, 30);
		List<User> oList = sqlSession.selectList("com.cybbj.test8.UserMapper.getUserByConditionIf", conditionUser);
		System.out.println(oList.toString());
		//如果调用了clearCache方法，后面将不再使用缓存里数据
		//sqlSession.clearCache();
		
		//如果调用了CUD(增删改)将不再使用缓存里数据
		ConditionUser tempUser = new ConditionUser("杨明强", 28, 0);
		sqlSession.insert("com.cybbj.test8.UserMapper.insertUser", tempUser);
		sqlSession.commit();
		System.out.println("---------------------");
		oList = sqlSession.selectList("com.cybbj.test8.UserMapper.getUserByConditionIf", conditionUser);
		System.out.println(oList.toString());
	}*/
	
	/**
	 * 
	 * cacheTwoTest: 测试二级缓存需在UserMapper.xml文件中打开<cache></cache>
	 * 二级缓存只作用在一个xml文件中
	 * @return 
	 * @throws
	 */
/*	@Test
	public void cacheTwoTest() {
		ConditionUser conditionUser = new ConditionUser("劲", 20, 30);
		List<User> oList = sqlSession.selectList("com.cybbj.test8.UserMapper.getUserByConditionIf", conditionUser);
		if (sqlSession!=null) {
			sqlSession.close();
		}
		System.out.println(oList.toString());
		
		System.out.println("---------------------");
		
		sqlSession = sqlSessionFactory.openSession();
		oList = sqlSession.selectList("com.cybbj.test8.UserMapper.getUserByConditionIf", conditionUser);
		if (sqlSession!=null) {
			sqlSession.close();
		}
		System.out.println(oList.toString());
	}*/
	
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