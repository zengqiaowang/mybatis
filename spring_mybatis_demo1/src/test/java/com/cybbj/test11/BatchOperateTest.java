/**   
 * 类名：BatchOperateTest
 *
 */
package com.cybbj.test11;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.Log4jFactory;
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
	
	private Log log = Log4jFactory.getLog(BatchOperateTest.class);
	
	@Autowired
	private BatchOperate batchOperate;
	
	@Test
	public void insertBatchTest() {
		log.info(">>>批处理开始");
	/*	List<ConditionUser> oList = new ArrayList<ConditionUser>();
		ConditionUser conditionUser = new ConditionUser("桥旺1", 28, 28);
		oList.add(conditionUser);
		conditionUser = new ConditionUser("桥旺2", 28, 28);
		oList.add(conditionUser);
		conditionUser = new ConditionUser("桥旺3", 28, 28);
		oList.add(conditionUser);
		conditionUser = new ConditionUser("桥旺4", 28, 28);
		oList.add(conditionUser);
		batchOperate.insertBatch(oList);*/
		log.info(">>>批处理结束");
	}
}
