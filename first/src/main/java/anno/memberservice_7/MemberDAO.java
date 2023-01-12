package anno.memberservice_7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("memberdao")
public class MemberDAO {
	@Autowired  //dto1,dto2,dto3
	@Qualifier("dto2")   //spring,1111
	MemberDTO dto;

//	public void setDto(MemberDTO dto) {
//		this.dto = dto;
//		// dto1,dto2,dto3+ 하위클래스 객체 (ioc, 구현, dependency injection)
//	}
	
	public boolean selectMember() {
		
		if (dto.getId().equals("spring") && dto.getPw().equals("1111"))
		{
			return true;}
		else {
			return false;
		}			
		
	}
	public void insertMember() {
		System.out.println(dto.getId()+" 님 회원가입 되셨습니다.");//id 가 psring 이고 pw 1111이면 정상 로그인
	}
	
	
}
