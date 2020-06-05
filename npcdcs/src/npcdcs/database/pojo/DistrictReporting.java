package npcdcs.database.pojo;

public class DistrictReporting {
	private String chccenter;
	private int noofscreening;
	private int noofpeopleBSBP;
	private int noofdiabetes;
	private int noofhypertension;
	private int noofrefersubtochc;
	private int noofhomevisit;
	
	public int getNoofhomevisit() {
		return noofhomevisit;
	}
	public void setNoofhomevisit(int noofhomevisit) {
		this.noofhomevisit = noofhomevisit;
	}
	public String getChccenter() {
		return chccenter;
	}
	public void setChccenter(String chccenter) {
		this.chccenter = chccenter;
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
	public int getNoofrefersubtochc() {
		return noofrefersubtochc;
	}
	public void setNoofrefersubtochc(int noofrefersubtochc) {
		this.noofrefersubtochc = noofrefersubtochc;
	}
	@Override
	public String toString() {
		return "DistrictReporting [chccenter=" + chccenter + ", noofscreening="
				+ noofscreening + ", noofpeopleBSBP=" + noofpeopleBSBP
				+ ", noofdiabetes=" + noofdiabetes + ", noofhypertension="
				+ noofhypertension + ", noofrefersubtochc=" + noofrefersubtochc
				+ "]";
	}	
}
