package sakancommain;

public class HOUSEANDTENANT {
	private int housingId;
	private String tenants;
	

	public HOUSEANDTENANT() {}
	public HOUSEANDTENANT(int housingId,String tenants) {
		this.housingId = housingId;
		this.tenants = tenants;
		
		
	}
	

	
	public String getTenants() {
		return tenants;
	}
	
	
	
	public int gethousingId() {
		return housingId;
	}
	
}
