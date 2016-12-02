/**   
 * 类名：TestOrder1
 *
 */
package com.cybbj.test4;

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
 * TestOrder1: 测试表的列名与类的属性名不一致问题
 * 
 * @version 1.0
 * @author 15989
 * @modified 2016-11-23 v1.0 15989 新建 
 */
public class TestOrder1 {
	
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
	public void getOrderByIdTest() {
		Order order = sqlSession.selectOne("com.cybbj.test4.OrderMapper.getOrderById", 1);
		System.out.println(order.toString());
	}
	
	@Test
	public void getOrderById2Test() {
		Order order = sqlSession.selectOne("com.cybbj.test4.OrderMapper.getOrderById2", 1);
		System.out.println(order.toString());
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
