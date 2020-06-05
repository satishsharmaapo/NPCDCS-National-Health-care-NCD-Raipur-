package npcdcs.database.pojo;

public class District {
	private int district_id;
	private int state_id;
	private String district_name;
	
	public int getDistrict_id() {
		return district_id;
	}
	public void setDistrict_id(int district_id) {
		this.district_id = district_id;
	}
	public int getState_id() {
		return state_id;
	}
	public void setState_id(int state_id) {
		this.state_id = state_id;
	}
	public String getDistrict_name() {
		return district_name;
	}
	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}
	@Override
	public String toString() {
		return "District [district_id=" + district_id + ", state_id="
				+ state_id + ", district_name=" + district_name + "]";
	}
	 
	 
}
	
	


