package sakancom1;

public class Apartment {

	private Integer id ;
	private Integer ownerId;
	private Integer residenceId;
	private Integer floorNum;
	private String photo;
	private Integer monthlyRent;
	private String services;
	private Integer maxNum;
	private Integer bedrooms;
	private Integer bathrooms;
	private Integer balcony;
	private Boolean available;
	
	
	
	public Apartment() {}
	
	public Apartment (int id , int ownerId , int residenceId, int floorNum, String photo , int monthlyRent , String services , int maxNum , int bedrooms , int bathrooms , int balcony , Boolean available ){
		
		this.id = id;
		this.ownerId = ownerId;
		this.residenceId = residenceId;
		this.floorNum = floorNum;
		this.photo = photo;
		this.monthlyRent = monthlyRent;
		this.services = services;
		this.maxNum = maxNum;
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		this.balcony = balcony;
		this.available = available;
	}
	
	public void setId (int id) {
		this.id = id ;
	}
	
	public int getId() {
		return id;
	}
	
	public void setOwnerId(int id) {
		this.ownerId = id;
	}
	
	public int getOwnerId() {
		return ownerId;
	}
	
	
	public void setResidenceId(int id) {
		this.residenceId = id;
	}
	
	public int getResidenceId() {
		return residenceId;
	}
	
	
	
	public void setFloorNum(int num) {
		this.floorNum = num;
	}
	
	public int getFloorNum() {
		return floorNum;
	}
	
	
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	public String getPhoto () {
		return photo;
	}
	
	public void setMonthlyRent (int rent) {
		this.monthlyRent = rent;
	}
	
	public int getMonthlyRent() {
		return monthlyRent;
	}
	
	public void setServices(String services) {
		this.services = services;
	}
	
	public String getServices() {
		return services;
	}
	
	public void setMaxNum(int num) {
		this.maxNum = num;
	}
	
	public int getMaxNum() {
		return maxNum;
	}
	
	public void setBedrooms(int num) {
		this.bedrooms = num;
	}
	
	public int getBedrooms() {
		return bedrooms;
	}
	
	public void setBathrooms(int num) {
		this.bathrooms = num ;
	}
	 
	public int getBathrooms() {
		return bathrooms;
	}
	
	public void setBalcony(int num) {
		this.balcony = num ;
	}
	
	public int getBalcony() {
		return balcony;
	}
	
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	
	public Boolean getAvailable() {
		return available;
	}
	
	
	
	
	
	
	
	
	
}
