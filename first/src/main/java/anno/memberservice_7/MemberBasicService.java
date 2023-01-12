package anno.memberservice_7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service2") //memberBasicService
public class MemberBasicService implements MemberService {
	@Autowired
	MemberDAO dao;
	
	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}
	@Override
	public void registerMember() {
		boolean isLogin = dao.selectMember();
		if(!isLogin) {
			dao.insertMember();
		}

	}
}