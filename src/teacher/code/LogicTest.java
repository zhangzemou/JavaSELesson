package teacher.code;

import org.junit.Test;

public class LogicTest {
	
	@Test
	public void xx04(){
		//本科毕业或工作两年以上才能参加初试
		//大专 本科
		String xuewei = "本科";
		int years = 5;
		System.out.println(!("本科".equals(xuewei) || years>=2));
		
	}
	
	@Test
	public void xx03(){
		//大专 本科
		String xuewei = "专科";
		int years = 0;
		System.out.println("本科".equals(xuewei) || years>=2);
	}
	
	@Test
	public void xx02(){
		//本科毕业或工作两年以上才能参加初试
		//10大专 20本科 30硕士 40博士
		int xuewei = 20;
		int years = 1;
		System.out.println(xuewei>=20 || years>=2);
	}
	
	@Test
	public void xx01(){
		//语文和数学都大于60分才能升学
		int yw = 89;
		int sx = 71;
		boolean yq = yw>60 && sx>60;
		System.out.println(yq);
	}

}
