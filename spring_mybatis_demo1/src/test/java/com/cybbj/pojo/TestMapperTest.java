/**   
 * 类名：TestMapperTest
 *
 */
package com.cybbj.pojo;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

/** 
 * TestMapperTest: TestMapper.xml测试
 * 
 * @version 1.0
 * @author 15989
 * @modified 2016-11-14 v1.0 15989 新建 
 */
public class TestMapperTest {
	
	@Test
	public void testMethod1() {
		String resource = "conf.xml";
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			List<Test> oList = sqlSession.selectList("com.cybbj.pojo.TestMapper.selectTest1");
			System.out.println(oList.size());
			if (sqlSession!=null) {
				sqlSession.close();
			}
			if (inputStream!=null) {
				inputStream.close();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
