package anno.memberservice_7.copy;

public class MemberBasicService implements MemberService {
	
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