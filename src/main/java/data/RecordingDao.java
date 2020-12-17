package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RecordingDao implements Dao<Recording> {
	private static final Logger LOG = LoggerFactory.getLogger(RecordingDao.class);

	private static final String GET_BY_STATION = "SELECT * FROM recordings WHERE station = ?;";
	private static final String GET_ALL = "SELECT * FROM recordings;";

	@Override
	public List<Recording> getAll() {
		List<Recording> results = new ArrayList<Recording>();
		try (Connection conn = Connector.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(GET_ALL)) {
			while (rs.next()) {
				Recording rec = new Recording(rs.getInt(1), rs.getDate(2), rs.getDouble(3), rs.getDouble(4),
						rs.getDouble(5), rs.getDouble(6), rs.getDouble(7), rs.getDouble(8), rs.getDouble(9),
						rs.getDouble(10), rs.getInt(11));
				results.add(rec);
			}
		} catch (SQLException se) {
			LOG.error("Can't get all recordings", se);
		}
		return results;
	}

//	@Override
//	public Recording getByStation(int n) {
//		
//		Recording result = new Recording();
//		try(Connection conn = Connector.getConnection();
//				PreparedStatement stmt = conn.prepareStatement(GET_BY_STATION);
//				stmt.setInt(1, n);
//				ResultSet rs = stmt.executeQuery()){
//			result.setRecoding_id(rs.getInt(1));
//			result.setDate(rs.getDate(2));
//			//result.
////			 rs.getDouble(3), rs.getDouble(4),
////					rs.getDouble(5), rs.getDouble(6), rs.getDouble(7), rs.getDouble(8), rs.getDouble(9),
////					rs.getDouble(10), rs.getInt(11));
//			
//		} catch (SQLException se) {
//			LOG.error("Can't get the recording", se);
//		}
//		
//		return result;
//	}

	@Override
	public void save(Recording t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Recording t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Recording getByStation(int n) {
		// TODO Auto-generated method stub
		return null;
	}

}
