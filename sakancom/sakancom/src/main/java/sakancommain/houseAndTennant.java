package sakancommain;

public class houseAndTennant {
	private int housingId;
	private String tenants;
	

	public houseAndTennant() {}
	public houseAndTennant(int housingId,String tenants) {
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
