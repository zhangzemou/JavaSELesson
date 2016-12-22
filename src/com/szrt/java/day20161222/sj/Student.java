package com.szrt.java.day20161222.sj;

import java.util.Scanner;

import org.junit.Test;

public class Student {

	@Test
	public void stu(){
		String name;  //学生姓名
		char sex;  //学生性别;
	    float score; //学生的成绩
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("请输入学生的姓名:");
	    name=sc.next();
	    System.out.println("请输入学生的性别:");
	    sex=sc.next().charAt(0);
	    System.out.println("请输入学生的成绩:");
	    score=sc.nextFloat();
	    
	    System.out.println("学生的姓名为:"+name+"性别为:"+sex+"成绩为:"+score);
	}
}
