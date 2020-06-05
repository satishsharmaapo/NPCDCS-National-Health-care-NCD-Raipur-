package npcdcs.database.pojo;
//form 2c  NCD Clinic at Community Health Center
public class NcdAtChcReporting {
  private int noofperson;
  private int noofdiabetes;
  private int noofhypertension;
  private int noofcardiovascular;
  private int noofcancer;
  private int noofreftodistrict;
  private int noofhomevisit;
public int getNoofperson() {
	return noofperson;
}
public void setNoofperson(int noofperson) {
	this.noofperson = noofperson;
}
public int getNoofdiabetes() {
	return noofdiabetes;
}
public void setNoofdiabetes(int noofdiabetes) {
	this.noofdiabetes = noofdiabetes;
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
public int getNoofreftodistrict() {
	return noofreftodistrict;
}
public void setNoofreftodistrict(int noofreftodistrict) {
	this.noofreftodistrict = noofreftodistrict;
}
public int getNoofhomevisit() {
	return noofhomevisit;
}
public void setNoofhomevisit(int noofhomevisit) {
	this.noofhomevisit = noofhomevisit;
}
@Override
public String toString() {
	return "NcdAtChcReporting [noofperson=" + noofperson + ", noofdiabetes="
			+ noofdiabetes + ", noofhypertension=" + noofhypertension
			+ ", noofcardiovascular=" + noofcardiovascular + ", noofcancer="
			+ noofcancer + ", noofreftodistrict=" + noofreftodistrict
			+ ", noofhomevisit=" + noofhomevisit + "]";
}
   
}
