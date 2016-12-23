package com.szrt.java.java20161223.prictise;

import java.util.Scanner;

import org.junit.Test;

public class RaceTest {
	
	@Test
	public void race(){
		Scanner sc=new Scanner(System.in);
		int race;
		System.out.println("请输入一个数:");
		race=sc.nextInt();
		sc.close();
		if(race>=350){
			System.out.println("您乘坐的是高铁......");
		}else if(race>=120&&race<350){
			System.out.println("您乘坐的是汽车......");
		}else if(race>=40&&race<120){
			System.out.println("您乘坐的是机动车......");
		}else{
			System.out.println("您现在在步行......");
		}
	}
}
