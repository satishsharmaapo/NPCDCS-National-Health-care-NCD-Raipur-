package npcdcs.database.pojo;

import java.sql.Date;

public class Diagnosis {
	private int digno_id;
	private int pat_id;
	private int disease_id;
	private double disease_value;
	private double center_id;
	private String center_type;
	private Date digno_date;
	
	public int getDigno_id() {
		return digno_id;
	}
	public void setDigno_id(int digno_id) {
		this.digno_id = digno_id;
	}
	public int getPat_id() {
		return pat_id;
	}
	public void setPat_id(int pat_id) {
		this.pat_id = pat_id;
	}
	public int getDisease_id() {
		return disease_id;
	}
	public void setDisease_id(int disease_id) {
		this.disease_id = disease_id;
	}
	public double getDisease_value() {
		return disease_value;
	}
	public void setDisease_value(double disease_value) {
		this.disease_value = disease_value;
	}
	public double getCenter_id() {
		return center_id;
	}
	public void setCenter_id(double center_id) {
		this.center_id = center_id;
	}
	public String getCenter_type() {
		return center_type;
	}
	public void setCenter_type(String center_type) {
		this.center_type = center_type;
	}
	public Date getDigno_date() {
		return digno_date;
	}
	public void setDigno_date(Date digno_date) {
		this.digno_date = digno_date;
	}
	@Override
	public String toString() {
		return "Diagnosis [digno_id=" + digno_id + ", pat_id=" + pat_id
				+ ", disease_id=" + disease_id + ", disease_value="
				+ disease_value + ", center_id=" + center_id + ", center_type="
				+ center_type + ", digno_date=" + digno_date + "]";
	}
	 
	
}
