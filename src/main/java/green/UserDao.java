package green;

import java.util.List;

import javax.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class UserDao extends Dao<User>{
	static protected final Logger LOG = LoggerFactory.getLogger(UserDao.class);
	
    public boolean isUser(String username, String password) {
        EntityManager em = null;

        try {
            em = JpaUtil.getEntityManager();
            String jpql = "SELECT e from User e where e.username = ?1 and e.password = ?2";
            var query = em.createQuery(jpql, User.class);
            query.setParameter(1, username);
            query.setParameter(2, password);
            List<User> rs = query.getResultList();
            if(rs.size()==1) {
            	return true;
            } else {
            	return false;
            }
 
        } catch (Exception ex) {
            LOG.error("Can't create query: " + ex.getMessage());
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        
    }
    

        
    public User read(int id) {
        EntityManager em = null;

        try {
            em = JpaUtil.getEntityManager();
            return em.find(User.class, id);
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
