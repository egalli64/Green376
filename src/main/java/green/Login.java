package green;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// TODO controllo user password

		// SELECT --> RS

		UserDao ud = new UserDao();
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);

		boolean flag = ud.isUser(username, password);
		String url;
		if (flag) {

			session.setAttribute("user", user);
			if (user.getUsername().equals("xxx") && user.getPassword().equals("yyy")) {
				url = "/privateLogged.jsp";
			} else {
				url = "/logged.jsp";
			}

		} else {
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
