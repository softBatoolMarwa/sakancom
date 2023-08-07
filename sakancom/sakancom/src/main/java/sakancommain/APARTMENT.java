package sakancommain;

public class APARTMENT {

	private Integer id ;
	private String ownerId;
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
	
	
	public APARTMENT() {}
	
	public APARTMENT (APARTMENT ap ){
		this.id = ap.getId();
		this.ownerId = ap.getOwnerId();
		this.residenceId = ap.getResidenceId();
		this.floorNum = ap.getFloorNum();
		this.photo = ap.getPhoto();
		this.monthlyRent = ap.getMonthlyRent();
		this.services = ap.getServices();
		this.maxNum = ap.getMaxNum();
		this.bedrooms = ap.getBedrooms();
		this.bathrooms = ap.getBathrooms();
		this.balcony = ap.getBalcony();
		this.available = ap.getAvailable();
		
		
	}
	
	public void setId (int id) {
		this.id = id ;
	}
	
	public int getId() {
		return id;
	}
	
	public void setOwnerId(String id) {
		this.ownerId = id;
	}
	
	public String getOwnerId() {
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
