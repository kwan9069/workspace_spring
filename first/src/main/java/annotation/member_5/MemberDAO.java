package annotation.member_5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
@Repository("dao")
public class MemberDAO {
	@Autowired //2개 dto,dto2
//	@Qualifier("dto")
	MemberDTO dto2;
/* 1.MemberDTO 타입 객체를 찾는다.
 * 2. 여러개 찾는다- 변수명 일치 객체 찾는다. 1개 자동 주입.
 * 3. 객체 여러개 찾는다- 이름 일치하지 않는다. - Qualifier("dto2")
 * 
 */
	public void setDto(MemberDTO dto2) {
		this.dto2 = dto2;
		// dto1,dto2,dto3+ 하위클래스 객체 (ioc, 구현, dependency injection)
	}
	
	public boolean selectMember() {
		
		if (dto2.getId().equals("spring") && dto2.getPw().equals("1111"))
		{
			return true;}
		else {
			return false;
		}			
		
	}
	public void insertMember() {
		System.out.println(dto2.getId()+" 님 회원가입 되셨습니다.");//id 가 psring 이고 pw 1111이면 정상 로그인
	}
	
	
}
