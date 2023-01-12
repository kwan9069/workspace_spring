package mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet("/DispatcherServlet")
public class DispatcherServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri=request.getRequestURI();
		String uri_array[]=uri.split("/");
		String result=uri_array[uri_array.length-1];
		HandlerMapping mappings=new HandlerMapping();
		Controller controller=mappings.getController(uri);
		String viewname=controller.handleRequest(request, response);
		//포워드
		RequestDispatcher rd=request.getRequestDispatcher(viewname);
		rd.forward(request, response);
		
	}

	

}
