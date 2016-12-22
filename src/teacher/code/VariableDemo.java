package teacher.code;

public class VariableDemo {

	/**
	 *方法的注释 还有类的注释 必须是/**才是正确的
	 * 
	 */
	public static void main(String[] args) {
		
		//单行注释 写2个斜杠
		/*int age;
		age=33;
		System.out.println(age);
		*/
	/*	int age=33;
		System.out.println(age);*/
		//byte money01=128;byte的范围为-128-127
		byte money01=127;
		System.out.println(money01);
		System.out.println("byte="+Byte.MAX_VALUE);
		
		int money02=1111111;
		System.out.println(money02);
		System.out.println("Integer="+Integer.MAX_VALUE);
		short money03=33;
		System.out.println("short="+Short.MIN_VALUE);
		//byte short int long 都是表示整数 没有小数点 区别在于范围的不同。如果您想自动具体的范围，MAX_VALUE和MIN_VALUE
	}
}
