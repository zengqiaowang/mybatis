/**   
 * 类名：UserDaoInterface
 *
 */
package com.cybbj.test10;

import java.util.List;

import com.cybbj.test7.ConditionUser;
import com.cybbj.test7.User;
import com.github.pagehelper.Page;

/** 
 * UserDaoInterface: 用户操作接口
 * 
 * @version 1.0
 * @author 15989
 * @modified 2016-12-1 v1.0 15989 新建 
 */
public interface UserDaoInterfacePage {
	public Page<User> selUsers(ConditionUser conditionUser);
}
