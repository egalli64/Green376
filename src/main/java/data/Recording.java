package data;

import java.util.Date;

public class Recording {
	
	private int recoding_id;
	private Date date;
	private double CH4;
	private double C0;
	private double NO;
	private double NO_2;
	private double O_3;
	private double PM10;
	private double PM25;
	private double SO_2;
	private int station;

	Recording(){
		
	}
	
	Recording(int recoding_id, Date date, double cH4, double c0, double nO, double nO_2, 
			double o_3, double pM10, double pM25, double sO_2, int station) {
		super();
		this.recoding_id = recoding_id;
		this.date = date;
		CH4 = cH4;
		C0 = c0;
		NO = nO;
		NO_2 = nO_2;
		O_3 = o_3;
		PM10 = pM10;
		PM25 = pM25;
		SO_2 = sO_2;
		this.station = station;
	}

	public int getRecoding_id() {
		return recoding_id;
	}
	public void setRecoding_id(int recoding_id) {
		this.recoding_id = recoding_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getCH4() {
		return CH4;
	}
	public void setCH4(double cH4) {
		CH4 = cH4;
	}
	public double getC0() {
		return C0;
	}
	public void setC0(double c0) {
		C0 = c0;
	}
	public double getNO() {
		return NO;
	}
	public void setNO(double nO) {
		NO = nO;
	}
	public double getNO_2() {
		return NO_2;
	}
	public void setNO_2(double nO_2) {
		NO_2 = nO_2;
	}
	public double getO_3() {
		return O_3;
	}
	public void setO_3(double o_3) {
		O_3 = o_3;
	}
	public double getPM10() {
		return PM10;
	}
	public void setPM10(double pM10) {
		PM10 = pM10;
	}
	public double getPM25() {
		return PM25;
	}
	public void setPM25(double pM25) {
		PM25 = pM25;
	}
	public double getSO_2() {
		return SO_2;
	}
	public void setSO_2(double sO_2) {
		SO_2 = sO_2;
	}
	public int getStation() {
		return station;
	}
	public void setStation(int station) {
		this.station = station;
	}
	
	
	
	
	
}
