package sakancom;

public class User {

	private String userName = "";
	private String passWord = "";
	
	public User () {}
	public User(String userName , String pass) {
		
		this.userName = userName;
		this.passWord = pass;
		
		
	}
	
	public void setUserName(String name) {
		this.userName = name;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setPass(String pass) {
		this.passWord = pass;
	}
	
	public String getPass() {
	return passWord ;
			}
	
	
	
	
	
	
	
	
	
	
}
