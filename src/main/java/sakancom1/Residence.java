package sakancom1;

import java.util.ArrayList;
import java.util.Scanner;

public class Residence {
	
	private Integer id;
	private String name ;
	private String location;
	private Integer numOfFloors;
	private Integer numOfApartments;
	public Boolean flag = false;
	
	
	
	public Residence() {}
	public Residence (  int id, String name , String location , int numOfFloors , int numOfApartments) {
		this.id = id;
		this.name = name ;
		this.location = location ;
		this.numOfFloors = numOfFloors;
		this.numOfApartments = numOfApartments;
		
		
	}
	
	public void setId(int id) {
	this.id = id;
	
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name ;
	}
	
	public String getName() {
		return name ;
	}
	
	public void setLocation(String location) {
		this.location = location ;
	}
	
	public String getLocation() {
		return location ;
	}
	
	public void setNumOfFloors(int num) {
		this.numOfFloors =  num ;
	}
	
	public int getNumOfFloors() {
		return numOfFloors ;
	}
	
	public void setNumOfApartment(int num) {
		this.numOfApartments = num ;	
	}
	
	public int getNumOfApartment () {
		return numOfApartments;
	}
	
	public ArrayList <Residence> ownerList = new ArrayList<Residence>();
	private  Scanner input2;
	
	public void saveResidenceInfo() {
		
	}
	
	
	
	
	
	
	
	
	
	
}