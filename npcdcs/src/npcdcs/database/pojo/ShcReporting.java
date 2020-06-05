package npcdcs.database.pojo;

public class ShcReporting {
	
	private String village;
	private int noofscreening;
	private int noofpersonBSBP;
	private int noofdiabetes;
	private int noofhypertension;
	private int noofpersonsrefchc;
	
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public int getNoofscreening() {
		return noofscreening;
	}
	public void setNoofscreening(int noofscreening) {
		this.noofscreening = noofscreening;
	}
	public int getNoofpersonBSBP() {
		return noofpersonBSBP;
	}
	public void setNoofpersonBSBP(int noofpersonBSBP) {
		this.noofpersonBSBP = noofpersonBSBP;
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
	public int getNoofpersonsrefchc() {
		return noofpersonsrefchc;
	}
	public void setNoofpersonsrefchc(int noofpersonsrefchc) {
		this.noofpersonsrefchc = noofpersonsrefchc;
	}
	@Override
	public String toString() {
		return "ShcReporting [village=" + village + ", noofscreening="
				+ noofscreening + ", noofpersonBSBP=" + noofpersonBSBP
				+ ", noofdiabetes=" + noofdiabetes + ", noofhypertension="
				+ noofhypertension + ", noofpersonsrefchc=" + noofpersonsrefchc
				+ "]";
	}
}
