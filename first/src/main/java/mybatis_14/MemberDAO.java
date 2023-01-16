package mybatis_14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class MemberDAO {
	SqlSession session;
	
	public void setSession(SqlSession session) {
		this.session = session;
	}

	public List<MemberDTO> memberlist(){
		return session.selectList("member.memberlist");
	}
	
	public int membercount(){
		return session.selectOne("member.membercount");
	}
	
	public MemberDTO onemember(String id) {
		return session.selectOne("member.onemember", id);
	}
	
	public List<MemberDTO> paginglist(int[] limit){
		return session.selectList("paginglist", limit);
	}
	
	public int insertmember(MemberDTO dto) {
		return session.insert("insertmember", dto);
	}
	public int updatemember(MemberDTO dto) {
		return session.update("updatemember", dto);
	}
	public int deletemember(String id) {
		return session.delete("deletemember", id);
	}
	public List<MemberDTO> searchmember(HashMap map){
		return session.selectList("searchmember", map);
	}
	public List<MemberDTO> addresssearch(ArrayList<String> addresslist){
		return session.selectList("addresssearch", addresslist);
	}
	public List<MemberDTO> combination(MemberDTO dto){
		return session.selectList("combination", dto);//name,email ok
	}
	public List<HashMap<String, String>> memberboard(String writer){
		return session.selectList("memberboard", writer);
	}
}










