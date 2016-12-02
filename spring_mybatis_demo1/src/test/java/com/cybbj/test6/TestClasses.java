/**   
 * 类名：TestClasses
 *
 */
package com.cybbj.test6;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cybbj.test6.Classes;

/** 
 * TestClasses: TODO请填写类描述
 * 
 * @version 1.0
 * @author 15989
 * @modified 2016-11-24 v1.0 15989 新建 
 */
public class TestClasses {

	
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
	public void getClassByIdTest() {
		//嵌套结果
	/*	Classes classes = sqlSession.selectOne("com.cybbj.test6.ClassMapper.getClassById", 1);
		System.out.println(classes.toString());*/
		
		//嵌套查询
		Classes classes = sqlSession.selectOne("com.cybbj.test6.ClassMapper.getClassById2", 2);
		System.out.println(classes.toString());
		
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
