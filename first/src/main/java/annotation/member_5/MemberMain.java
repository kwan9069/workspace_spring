package annotation.member_5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMain {

	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("annotation/member_5/member.xml");
		MemberDAO dao=factory.getBean("dao",MemberDAO.class);
//		MemberDAO dto=factory.getBean("dto1",MemberDAO.class);
		boolean isLogin=dao.selectMember();
		if(isLogin) {
			System.out.println(dao.dto2.getId()+ " 회원님 정상 로그인되셨습니다.");
		}
		else {
			dao.insertMember();
		}
//		MemberDTO dto1=new MemberDTO();
//		MemberDTO dto2=new MemberDTO();
//		MemberDTO dto3=new MemberDTO();
//		dao.dto=dto3;
		System.out.println("========================================");
		String[] beanNames=factory.getBeanDefinitionNames();
		for(String name:beanNames) {
			System.out.println(name);
		}
	}

}
