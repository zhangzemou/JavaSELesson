package teacher.code;

public class PrictiesDemo01 {

	public static void main(String[] args) {
		String name  = "张三";
		double score = 98.5;
		char     sex = '男';
		int      age = 18;
		
		//1 先打印出横线
		System.out.println("---------------------------");
		
		//2 打印出表格的开头
		System.out.println("姓名\t"+"分数\t"+"性别\t"+"年龄");
		
		//3 打印出表格的内容
		 System.out.println(name+"\t"+score+"\t"+sex+"\t"+age);
		 System.out.println("---------------------------");
	}
}
