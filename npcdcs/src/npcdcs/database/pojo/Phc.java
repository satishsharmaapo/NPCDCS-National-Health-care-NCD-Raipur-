package npcdcs.database.pojo;

public class Phc {
	private int phc_id;
	private int chc_id;
	private String phc_name;
	
	public int getPhc_id() {
		return phc_id;
	}
	public void setPhc_id(int phc_id) {
		this.phc_id = phc_id;
	}
	public int getChc_id() {
		return chc_id;
	}
	public void setChc_id(int chc_id) {
		this.chc_id = chc_id;
	}
	public String getPhc_name() {
		return phc_name;
	}
	public void setPhc_name(String phc_name) {
		this.phc_name = phc_name;
	}
	@Override
	public String toString() {
		return "Phc [phc_id=" + phc_id + ", chc_id=" + chc_id + ", phc_name="
				+ phc_name + "]";
	}
	
	
	 
}
