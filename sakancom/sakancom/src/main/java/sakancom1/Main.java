
package sakancom1;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

	public static ArrayList <Residence> residenceList = new ArrayList<Residence>();
	public static ArrayList <tenant> tenantLinst = new ArrayList<tenant>();
	public static ArrayList <houseAndTennant> houseAndTennantlist = new ArrayList<houseAndTennant>();
	public static ArrayList <Apartment> apartmentList = new ArrayList<Apartment>();
	public static ArrayList <User> users = new ArrayList<User>();
	public static ArrayList <Housing> housingList = new ArrayList<Housing>();
	public static ArrayList <Housing> housingListAccepted = new ArrayList<Housing>();

	private static  Scanner input1;
	private static String userType = "none" ;
	static String username;
	static Boolean housing_not_found = false; 
	static Boolean accept = false; 


	
	public static void setUserType(String type) {
		userType = type;
	}	
	public static String getUserType() {
		return userType;
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
	
	public static boolean showUsedFurniture(String t) {
		boolean returnn = false;
		for (int i=0 ; i<tenantLinst.size() ; i++) {
			
			if (t.equals(tenantLinst.get(i).getname()) )  {
				if (tenantLinst.get(i).getFurniture()!=null) {
				System.out.println("I have this used furniture for sale at good prices :\n" + tenantLinst.get(i).getFurniture() );
				returnn= true;
				}
				else {
					System.out.println("I dont have any used furniture for sale \n");
					returnn= false;
				}
			}
		}
		
		return returnn;}
	
public static boolean addUsedFurniture(String Furniture,String user) {
	boolean flag=false;
		for (int i=0 ; i<tenantLinst.size() ; i++) {
			
			if (user.equals(tenantLinst.get(i).getname()) )  {
				tenantLinst.get(i).setFurniture(Furniture);
			flag=true;	
			}
							}
			
		return flag; }
		
	
	public static boolean tenantCpanel(String usernamee) {
		int IdHouse = 0;
		
		boolean a = false;
		for (int i=0 ; i<tenantLinst.size() ; i++) {
		if(tenantLinst.get(i).getname().equals(usernamee)) {
			a=true;
			System.out.println("your name : "+tenantLinst.get(i).getname());
			System.out.println("your phone : "+tenantLinst.get(i).getphone());
			System.out.println("your age : "+tenantLinst.get(i).getage());
			System.out.println("your majer : "+tenantLinst.get(i).getmajer());
			System.out.println("your furniture : "+tenantLinst.get(i).getFurniture());
			
			for (int j=0 ; j<houseAndTennantlist.size() ; j++) {
				if(usernamee.equals(houseAndTennantlist.get(j).getTenants())) {
					System.out.println("The apartment number booked in your name is  : "+houseAndTennantlist.get(j).gethousingId());
					IdHouse=houseAndTennantlist.get(j).gethousingId();
				
					
					for (int jj=0 ; jj<housingListAccepted.size() ; jj++) {
						if(IdHouse==housingListAccepted.get(jj).getHousingId()) {
							System.out.println("The owner Name is   : "+housingListAccepted.get(jj).getOwnerName());
							System.out.println("The owner Phone is  : "+housingListAccepted.get(jj).getOwnerPhone());
							System.out.println("The owner Email is  : "+housingListAccepted.get(jj).getOwnerEmail());
							System.out.println("The Residence Id is  : "+housingListAccepted.get(jj).getResidenceId());
							System.out.println("The Rent is  : "+housingListAccepted.get(jj).getRent());
							System.out.println("Please pay the rent within the next month.");
							System.out.println("||||||||||||||||||||||||||||||||||||||||||||");

						}
							

				}
					}
				
			}	
				
					

			}
		}
		return a;	}
		
	
	public static void tenantProcess(int choice) {
		
		switch(choice) {
		
		case 1 :
			
			ShowStatusOfHousing();	
		showMenu();
				
		           break; 
		           
		case  2 :  WatchingReservations();
					showMenu();
		          break;
		          
		case 3 : 
			
			input1 = new Scanner(System.in);
			System.out.println("what your choice from avalible housing ?");
			for(int j=0; j<housingListAccepted.size();j++) {
				System.out.print(housingListAccepted.get(j).getHousingId()+"     ");
			}
			int id = input1.nextInt();
			bookAccommodation(id);
			showMenu();
			   break;
		case 4:
		ifTenIsStudent(username);
				showMenu();

			   break;
			   
			   
		case 5:		Scanner input2a = new Scanner(System.in);

			System.out.println("Enter your Furniture to add  please");
	 String	s = input2a.next();
			addUsedFurniture(s,username);
		showMenu();

		   break;
		case 6: showUsedFurniture(username);
		showMenu();

		   break;
		case 7: tenantCpanel(username) ; 
		showMenu();

		   break;
		case 8 : System.out.println("See you soon!");
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter your username please");
	 	username = input2.next();
		System.out.println("Enter your password please");
		String pass = input2.next();
		login(username , pass);
		showMenu();
				  break;
		
		case 9: for(int i=0 ; i<tenantLinst.size();i++) {
			System.out.println(tenantLinst.get(i).getname()+"   ");}
			showMenu();
			  break;
		  default:showMenu();

		   break;
		}
		}	
			
	public static boolean ShowStatusOfHousing() { 
		/**     house id : 556 ||||| Available 
		   		house id : 557 ||||| Un_Available */
		boolean flag=false;
		for(int j=0; j<housingListAccepted.size();j++) {

			System.out.print("House Id:   " + housingListAccepted.get(j).getHousingId()+" ||||||||   " +housingListAccepted.get(j).getStatus()+"\n");
flag=true;
		}
		return flag;
	}
	static int c=0;
	private static Scanner input2;
	private static Scanner input3;
	private static Scanner scanner;
	private static Scanner input4;
	private static Scanner scanner2;
	private static Scanner input22;
	public static boolean bookAccommodation(int housingId) {
		 boolean h=false;
		 for(int i=0; i<housingListAccepted.size();i++) {
			
			  if(housingListAccepted.get(i).getHousingId() == housingId ) {
				 
				  if(housingListAccepted.get(i).getStatus().equals("Available") ) {
					  c=c+1;
					  h=true;
					  houseAndTennant t1 = new houseAndTennant(housingId,username);
					  houseAndTennantlist.add(t1);
						
						System.out.println("The apartment has been booked");

					  if(housingListAccepted.get(i).getMaxNumOfTenant()==c) {
						  housingListAccepted.get(i).setStatusUnavailable();
						  
					  }
					  
				  }
				  else	{h=false; System.out.println("This house is Unavailable"); }

				  }	 
				  }

return h;	}

	
	public static void ownerProcess(int choice) {
		
	switch(choice) {
	
	case 1 :Housing h=addHousingInfo();
			addHousing(h,getUserType());
			showMenu();

	           break; 
	           
	case  2 :  

	cPanel(username);
		showMenu();
	          break;
	          
	case 3 :		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the house number you want to modify");
		System.out.println("Your Houses ... ");
		for (int i=0 ; i<housingList.size() ;i++) {
    	if(housingList.get(i).getOwnerName().equals(username)) 
			System.out.print(housingList.get(i).getHousingId()+"     ");
    
		}
		
	    int id = scanner.nextInt();
	    
	    for(int i=0; i<housingList.size();i++) {
			 if(id == housingList.get(i).getHousingId()) {
				System.out.println("Enter number to modify this point \n1)Residence Id .. \n2)Residence Name ..\n3)Location..\n4)Floor Number..\n5)Apartment Number..\n6)Photo.. \n7)Rent..\n8)Services..\n9)Max Number Of Tenant..\n10)Number Of Bedrooms..\n11)Number Of Bathrooms..\n12)Balcony..\n13)Owner Name..\n14)Owner Phone..\n15)Owner Email..\n16)Status..  ");
			    int number = scanner.nextInt();
			
			    editHousing(number,id,username);}
			 }
			showMenu();
			break;
		
			
	case 4 :		System.out.println("this all housing for acepted ot reject  from admin");
					ShowHousingj(username);
			showMenu();
			break;
			
	case 5 : 		
		WatchingReservationstoOwner();
		showMenu();
	break;	
	case 6 : System.out.println("See you soon!");
	Scanner input2 = new Scanner(System.in);
	System.out.println("Enter your username please");
 	username = input2.next();
	System.out.println("Enter your password please");
	String pass = input2.next();
	login(username , pass);
	showMenu();
			  break;
	default:showMenu();

	   break;
			  
	
	}	
		
		
	}
    public static Housing addHousingInfo() {
	input4 = new Scanner(System.in);
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
	System.out.println("The name of the owner has been entered. If you want to change it, go to the Modify field. The name of the owner is: \n"+username);
	String ownerName = username;
	System.out.println("Enter the owner phone :");
	String ownerPhone = input4.next();
	System.out.println("Enter the owner email :");
	String ownerEmail= input4.next(); 
	Housing h= new Housing(residenceId ,residenceName,location,floorNumber,apartmentNumber,photo,rent,services, maxNum,numOfBedrooms,numOfBathrooms,balcony,username,ownerName,ownerPhone,ownerEmail);
	Apartment secondApartment32 = new Apartment(apartmentNumber,username,residenceId,floorNumber,photo,rent,services,maxNum,numOfBedrooms,numOfBathrooms,balcony,true);
	apartmentList.add(secondApartment32);
		
		return h;
		
	}
    public static Boolean addHousing(Housing h,String getUserType) {                        /*** to add housing by the owner  ***/
		if (getUserType.equals("admin")) {
			
			
			int flag=0;
			for (int i=0 ; i<housingListAccepted.size(); i++) {
				if( h.getHousingId() == housingListAccepted.get(i).getHousingId()) {
					flag=1;
				}			
				}
				if (flag ==0 ) {housingListAccepted.add(h);
				System.out.println("your housing has been added successfully");
				return	housing_not_found= true;
				}
				else {
					System.out.println("this housing is already exist");
					
					return housing_not_found = false;
					
				   
				}
			
			
		}
		else if(getUserType.equals("owner")) {
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
				
			   
			}}
		else {return housing_not_found = false;}
			
			
	
		
	}

 
 public static boolean editHousing1(int number,int id,String newValue ) {
     boolean flag=false; 
	 for(int i=0; i<housingList.size();i++) {
   		 if(id == housingList.get(i).getHousingId()) {
if(number==2) {
       	housingList.get(i).setResidenceName(newValue);
   	 System.out.println("Done this update on ResidenceName");
   	flag = true ;}
if(number==3) { 
housingList.get(i).setLocation(newValue);
 System.out.println("Done this update on location");
	flag = true ;
}
 if(number==6) {
 housingList.get(i).setPhoto(newValue);
 System.out.println("Done this update on Photo");
 
	flag = true ;

}
 if(number==8) {
 housingList.get(i).setServices(newValue);
 System.out.println("Done this update on Services");
	flag = true ; }


 if(number==13) {
 housingList.get(i).setOwnerName(newValue);
 System.out.println("Done this update on OwnerName");
	flag = true ;

}
 if(number==14) {
 housingList.get(i).setOwnerPhone(newValue);
 System.out.println("Done this update on OwnerPhone");
	flag = true ;

}
 if(number==15) {
 housingList.get(i).setOwnerEmail(newValue);
 System.out.println("Done this update on OwnerEmail");
	flag = true ;

}
   		 
   		 }}
      	return flag;}

 
 public static boolean editHousing2(int number,int id,int newValue ) {
     boolean flag=false; 

	 for(int i=0; i<housingList.size();i++) {
		 if(id == housingList.get(i).getHousingId()) {
			 if(number==1) {
			     housingList.get(i).setResidenceId(newValue);
			     System.out.println("Done this update ResidenceId");
			     flag= true;
	    	 
	    	 }
			  if(number==4) {
			     housingList.get(i).setFloorNum(newValue);
			     System.out.println("Done this update FloorNum");
			     flag= true;
				}
				 if(number==5) {
				 housingList.get(i).setApartmentNum(newValue);
				 System.out.println("Done this update ApartmentNum");
				 flag= true;
				}
				 if(number==7) {
				 housingList.get(i).setRent(newValue);
				 System.out.println("Done this update Rent");
				 flag= true;
}
				 if(number==9) {
				 housingList.get(i).setMaxNumOfTenant(newValue);
				 System.out.println("Done this update MaxNumOfTenant");
				 flag= true;
}
				 if(number==10) {
				 housingList.get(i).setNumOfBedrooms(newValue);
				 System.out.println("Done this update NumOfBedrooms");
				 flag= true;
}
				 if(number==11) {
				 housingList.get(i).setNumOfBathrooms(newValue);
				 System.out.println("Done this update NumOfBathrooms");
				 flag= true;
}
				 if(number==12) {
				 housingList.get(i).setBalcony(newValue);
				 System.out.println("Done this update Balcony");
				 flag= true;

}		 
			 }}
   	return flag;}
    
 
    public static boolean editHousing(int number,int id,String usernamee) {

    	scanner2 = new Scanner(System.in);
    	 for(int i=0; i<housingList.size();i++) {

    		 if(usernamee.equals(housingList.get(i).getOwnerName())) {
    		 
			 if(id == housingList.get(i).getHousingId()) {
			    	 if(number==1) {
			    		 System.out.println("Enter new value to edit .. ");
					     int resId = scanner2.nextInt(); 
					     editHousing2( number, id, resId );
			    	 
			    	 }
				 if(number==2) {
					System.out.println("Enter new value to edit .. ");
					String resNmae = scanner2.next();
					editHousing1( number, id, resNmae );
				
				}
				 if(number==3) {System.out.println("Enter new value to edit .. ");
				String location = scanner2.next(); 
				editHousing1( number, id, location );
				}
				 if(number==4) {System.out.println("Enter new value to edit .. ");
			    int floorNum = scanner2.nextInt();
			     editHousing2( number, id, floorNum );

				}
				 if(number==5) {System.out.println("Enter new value to edit .. ");
				int apartmentNum = scanner2.nextInt();
			     editHousing2( number, id, apartmentNum );

				}
				 if(number==6) {System.out.println("Enter new value to edit .. ");
				String photo = scanner2.next();
				editHousing1( number, id, photo );
				}
				 if(number==7) {System.out.println("Enter new value to edit .. ");
				int rent = scanner2.nextInt();
			     editHousing2( number, id, rent );

}
				 if(number==8) {System.out.println("Enter new value to edit .. ");
				String services = scanner2.next();
				editHousing1( number, id, services );


				}
				 if(number==9) {System.out.println("Enter new value to edit .. ");
				int max = scanner2.nextInt();
			     editHousing2( number, id, max );

}
				 if(number==10) {System.out.println("Enter new value to edit .. ");
				int bed = scanner2.nextInt();
			     editHousing2( number, id, bed );

}
				 if(number==11) {System.out.println("Enter new value to edit .. ");
				int bath = scanner2.nextInt();
			     editHousing2( number, id, bath );

}
				 if(number==12) {System.out.println("Enter new value to edit .. ");
				 int balcony = scanner2.nextInt();
			     editHousing2( number, id, balcony );

}
				 if(number==13) {System.out.println("Enter new value to edit .. ");
			String	name = scanner2.next();
			editHousing1( number, id, name );

}
				 if(number==14) {System.out.println("Enter new value to edit .. ");
				String phone = scanner2.next();
				editHousing1( number, id, phone );

}
				 if(number==15) {System.out.println("Enter new value to edit .. ");
				String email = scanner2.next();
				editHousing1( number, id, email );

}
				 if(number==16) {
					  if(housingList.get(i).getStatus().equals("Available") ) {
						  housingList.get(i).setStatusUnavailable();}
						  else { housingList.get(i).setStatusAvailable();}
					  System.out.println("Done this update ");
					  return true;   
						  
  
					  }
				else { return false;
			     	   }

}
    	 }	
				 
				 
			 }
		return true;}


	public static void AdminProcess(int choice) {
		
		switch(choice) {
		
		case 1 :System.out.println("accept And Reject!");
		  for(int i=0; i<housingList.size();i++) {
			  ShowHousingWithId(housingList.get(i).getHousingId());		
			scanner = new Scanner(System.in);
			System.out.println("Enter 1 to accept this House and Enter 2 to Reject this House... ");
			int n = scanner.nextInt();
			acceptAndReject(n,housingList.get(i));}
		
			System.out.println("Array is empity..");
			showMenu();
		         break; 
		           
		case  2 :  WatchingReservations();	
		showMenu();
		          break;
		case 3 :  Housing h=addHousingInfo();
		addHousing(h,getUserType());
		showMenu();

		
           break; 
           
		case 4:
			showTenantToAdmin();
			showMenu();

		
        break; 
        
		case 5 :System.out.println("See you soon!");
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter your username please");
	 	username = input2.next();
		System.out.println("Enter your password please");
		String pass = input2.next();
		login(username , pass);
		showMenu();
		  break;
		default:showMenu();

		   break;
		
		}	
			
			
		}
	
	public static Boolean showTenantToAdmin() {
		boolean flag=false;
		for(int i=0 ; i<houseAndTennantlist.size();i++) {
			System.out.println("house id : "+houseAndTennantlist.get(i).gethousingId()+"|| have this ||"+houseAndTennantlist.get(i).getTenants());
			

			flag=true;
		}
		return flag;
	}
	
	
	

	public static Boolean WatchingReservationstoOwner() {
		boolean flag=false;
		for(int i=0; i<housingListAccepted.size();i++) {
		if(housingListAccepted.get(i).getOwnerName().equals(username)) {
	  
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
								flag=true;
						  }}
		return flag;
		 
		 
		 
	}
   	

	public static Boolean WatchingReservations() {
		boolean flag=false;
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
flag=true;
						  }
		return flag;
		 
		 
		 
	}

    public static Boolean acceptAndReject(int n,Housing housing) {
    	
    	  
    	if(n==1) { housingListAccepted.add(housing); housingList.remove(housing);	return accept=true;		}
    	else if(n==2) {housingList.remove(housing);	
    	return false;
    	}
    	else {System.out.println("Enter true value !!!");
    			return accept=false;
    	}
    	


    	
    	
    }			

    public static boolean ShowHousingj(String usernamee) {
    	boolean flag=false;
		
		 for(int i=0; i<housingList.size();i++) {
			 if(usernamee.equals(housingList.get(i).getOwnerName())) {
				 LOGGER.log(Level.INFO,"House Id:   \n" , housingList.get(i).getHousingId());
					LOGGER.log(Level.INFO,"Residence Id:   \n" ,housingList.get(i).getResidenceId());
					LOGGER.log(Level.INFO,"Residence Name:   \n" , housingList.get(i).getResidenceName());
					LOGGER.log(Level.INFO,"House location:   \n" , housingList.get(i).getLocation());					
					LOGGER.log(Level.INFO,"floor Number :   \n" , housingList.get(i).getFloorNum());
					LOGGER.log(Level.INFO,"Apartment Number:   \n" , housingList.get(i).getApartmentNum());
					LOGGER.log(Level.INFO,"House photo:   \n" , housingList.get(i).getPhoto());
					LOGGER.log(Level.INFO,"House Rent:   \n" , housingList.get(i).getRent());
					LOGGER.log(Level.INFO,"House Services:   \n" , housingList.get(i).getServices());
					LOGGER.log(Level.INFO,"Max Number Of Tenant in House :   \n" , housingList.get(i).getMaxNumOfTenant());
					LOGGER.log(Level.INFO,"Number Of Bedrooms in House:   \n" , housingList.get(i).getNumOfBedrooms());
					LOGGER.log(Level.INFO,"Number Of Bethrooms in House:   \n" , housingList.get(i).getNumOfBathrooms());
					LOGGER.log(Level.INFO,"Number Of Balcony House:  \n" , housingList.get(i).getBalcony());
					LOGGER.log(Level.INFO,"Owner Name to House :   \n" , housingList.get(i).getOwnerName());
					LOGGER.log(Level.INFO,"Owner Phone to House :   \n" , housingList.get(i).getOwnerPhone());
					LOGGER.log(Level.INFO,"Owner Email to House :   \n" , housingList.get(i).getOwnerEmail());

					LOGGER.log(Level.INFO,"||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
	flag=true;
			 }
			  }
		 return flag;
			  }  
 
 public static boolean ShowHousingWithId(int id) {
	   boolean flag=false;
		
		 for(int i=0; i<housingList.size();i++) {
			 
		  if(housingList.get(i).getHousingId() == id ) {
				  
					
				  
			  LOGGER.log(Level.INFO,"House Id:  \n" , housingList.get(i).getHousingId());
					LOGGER.log(Level.INFO,"Residence Id:  \n" ,housingList.get(i).getResidenceId());
					LOGGER.log(Level.INFO,"Residence Name:   \n" , housingList.get(i).getResidenceName());
					LOGGER.log(Level.INFO,"House location:   \n" , housingList.get(i).getLocation());					
					LOGGER.log(Level.INFO,"floor Number :   \n" , housingList.get(i).getFloorNum());
					LOGGER.log(Level.INFO,"Apartment Number:   \n" , housingList.get(i).getApartmentNum());
					LOGGER.log(Level.INFO,"House photo:   \n" , housingList.get(i).getPhoto());
					LOGGER.log(Level.INFO,"House Rent:   \n" , housingList.get(i).getRent());
					LOGGER.log(Level.INFO,"House Services:   \n" , housingList.get(i).getServices());
					LOGGER.log(Level.INFO,"Max Number Of Tenant in House :   \n" , housingList.get(i).getMaxNumOfTenant());
					LOGGER.log(Level.INFO,"Number Of Bedrooms in House:   \n" , housingList.get(i).getNumOfBedrooms());
					LOGGER.log(Level.INFO,"Number Of Bethrooms in House:   \n" , housingList.get(i).getNumOfBathrooms());
					LOGGER.log(Level.INFO,"Number Of Balcony House:   \n" , housingList.get(i).getBalcony());
					LOGGER.log(Level.INFO,"Owner Name to House :   \n" , housingList.get(i).getOwnerName());
					LOGGER.log(Level.INFO,"Owner Phone to House :   \n" , housingList.get(i).getOwnerPhone());
					LOGGER.log(Level.INFO,"Owner Email to House :   \n" , housingList.get(i).getOwnerEmail());
					

					LOGGER.log(Level.INFO,"||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
					flag=true;
		  }
			  }
		 return flag;
			  }
  
   public static void printInfoForCpanelOwner(int j,int m) {
	   LOGGER.log(Level.INFO,"Aapartment Id :"+apartmentList.get(j).getId()+"    ");
	   LOGGER.log(Level.INFO,"number of balcony :"+apartmentList.get(j).getBalcony()+"   ");
		LOGGER.log(Level.INFO,"number of bedrooms :"+apartmentList.get(j).getBedrooms()+"   ");
				LOGGER.log(Level.INFO,"number of bathrooms :"+apartmentList.get(j).getBathrooms()+"   ");
				
				
				
				String res = Integer.toString(residenceList.get(m).getId());
				String apa = Integer.toString(apartmentList.get(j).getId());
				String result = res + apa ;
				int housingId = Integer.parseInt(result);
				  
				LOGGER.log(Level.INFO,"House Id  :"+housingId+"   \n");
				
				 
			
		
		
		for(int jj=0; jj<houseAndTennantlist.size();jj++) {
			if(	housingId == houseAndTennantlist.get(jj).gethousingId()) {
 				LOGGER.log(Level.INFO,"\nTenant Name :"+houseAndTennantlist.get(jj).getTenants()+"   ");

				
				for(int jjj=0; jjj<tenantLinst.size();jjj++) {
					if(	tenantLinst.get(jjj).getname().equals(houseAndTennantlist.get(jj).getTenants())) {
		 				LOGGER.log(Level.INFO,"Tenant phone :"+tenantLinst.get(jjj).getphone()+"   ");

						}}}}
		   
   }
	
    public static boolean cPanel(String userName) {
    	boolean flag=false;
			System.out.print("Welcome in Conrtol Panel "+userName);

			for (int m =0 ; m<residenceList.size();m++) {
				if(residenceList.get(m).getOwnerId().equals(userName)) {
					flag=true;
	 				LOGGER.log(Level.INFO,"\n||||||||||||||||||||||||||||||||||||||||||\nId for your residence is : "+ residenceList.get(m).getId());
	 				LOGGER.log(Level.INFO,"Number Of Floor is :"+ residenceList.get(m).getNumOfFloors());

					
					
					for(int j=0; j<apartmentList.size();j++) {
						
							
						
			
							
							if(apartmentList.get(j).getResidenceId() == residenceList.get(m).getId() ) {
								if(	apartmentList.get(j).getFloorNum() ==1 ) {
					 				LOGGER.log(Level.INFO,"\nThe (first) floor have this apartment : ");

								
								printInfoForCpanelOwner(j,m);
								flag=true;
								}
							
								
								if(	apartmentList.get(j).getFloorNum() ==2 ) {
					 				LOGGER.log(Level.INFO,"\nThe (secend) floor have this apartment : ");

									printInfoForCpanelOwner(j,m);
									flag=true;
									}
								
								if(	apartmentList.get(j).getFloorNum() ==3 ) {
					 				LOGGER.log(Level.INFO,"\nThe (Third) floor have this apartment : ");

									printInfoForCpanelOwner(j,m);
									flag=true;
									}
								
								
								
							
				
				
		
     		
					}}
							}}	
    	
				return flag;  }
    
    
    
    public static boolean ifTenIsStudent(String name) {
    	boolean flag=false;
    	for(int ii =0 ; ii<tenantLinst.size();ii++) {
    		if(tenantLinst.get(ii).getname().equals(name) && tenantLinst.get(ii).getIsStudent().equals("yes")) {
    		
    
     
        	for(int i =0 ; i<tenantLinst.size();i++) {
        		if(tenantLinst.get(i).getIsStudent().equals("yes") ) {
        			
        			if(!(tenantLinst.get(i).getname().equals(name))) {
 				LOGGER.log(Level.INFO,"*********Student Neighbors Information:*********");
 				LOGGER.log(Level.INFO,"Student Name:"+tenantLinst.get(i).getname());
 				LOGGER.log(Level.INFO,"Student phone:"+tenantLinst.get(i).getphone());
 				LOGGER.log(Level.INFO,"Student age:"+tenantLinst.get(i).getage());
 				LOGGER.log(Level.INFO,"Student majer:"+tenantLinst.get(i).getmajer());

 				
 				flag=true;
        			}

        	}
        } }
       
        } return flag;}
    
    
    public static void fullInformation() {
    	
    	
		
		
		tenant t1 = new tenant("tenantNajeh45","05999999",19,"Comuter Engineering","yes");
		tenant t2 = new tenant("tenantNajeh44","05888888",30,"Doctor","no");
		tenant t3 = new tenant("tenantNajeh43","05777777",21," MIS","yes");
		tenant t4 = new tenant("tenantNajeh42","05666666",20,"Civil Engineering","yes");
		tenantLinst.add(t1);

		tenantLinst.add(t2);

		tenantLinst.add(t3);

		tenantLinst.add(t4);

		Residence firstResidence = new Residence(1 , "alsafa" , "nablus" , 3 , 10,"ownerOmar");
		Residence secondResidence = new Residence(5 , "istanbul" , "nablus" , 3 , 21,"ownerAseel");
		residenceList.add(firstResidence);
		residenceList.add(secondResidence);


    }
    
    public static String login(String userName , String passWord) {     /***  for log in as admin or owner or tenant  ***/
				
    	User firstUser = new User("ownerOmar","123");
		User secondUser = new User("ownerAseel","321");
		User thirdUser = new User ("adminAhmad","159");
		User forthUser = new User ("tenantNajeh45","456");
		User forthUser1 = new User ("tenantNajeh44","446");
		User forthUser2 = new User ("tenantNajeh43","436");
		User forthUser3 = new User ("tenantNajeh42","426");

		User fifthUser = new User ("Najeh","147");
		
		users.add(firstUser);
		users.add(secondUser);
		users.add(thirdUser);
		users.add(forthUser);
		users.add(forthUser1);
		users.add(forthUser2);
		users.add(forthUser3);

		
		users.add(fifthUser);
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
		
		input3 = new Scanner(System.in);
		if (getUserType().equals("admin"))
		{

			LOGGER.log(Level.INFO,"\nChoose one :\n1)See housing and accept or reject it. \n2)Watching all accepted house.\n3)Add Housing. \n4)Watching reservations via the system\n5)Close porogram." );

			LOGGER.log(Level.INFO,"what your choice?");
			int userChoice = input3.nextInt();
			AdminProcess(userChoice);
		}
		else if (getUserType().equals("owner")) {
			LOGGER.log(Level.INFO,"\nChoose one :\n1)Add Housing .\n2)Your control panel. \n3) Modify housing.\n4)Show housing for accept ot reject  from admin. \n5)Show housing  acepted from admin.\n6)Close porogram.");

			LOGGER.log(Level.INFO,"what your choice?");
			int userChoice = input3.nextInt();
			ownerProcess(userChoice);
		}	
		else if (getUserType().equals("tenant")) {
			LOGGER.log(Level.INFO,"\nChoose one :\n1)ability to view the available housing. \n2)ability to view information about houses. \n3)Book accommodation. \n4)See information who live araund you (if you are student.)\n5)Add Furniture.\n6)show your Furniture. \n7)control panel \n8)Close porogram.");
			LOGGER.log(Level.INFO,"what your choice?");
			int userChoice = input3.nextInt();
			tenantProcess(userChoice);
		}
		else {
			input2 = new Scanner(System.in);
			LOGGER.log(Level.INFO,"Enter your username please");
		 	username = input2.next();
		 	LOGGER.log(Level.INFO,"Enter your password please");
			String pass = input2.next();
			login(username , pass);
			showMenu();
		}
		
		
		
	}

	
	public static void main(String args[]) {
		
		fullInformation();
		input22 = new Scanner(System.in);
		LOGGER.log(Level.INFO,"Enter your username please");
	 	username = input22.next();
	 	LOGGER.log(Level.INFO,"Enter your password please");
		String pass = input22.next();
		login(username , pass);
		showMenu();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
