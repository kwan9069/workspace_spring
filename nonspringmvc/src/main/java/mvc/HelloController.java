package mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		//model 설정
		HelloDTO dto=new HelloDTO();
		dto.setMessage("컨트롤러가 view로 전달하는 모델입니다.");
		request.setAttribute("model", dto);
		return"hello.jsp"; //$ (model.message)
	}
	
}
