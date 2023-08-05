package classes;
import java.util.ArrayList;
import java.util.Scanner;

public class User {
	private String userName  ;
			private String passWord ;
			private String type ;
			///I private String type = SET GET
			public User(){}
			public User (String userName , String pass , String Type) {
			this.userName = userName;
			this.passWord = pass;
			this.type = Type;
			}
			public void setUserName(String name) {
			this.userName = name;
			}
			public String getUserName () {
			return userName;
			}
			public void setPass(String pass){
			this.passWord = pass;
			}
			public String getPass(){
				return passWord;
			}
		
			public String getType() {
				return type;
		}
			public void setType(String typee) {
				this.type = typee;
				}
}