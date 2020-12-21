package green;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("ueueueueueueu");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		UserDao ud = new UserDao();
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);

		if (ud.create(user)) {
			System.out.println("new user created: " + username);
		} else {
			System.out.println("can't create user: " + username);
		}

		request.setAttribute("user", user);

		request.getRequestDispatcher("login.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
