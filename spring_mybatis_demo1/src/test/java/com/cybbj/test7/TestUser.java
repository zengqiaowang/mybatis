/**   
 * 类名：TestUser
 *
 */
package com.cybbj.test7;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/** 
 * TestUser: TODO请填写类描述
 * 
 * @version 1.0
 * @author 15989
 * @modified 2016-11-28 v1.0 15989 新建 
 */
public class TestUser {

	
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
		//ConditionUser conditionUser = new ConditionUser("劲", 20, 30);
		//List<User> oList = sqlSession.selectList("com.cybbj.test7.UserMapper.getUserByConditionIf", conditionUser);
		//List<User> oList = sqlSession.selectList("com.cybbj.test7.UserMapper.getUserByConditionChoose", conditionUser);
		//List<User> oList = sqlSession.selectList("com.cybbj.test7.UserMapper.getUserByConditionWhere", conditionUser);
		//List<User> oList = sqlSession.selectList("com.cybbj.test7.UserMapper.getUserByConditionTrim", conditionUser);
		//System.out.println(oList.toString());
		
		//ConditionUser conditionUser = new ConditionUser("劲", 20, 30);
		//sqlSession.update("com.cybbj.test7.UserMapper.updateUserByConditionSet", conditionUser);
		
		/*List<Integer> oTempList = new ArrayList<Integer>();
		oTempList.add(1);
		oTempList.add(2);
		oTempList.add(3);
		List<User> oList = sqlSession.selectList("com.cybbj.test7.UserMapper.getUserByConditionForeach", oTempList);
		System.out.println(oList.toString());*/
		
		ConditionUser conditionUser = new ConditionUser("洗", 0, 0);
		List<User> oList = sqlSession.selectList("com.cybbj.test7.UserMapper.getUserByConditionBind", conditionUser);
		System.out.println(oList.toString());
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
