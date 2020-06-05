package npcdcs.database.pojo;

import java.sql.Date;

public class CheckUpDetails {
	private int checkup_id;
	private int anm_id;
	private int pat_id;
	private Date dateof_checkup;
	
	public int getCheckup_id() {
		return checkup_id;
	}
	public void setCheckup_id(int checkup_id) {
		this.checkup_id = checkup_id;
	}
	public int getAnm_id() {
		return anm_id;
	}
	public void setAnm_id(int anm_id) {
		this.anm_id = anm_id;
	}
	public int getPat_id() {
		return pat_id;
	}
	public void setPat_id(int pat_id) {
		this.pat_id = pat_id;
	}
	public Date getDateof_checkup() {
		return dateof_checkup;
	}
	public void setDateof_checkup(Date dateof_checkup) {
		this.dateof_checkup = dateof_checkup;
	}
	@Override
	public String toString() {
		return "CheckUpDetails [checkup_id=" + checkup_id + ", anm_id="
				+ anm_id + ", pat_id=" + pat_id + ", dateof_checkup="
				+ dateof_checkup + "]";
	}
	
	  
}
