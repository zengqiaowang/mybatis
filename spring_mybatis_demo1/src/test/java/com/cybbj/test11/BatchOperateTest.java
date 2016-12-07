/**   
 * 类名：BatchOperateTest
 *
 */
package com.cybbj.test11;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cybbj.test7.ConditionUser;

/** 
 * BatchOperateTest: 批处理测试
 * 
 * @version 1.0
 * @author 15989
 * @modified 2016-12-7 v1.0 15989 新建 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext.xml")
public class BatchOperateTest {
	
	@Autowired
	private BatchOperate batchOperate;
	
	@Test
	public void insertBatchTest() {
		List<ConditionUser> oList = new ArrayList<ConditionUser>();
		ConditionUser conditionUser = new ConditionUser("桥旺1", 28, 28);
		oList.add(conditionUser);
		conditionUser = new ConditionUser("桥旺2", 28, 28);
		oList.add(conditionUser);
		conditionUser = new ConditionUser("桥旺3", 28, 28);
		oList.add(conditionUser);
		conditionUser = new ConditionUser("桥旺4", 28, 28);
		oList.add(conditionUser);
		batchOperate.insertBatch(oList);
	}
}
