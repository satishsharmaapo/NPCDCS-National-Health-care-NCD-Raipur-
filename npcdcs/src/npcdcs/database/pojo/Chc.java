package npcdcs.database.pojo;

public class Chc {
	private int chc_id;
	private int district_id;
	private String chc_name;
	public int getChc_id() {
		return chc_id;
	}
	public void setChc_id(int chc_id) {
		this.chc_id = chc_id;
	}
	public int getDistrict_id() {
		return district_id;
	}
	public void setDistrict_id(int district_id) {
		this.district_id = district_id;
	}
	public String getChc_name() {
		return chc_name;
	}
	public void setChc_name(String chc_name) {
		this.chc_name = chc_name;
	}
	@Override
	public String toString() {
		return "Chc [chc_id=" + chc_id + ", district_id=" + district_id
				+ ", chc_name=" + chc_name + "]";
	}
	
	 
 
}
