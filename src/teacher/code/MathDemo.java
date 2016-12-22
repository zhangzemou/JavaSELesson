package teacher.code;

public class MathDemo {

	public static void main(String[] args) {
		int c    = 89;
		int java = 92;
		int sql  = 60;
		
		System.out.println("--------------------");
		System.out.println("C\t"+"Java\t"+"SQL");
		System.out.println(c+"\t"+java+"\t"+sql);
		System.out.println("--------------------");
		
		int sub = java-sql;
		System.out.println("Java和SQL的成绩差为："+sub);
		int sum = c+java+sql;
		
		//整数除以整数结果只能是整数,整数除以小数结果肯定是小数，就算能够整除，也会保留.0;
		System.err.println(sum/3);
		System.err.println(sum/3.0);
		
	   double aveage = sum/3.0;
	   System.out.println("3门课的平均分:"+aveage);
	   
	   double a = 1.23;
	   double b = 3.32;
	   //面向对象的时候 我们可以完美地解决这个问题。double精度丢失问题 Double
	   System.out.println(a+b);
	}
}
