package npcdcs.database.pojo;

public class Anm {
	private int anm_id;
	private String anm_name;
	private String anm_mob;
	private String gender;
	private int sub_id;
	public int getAnm_id() {
		return anm_id;
	}
	public void setAnm_id(int anm_id) {
		this.anm_id = anm_id;
	}
	public String getAnm_name() {
		return anm_name;
	}
	public void setAnm_name(String anm_name) {
		this.anm_name = anm_name;
	}
	public String getAnm_mob() {
		return anm_mob;
	}
	public void setAnm_mob(String anm_mob) {
		this.anm_mob = anm_mob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSub_id() {
		return sub_id;
	}
	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}
	@Override
	public String toString() {
		return "Anm [anm_id=" + anm_id + ", anm_name=" + anm_name
				+ ", anm_mob=" + anm_mob + ", gender=" + gender + ", sub_id="
				+ sub_id + "]";
	}
}
