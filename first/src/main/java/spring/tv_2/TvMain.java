package spring.tv_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory= new ClassPathXmlApplicationContext("spring/tv_2/tv.xml");
//		TV tv= (TV)factory.getBean("tv2");
		TV tv= factory.getBean("tv2",TV.class);
//		TV tv=new SamsungTV();
		tv.powerOn();
		tv.soundUp(5);
		tv.soundDown(3);
		tv.powerOff();
		tv=new LgTV();
		tv.powerOn();
		tv.soundUp(5);
		tv.soundDown(3);
		tv.powerOff();	
		TV tv2=(TV) factory.getBean("tv2"); //2. return tv
		TV tv3=(TV) factory.getBean("tv2"); //3.reutrn tv
	}
	
	/*
	 * 개발자- 일부 코드 수정시에 길이 따라서 변경 부분 많아진다. --> 최소화
	 * 인터페이스 공통 기능 명세서 각각 tv들은 공통 메소드 구현
	 * 외부공장 전달받은 TV 사용-MAIN(객체 생성 제어권-- 팩토리)
	 * 1> inversion of control 
	 * 2> pojo 클래스 사용
	 * 3> 프로그램 구현 방식 - 자바 디자인 패턴 - 내장 factory pattern + 인터페이스 - ioc
	 * 4> singleton pattern - 1개만 생성 공유 
	 * 
	 */
	
	

}
