package npcdcs.database.pojo;

import java.sql.Date;

public class Referral {
	private int reference_id;
	private int pat_id;
	private String reference_from;
	private String reference_to;
	private String date_to_refer;
	
	public String getDate_to_refer() {
		return date_to_refer;
	}
	public void setDate_to_refer(String date_to_refer) {
		this.date_to_refer = date_to_refer;
	}
	public int getReference_id() {
		return reference_id;
	}
	public void setReference_id(int reference_id) {
		this.reference_id = reference_id;
	}
	public int getPat_id() {
		return pat_id;
	}
	public void setPat_id(int pat_id) {
		this.pat_id = pat_id;
	}
	public String getReference_from() {
		return reference_from;
	}
	public void setReference_from(String i) {
		this.reference_from = i;
	}
	public String getReference_to() {
		return reference_to;
	}
	public void setReference_to(String reference_to) {
		this.reference_to = reference_to;
	}
 
	 
	@Override
	public String toString() {
		return "Referral [reference_id=" + reference_id + ", pat_id=" + pat_id
				+ ", reference_from=" + reference_from + ", reference_to="
				+ reference_to + ", date_to_refer=" + date_to_refer + "]";
	}
	public void setReference_from(int parseInt) {
		// TODO Auto-generated method stub
		
	}
	 
}
