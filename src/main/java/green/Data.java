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
		
		
		// CH4
		double avgCH4 = op.avgCH4(list);
		String aqCH4 = op.selectAQ(avgCH4,0);
		request.setAttribute("averageCH4", avgCH4);
		request.setAttribute("aqCH4", aqCH4);
		
		// CO
		double avgCO = op.avgCO(list);
		String aqCO = op.selectAQ(avgCO,1);
		request.setAttribute("averageCO", avgCO);
		request.setAttribute("aqCO", aqCO);
		
		// SO2
		double avgSO2 = op.avgSO2(list);
		String aqSO2 = op.selectAQ(avgSO2,2);
		request.setAttribute("averageSO2", avgSO2);
		request.setAttribute("aqSO2", aqSO2);
		
		// NO
		double avgNO = op.avgNO(list);
		String aqNO = op.selectAQ(avgNO,3);
		request.setAttribute("averageNO", avgNO);
		request.setAttribute("aqNO", aqNO);
		
		// NO2
		double avgNO2 = op.avgNO2(list);
		String aqNO2 = op.selectAQ(avgNO2,4);
		request.setAttribute("averageNO2", avgNO2);
		request.setAttribute("aqNO2", aqNO2);
		
		// O3
		double avgO3 = op.avgO3(list);
		String aqO3 = op.selectAQ(avgO3,5);
		request.setAttribute("averageO3", avgO3);
		request.setAttribute("aqO3", aqO3);

		// PM 10
		double avgPM10 = op.avgPM10(list);
		String aqPM10 = op.selectAQ(avgPM10,6);
		request.setAttribute("averagePM10", avgPM10);
		request.setAttribute("aqPM10", aqPM10);
		
		// PM 25
		double avgPM25 = op.avgPM25(list);
		String aqPM25 = op.selectAQ(avgPM25,7);
		request.setAttribute("averagePM25", avgPM25);
		request.setAttribute("aqPM25", aqPM25);
		
		
		request.getRequestDispatcher("result.jsp").forward(request, response);

		

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
