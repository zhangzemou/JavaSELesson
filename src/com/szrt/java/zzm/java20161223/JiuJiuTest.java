package com.szrt.java.zzm.java20161223;

import org.junit.Test;

public class JiuJiuTest {
	
	@Test
	public void aa(){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+i*j+" ");
				if((j==2&&i==3)){
					System.out.print(" ");
				}
				if((j==2&&i==4)){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
