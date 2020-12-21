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
		double value = result/count;
		
		return (double)Math.round(value * 100000d) / 100000d;
	}

	public double avgCO(List<Recording> rs) {
		
		double result = 0; 
		double count = 0;
		Iterator<Recording> it = rs.iterator();
		
		while(it.hasNext()) {
			if(it.next()!=null) {
				result += it.next().getCO();
				count++;
			}		
		}
		
		return result/count;
	}
	
	public double avgNO(List<Recording> rs) {
		
		double result = 0; 
		double count = 0;
		Iterator<Recording> it = rs.iterator();
		
		while(it.hasNext()) {
			if(it.next()!=null) {
				result += it.next().getNO();
				count++;
			}		
		}
		
		return result/count;
	}
	
	public double avgNO2(List<Recording> rs) {
		
		double result = 0; 
		double count = 0;
		Iterator<Recording> it = rs.iterator();
		
		while(it.hasNext()) {
			if(it.next()!=null) {
				result += it.next().getNO_2();
				count++;
			}		
		}
		
		return result/count;
	}
	
	public double avgSO2(List<Recording> rs) {
		
		double result = 0; 
		double count = 0;
		Iterator<Recording> it = rs.iterator();
		
		while(it.hasNext()) {
			if(it.next()!=null) {
				result += it.next().getSO_2();
				count++;
			}		
		}
		
		return result/count;
	}
	
	public double avgO3(List<Recording> rs) {
		
		double result = 0; 
		double count = 0;
		Iterator<Recording> it = rs.iterator();
		
		while(it.hasNext()) {
			if(it.next()!=null) {
				result += it.next().getO_3();
				count++;
			}		
		}
		
		return result/count;
	}
	
	public double avgPM10(List<Recording> rs) {
		
		double result = 0; 
		double count = 0;
		Iterator<Recording> it = rs.iterator();
		
		while(it.hasNext()) {
			if(it.next()!=null) {
				result += it.next().getPM10();
				count++;
			}		
		}
		
		return result/count;
	}
	
	public double avgPM25(List<Recording> rs) {
		
		double result = 0; 
		double count = 0;
		Iterator<Recording> it = rs.iterator();
		
		while(it.hasNext()) {
			if(it.next()!=null) {
				result += it.next().getPM25();
				count++;
			}		
		}
		
		return result/count;
	}
	
	
	
	
	
}
