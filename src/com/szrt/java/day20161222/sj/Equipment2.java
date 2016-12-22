package com.szrt.java.day20161222.sj;



import org.junit.Test;

public class Equipment2 {
	@Test
	public void euqipment2(){
		int eid=1; //资产编号;
		String name="联想笔记本电脑"; //电脑名称
		double price=5999.99;//电脑价格
		String model="ThinkPad";//电脑型号
		System.out.println("您购买了7台电脑，并且打了7折,请输出电脑信息，与总金额");
		double sum=price*7*0.7;
		System.out.println("资产编号为:"+eid);
		System.out.println("您购买电脑的名称为:"+name);
		System.out.println("您购买电脑的价格为:"+price);
		System.out.println("您购买的电脑的型号为:"+model);
		System.out.println("您购买电脑的总金额为:"+sum);
	}
}
