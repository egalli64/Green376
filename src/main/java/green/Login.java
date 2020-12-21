package green;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// TODO controllo user  password
		
		// SELECT --> RS 
		
		UserDao ud = new UserDao();

		boolean flag = ud.isUser(username, password);
		System.out.println("*********"+flag);
		String url;
		if(flag) {
			url = "/logged.jsp";
		} else{
			url = "/unknown.jsp";
		}
		
		request.setAttribute("username", username);
//
//		String url;
//		if (user == null || password == null || user.isBlank() || password.isBlank()) {
//			url = "/unknown.jsp";
//		} else {
//			url = "/logged.jsp";
//		}
		
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}
