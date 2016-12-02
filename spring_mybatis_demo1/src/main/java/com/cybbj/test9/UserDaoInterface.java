/**   
 * 类名：UserDaoInterface
 *
 */
package com.cybbj.test9;

import java.util.List;

import com.cybbj.test7.ConditionUser;
import com.cybbj.test7.User;

/** 
 * UserDaoInterface: 用户操作接口
 * 
 * @version 1.0
 * @author 15989
 * @modified 2016-12-1 v1.0 15989 新建 
 */
public interface UserDaoInterface {
	public int insertUser(ConditionUser conditionUser);
	public int updateUser(ConditionUser conditionUser);
	public List<User> selUsers(ConditionUser conditionUser);
	public int delUsers(int id);
}
