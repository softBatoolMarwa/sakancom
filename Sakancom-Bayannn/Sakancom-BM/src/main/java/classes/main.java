package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	static Scanner myInput = new Scanner(System.in);
	public static ArrayList<House> arrayHouses = new ArrayList<House>();
	public static ArrayList<House> AdvertisedHouses = new ArrayList<House>();
	private static int CounterID=0; 
	public static ArrayList<User> users = new ArrayList<User>();
	private static String userType = "none" ;
	static String username;
	
	 
	 public static void main(String[] args) {
//			System.out.print();
		 while (true) {
		System.out.println("Enter your username please");
		String username1 = myInput.next();
		System.out.println("Enter your password please");
		String pass = myInput.next();
		String type = login(username1, pass);
		int in;
		
		
		 if(type.equals("owner")) {
			 do { 
			 System.out.println(" ((( owner menu ))) : ");
			 System.out.println("1-add House\n2-Modify information\n3-show House\n4-Exit");
			  in = myInput.nextInt();
				 switch(in) {
				 case 1:
					 House House1 = enterInformation();
						addHouse(House1,"owner");
					 break;
				 case 2:
		
						System.out.println("What is the house ID that you want to change to?");
						int houseId = myInput.nextInt();
						
						System.out.println("What information do you want to modify?");
						System.out.println("1-name of Residence \n2-the location of the Residence \n3-the number of floors of the building \n4-How many apartments per floor");
						System.out.println("5-the number of the apartment \n6-What floor is the apartment on \n7-How many people can the apartment accommodate \n8-How space is the room");
						System.out.println("9-How much are the monthly fees \n10-Do the fees include electricity and water \n11-Is there free internet service \n12-Is there a private car park for the building \n13-Is elevator service available \n14-picture of the apartment");
						
						int num = myInput.nextInt();
						System.out.println("Enter the new value");
						String new_value =  myInput.next();
						Modify_information(houseId,num,new_value);			 
						break;
				 case 3:
					 showHouse();
					 break;
				 case 4:
					 
					 break; 
				 }
				 
			}
			 while(in!=4);
			  
		}
		 else if (type.equals("admin")) {
			 do { 
				 System.out.println(" ((( admin menu ))) : ");
				 System.out.println("1-accept and reject\n2-show advertised houses\n3-add at advertised houses\n4-Exit");
				 in = myInput.nextInt();
					 switch(in) {
					 case 1:
						String acc; 
							 for(int i=0;i<arrayHouses.size();i++) {
									System.out.println("The ID of the house is: " +arrayHouses.get(i).get_ID() );
									System.out.println("House information is : ");
									System.out.println("1-name of Residence : " +arrayHouses.get(i).residenceObj.get_name()+" \n2-the location of the Residence : " +arrayHouses.get(i).residenceObj.get_location() +"\n3-the number of floors of the building : "+arrayHouses.get(i).residenceObj.get_number_floors()+" \n4-How many apartments per floor : "+arrayHouses.get(i).residenceObj.get_Number_apartments_floor());
									System.out.println("5-the number of the apartment : "+arrayHouses.get(i).apartmentsObj.get_number()+" \n6-What floor is the apartment on : "+arrayHouses.get(i).apartmentsObj.get_which_floor()+" \n7-How many people can the apartment accommodate : "+arrayHouses.get(i).apartmentsObj.get_number_person()+" \n8-How space is the room : "+arrayHouses.get(i).apartmentsObj.get_space());
									System.out.println("9-How much are the monthly fees : "+arrayHouses.get(i).apartmentsObj.get_monthly_fee()+" \n10-Do the fees include electricity and water : "+arrayHouses.get(i).apartmentsObj.get_Fees_include_water_electricity()+" \n11-Is there free internet service : "+arrayHouses.get(i).apartmentsObj.get_Free_internet()+" \n12-Is there a private car park for the building : "+arrayHouses.get(i).residenceObj.get_available_parking()+"\n13-Is elevator service available : "+arrayHouses.get(i).residenceObj.get_Elevator_available());
									
									System.out.println("Enter y if you accept to add this house and n if you reject : ");
									acc = myInput.next();
									acceptAndReject(acc,arrayHouses.get(i));
							 } 
						 
						 break; 
					 case 2:
						 showAdvertisedHouses();
						 break; 
					 case 3:
						 House House1 = enterInformation();
							addHouse(House1,"admin");
						 break; 
					 case 4:
						 
						 break; 	 
					 } 
			 }	
			 while(in!=4);
		 }
		 else {
			 do { 
				 System.out.println(" ((( tenants menu ))) : ");
				 System.out.println("1-view the available housing \n2- view pictures of housing and other information\n3-\n4-Exit");
				 in = myInput.nextInt();
					 switch(in) {
					 case 1:
						 viewAvailableHousing();
						 break; 
					 case 2:
						 viewPicturesAndInformation();
						 break; 
					 case 3:
						 break; 
					 }
			 } while(in!=4);
		 }
		  }
	 }
	 
	 
//log in 	 
	 public static String login(String userName , String password){
		 
		 User firstUser= new User("marah", "123","admin");
		 User secondtUser= new User("bayan", "333", "owner");
		 User thirdUser= new User("ahmad", "133", "owner");
		 User fourthUser= new User("khalid", "993", "tenant");
		 User fifthUser= new User("mayar", "122", "tenant");
		 User sixthUser= new User("osama", "222", "tenant");
		 
		 users.add(firstUser);
		 users.add(secondtUser);
		 users.add(thirdUser);
		 users.add(fourthUser);
		 users.add(fifthUser);
		 users.add(sixthUser);
		 
		for (int i=0 ; i <users.size();i++) {
			
			if (users.get(i).getUserName().equals(userName)) {
			if (users.get(i).getType().equals("admin")) {
				setUserType("admin");
		}
			else if (users.get(i).getType().equals("owner")) {
				setUserType("owner");
		}
			else if (users.get(i).getType().equals("tenant")) {
				setUserType("tenant");
		}
			else {
				setUserType("none");
			}
		}
		}
	
	return getUserType();
	 }
	 
	 public static void setUserType(String type) {
			userType = type;
		}	
	 public static String getUserType() {
			return userType;
		}
	 
	 public static House enterInformation() {
		 Residence residenceObj=new Residence();
		 	apartments apartmentsObj =new apartments() ;
			CounterID=CounterID+1;
			System.out.println("The name of the building in which the apartment is located ?");
			residenceObj.set_name(myInput.next());

			System.out.println("What is the location of the Residence in which the apartment is located ?");
			residenceObj.set_location(myInput.next()); 
			
			System.out.println("What is the number of floors of the building?");
			residenceObj.set_number_floors(myInput.nextInt());
			
			System.out.println("How many apartments per floor?");
			residenceObj.set_Number_apartments_floor(myInput.nextInt());
			
			System.out.println("Enter the number of the apartment ?");
			apartmentsObj.set_number(myInput.nextInt());
			
			System.out.println("What floor is the apartment on ?");
			apartmentsObj.set_which_floor(myInput.nextInt());

			System.out.println("How many people can the apartment accommodate?");
			apartmentsObj.set_number_person(myInput.nextInt());

			System.out.println("How space is the room ?");
			apartmentsObj.set_space(myInput.next());
			
			System.out.println("How much are the monthly fees ?");
			apartmentsObj.set_monthly_fee(myInput.nextInt());
			
			System.out.println("Do the fees include electricity and water ? (y or n)");
			String s = myInput.next();
			boolean b=true ;
			if(s=="y" && s=="Y") { b=true;}
			else if(s=="n" && s=="N") { b=false;}
			else { System.out.println("Please, pay attention !!! Enter the letter Y=Yes or N=No only"); }
			apartmentsObj.set_Fees_include_water_electricity(b);

			System.out.println("Is there free internet service ? (y or n)");
			s = myInput.next();
			if(s=="y" && s=="Y") { b=true;}
			else if(s=="n" && s=="N") { b=false;}
			else { System.out.println("Please, pay attention !!! Enter the letter Y=Yes or N=No only"); }
			apartmentsObj.set_Free_internet(b);
			
			System.out.println("Is there a private car park for the building? (y or n)");
			s = myInput.next();
			if(s=="y" && s=="Y") { b=true;}
			else if(s=="n" && s=="N") { b=false;}
			else { System.out.println("Please, pay attention !!! Enter the letter Y=Yes or N=No only"); }
			residenceObj.set_available_parking(b);
			
			System.out.println("Is elevator service available? (y or n)");
			s = myInput.next();
			if(s=="y" && s=="Y") { b=true;}
			else if(s=="n" && s=="N") { b=false;}
			else { System.out.println("Please, pay attention !!! Enter the letter Y=Yes or N=No only"); }
			residenceObj.set_Elevator_available(b);	
			
			System.out.println("Enter a picture of the apartment");
			apartmentsObj.set_photo(myInput.next());
		 	House House1 = new House(CounterID,residenceObj,apartmentsObj,true);
		 	return House1;
	 }
//owner		
		
		public static boolean addHouse(House House1,String type) {
			if(type.equals("owner")) {
				arrayHouses.add(House1);
			}
			else if(type.equals("admin")) {
				AdvertisedHouses.add(House1);
			}
			
			System.out.println("*******House has been added successfully*******");
			return true;
		}

		public static boolean Modify_information(int houseId , int num , String new_value) {
			House House1 = new House();
			House1=arrayHouses.get(houseId-1);

			switch (num) { 
			case 1:
				House1.residenceObj.set_name(new_value);
				break;
			case 2:
				House1.residenceObj.set_location(new_value);
				break;
			case 3:
				House1.residenceObj.set_number_floors(Integer.parseInt(new_value));
				break;
			case 4:
				House1.residenceObj.set_Number_apartments_floor(Integer.parseInt(new_value));
				break;
			case 5:
				House1.apartmentsObj.set_number(Integer.parseInt(new_value));
				break;
			case 6:
				House1.apartmentsObj.set_which_floor(Integer.parseInt(new_value));
				break;
			case 7:
				House1.apartmentsObj.set_number_person(Integer.parseInt(new_value));
				break;
			case 8:
				House1.apartmentsObj.set_space(new_value);
				break;
			case 9:
				House1.apartmentsObj.set_monthly_fee(Integer.parseInt(new_value));
				break;
			case 10:
				House1.apartmentsObj.set_Fees_include_water_electricity(Boolean.parseBoolean(new_value));
				break;
			case 11:
				House1.apartmentsObj.set_Free_internet(Boolean.parseBoolean(new_value));
				break;
			case 12:
				House1.residenceObj.set_available_parking(Boolean.parseBoolean(new_value));
				break;
			case 13:
				House1.residenceObj.set_Elevator_available(Boolean.parseBoolean(new_value));
				break;
			case 14:
				House1.apartmentsObj.set_photo(new_value);
				break;
			default:
				System.out.println("Wrong!!!Enter only one of the available options");
			}
		
			arrayHouses.set(houseId-1,House1);
			System.out.println("Modify information successfully");
			return true;		
		}
		
		public static boolean showHouse() {
			for(int i=0;i<arrayHouses.size();i++) {
			System.out.println("The ID of the house is: " +arrayHouses.get(i).get_ID() );
			System.out.println("House information is : ");
			System.out.println("1-name of Residence : " +arrayHouses.get(i).residenceObj.get_name()+" \n2-the location of the Residence : " +arrayHouses.get(i).residenceObj.get_location() +"\n3-the number of floors of the building : "+arrayHouses.get(i).residenceObj.get_number_floors()+" \n4-How many apartments per floor : "+arrayHouses.get(i).residenceObj.get_Number_apartments_floor());
			System.out.println("5-the number of the apartment : "+arrayHouses.get(i).apartmentsObj.get_number()+" \n6-What floor is the apartment on : "+arrayHouses.get(i).apartmentsObj.get_which_floor()+" \n7-How many people can the apartment accommodate : "+arrayHouses.get(i).apartmentsObj.get_number_person()+" \n8-How space is the room : "+arrayHouses.get(i).apartmentsObj.get_space());
			System.out.println("9-How much are the monthly fees : "+arrayHouses.get(i).apartmentsObj.get_monthly_fee()+" \n10-Do the fees include electricity and water : "+arrayHouses.get(i).apartmentsObj.get_Fees_include_water_electricity()+" \n11-Is there free internet service : "+arrayHouses.get(i).apartmentsObj.get_Free_internet()+" \n12-Is there a private car park for the building : "+arrayHouses.get(i).residenceObj.get_available_parking()+"\n13-Is elevator service available : "+arrayHouses.get(i).residenceObj.get_Elevator_available());
			}
			System.out.println("***The array is empty***");
			return true;
		}

//admain		
		
		public static Boolean acceptAndReject(String s ,House housing){
			
			if(s.equals("y")) {AdvertisedHouses.add(housing); 
			arrayHouses.remove (housing); 
			System.out.println("*********done successfully********* ");
			return true;
			}
			else if(s.equals("n")) {arrayHouses.remove (housing);
			System.out.println("*********Not added*********");
			return false;
			}
			else {
				System.out.println("Enter true value !!!");
			}
			System.out.println("*********Not added*********");
			return false;
			}

		public static boolean showAdvertisedHouses() {
			for(int i=0;i<AdvertisedHouses.size();i++) {
			System.out.println("House information is : ");
			System.out.println("1-name of Residence : " +AdvertisedHouses.get(i).residenceObj.get_name()+" \n2-the location of the Residence : " +AdvertisedHouses.get(i).residenceObj.get_location() +"\n3-the number of floors of the building : "+AdvertisedHouses.get(i).residenceObj.get_number_floors()+" \n4-How many apartments per floor : "+AdvertisedHouses.get(i).residenceObj.get_Number_apartments_floor());
			System.out.println("5-the number of the apartment : "+AdvertisedHouses.get(i).apartmentsObj.get_number()+" \n6-What floor is the apartment on : "+AdvertisedHouses.get(i).apartmentsObj.get_which_floor()+" \n7-How many people can the apartment accommodate : "+AdvertisedHouses.get(i).apartmentsObj.get_number_person()+" \n8-How space is the room : "+AdvertisedHouses.get(i).apartmentsObj.get_space());
			System.out.println("9-How much are the monthly fees : "+AdvertisedHouses.get(i).apartmentsObj.get_monthly_fee()+" \n10-Do the fees include electricity and water : "+AdvertisedHouses.get(i).apartmentsObj.get_Fees_include_water_electricity()+" \n11-Is there free internet service : "+AdvertisedHouses.get(i).apartmentsObj.get_Free_internet()+" \n12-Is there a private car park for the building : "+AdvertisedHouses.get(i).residenceObj.get_available_parking()+"\n13-Is elevator service available : "+AdvertisedHouses.get(i).residenceObj.get_Elevator_available());
			}
			System.out.println("***The array is empty***");
			return true;
		}
		
		

		public static boolean viewAvailableHousing(){
			if(AdvertisedHouses.isEmpty()) {System.out.println("***There are no homes available***"); return false;}
			System.out.println("The available housing : ");
			for(int i=0;i<AdvertisedHouses.size();i++) {
				 if(AdvertisedHouses.get(i).get_availabilityStatus()) {
					 System.out.println("name of Residence : " +AdvertisedHouses.get(i).residenceObj.get_name()+" \nthe location of the Residence : " +AdvertisedHouses.get(i).residenceObj.get_location() );
						System.out.print("the number of the apartment : "+AdvertisedHouses.get(i).apartmentsObj.get_number());
				 } 
			 }
			
			 return true;
		}
		
		public static boolean viewPicturesAndInformation(){
			
			for(int i=0;i<AdvertisedHouses.size();i++) {
				 if(AdvertisedHouses.get(i).get_availabilityStatus()) {
					 System.out.println("House information is : ");
						System.out.println("1-name of Residence : " +AdvertisedHouses.get(i).residenceObj.get_name()+" \n2-the location of the Residence : " +AdvertisedHouses.get(i).residenceObj.get_location() +"\n3-the number of floors of the building : "+AdvertisedHouses.get(i).residenceObj.get_number_floors()+" \n4-How many apartments per floor : "+AdvertisedHouses.get(i).residenceObj.get_Number_apartments_floor());
						System.out.println("5-the number of the apartment : "+AdvertisedHouses.get(i).apartmentsObj.get_number()+" \n6-What floor is the apartment on : "+AdvertisedHouses.get(i).apartmentsObj.get_which_floor()+" \n7-How many people can the apartment accommodate : "+AdvertisedHouses.get(i).apartmentsObj.get_number_person()+" \n8-How space is the room : "+AdvertisedHouses.get(i).apartmentsObj.get_space());
						System.out.println("9-How much are the monthly fees : "+AdvertisedHouses.get(i).apartmentsObj.get_monthly_fee()+" \n10-Do the fees include electricity and water : "+AdvertisedHouses.get(i).apartmentsObj.get_Fees_include_water_electricity()+" \n11-Is there free internet service : "+AdvertisedHouses.get(i).apartmentsObj.get_Free_internet()+" \n12-Is there a private car park for the building : "+AdvertisedHouses.get(i).residenceObj.get_available_parking()+"\n13-Is elevator service available : "+AdvertisedHouses.get(i).residenceObj.get_Elevator_available());
						System.out.println("14-Image link for the apartment"+AdvertisedHouses.get(i).apartmentsObj.get_photo());
						System.out.println("** This house is available **");
				 }
			 }
			return true;
		}
		
		
		
}
