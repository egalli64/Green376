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
		
		double value = result/count;
		
		return (double)Math.round(value * 100000d) / 100000d;
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
		
		double value = result/count;
		
		return (double)Math.round(value * 100000d) / 100000d;
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
		
		double value = result/count;
		
		return (double)Math.round(value * 100000d) / 100000d;
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
		
		double value = result/count;
		
		return (double)Math.round(value * 100000d) / 100000d;
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
		
		double value = result/count;
		
		return (double)Math.round(value * 100000d) / 100000d;
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
		
		double value = result/count;
		
		return (double)Math.round(value * 100000d) / 100000d;
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
		
		double value = result/count;
		
		return (double)Math.round(value * 100000d) / 100000d;
	}
	
	
	public String selectAQ(double avg, int row) {
		
		
		double[][] th = new double[][] {{1,2},{0.2,0.4},{5,6},{20,40},{30,40},{100,125},{25,40},{15,25}};
		//								CH4    C0		SO2		NO    NO2	    O3		PM10	PM25
		
		
		if(avg>th[row][1] ) {	
			return "btn-danger";		
		} else if (th[row][0]<avg && avg<th[row][1]) {
			return "btn-warning";
		}else {
			return "btn-success";
		}
	}
	
			
			

			
			
	
}
