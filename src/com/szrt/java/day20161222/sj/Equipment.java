package com.szrt.java.day20161222.sj;

import java.util.Scanner;

import org.junit.Test;

public class Equipment {

	@Test
	public void equipMent(){
		Scanner sc=new Scanner(System.in);
	    int eid;   //资产编号
	    String name;  //产品名称
	    double price;  //产品价格
	    String model;  //产品型号
	    int count;  //购买数量
	    
	    System.out.println("请你输入产品的编号:");
	    eid=sc.nextInt();
	    System.out.println("请你输入产品的名称:");
	    name=sc.next();
	    System.out.println("请您输入产品的价格：");
	    price=sc.nextDouble();
	    System.out.println("请您输入产品的型号：");
	    model=sc.next();
	    System.out.println("请您输入你需要购买的数量");
	    count=sc.nextInt();
	    
	    System.out.println("------------------");
	    System.out.println("活动期间打8折,购买的电脑信息,总金额如下");
	    double sum=price*0.8*count;
	    System.out.println("电脑的编号:"+eid);
	    System.out.println("电脑的名称:"+name);
	    System.out.println("电脑的价格:"+price);
	    System.out.println("电脑的型号:"+model);
	    System.out.println("您购买该产品的总金额为:"+sum);
	    
	}
}
