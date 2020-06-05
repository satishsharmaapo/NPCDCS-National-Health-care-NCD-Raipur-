package npcdcs.database.pojo;

import java.sql.Date;

public class ScreeningReport {
	private Date date1;
	private int noofperson;
	private int suspectedfordiabetes;
	private int suspectedforhypertension;
	public Date getDate1() {
		return date1;
	}
	public void setDate1(Date date1) {
		this.date1 = date1;
	}
	public int getNoofperson() {
		return noofperson;
	}
	public void setNoofperson(int noofperson) {
		this.noofperson = noofperson;
	}
	public int getSuspectedfordiabetes() {
		return suspectedfordiabetes;
	}
	public void setSuspectedfordiabetes(int suspectedfordiabetes) {
		this.suspectedfordiabetes = suspectedfordiabetes;
	}
	public int getSuspectedforhypertension() {
		return suspectedforhypertension;
	}
	public void setSuspectedforhypertension(int suspectedforhypertension) {
		this.suspectedforhypertension = suspectedforhypertension;
	}
	@Override
	public String toString() {
		return "ScreeningReport [date1=" + date1 + ", noofperson=" + noofperson
				+ ", suspectedfordiabetes=" + suspectedfordiabetes
				+ ", suspectedforhypertension=" + suspectedforhypertension
				+ "]";
	}
    
}
