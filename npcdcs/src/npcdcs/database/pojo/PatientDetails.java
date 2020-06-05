package npcdcs.database.pojo;

public class PatientDetails {
	private int pat_id;
	private int sub_id;
	private String pat_name;
	private String father_name;
	private String pat_address;
	private int age;
	private String sex;
	private String village;
	private String campregnoname;
	private String contact;
	private String id_type;
	private String id_no;
	private boolean smoking;
	private boolean chewable;
	
	
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public int getPat_id() {
		return pat_id;
	}
	public void setPat_id(int pat_id) {
		this.pat_id = pat_id;
	}
	public int getSub_id() {
		return sub_id;
	}
	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}
	public String getPat_name() {
		return pat_name;
	}
	public void setPat_name(String pat_name) {
		this.pat_name = pat_name;
	}
	public String getPat_address() {
		return pat_address;
	}
	public void setPat_address(String pat_address) {
		this.pat_address = pat_address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getId_type() {
		return id_type;
	}
	public void setId_type(String id_type) {
		this.id_type = id_type;
	}
	public String getId_no() {
		return id_no;
	}
	public void setId_no(String id_no) {
		this.id_no = id_no;
	}
	public boolean isSmoking() {
		return smoking;
	}
	public void setSmoking(boolean smoking) {
		this.smoking = smoking;
	}
	public boolean isChewable() {
		return chewable;
	}
	public void setChewable(boolean chewable) {
		this.chewable = chewable;
	}
	
	public String getCampregnoname() {
		return campregnoname;
	}
	public void setCampregnoname(String campregnoname) {
		this.campregnoname = campregnoname;
	}
	@Override
	public String toString() {
		return "PatientDetails [pat_id=" + pat_id + ", sub_id=" + sub_id
				+ ", pat_name=" + pat_name + ", father_name=" + father_name
				+ ", pat_address=" + pat_address + ", age=" + age + ", sex="
				+ sex + ", village=" + village + ", campregnoname="
				+ campregnoname + ", contact=" + contact + ", id_type="
				+ id_type + ", id_no=" + id_no + ", smoking=" + smoking
				+ ", chewable=" + chewable + "]";
	}
	     
}
