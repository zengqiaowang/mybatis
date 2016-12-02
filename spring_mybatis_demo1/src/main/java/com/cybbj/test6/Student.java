/**   
 * 类名：Student
 *
 */
package com.cybbj.test6;

/**
 * Student: TODO请填写类描述
 * 
 * @version 1.0
 * @author 15989
 * @modified 2016-11-24 v1.0 15989 新建
 */
public class Student {
	private int id;

	private String name;

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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	
}
