package npcdcs.database.pojo;

public class Shc {
	private int sub_id;
	private int chc_id;
	private int phc_id;
	private String sub_name;
	
	public int getSub_id() {
		return sub_id;
	}
	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}
	public int getChc_id() {
		return chc_id;
	}
	public void setChc_id(int chc_id) {
		this.chc_id = chc_id;
	}
	public int getPhc_id() {
		return phc_id;
	}
	public void setPhc_id(int phc_id) {
		this.phc_id = phc_id;
	}
	public String getSub_name() {
		return sub_name;
	}
	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}
	
	@Override
	public String toString() {
		return "Shc [sub_id=" + sub_id + ", chc_id=" + chc_id + ", phc_id="
				+ phc_id + ", sub_name=" + sub_name + "]";
	}
	 
}
