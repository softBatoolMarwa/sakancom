package classes;

public class House {
	private int ID;
	public Residence residenceObj;
	public apartments apartmentsObj ;
	private boolean availabilityStatus;

	public House() {}
	public House(int ID,Residence residenceObj,apartments apartmentsObj,boolean availabilityStatus) {
		this.ID=ID;
		this.residenceObj=residenceObj;
		this.apartmentsObj=apartmentsObj;
		this.availabilityStatus=availabilityStatus;
	}
	public int get_ID() {
		return ID;
	}
	public void set_ID(int new_ID) {
		ID = new_ID;
	}
	public boolean get_availabilityStatus() {
		return availabilityStatus;
	}
	public void set_availabilityStatus(boolean new_availabilityStatus) {
		availabilityStatus = new_availabilityStatus;
	}
}
