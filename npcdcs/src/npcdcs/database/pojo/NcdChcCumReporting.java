package npcdcs.database.pojo;

public class NcdChcCumReporting {
	 
	private String sex;
	private int month;
	private int noofsex;
	private int noofperson;
	private int noofdiabetic;
	private int noofhypertension;
	private int noofcardiovascular;
	private int noofcancer;
	private int noofrefpatient;
	private int noofhomevisit;
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getNoofsex() {
		return noofsex;
	}
	public void setNoofsex(int noofsex) {
		this.noofsex = noofsex;
	}
	public int getNoofperson() {
		return noofperson;
	}
	public void setNoofperson(int noofperson) {
		this.noofperson = noofperson;
	}
	public int getNoofdiabetic() {
		return noofdiabetic;
	}
	public void setNoofdiabetic(int noofdiabetic) {
		this.noofdiabetic = noofdiabetic;
	}
	public int getNoofhypertension() {
		return noofhypertension;
	}
	public void setNoofhypertension(int noofhypertension) {
		this.noofhypertension = noofhypertension;
	}
	public int getNoofcardiovascular() {
		return noofcardiovascular;
	}
	public void setNoofcardiovascular(int noofcardiovascular) {
		this.noofcardiovascular = noofcardiovascular;
	}
	public int getNoofcancer() {
		return noofcancer;
	}
	public void setNoofcancer(int noofcancer) {
		this.noofcancer = noofcancer;
	}
	public int getNoofrefpatient() {
		return noofrefpatient;
	}
	public void setNoofrefpatient(int noofrefpatient) {
		this.noofrefpatient = noofrefpatient;
	}
	public int getNoofhomevisit() {
		return noofhomevisit;
	}
	public void setNoofhomevisit(int noofhomevisit) {
		this.noofhomevisit = noofhomevisit;
	}
	@Override
	public String toString() {
		return "NcdChcCumReporting [sex=" + sex + ", month=" + month
				+ ", noofsex=" + noofsex + ", noofperson=" + noofperson
				+ ", noofdiabetic=" + noofdiabetic + ", noofhypertension="
				+ noofhypertension + ", noofcardiovascular="
				+ noofcardiovascular + ", noofcancer=" + noofcancer
				+ ", noofrefpatient=" + noofrefpatient + ", noofhomevisit="
				+ noofhomevisit + "]";
	}
	 
	 

}
