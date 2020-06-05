package npcdcs.database.pojo;

public class Login {
	private int loginid;
	private int level;
	private String password;
	private String userid;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getLoginid() {
		return loginid;
	}
	public void setLoginid(int loginid) {
		this.loginid = loginid;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Login [loginid=" + loginid + ", level=" + level + ", password="
				+ password + ", userid=" + userid + "]";
	}
	 
	 

	
}
