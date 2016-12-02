/**   
 * 类名：TestMybatisAndSpring
 *
 */
package com.cybbj.test9;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cybbj.test7.ConditionUser;

/** 
 * TestMybatisAndSpring: TODO请填写类描述
 * 
 * @version 1.0
 * @author 15989
 * @modified 2016-12-1 v1.0 15989 新建 
 */
/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext.xml")*/
public class TestMybatisAndSpring {

	/*@Autowired
	private UserDaoInterface userDaoInterface;*/
	
	@Test
	public void insertUserTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDaoInterface userDaoInterface = (UserDaoInterface) applicationContext.getBean("userDaoInterface");
		ConditionUser conditionUser = new ConditionUser("桥旺", 28, 0);
		userDaoInterface.insertUser(conditionUser);
	}
}
