/**   
 * 类名：InterfacePojo
 *
 */
package com.cybbj.test3;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.cybbj.pojo.Test;

/** 
 * InterfacePojo: sql注解接口类(用于测试注解的方式)
 * 
 * @version 1.0
 * @author 15989
 * @modified 2016-11-22 v1.0 15989 新建 
 */
public interface InterfacePojo {
	
	@Insert("insert into test(col2) values(#{val1})")
	public int add(String param1);
	
	@Update("update test set col2=#{col2} where col1=#{col1}")
	public int update(Test pojo);
	
	@Delete("delete from test where col1=#{col1}")
	public int del(int param1);
	
	@Select("select * from test")
	public List<Test> selList();
}
