package npcdcs.database.pojo;

import java.sql.Date;

public class ScreeningDetails {
	private int screen_id;
	private int pat_id;
	private float diabetes;
	private String diabetes_test_type;
	private float hypertension_high;
	private float hypertension_low;
	private boolean cardiovascular;
	private boolean cancer;
	private Date date1;
	
	public Date getDate1() {
		return date1;
	}
	public void setDate1(Date date1) {
		this.date1 = date1;
	}
	public String getDiabetes_test_type() {
		return diabetes_test_type;
	}
	public void setDiabetes_test_type(String diabetes_test_type) {
		this.diabetes_test_type = diabetes_test_type;
	}
	public int getScreen_id() {
		return screen_id;
	}
	public void setScreen_id(int screen_id) {
		this.screen_id = screen_id;
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
	public int getPat_id() {
		return pat_id;
	}
	public void setPat_id(int pat_id) {
		this.pat_id = pat_id;
	}
	public float getDiabetes() {
		return diabetes;
	}
	public void setDiabetes(float diabetes) {
		this.diabetes = diabetes;
	}
	public float getHypertension_high() {
		return hypertension_high;
	}
	public void setHypertension_high(float hypertension_high) {
		this.hypertension_high = hypertension_high;
	}
	public float getHypertension_low() {
		return hypertension_low;
	}
	public void setHypertension_low(float hypertension_low) {
		this.hypertension_low = hypertension_low;
	}
	@Override
	public String toString() {
		return "ScreeningDetails [screen_id=" + screen_id + ", pat_id="
				+ pat_id + ", diabetes=" + diabetes + ", diabetes_test_type="
				+ diabetes_test_type + ", hypertension_high="
				+ hypertension_high + ", hypertension_low=" + hypertension_low
				+ ", cardiovascular=" + cardiovascular + ", cancer=" + cancer
				+ "]";
	}
	 
	 
}
