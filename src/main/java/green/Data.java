package green;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import data.Recording;
import data.RecordingDao;

@WebServlet("/data")
public class Data extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String station = request.getParameter("station");
		int station_id = Integer.parseInt(station);

		RecordingDao rd = new RecordingDao();
		Operations op = new Operations();

		List<Recording> list = rd.readByStation(station_id);
		
		double avg = op.avgCH4(list);
		
		request.setAttribute("average", avg);
		
		request.getRequestDispatcher("result.jsp").forward(request, response);

		

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
