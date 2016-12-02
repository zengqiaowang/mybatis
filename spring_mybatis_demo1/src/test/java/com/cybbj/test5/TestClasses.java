/**   
 * 类名：TestClasses
 *
 */
package com.cybbj.test5;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/** 
 * TestClasses: 测试班级与老师一对一关联两表查询处理方式
 * 
 * @version 1.0
 * @author 15989
 * @modified 2016-11-23 v1.0 15989 新建 
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
		Classes classes = sqlSession.selectOne("com.cybbj.test5.ClassMapper.getClassById", 1);
		Classes classes2 = sqlSession.selectOne("com.cybbj.test5.ClassMapper.getClassById2", 2);
		System.out.println(classes.toString());
		System.out.println(classes2.toString());
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
