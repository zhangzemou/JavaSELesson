package com.szrt.java.java20161223.demo01;

import org.junit.Test;

public class IFTest {

	@Test
	public void xx01(){
		int teacherAge=33;
		int studentAge=23;
		
		boolean result=teacherAge>studentAge;
		System.out.println(result);
		if(result){
			System.out.println("老师的年龄比较大");
		}
				
	}
	@Test
	public void xx02(){
		int teacherAge=33;
		int studentAge=43;
		
		boolean result=teacherAge>studentAge;
		System.out.println(result);
		if(result){
			System.out.println("老师的年龄比较大");
		}else{
			System.out.println("老师的年龄比较小");
		}
				
	}
	
	/**
	 * 总结：
	 * 1、代码的规范 最后一个else 是不需要接if
	 * 2、{不能随便回车
	 * 3、else if 可以写0个 也可以写1个 也可以写多个 注意else和后面的if中间只能有1个空格
	 * 4、虽然有多个语句  多个语句中有且只有1条语句被执行
	 * 5、{要顶着小括号 中间不能有空格
	 * 6、该有的空格一个不能少，不该有的空格一个不能多，职业素质
	 */
	@Test
	public void fcwr(){
		boolean tall   = false;
		boolean money  = false;
		boolean cool   = false;
		
		if(tall){
			System.out.println("因为你高,我选择你了......");
		}else if(money){
			System.out.println("因为您有钱,我选择你了......");
		}else if(cool){
			System.out.println("因为你很帅,我选择你了");
		}else{
			System.out.println("你不高又没钱又不帅,我凭我什么选择你呀 ......");
		}
	}
}
