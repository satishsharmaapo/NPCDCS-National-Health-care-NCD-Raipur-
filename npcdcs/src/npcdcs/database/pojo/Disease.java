package npcdcs.database.pojo;

public class Disease {
	 private int disease_id;
	 private String disease_name;
	public int getDisease_id() {
		return disease_id;
	}
	public void setDisease_id(int disease_id) {
		this.disease_id = disease_id;
	}
	public String getDisease_name() {
		return disease_name;
	}
	public void setDisease_name(String disease_name) {
		this.disease_name = disease_name;
	}
	@Override
	public String toString() {
		return "Disease [disease_id=" + disease_id + ", disease_name="
				+ disease_name + "]";
	}
	 
}
