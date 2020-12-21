package data;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import green.JpaUtil;


public class RecordingDao {
	private static final Logger LOG = LoggerFactory.getLogger(RecordingDao.class);

	public List<Recording> readByStation(int station_id) {
        EntityManager em = null;

        try {
            em = JpaUtil.getEntityManager();
            String jpql = "SELECT e from Recording e where e.station_id = ?1";
            var query = em.createQuery(jpql, Recording.class);
            query.setParameter(1,station_id);
            List<Recording> rs = query.getResultList();
            return rs;
 
        } catch (Exception ex) {
            LOG.error("Can't create query: " + ex.getMessage());
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
	}

}
