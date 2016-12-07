/**   
 * 类名：BatchOperate
 *
 */
package com.cybbj.test11;

import java.util.List;

import com.cybbj.test7.ConditionUser;

/** 
 * BatchOperate: 批处理
 * 
 * @version 1.0
 * @author 15989
 * @modified 2016-12-7 v1.0 15989 新建 
 */
public interface BatchOperate {
	public void insertBatch(List<ConditionUser> oList);
}
