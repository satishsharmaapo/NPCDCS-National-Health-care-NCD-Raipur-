package npcdcs.database.pojo;

public class ChcReporting {
	private String subcenter;
	private int noofscreening;
	private int noofpeopleBSBP;
	private int noofdiabetes;
	private int noofhypertension;
	private int noofrefertochc;
	public String getSubcenter() {
		return subcenter;
	}
	public void setSubcenter(String subcenter) {
		this.subcenter = subcenter;
	}
	public int getNoofscreening() {
		return noofscreening;
	}
	public void setNoofscreening(int noofscreening) {
		this.noofscreening = noofscreening;
	}
	public int getNoofpeopleBSBP() {
		return noofpeopleBSBP;
	}
	public void setNoofpeopleBSBP(int noofpeopleBSBP) {
		this.noofpeopleBSBP = noofpeopleBSBP;
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
	public int getNoofrefertochc() {
		return noofrefertochc;
	}
	public void setNoofrefertochc(int noofrefertochc) {
		this.noofrefertochc = noofrefertochc;
	}
	@Override
	public String toString() {
		return "ChcReporting [subcenter=" + subcenter + ", noofscreening="
				+ noofscreening + ", noofpeopleBSBP=" + noofpeopleBSBP
				+ ", noofdiabetes=" + noofdiabetes + ", noofhypertension="
				+ noofhypertension + ", noofrefertochc=" + noofrefertochc + "]";
	}
	
	

}
