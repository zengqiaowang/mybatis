/**   
 * 类名：Teacher
 *
 */
package com.cybbj.test5;

/**
 * Teacher: 教师实体类
 * 
 * @version 1.0
 * @author 15989
 * @modified 2016-11-23 v1.0 15989 新建
 */
public class Teacher {
	private int id;

	private String teacherNo;

	private String teacherName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeacherNo() {
		return teacherNo;
	}

	public void setTeacherNo(String teacherNo) {
		this.teacherNo = teacherNo;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", teacherNo=" + teacherNo + ", teacherName=" + teacherName + "]";
	}

	
}
