package npcdcs.database.pojo;

public class ColumnName {
	
	private String primarykey;
	private String tablename;
	private String prefix;
	
	public String getPrimarykey() {
		return primarykey;
	}
	
	public void setPrimarykey(String primarykey) {
		this.primarykey = primarykey;
	}
	
	public String getTablename() {
		return tablename;
	}
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}
	 
	public String getPrefix() {
		return prefix;
	}
	
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}	 

}
