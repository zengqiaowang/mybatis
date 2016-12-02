/**   
 * 类名：User
 *
 */
package com.cybbj.test7;

import java.io.Serializable;

/** 
 * User: User实体类
 * 
 * @version 1.0
 * @author 15989
 * @modified 2016-11-28 v1.0 15989 新建 
 */
public class User implements Serializable{
	private int id;
	private String name="";
	private int age;
	
	/** 
	*
	* @param id
	* @param name
	* @param age 
	*/
	public User(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	/** 
	* 
	*/
	public User() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
