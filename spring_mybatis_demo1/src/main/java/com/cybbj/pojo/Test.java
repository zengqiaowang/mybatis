/**   
 * 类名：Test
 *
 */
package com.cybbj.pojo;

/**
 * Test: TODO请填写类描述
 * 
 * @version 1.0
 * @author 15989
 * @modified 2016-11-23 v1.0 15989 新建
 */
public class Test {
	private int col1;

	private String col2;

	public int getCol1() {
		return col1;
	}

	public void setCol1(int col1) {
		this.col1 = col1;
	}

	public String getCol2() {
		return col2;
	}

	public void setCol2(String col2) {
		this.col2 = col2;
	}

	@Override
	public String toString() {
		return "Test [col1=" + col1 + ", col2=" + col2 + "]";
	}	
}
