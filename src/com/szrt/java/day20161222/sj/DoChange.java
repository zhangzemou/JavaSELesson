package com.szrt.java.day20161222.sj;

import org.junit.Test;

public class DoChange {

	@Test
	public void doChange(){
		int left=10;
		int right=8;
		int center;
		System.out.println("比较前的值:");
		System.out.println("left:"+left+"\t"+"right:"+right);
		if(left>right){
			center=left;
			left=right;
			right=center;
		}
		System.out.println("比较后的值：");
		System.out.println("left:"+left+"\t"+"right:"+right);
	}
}
