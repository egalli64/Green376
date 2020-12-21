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
		
		double avgCH4 = op.avgCH4(list);
		double avgCO = op.avgCO(list);
		double avgO3 = op.avgO3(list);
		double avgSO2 = op.avgSO2(list);
		double avgPM10 = op.avgPM10(list);
		double avgPM25 = op.avgPM25(list);
		double avgNO = op.avgNO(list);
		double avgNO2 = op.avgNO2(list);
		
		
		
		request.setAttribute("averageCH4", avgCH4);
		request.setAttribute("averageCO", avgCO);
		request.setAttribute("averageO3", avgO3);
		request.setAttribute("averagePM10", avgPM10);
		request.setAttribute("averagePM25", avgPM25);
		request.setAttribute("averageNO", avgNO);
		request.setAttribute("averageNO2", avgNO2);
		request.setAttribute("averageSO2", avgSO2);
		
		
		request.getRequestDispatcher("result.jsp").forward(request, response);

		

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
