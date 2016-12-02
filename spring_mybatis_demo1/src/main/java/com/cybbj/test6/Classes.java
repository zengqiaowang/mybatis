/**   
 * 类名：Classes
 *
 */
package com.cybbj.test6;

import java.util.List;

import com.cybbj.test5.Teacher;

/**
 * Classes: 班级实体类
 * 
 * @version 1.0
 * @author 15989
 * @modified 2016-11-23 v1.0 15989 新建
 */
public class Classes {
	private int id;

	private String classNo;

	private String className;
	
	private Teacher teacher;

	private List<Student> list;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}	

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Classes [id=" + id + ", classNo=" + classNo + ", className=" + className + ", teacher=" + teacher
				+ ", list=" + list + "]";
	}

	
}
