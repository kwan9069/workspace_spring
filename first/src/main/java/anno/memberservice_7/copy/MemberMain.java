package anno.memberservice_7.copy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMain {
	public static void main(String args[]) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("memberservice_4/member.xml");
		
		MemberService service = factory.getBean("service", MemberBasicService.class);
		
		service.registerMember();
		
			
			
		System.out.println("========================================");
		String[] beanNames=factory.getBeanDefinitionNames();
		for(String name:beanNames) {
			System.out.println(name);
		}
			
//		MemberDAO dto2 = new MemberDTO();
//		MemberDAO dto3 = new MemberDTO();;
			
			
			
			
	}

}
