/**   
 * 类名：TestMapper3
 *
 */
package com.cybbj.test3;

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

/** 
 * TestMapper3: 简单注解sql测试
 * 
 * @version 1.0
 * @author 15989
 * @modified 2016-11-22 v1.0 15989 新建 
 */
public class TestMapper3 {
	SqlSession sqlSession = null;

	@Before
	public void init() {
		String resource = "conf.xml";
		
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			sqlSession = sqlSessionFactory.openSession(true);			
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
	public void insert() {
		InterfacePojo interfacePojo = sqlSession.getMapper(InterfacePojo.class);
		System.out.println("增加数：" + interfacePojo.add("annotation_add"));
	}*/
	
/*	@Test
	public void update() {
		InterfacePojo interfacePojo = sqlSession.getMapper(InterfacePojo.class);
		com.cybbj.pojo.Test pojo = new com.cybbj.pojo.Test(6, "annotation_update");
		System.out.println("修改数：" + interfacePojo.update(pojo));
	}*/
	
/*	@Test
	public void delete() {
		InterfacePojo interfacePojo = sqlSession.getMapper(InterfacePojo.class);
		System.out.println("删除数：" + interfacePojo.del(6));
	}
	*/
	
	@Test
	public void select() {
		InterfacePojo interfacePojo = sqlSession.getMapper(InterfacePojo.class);
		List<com.cybbj.pojo.Test> oList = interfacePojo.selList();
		System.out.println(oList.size());
	}
	@After
	public void destroy() {
		if (sqlSession != null) {
			sqlSession.close();
		}
	}
	
}
