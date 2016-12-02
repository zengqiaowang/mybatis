/**   
 * 类名：Order
 *
 */
package com.cybbj.test4;

/** 
 * Order: TODO请填写类描述
 * 
 * @version 1.0
 * @author 15989
 * @modified 2016-11-23 v1.0 15989 新建 
 */
public class Order {
	private int id;
	private String orderName;
	private String orderNo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderName=" + orderName + ", orderNo=" + orderNo + "]";
	}
	
	
}
