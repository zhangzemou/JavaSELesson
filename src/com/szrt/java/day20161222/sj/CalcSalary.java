package com.szrt.java.day20161222.sj;

import org.junit.Test;

public class CalcSalary {

	@Test
	public void calcSalary(){
		int base=3000;   //基本工资
		double ga;       //物价津贴
		double hra;      //房屋津贴
		double salary;   //薪水
		
		ga=base*40/9.0;   //整数除以小数结果一定是小数，就算能整除，也会保留.0
		hra=base*25/9.0;
		salary=base+hra+ga;
		System.out.println("该员工的工资明细为:");
		System.out.println("基本工资为:"+base);
		System.out.println("物价津贴为:"+ga);
		System.out.println("房屋津贴为:"+hra);
		System.out.println("薪水为:"+salary);
	}
}
