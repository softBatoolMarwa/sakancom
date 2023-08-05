package classes;
//عمارة
public class Residence {
	private String name;
	private String location ;
	private int number_floors ;
	private int Number_apartments_floor;
	private boolean available_parking;
	private boolean Elevator_available;
	
	public Residence() {};
	
	public Residence(String name,String location,int number_floors,int Number_apartments_floor,boolean available_parking,boolean Elevator_available) {
		this.name=name;
		this.location=location;
		this.number_floors=number_floors;
		this.Number_apartments_floor=Number_apartments_floor;
		this.available_parking=available_parking;
		this.Elevator_available=Elevator_available;
	};
	public String get_name() {
		return name;
	}
	public void set_name(String new_name) {
		name = new_name;
	}
	public String get_location() {
		return location;
	}
	public void set_location(String new_location) {
		location = new_location;
	}
	public int get_number_floors() {
		return number_floors;
	}
	public void set_number_floors(int new_number_floors) {
		number_floors = new_number_floors;
	}
	public int get_Number_apartments_floor() {
		return Number_apartments_floor;
	}
	public void set_Number_apartments_floor(int new_Number_apartments_floor) {
		Number_apartments_floor = new_Number_apartments_floor;
	}
	public boolean get_available_parking() {
		return available_parking;
	}
	public void set_available_parking(boolean new_available_parking) {
		available_parking = new_available_parking;
	}
	public boolean get_Elevator_available() {
		return Elevator_available;
	}
	public void set_Elevator_available(boolean new_Elevator_available) {
		Elevator_available = new_Elevator_available;
	}
}
