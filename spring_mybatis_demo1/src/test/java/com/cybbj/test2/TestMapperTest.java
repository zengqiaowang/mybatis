/**   
 * 类名：TestMapperTest
 *
 */
package com.cybbj.test2;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/** 
 * TestMapperTest: TestMapper.xml测试
 * 
 * @version 1.0
 * @author 15989
 * @modified 2016-11-14 v1.0 15989 新建 
 */
public class TestMapperTest {
	
	private SqlSession sqlSession = null;
	
	@Before
	public void init() {
		String resource = "conf.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			sqlSession = sqlSessionFactory.openSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (inputStream!=null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
/*	@Test
	public void insertTest1() {
		sqlSession.insert("com.cybbj.test2.TestMapper.insertTest1", "test_insert");
		sqlSession.commit();
	}*/
	
/*	@Test
	public void updateTest1() {
		com.cybbj.pojo.Test test = new com.cybbj.pojo.Test();
		test.setCol1(5);
		test.setCol2("test_update");
		sqlSession.update("com.cybbj.test2.TestMapper.updateTest1", test);
		sqlSession.commit();
	}*/
	
/*	@Test
	public void deleteTest1() {
		sqlSession.delete("com.cybbj.test2.TestMapper.deleteTest1", 5);
		sqlSession.commit();
	}*/
	
	@Test
	public void selectTest1() {
		com.cybbj.pojo.Test tempPojo = sqlSession.selectOne("com.cybbj.test2.TestMapper.selectTest1",1);
		System.out.println(tempPojo.toString());
	}

	@After
	public void destroy() {
		if (sqlSession!=null) {
			sqlSession.close();
		}
	}
}
