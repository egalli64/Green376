package data;

import java.util.List;

public interface Dao<T> {
	
    List<T> getAll();
    
    T getByStation(int n);

    void save(T t);

    void update(T t);

    void delete(long id);

}
