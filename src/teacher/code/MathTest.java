package teacher.code;



import org.junit.Test;

public class MathTest {
    /**
     * =  赋值
     * == 等于
     */
	@Test
	public void equal03(){
		//变量在一定的区间内不能重复定义 
		int money = 444;
		System.out.println(money);
	}
	@Test
	public void equal02(){
		//变量时可以多次赋值的
		int money = 5000;
		money = money+1000;
		System.out.println(money);
	}
	
	@Test
	public void equal01(){
		
		int a = 11;
		int b = 11;
		System.out.println(a==b);
	}
	
	/**
	 * 加等于
	 */
	@Test
	public void addEqu(){
		int a = 11;
		int b = a+5;
		int c = a%=4;
		
		System.out.println(c);
	}
	
	/**
	 * 重点 除法和求模的区别
	 */
	@Test
	public void mod(){
		/**
		 *   / 代表除法 结果取整个结果的整数部分 a=9
		 */
		int a = 49/5;
		System.out.println(a);
		
		/**
		 *   %代表是求模 结果却整个结果的余数部分 4
		 */
		int b = 49%5;
		System.out.println(b);
	}
	
	@Test
	public void addsub(){
		int a = 10;  //a=10;
		int b = 10;  //b=10;
		int c = ++a; //c=11 a=11;
		int d = b--; //d=10 b=9;
		int e = c++; //e=11 c=12
		int f = ++d; //f=11 d=11
	}
	
	@Test
	public void subsub01(){
		
		int a = 10;
		int b = --a;
		System.out.println("b="+b);
		System.out.println("a="+a);
	}
	
	@Test
	public void addadd03(){
		
		int a = 10;
		int b = ++a;
		/*
		 * int b = a+1;
		 * a=a+1;
		 */
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	
	@Test
	public void addadd02(){
		int a = 10;
		//共同点 a=11；
		//区分: b等于多少看等于后面接的第一个符号是什么？
		//如果=后面接的是a 先取后加 b=10
		//如果=后面接的是+ 先加后取 b=11
		int b = a++;
		/*
		 * int b = a;
		 * a = a+1;
		 */
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	
	@Test
	public void addadd01(){
		int a = 10;
		a++;
		System.out.println(a);
	}
	
	@Test
	public void sum02(){
		int a = 10;
		int b = 20;
		int sum = a+b;
		
		sum = ++sum;
		System.out.println(sum);
	}
	
	@Test
	public void sum01(){
		
		int a = 10;
		int b = 20;
		int sum = a+b;
		sum = sum+1;
		System.out.println(sum);
	}
}
