package tv_1;

public class TvMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TVFactory factory=new TVFactory();
		TV tv=factory.getTV("삼성");
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
	}
	
	/*
	 * 개발자- 일부 코드 수정시에 길이 따라서 변경 부분 많아진다. --> 최소화
	 * 인터페이스 공통 기능 명세서 각각 tv들은 공통 메소드 구현
	 * 외부공장 전달받은 TV 사용-MAIN(객체 생성 제어권-- 팩토리)
	 * inversion of control 
	 * 
	 * 
	 */
	
	

}
