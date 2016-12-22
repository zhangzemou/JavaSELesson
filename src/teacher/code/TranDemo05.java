package teacher.code;

public class TranDemo05 {

	public static void main(String[] args) {
		//正是可以自动转化成类型,从小到大 可以自动转化，反之要强制类型转化
		double score=95;
		
		//强制类型转化 取舍
		int money=(int)200.32;
		System.out.println(score+"\t"+money);
		//因为double占了8个字节，int占了4个字节，所以int可以自动转化成double
	}
	
}
