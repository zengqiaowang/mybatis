/**   
 * 类名：TestMybatisPage
 *
 */
package com.cybbj.test10;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.cybbj.test7.ConditionUser;
import com.cybbj.test7.User;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

/** 
 * TestMybatisPage: 测试使用mybatis插件分页
 * 
 * @version 1.0
 * @author 15989
 * @modified 2016-12-6 v1.0 15989 新建 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext.xml")
public class TestMybatisPage {
	@Autowired
	private UserDaoInterfacePage userDaoInterfacePage;

	
	@Test
	public void selPageDataByPlugin() {
		ConditionUser conditionUser = new ConditionUser("劲", 1, 30);
		PageHelper.startPage(0, 2, true);
		Page<User> oList = userDaoInterfacePage.selUsers(conditionUser);
		System.out.println("分页后数据大小：" + oList.size());
		System.out.println(">>total num: " + oList.getTotal());
		conditionUser = new ConditionUser("洗", 1, 30);
		oList = userDaoInterfacePage.selUsers(conditionUser);
		System.out.println(">>total num: " + oList.getTotal());
	}
	
}
