package sakancom1;


import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	public ArrayList <Owner> ownerList = new ArrayList<Owner>();
	public static ArrayList <Residence> residenceList = new ArrayList<Residence>();
	public static ArrayList <Apartment> apartmentList = new ArrayList<Apartment>();
	public static ArrayList <User> users = new ArrayList<User>();
	public static ArrayList <Housing> housingList = new ArrayList<Housing>();
	private static  Scanner input1;
	private Boolean found = false;
	private static String userType = "none" ;
	static String username;
	static Boolean housing_not_found = false; 
	static Boolean accept = false; 
	
	public static ArrayList <Housing> housingListAccepted = new ArrayList<Housing>();


	
	public static void setUserType(String type) {
		userType = type;
	}	
	public static String getUserType() {
		return userType;
	}
	public void saveOwnerInfo() {                      /*  function to add the owner in the list */
		
		System.out.println("Enter your ID please :");
		input1 = new Scanner(System.in);
		 int IdFromInput = input1.nextInt();  
		 
		 for(int i=0; i<ownerList.size();i++) {
			  if(ownerList.get(i).getId() == IdFromInput) {
				  ownerList.get(i).setSavedFlag(true);
			      found = true;
	           }
			 
		 }
		 
		 if (found) {
			 System.out.println("This owner is already exists");
		 }
		 else {
			 System.out.println(" Enter your name please :");
			 input1 = new Scanner(System.in);
			 String nameFromInput = input1.next();
			 System.out.println(" Enter your address please :");
			 input1 = new Scanner(System.in);
			 String addressFromInput =input1.next();
			 System.out.println(" Enter your phone number please :");	
			 input1 = new Scanner(System.in);
			 String phoneFromInput = input1.next();
			 System.out.println(" Enter your email please :");
			 input1 = new Scanner(System.in);
			 String emailFromInput = input1.next();
			 ownerList.add(new Owner(IdFromInput , nameFromInput, addressFromInput , phoneFromInput , emailFromInput  ));
			 System.out.println("Thank you , we add you in our system successfully");
		 }
		 
}
	public static  Boolean isUserFound (String userName , String passWord) {
		
		boolean user_found = false;
		for (User user : users) {
			
			if ((user.getUserName().equals(userName))&&(user.getPass().equals(passWord))) {
				user_found = true;
				break;
			}
			
			else {
				user_found = false;
			}
		
		}
		
		return user_found;
	} 
	
	
	
	
	
	
	public static void tenantProcess(int choice) {
		
		switch(choice) {
		
		case 1 :
			
			ShowStatusOfHousing();	
		showMenu();
				
		           break; 
		           
		case  2 :  ShowHousing();
					showMenu();
		          break;
		          
		case 3 : 
			
			input1 = new Scanner(System.in);
			System.out.println("what your choice from avalible housing ?");
			int id = input1.nextInt();
			bookAccommodation(id);
			showMenu();
		case 7 : System.out.println("See you soon!");
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter your username please");
	 	username = input2.next();
		System.out.println("Enter your password please");
		String pass = input2.next();
		login(username , pass);
		//System.out.println(username);
		showMenu();
				  break;
		
		}	
			
			
		}
	public static boolean ShowStatusOfHousing() { 
		//      house id : 556 ||||| Available 
		//		house id : 557 ||||| Un_Available 
for(int i=0; i<housingListAccepted.size();i++) {
	
System.out.printf("House Id: %d  " , housingList.get(i).getHousingId());
System.out.printf(" |||||||| %s  \n" , housingList.get(i).getStatus());

}
return true;
}
	public static void bookAccommodation(int housingId) {
		
		 for(int i=0; i<housingListAccepted.size();i++) {
			  if(housingListAccepted.get(i).getHousingId() == housingId ) {
				  int c=0;
				  if(housingListAccepted.get(i).getStatus().equals("Available") ) {
					  c=c+1;
					  if(housingListAccepted.get(i).getMaxNumOfTenant()==c) {
						  housingListAccepted.get(i).setStatusUnavailable();
						  
					  }
					  
				  }
				  else	System.out.println("This house is Unavailable");

				  }	  else	System.out.println("There is no housing with this id");
				  }
	}

	
	
	
	
	
	public static void ownerProcess(int choice) {
		
	switch(choice) {
	
	case 1 :Housing h=addHousingInfo();
			addHousing(h);
			showMenu();

	           break; 
	           
	case  2 :  	System.out.println("Wecome in Owner Control Panel :");

		ownerControlPanel();
	          break;
	          
	case 3 :		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the house number you want to modify");
		System.out.println("Your Houses ... ");
		for (int i=0 ; i<housingList.size() ;i++) {
    		System.out.print(housingList.get(i).getHousingId()+"     ");
			
		}
		
	    int id = scanner.nextInt();
	    
	    for(int i=0; i<housingList.size();i++) {
			 if(id == housingList.get(i).getHousingId()) {
				System.out.println("Enter number to modify this point \n1)Residence Id .. \n2)Residence Name ..\n3)Location..\n4)Floor Number..\n5)Apartment Number..\n6)Photo.. \n7)Rent..\n8)Services..\n9)Max Number Of Tenant..\n10)Number Of Bedrooms..\n11)Number Of Bathrooms..\n12)Balcony..\n13)Owner Name..\n14)Owner Phone..\n15)Owner Email..\n16)Status..  ");
			    int number = scanner.nextInt();
			
			    editHousing(number,id);}
			 }
			showMenu();
			break;
		
			
	case 4 :		System.out.println("this all housing for acepted ot reject  from admin");
			for(int i=0; i<housingList.size();i++) {
					ShowHousingj();	}
			showMenu();
			break;
			
			
	case 5 : System.out.println("See you soon!");
	Scanner input2 = new Scanner(System.in);
	System.out.println("Enter your username please");
 	username = input2.next();
	System.out.println("Enter your password please");
	String pass = input2.next();
	login(username , pass);
	//System.out.println(username);
	showMenu();
			  break;
	
	}	
		
		
	}
    public static Housing addHousingInfo() {
	Scanner input4 = new Scanner(System.in);
	System.out.println("Enter the residence ID :");
	int residenceId = input4.nextInt();
	System.out.println("Enter the residence name :");
	String residenceName = input4.next();
	System.out.println("Enter the residence location :");
	String location = input4.next();
	System.out.println("Enter the floor number :");
	int floorNumber = input4.nextInt(); 
	System.out.println("Enter the apartment number :");
	int apartmentNumber = input4.nextInt(); 
	System.out.println("Enter the apartment photo :");
	String photo = input4.next();
	System.out.println("Enter the monthly rent ( inclusive of electricity and water ) :");
	int rent = input4.nextInt(); 
	System.out.println("Enter the available services in the apartment :");
	String services = input4.next();
	System.out.println("Enter the Maximum number of tenants :");
	int maxNum = input4.nextInt();
	System.out.println("Enter the Number of bedrooms:");
	int numOfBedrooms = input4.nextInt();
	System.out.println("Enter the Number of bathrooms:");
	int numOfBathrooms = input4.nextInt();
	System.out.println("is there a balcony in the apartment? if ");
	int balcony = input4.nextInt();
	System.out.println("Enter the owner name :");
	String ownerName = input4.next();
	System.out.println("Enter the owner phone :");
	String ownerPhone = input4.next();
	System.out.println("Enter the owner email :");
	String ownerEmail= input4.next(); 
	Housing h= new Housing(residenceId ,residenceName,location,floorNumber,apartmentNumber,photo,rent,services, maxNum,numOfBedrooms,numOfBathrooms,balcony,username,ownerName,ownerPhone,ownerEmail);
    	
		return h;
		
	}
    public static Boolean addHousing(Housing h) {                        /* to add housing by the owner  */
		
		int flag=0;
		for (int i=0 ; i<housingList.size(); i++) {
			if( h.getHousingId() == housingList.get(i).getHousingId()) {
				flag=1;
			}			
			}
			if (flag ==0 ) {housingList.add(h);
			System.out.println("your housing has been added successfully");
			return	housing_not_found= true;
			}
			else {
				System.out.println("this housing is already exist");
				
				return housing_not_found = false;
				
			   
			}
			
			
	
//		return housing_not_found;
		
	}
    public static void ownerControlPanel() {
		
		Scanner input5 = new Scanner(System.in);
		for (int i=0 ; i<housingList.size() ;i++) {
	    if (housingList.get(i).getOwnerUserName().equals(username))
	    {
	    	housingList.get(i).showHousing();
	    	}
		}
		System.out.println("Your Houses ... ");
		for (int i=0 ; i<housingList.size() ;i++) {
    		System.out.print(housingList.get(i).getHousingId()+"     ");
			
		}
		System.out.println("\n   Enter the id of which housing you want to see its details");
	    	int id = input5.nextInt();
	    	for (int k = 0 ; k<housingList.size() ; k++) {
	    		if (housingList.get(k).getHousingId()==id) {
	    			for (int j=0 ; j< residenceList.size() ;j++) {
	    		    	if (housingList.get(k).getResidenceId()==(residenceList.get(j).getId())) {
	    		    		System.out.println("the number of floors in this residence is: " + residenceList.get(j).getNumOfFloors());
	    		    		System.out.println("Enter the number of floor to see which the apartments is in it");
	    		    		int floor = input5.nextInt();
	    		    		System.out.println("These are the apartments on this floor");
	    		    		for (int a =0 ; a<apartmentList.size() ; a++) {
	    		    			if (apartmentList.get(a).getFloorNum()==floor) {
	    		    				System.out.println(apartmentList.get(a).getId()); 
	    		    			}
	    		    		}
	    		    		System.out.println("Enter the number of apartment ");
	    		    		int apartmentId = input5.nextInt();
	    		    		for(int n=0 ; n<apartmentList.size() ; n++) {
	    		    			if (apartmentList.get(n).getId()==apartmentId) {
	    		    				System.out.println("the number of bedrooms is : " + apartmentList.get(n).getBedrooms());
	    		    				System.out.println("the number of bathrooms is "+ apartmentList.get(n).getBathrooms());
	    		    				System.out.println("the number of balcony is: " +apartmentList.get(n).getBalcony() );
	    		    			}
	    		    		}
	    		    		
	    		    		
	    		    	}
	    		    	}
	    		    	
	    		   		
	    					
	    		}
	    	}
	    	
			
			
		}
    public static boolean editHousing(int number,int id) {
		///fun. Show all hausing for this owner

    	Scanner scanner = new Scanner(System.in);
    	 for(int i=0; i<housingList.size();i++) {
			 if(id == housingList.get(i).getHousingId()) {
			    	 if(number==1) {
			    		 System.out.println("Enter new value to edit .. ");
					     int resId = scanner.nextInt(); 
					     housingList.get(i).setResidenceId(resId);
					     System.out.println("Done this update ");
					     return true;
			    	 
			    	 }
				else if(number==2) {System.out.println("Enter new value to edit .. ");
				String resNmae = scanner.next();
				 housingList.get(i).setResidenceName(resNmae);
				 System.out.println("Done this update ");
				 return true;
				}
				else if(number==3) {System.out.println("Enter new value to edit .. ");
				String location = scanner.next();
				 housingList.get(i).setLocation(location);
				 System.out.println("Done this update ");
				 return true;
				}
				else if(number==4) {System.out.println("Enter new value to edit .. ");
			    int floorNum = scanner.nextInt();
			     housingList.get(i).setFloorNum(floorNum);
			     System.out.println("Done this update ");
			     return true;
				}
				else if(number==5) {System.out.println("Enter new value to edit .. ");
				int apartmentNum = scanner.nextInt();
				 housingList.get(i).setApartmentNum(apartmentNum);
				 System.out.println("Done this update ");
				 return true;
				}
				else if(number==6) {System.out.println("Enter new value to edit .. ");
				String photo = scanner.next();
				 housingList.get(i).setPhoto(photo);
				 System.out.println("Done this update ");
			     
				 return true;

				}
				else if(number==7) {System.out.println("Enter new value to edit .. ");
				int rent = scanner.nextInt();
				 housingList.get(i).setRent(rent);
				 System.out.println("Done this update ");
				 return true;
}
				else if(number==8) {System.out.println("Enter new value to edit .. ");
				String services = scanner.next();
				 housingList.get(i).setServices(services);
				 System.out.println("Done this update ");
				 return true;


				}
				else if(number==9) {System.out.println("Enter new value to edit .. ");
				int max = scanner.nextInt();
				 housingList.get(i).setMaxNumOfTenant(max);
				 System.out.println("Done this update ");
				 return true;
}
				else if(number==10) {System.out.println("Enter new value to edit .. ");
				int bed = scanner.nextInt();
				 housingList.get(i).setNumOfBedrooms(bed);
				 System.out.println("Done this update ");
				 return true;
}
				else if(number==11) {System.out.println("Enter new value to edit .. ");
				int bath = scanner.nextInt();
				 housingList.get(i).setNumOfBathrooms(bath);
				 System.out.println("Done this update ");
				 return true;
}
				else if(number==12) {System.out.println("Enter new value to edit .. ");
				 int balcony = scanner.nextInt();
				 housingList.get(i).setBalcony(balcony);
				 System.out.println("Done this update ");
				 return true;

}
				else if(number==13) {System.out.println("Enter new value to edit .. ");
			String	name = scanner.next();
				 housingList.get(i).setOwnerName(name);
				 System.out.println("Done this update ");
				 return true;

}
				else if(number==14) {System.out.println("Enter new value to edit .. ");
				String phone = scanner.next();
				 housingList.get(i).setOwnerPhone(phone);
				 System.out.println("Done this update ");
				 return true;

}
				else if(number==15) {System.out.println("Enter new value to edit .. ");
				String email = scanner.next();
				 housingList.get(i).setOwnerEmail(email);
				 System.out.println("Done this update ");
				 return true;

}
				else if(number==16) {
					  if(housingList.get(i).getStatus().equals("Available") ) {
						  housingList.get(i).setStatusUnavailable();}
						  else { housingList.get(i).setStatusAvailable();}
					  System.out.println("Done this update ");
					  return true;   
						  
  
					  }
				else { System.out.println("not found this feild ...Please enter a valid value again.");return false;
			     	   }

}
				
				 
				 
			 }
		return true;}

	
	
	
	
	
	
	public static void AdminProcess(int choice) {
		
		switch(choice) {
		
		case 1 :System.out.println("accept And Reject!");
		  for(int i=0; i<housingList.size();i++) {
			  ShowHousingj();		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter 1 to accept this House and Enter 2 to Reject this House... ");
			int n = scanner.nextInt();
			acceptAndReject(n,housingList.get(i));showMenu();}
			System.out.println("Array is empity..");
			showMenu();
		           break; 
		           
		case  2 :  WatchingReservations();	
		showMenu();
		          break;
		case 3 :  Housing h=addHousingInfo();
		addHousing(h);
		
           break;     
		case 4 :System.out.println("See you soon!");
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter your username please");
	 	username = input2.next();
		System.out.println("Enter your password please");
		String pass = input2.next();
		login(username , pass);
		//System.out.println(username);
		showMenu();
		  break;
	
		
		}	
			
			
		}
    public static Boolean WatchingReservations() {
		 for(int i=0; i<housingListAccepted.size();i++) {			
							  
								System.out.printf("House Id: %d  \n" , housingListAccepted.get(i).getHousingId());
								System.out.println("");
								System.out.printf("Residence Id: %d  \n" ,housingListAccepted.get(i).getResidenceId());
								System.out.println("");
								System.out.printf("Residence Name: %s  \n" , housingListAccepted.get(i).getResidenceName());
								System.out.println("");
								System.out.printf("House location: %s  \n" , housingListAccepted.get(i).getLocation());					
								System.out.println("");
								System.out.printf("floor Number : %d  \n" , housingListAccepted.get(i).getFloorNum());
								System.out.println("");
								System.out.printf("Apartment Number: %d  \n" , housingListAccepted.get(i).getApartmentNum());
								System.out.println("");
								System.out.printf("House photo: %s  \n" , housingListAccepted.get(i).getPhoto());
								System.out.println("");
								System.out.printf("House Rent: %d  \n" , housingListAccepted.get(i).getRent());
								System.out.println("");
								System.out.printf("House Services: %s  \n" , housingListAccepted.get(i).getServices());
								System.out.println("");
								System.out.printf("Max Number Of Tenant in House : %d  \n" , housingListAccepted.get(i).getMaxNumOfTenant());
								System.out.println("");
								System.out.printf("Number Of Bedrooms in House: %d  \n" , housingListAccepted.get(i).getNumOfBedrooms());
								System.out.println("");
								System.out.printf("Number Of Bethrooms in House: %d  \n" , housingListAccepted.get(i).getNumOfBathrooms());
								System.out.println("");
								System.out.printf("Number Of Balcony House: %d  \n" , housingListAccepted.get(i).getBalcony());
								System.out.println("");
								System.out.printf("Owner Name to House : %s  \n" , housingListAccepted.get(i).getOwnerName());
								System.out.println("");
								System.out.printf("Owner Phone to House : %s  \n" , housingListAccepted.get(i).getOwnerPhone());
								System.out.println("");
								System.out.printf("Owner Email to House : %s  \n" , housingListAccepted.get(i).getOwnerEmail());
								System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

						  }
		return true;
		 
		 
		 
	}
    public static Boolean acceptAndReject(int n,Housing housing) {
    	
    	  
    	if(n==1) { housingListAccepted.add(housing); housingList.remove(housing);	return accept=true;		}
    	else if(n==2) {housingList.remove(housing);	
    	return false;
    	}
    	else {System.out.println("Enter true value !!!");
    			return accept=false;
    	}
    	
//    	 accept;

    	
    	
    }	
		
	public static boolean ShowHousing() {
		// TODO Auto-generated method stub
	
		
		 for(int i=0; i<housingListAccepted.size();i++) {
		//	  if(housingList.get(i).getHousingId() == housingId ) {
				  
			//	  if(housingList.get(i).getStatus().equals("Available") ) {
					
				  
					System.out.printf("House Id: %d  \n" , housingList.get(i).getHousingId());
//					System.out.println("");
					System.out.printf("Residence Id: %d  \n" ,housingList.get(i).getResidenceId());
//					System.out.println("");
					System.out.printf("Residence Name: %s  \n" , housingList.get(i).getResidenceName());
//					System.out.println("");
					System.out.printf("House location: %s  \n" , housingList.get(i).getLocation());					
//					System.out.println("");
					System.out.printf("floor Number : %d  \n" , housingList.get(i).getFloorNum());
//					System.out.println("");
					System.out.printf("Apartment Number: %d  \n" , housingList.get(i).getApartmentNum());
//					System.out.println("");
					System.out.printf("House photo: %s  \n" , housingList.get(i).getPhoto());
//					System.out.println("");
					System.out.printf("House Rent: %d  \n" , housingList.get(i).getRent());
//					System.out.println("");
					System.out.printf("House Services: %s  \n" , housingList.get(i).getServices());
//					System.out.println("");
					System.out.printf("Max Number Of Tenant in House : %d  \n" , housingList.get(i).getMaxNumOfTenant());
//					System.out.println("");
					System.out.printf("Number Of Bedrooms in House: %d  \n" , housingList.get(i).getNumOfBedrooms());
//					System.out.println("");
					System.out.printf("Number Of Bethrooms in House: %d  \n" , housingList.get(i).getNumOfBathrooms());
//					System.out.println("");
					System.out.printf("Number Of Balcony House: %d  \n" , housingList.get(i).getBalcony());
//					System.out.println("");
					System.out.printf("Owner Name to House : %s  \n" , housingList.get(i).getOwnerName());
//					System.out.println("");
					//}
				//  else	System.out.println("This house is Un_Available");

					System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

			  }
		 return true;
			  }



	public static boolean ShowHousingj() {
		// TODO Auto-generated method stub
	
		
		 for(int i=0; i<housingList.size();i++) {
		//	  if(housingList.get(i).getHousingId() == housingId ) {
				  
			//	  if(housingList.get(i).getStatus().equals("Available") ) {
					
				  
					System.out.printf("House Id: %d  \n" , housingList.get(i).getHousingId());
//					System.out.println("");
					System.out.printf("Residence Id: %d  \n" ,housingList.get(i).getResidenceId());
//					System.out.println("");
					System.out.printf("Residence Name: %s  \n" , housingList.get(i).getResidenceName());
//					System.out.println("");
					System.out.printf("House location: %s  \n" , housingList.get(i).getLocation());					
//					System.out.println("");
					System.out.printf("floor Number : %d  \n" , housingList.get(i).getFloorNum());
//					System.out.println("");
					System.out.printf("Apartment Number: %d  \n" , housingList.get(i).getApartmentNum());
//					System.out.println("");
					System.out.printf("House photo: %s  \n" , housingList.get(i).getPhoto());
//					System.out.println("");
					System.out.printf("House Rent: %d  \n" , housingList.get(i).getRent());
//					System.out.println("");
					System.out.printf("House Services: %s  \n" , housingList.get(i).getServices());
//					System.out.println("");
					System.out.printf("Max Number Of Tenant in House : %d  \n" , housingList.get(i).getMaxNumOfTenant());
//					System.out.println("");
					System.out.printf("Number Of Bedrooms in House: %d  \n" , housingList.get(i).getNumOfBedrooms());
//					System.out.println("");
					System.out.printf("Number Of Bethrooms in House: %d  \n" , housingList.get(i).getNumOfBathrooms());
//					System.out.println("");
					System.out.printf("Number Of Balcony House: %d  \n" , housingList.get(i).getBalcony());
//					System.out.println("");
					System.out.printf("Owner Name to House : %s  \n" , housingList.get(i).getOwnerName());
//					System.out.println("");
					//}
				//  else	System.out.println("This house is Un_Available");

					System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

			  }
		 return true;
			  }

	public static String login(String userName , String passWord) {     /*  for log in as admin or owner or tenant  */
		User firstUser = new User("ownerOmar","123");
		User secondUser = new User("ownerAseel","321");
		User thirdUser = new User ("adminAhmad","159");
		User forthUser = new User ("tenantNajeh45","456");
		User fifthUser = new User ("Najeh","147");
		users.add(firstUser);
		users.add(secondUser);
		users.add(thirdUser);
		users.add(forthUser);
		users.add(fifthUser);
		
		
		Residence firstResidence = new Residence(1 , "alsafa" , "nablus" , 5 , 10);
		Residence secondResidence = new Residence(5 , "istanbul" , "nablus" , 7, 21);
		residenceList.add(firstResidence);
		residenceList.add(secondResidence);
		Apartment firstApartment = new Apartment(100,222,1,3,"https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link",1200,"elevator",4,2,2,1,true);
		Apartment secondApartment = new Apartment(22,15,5,6,"https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link",1500,"free internet",6,3,2,2,true);
		apartmentList.add(firstApartment);
		apartmentList.add(secondApartment);
		Housing firstHousing = new Housing (1,"alsafa" ,"nablus" ,3,100,"https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link",1200,"elevator",4,2,2,1,"omar","ownerOmar11","0569696345","omar.112@gmail.com");
//		housingList.add(firstHousing);
		Housing firstHousing1 = new Housing (2,"alsafa" ,"nablus" ,3,200,"https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link",1200,"elevator",4,2,2,1,"omar","ownerOmar11","0569696345","omar.112@gmail.com");
//		housingList.add(firstHousing1);
		Housing firstHousing2 = new Housing (3,"alsafa" ,"nablus" ,3,300,"https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link",1200,"elevator",4,2,2,1,"omar","ownerOmar11","0569696345","omar.112@gmail.com");
//		housingList.add(firstHousing2);
		Housing firstHousing3 = new Housing (1,"alsafa" ,"nablus" ,3,100,"https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link",1200,"elevator",4,2,2,1,"omar","ownerOmar11","0569696345","omar.112@gmail.com");
//		housingListAccepted.add(firstHousing3);
		Housing firstHousing4 = new Housing (5,"alsafa" ,"nablus" ,3,600,"https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link",1200,"elevator",4,2,2,1,"omar","ownerOmar11","0569696345","omar.112@gmail.com");
//		housingListAccepted.add(firstHousing4);
		Housing firstHousing5 = new Housing (6,"alsafa" ,"nablus" ,3,500,"https://drive.google.com/file/d/1Meeeogiy_F5bCQvhoJB2BepnrxkRkF_P/view?usp=drive_link",1200,"elevator",4,2,2,1,"omar","ownerOmar11","0569696345","omar.112@gmail.com");
//		housingListAccepted.add(firstHousing5);
		
		
		
		  if (isUserFound(userName, passWord)) {
		 
			
				if (userName.startsWith("admin")) {
					
					setUserType("admin");
				}
				
				else if (userName.startsWith("owner")) {
					
					setUserType("owner");
				}
				
				else if (userName.startsWith("tenant")) {
					setUserType("tenant");
				}
				else {
					setUserType("none");
				}
					
				}  
			else {
				setUserType("You are not signed up in the application");
			}
		
		return getUserType();
		
	}
	
	
	public static void showMenu() {
		
		Scanner input3 = new Scanner(System.in);
		if (getUserType().equals("admin"))
		{
			System.out.println("Choose one :\n1)See housing and accept or reject it. \n2)Watching reservations via the system.\n3)Add Housing. \n4)Close porogram.");
			System.out.println("what your choice?");
			int userChoice = input3.nextInt();
			AdminProcess(userChoice);
		}
		else if (getUserType().equals("owner")) {
			System.out.println("Choose one :\n1)Add Housing .\n2)Your control panel. \n3) Modify housing.\n4)Show housing. \n5)Close porogram.");
			System.out.println("what your choice?");
			int userChoice = input3.nextInt();
			ownerProcess(userChoice);
		}	
		else if (getUserType().equals("tenant")) {
			System.out.println("Choose one :\n1)ability to view the available housing. \n2)ability to view information about houses. \n3)Book accommodation. \n7)Close porogram.");
			System.out.println("what your choice?");
			int userChoice = input3.nextInt();
			tenantProcess(userChoice);
		}
		else {
			//System.out.println("please sign up!");
			Scanner input2 = new Scanner(System.in);
			System.out.println("Enter your username please");
		 	username = input2.next();
			System.out.println("Enter your password please");
			String pass = input2.next();
			login(username , pass);
			//System.out.println(username);
			showMenu();
		}
		
		
		
	}

		
		
		
		
		
			
		
		
	
		
		
		
		
	
	
		
		
	
	
	
	
	
	
	public static void main(String args[]) {
		
		
		
		
	
		
		
		
		
		
	
		
			
			
			
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter your username please");
	 	username = input2.next();
		System.out.println("Enter your password please");
		String pass = input2.next();
		login(username , pass);
		//System.out.println(username);
		showMenu();
		//System.out.println(userType);
		
		for(int i=0;i<housingList.size();i++) {
	//		System.out.println(housingList.get(i).getHousingId());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}