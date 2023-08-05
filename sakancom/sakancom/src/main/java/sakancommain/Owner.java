package sakancommain;


public class Owner {

	private Integer id;
	private String name;            /***  Contact info for the owner   ***/
	private String address;
	private String phoneNumber;
	private String email;
	private Boolean isOwnerSaved;
	
	
	
	
	
	public Owner() {}
	public Owner(int id , String ownerName , String ownerAdd , String ownerPhone , String ownerEmail) {
		this.id = id;
		this.name = ownerName;
		this.address = ownerAdd;
		this.phoneNumber = ownerPhone;
		this.email = ownerEmail;
		
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	
	public void setName(String name) {
		this.name = name ;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String address) {
		this.address = address ;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setPhone(String phone) {
		this.phoneNumber = phone;
	}
	
	public String getPhone() {
		return phoneNumber;
	}
	
	public void setEmail(String email) {
		this.email = email ;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setSavedFlag(Boolean isOwnerSaved) {
		this.isOwnerSaved = isOwnerSaved;
	}
	
	public Boolean getSavedFlag() {
		return isOwnerSaved;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}