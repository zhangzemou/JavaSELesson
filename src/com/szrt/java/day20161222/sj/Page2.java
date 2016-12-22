package com.szrt.java.day20161222.sj;

import java.util.Scanner;

import org.junit.Test;

public class Page2 {

	@Test
	public void page2(){
		int allNumber;//主题总数
		int listNumber;//每页的主题数
		int allPage;//需要的总页数
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入主题总数：");
		allNumber=sc.nextInt();
		System.out.println("请输入每页的主题数:");
		listNumber=sc.nextInt();
	    if(allNumber<0||listNumber<0){
	    	System.out.println("您输入的主题数不合法，请重新输入");
	    	return;
	    }
	    if(allNumber>0&&listNumber>0){
	    	 allPage=(int)Math.ceil((double)allNumber/listNumber);
	    	System.out.println("需要的总页数为:"+allPage);
	    }
		
	}
}
