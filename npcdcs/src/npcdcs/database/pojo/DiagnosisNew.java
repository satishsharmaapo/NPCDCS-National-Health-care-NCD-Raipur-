package npcdcs.database.pojo;

import java.util.Date;

public class DiagnosisNew {
	private int diagnosis_id;
	private int pat_id;
	private boolean hypertension;
	private boolean diabetes;
	private boolean cardiovascular;
	private boolean cancer;
	private boolean noofhomevisit;
	private Date dignodate;
	
	public int getDiagnosis_id() {
		return diagnosis_id;
	}
	public Date getDignodate() {
		return dignodate;
	}
	public void setDignodate(Date dignodate) {
		this.dignodate = dignodate;
	}
	public void setDiagnosis_id(int diagnosis_id) {
		this.diagnosis_id = diagnosis_id;
	}
	public int getPat_id() {
		return pat_id;
	}
	public void setPat_id(int pat_id) {
		this.pat_id = pat_id;
	}
	public boolean isHypertension() {
		return hypertension;
	}
	public void setHypertension(boolean hypertension) {
		this.hypertension = hypertension;
	}
	public boolean isDiabetes() {
		return diabetes;
	}
	public void setDiabetes(boolean diabetes) {
		this.diabetes = diabetes;
	}
	public boolean isCardiovascular() {
		return cardiovascular;
	}
	public void setCardiovascular(boolean cardiovascular) {
		this.cardiovascular = cardiovascular;
	}
	public boolean isCancer() {
		return cancer;
	}
	public void setCancer(boolean cancer) {
		this.cancer = cancer;
	}
	 
	public boolean isNoofhomevisit() {
		return noofhomevisit;
	}
	public void setNoofhomevisit(boolean noofhomevisit) {
		this.noofhomevisit = noofhomevisit;
	}
	@Override
	public String toString() {
		return "DiagnosisNew [diagnosis_id=" + diagnosis_id + ", pat_id="
				+ pat_id + ", hypertension=" + hypertension + ", diabetes="
				+ diabetes + ", cardiovascular=" + cardiovascular + ", cancer="
				+ cancer + ", noofhomevisit=" + noofhomevisit + ", dignodate="
				+ dignodate + "]";
	}
	 
}
