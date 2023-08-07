package sakancommain;

public class Housing {
	
	private int housingId;
	private int residenceId;
	private String residenceName;
	private String location; 
	private int floorNum;
	private int apartmentNum;
	private String photo;
	private int rent;
	private String services;
	private int maxNumOfTenant;
	private int numOfBedrooms;
	private int numOfBathrooms;
	private int balcony;
	private String ownerName;
	private String ownerUserName;
	private String ownerPhone;
	private String ownerEmail;
	private String status = "Available" ;
	
	
	
	
	public  Housing () {}



	public Housing(Housing h) {
		super();
		this.residenceId = h.getResidenceId();
		this.residenceName = h.getResidenceName();
		this.location = h.getLocation();
		this.floorNum = h.getFloorNum();
		this.apartmentNum = h.getApartmentNum();
		this.photo = h.getPhoto();
		this.rent = h.getRent();
		this.services = h.getServices();
		this.maxNumOfTenant = h.getMaxNumOfTenant();
		this.numOfBedrooms = h.getNumOfBedrooms();
		this.numOfBathrooms = h.getNumOfBathrooms();
		this.balcony = h.getBalcony();
		this.ownerUserName = h.getOwnerUserName();
		this.ownerName = h.getOwnerName();
		this.ownerPhone = h.getOwnerPhone();
		this.ownerEmail = h.getOwnerEmail();
	}
	
	public int housingIdFormat() {   /***  to concate residenceId and apartmentNum  ***/
		
		String res = Integer.toString(residenceId);
		String apa = Integer.toString(apartmentNum);
		String result = res + apa ;
		
		return Integer.parseInt(result);
		
	}
	
	


	public int getHousingId() {
		
		return housingIdFormat();
		
	}


	public int getResidenceId() {
		return residenceId;
	}



	public void setResidenceId(int residenceId) {
		this.residenceId = residenceId;
	}



	public String getResidenceName() {
		return residenceName;
	}



	public void setResidenceName(String residenceName) {
		this.residenceName = residenceName;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public int getFloorNum() {
		return floorNum;
	}



	public void setFloorNum(int floorNum) {
		this.floorNum = floorNum;
	}



	public int getApartmentNum() {
		return apartmentNum;
	}



	public void setApartmentNum(int apartmentNum) {
		this.apartmentNum = apartmentNum;
	}



	public String getPhoto() {
		return photo;
	}



	public void setPhoto(String photo) {
		this.photo = photo;
	}



	public int getRent() {
		return rent;
	}



	public void setRent(int rent) {
		this.rent = rent;
	}



	public String getServices() {
		return services;
	}



	public void setServices(String services) {
		this.services = services;
	}



	public int getMaxNumOfTenant() {
		return maxNumOfTenant;
	}



	public void setMaxNumOfTenant(int maxNumOfTenant) {
		this.maxNumOfTenant = maxNumOfTenant;
	}



	public int getNumOfBedrooms() {
		return numOfBedrooms;
	}



	public void setNumOfBedrooms(int numOfBedrooms) {
		this.numOfBedrooms = numOfBedrooms;
	}



	public int getNumOfBathrooms() {
		return numOfBathrooms;
	}



	public void setNumOfBathrooms(int numOfBathrooms) {
		this.numOfBathrooms = numOfBathrooms;
	}



	public int getBalcony() {
		return balcony;
	}



	public void setBalcony(int balcony) {
		this.balcony = balcony;
	}



	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerUserName(String userName) {
		this.ownerUserName = userName;
	}
	
	public String getOwnerUserName() {
		return ownerUserName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}



	public String getOwnerPhone() {
		return ownerPhone;
	}



	public void setOwnerPhone(String ownerPhone) {
		this.ownerPhone = ownerPhone;
	}



	public String getOwnerEmail() {
		return ownerEmail;
	}



	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}
	
	public void setStatusAvailable() {
		
		this.status = "Available";
	}
	
public void setStatusUnavailable() {
		
		this.status = "Unavailable";
	}

public String getStatus() {
	return this.status;
}

}


