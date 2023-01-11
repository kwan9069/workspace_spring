package memberservice_4;

public class MemberJanService implements MemberService {
	MemberDAO memberdao;
	PointDAO pointdao;
	
	public MemberDAO getMemberdao() {
		return memberdao;
	}

	public void setMemberdao(MemberDAO memberdao) {
		this.memberdao = memberdao;
	}

	public PointDAO getPointdao() {
		return pointdao;
	}

	public void setPointdao(PointDAO pointdao) {
		this.pointdao = pointdao;
	}

	@Override
	public void registerMember() {
		boolean isLogin = memberdao.selectMember();
		if(!isLogin) {
			memberdao.insertMember();
			//pointdao.setPoint(10000);
			System.out.println(pointdao.getPoint() + " 포인트를 받았습니다.");
		}
	}
}