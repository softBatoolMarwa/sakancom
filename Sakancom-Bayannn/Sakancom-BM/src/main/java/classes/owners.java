package classes;
import java.util.ArrayList;
import java.util.Scanner;

public class owners {
	Scanner myInput = new Scanner(System.in);
	
	private int numberOfHouses ;
	private String name ;
	private String phone_number;
	public owners() {};
	
	
	public owners(int numberOfHouses,String name , String phone_number ) {
		this.numberOfHouses=numberOfHouses;
		this.name=name;
		this.phone_number=phone_number;
	};
	public String get_name() {
		return name ;
	}
	public void set_name(String new_name) {
		name = new_name;
	}
	
	public String get_phone_number() {
		return phone_number ;
	}
	public void set_phone_number(String new_phone_number) {
		phone_number = new_phone_number;
	}
	public int get_numberOfHouses() {
		return numberOfHouses ;
	}
	public void set_numberOfHouses(int new_numberOfHouses) {
		numberOfHouses = new_numberOfHouses;
	}
	
//	
//	
//	public void showHouse() {
//		System.out.println("House information is : ");
//		System.out.println("1-name of Residence : " +House1.residenceObj.get_name()+" \n2-the location of the Residence : " +House1.residenceObj.get_location() +"\n3-the number of floors of the building : "+House1.residenceObj.get_number_floors()+" \n4-How many apartments per floor : "+House1.residenceObj.get_Number_apartments_floor());
//		System.out.println("5-the number of the apartment : "+House1.apartmentsObj.get_number()+" \n6-What floor is the apartment on : "+House1.apartmentsObj.get_which_floor()+" \n7-How many people can the apartment accommodate : "+House1.apartmentsObj.get_number_person()+" \n8-How space is the room : "+House1.apartmentsObj.get_space());
//		System.out.println("9-How much are the monthly fees : "+House1.apartmentsObj.get_monthly_fee()+" \n10-Do the fees include electricity and water : "+House1.apartmentsObj.get_Fees_include_water_electricity()+" \n11-Is there free internet service : "+House1.apartmentsObj.get_Free_internet()+" \n12-Is there a private car park for the building : "+House1.residenceObj.get_available_parking()+"\n13-Is elevator service available : "+House1.residenceObj.get_Elevator_available());
//		
//	}
	
}
