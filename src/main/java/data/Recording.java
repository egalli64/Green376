package data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RECORDINGS")
public class Recording {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RECORDING_ID")
	private int recoding_id;
	@Column(name = "DATE")
	private Date date;
	@Column(name = "CH4")
	private double CH4;
	@Column(name = "CO")
	private double CO;
	@Column(name = "NO")
	private double NO;
	@Column(name = "NO_2")
	private double NO_2;
	@Column(name = "O_3")
	private double O_3;
	@Column(name = "PM10")
	private double PM10;
	@Column(name = "PM25")
	private double PM25;
	@Column(name = "SO_2")
	private double SO_2;
	@Column(name = "STATION_ID")
	private int station_id;

	Recording(){
		
	}
	
	Recording(int recoding_id, Date date, double cH4, double cO, double nO, double nO_2, 
			double o_3, double pM10, double pM25, double sO_2, int station_id) {
		super();
		this.recoding_id = recoding_id;
		this.date = date;
		CH4 = cH4;
		CO = cO;
		NO = nO;
		NO_2 = nO_2;
		O_3 = o_3;
		PM10 = pM10;
		PM25 = pM25;
		SO_2 = sO_2;
		this.station_id = station_id;
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
	public double getCO() {
		return CO;
	}
	public void setCO(double cO) {
		CO = cO;
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
		return station_id;
	}
	public void setStation(int station_id) {
		this.station_id = station_id;
	}
	
	
	
	
	
}
