package sakancom;

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



	public Housing(int residenceId, String residenceName, String location, int floorNum, int apartmentNum, String photo,
			int rent, String services, int maxNumOfTenant, int numOfBedrooms, int numOfBathrooms, int balcony,
			String ownerName,String username,String ownerPhone, String ownerEmail) {
		super();
		this.residenceId = residenceId;
		this.residenceName = residenceName;
		this.location = location;
		this.floorNum = floorNum;
		this.apartmentNum = apartmentNum;
		this.photo = photo;
		this.rent = rent;
		this.services = services;
		this.maxNumOfTenant = maxNumOfTenant;
		this.numOfBedrooms = numOfBedrooms;
		this.numOfBathrooms = numOfBathrooms;
		this.balcony = balcony;
		this.ownerUserName = username;
		this.ownerName = ownerName;
		this.ownerPhone = ownerPhone;
		this.ownerEmail = ownerEmail;
	}
	
	public int housingIdFormat() {   /***  to concate residenceId and apartmentNum  ***/
		
		String res = Integer.toString(residenceId);
		String apa = Integer.toString(apartmentNum);
		String result = res + apa ;
		int housingId = Integer.parseInt(result);
		return housingId;
		
	}
	
	
	public void setHousingId() {
		
		this.housingId = housingIdFormat(); 
		
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


