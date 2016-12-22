package com.szrt.java.day20161222.sj;



import org.junit.Test;

public class Page {

	@Test
	public void page(){
		int allNumber=56;  //主题总数
		int listNumber=10;  //每页显示的主题数
		int allPage=0;  //需要的总页数
		
		allPage=(int)Math.floor((double)allNumber/listNumber);
		System.out.println("需要的总页数:"+allPage);
		
		allPage=allNumber/listNumber;
		System.out.println("共需要的总页数："+allPage);
		System.out.println("共需要的总页数:"+(double)allNumber/listNumber);
	}
}
