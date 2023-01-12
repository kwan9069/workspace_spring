package springmvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ListController implements Controller {
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
	ArrayList<String> max = new ArrayList<String>();
	HelloDTO dto=new HelloDTO();
	max.add("Jin");
	max.add("jhope");
	max.add("rm");
	max.add("blackpink");
	max.add("bigbang");
	dto.setMembers(max);
	ModelAndView mv=new ModelAndView();
	mv.addObject("model",dto);
	mv.setViewName("list");
	//view 설정
	return mv; //$ (model.message)
	}
//	@Override
//	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
//		// TODO Auto-generated method stub
//		//model 설정
//		HelloDTO dto=new HelloDTO();
//		dto.setMessage("컨트롤러가 view로 전달하는 모델입니다.");
//		request.setAttribute("model", dto);
//		return"hello.jsp"; //$ (model.message)
//	}
	
	
	
}

