package com.szrt.java.zzm.java20161223;

import java.util.Scanner;

import org.junit.Test;

public class SubTest {

	@Test
	public void aa(){
		
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		System.out.println("请您输入一个整数:");
		a=sc.nextInt();
		System.out.println("请您输入另外一个整数:");
		b=sc.nextInt();
		System.out.println("您输入两个数的差为:");
		System.out.println(a-b);
		sc.close();//需要关闭资源
	}
}
