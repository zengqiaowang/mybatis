/**   
 * 类名：ConditionUser
 *
 */
package com.cybbj.test7;

/** 
 * ConditionUser: 查询条件User对象
 * 
 * @version 1.0
 * @author 15989
 * @modified 2016-11-28 v1.0 15989 新建 
 */
public class ConditionUser {
	
	private String name="";
	private int minAge;
	private int maxAge;
	

	/** 
	*
	* @param name
	* @param minAge
	* @param maxAge 
	*/
	public ConditionUser(String name, int minAge, int maxAge) {
		super();
		this.name = name;
		this.minAge = minAge;
		this.maxAge = maxAge;
	}

	/** 
	* 
	*/
	public ConditionUser() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	@Override
	public String toString() {
		return "ConditionUser [name=" + name + ", minAge=" + minAge + ", maxAge=" + maxAge + "]";
	}
	
}
