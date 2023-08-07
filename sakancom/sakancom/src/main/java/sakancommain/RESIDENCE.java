package sakancommain;


public class RESIDENCE {
	
	private Integer id;
	private String name ;
	private String location;
	private Integer numOfFloors;
	private Integer numOfApartments;
	private Boolean flag = false;
	private String ownerId;
	
	
	
	
	public RESIDENCE (  int id, String name , String location , int numOfFloors , int numOfApartments,String ownerId) {
		this.id = id;
		this.name = name ;
		this.location = location ;
		this.numOfFloors = numOfFloors;
		this.numOfApartments = numOfApartments;
		this.ownerId = ownerId;
		
	}

	
	public String getOwnerId() {
		return ownerId;
	}
	
	
	
	public int getId() {
		return id;
	}
	

	

	
	public int getNumOfFloors() {
		return numOfFloors ;
	}
	
	
	
}