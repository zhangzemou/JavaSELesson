package com.szrt.java.day20161222.demo5;

public class MathDemo {

	public static void main(String[] args) {
		//定义三个变量
		int c=63;
		int java=91;
		int sql=57;
		System.out.println("----------------------");
		System.out.println("C\t"+"Java\t"+"SQL");
		System.out.println(c+"\t"+java+"\t"+sql+"\t");
		System.out.println("----------------------");
		int sub=java-sql;
		System.out.println("java和sql的差为:"+sub);
		
		int sum=c+java+sql;
		//整数除以整数结果是整数，整数除以小数，结果是小数，就算能整除，也会保留“.0”
		//double avg=sum/3;
		double avg=sum/3.0;
		System.out.println("三门课程的平均成绩为:"+avg);
	}
}
