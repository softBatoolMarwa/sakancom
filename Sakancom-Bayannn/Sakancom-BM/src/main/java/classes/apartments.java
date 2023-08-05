package classes;
//شقة
public class apartments {
	private int number ;
	private int which_floor;
	private int monthly_fee;
	private int number_person;
	private String space;
	private String photo;
	private boolean Free_internet;
	private boolean Fees_include_water_electricity;
	

	public apartments() {};
	public apartments(int number,int which_floor,int monthly_fee,int number_person,String space,String photo,boolean Free_internet,boolean Fees_include_water_electricity) {
		this.number=number;
		this.which_floor=which_floor;
		this.monthly_fee=monthly_fee;
		this.number_person=number_person;
		this.space=space;
		this.photo=photo;
		this.Free_internet=Free_internet;
		this.Fees_include_water_electricity=Fees_include_water_electricity;
	};
	
	public int get_number() {
		return number;
	}
	public void set_number(int new_number) {
		number = new_number;
	}
	public int get_which_floor() {
		return which_floor;
	}
	public void set_which_floor(int new_which_floor) {
		which_floor = new_which_floor;
	}
	public int get_monthly_fee() {
		return monthly_fee;
	}
	public void set_monthly_fee(int new_monthly_fee) {
		monthly_fee = new_monthly_fee;
	}
	public int get_number_person() {
		return number_person;
	}
	public void set_number_person(int new_number_person) {
		number_person = new_number_person;
	}
	public String get_space() {
		return space;
	}
	public void set_space(String new_space) {
		space = new_space;
	}
	public String get_photo() {
		return photo;
	}
	public void set_photo(String new_photo) {
		photo = new_photo;
	}
	public boolean get_Free_internet() {
		return Free_internet;
	}
	public void set_Free_internet(boolean new_Free_internet) {
		Free_internet = new_Free_internet;
	}
	public boolean get_Fees_include_water_electricity() {
		return Fees_include_water_electricity;
	}
	public void set_Fees_include_water_electricity(boolean new_Fees_include_water_electricity) {
		Fees_include_water_electricity = new_Fees_include_water_electricity;
	}
}
