package green;

import java.util.Iterator;
import java.util.List;
import data.*;


public class Operations {
	
	
	public double avgCH4(List<Recording> rs) {
		
		double result = 0; 
		double count = 0;
		Iterator<Recording> it = rs.iterator();
		
		while(it.hasNext()) {
			if(it.next()!=null) {
				result += it.next().getCH4();
				count++;
			}		
		}
		
		return result/count;
	}

}
