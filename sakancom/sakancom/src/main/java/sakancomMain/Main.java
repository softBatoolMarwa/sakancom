
package sakancomMain;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    private static final String YOURCHOICE = "what your choice?";
    private static final String ADMIN = "admin";
    private static final String OWNER = "owner";
    private static final String TENANT = "tenant";

    private static final String SOON = "See you soon!";
    private static final String ENTERPASS = "Enter your password please";
    private static final String ENTERNAME = "Enter your username please";


    private static final String ENTERVLAUWTOEDIT = "Enter new value to edit .. ";


    
    private static final String SPACE = "      ";

    public  static ArrayList <Residence> residenceList = new ArrayList<Residence>();
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
					String neww=  tenantLinst.get(i).getFurniture()   ;
					LOGGER.log(Level.INFO,"I have this used furniture for sale at good prices :\n" );
					LOGGER.log(Level.INFO,neww );

					returnn= true;
				}
				else {
					LOGGER.log(Level.INFO,"I dont have any used furniture for sale \n");
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
			LOGGER.log(Level.INFO,"your name : ");
			LOGGER.log(Level.INFO,tenantLinst.get(i).getname() );
			
			
			LOGGER.log(Level.INFO,"your phone : ");
			LOGGER.log(Level.INFO,tenantLinst.get(i).getphone() );
			
			LOGGER.log(Level.INFO,"your age :  {0} ",tenantLinst.get(i).getage());
			
			LOGGER.log(Level.INFO,"your majer : ");
			LOGGER.log(Level.INFO,tenantLinst.get(i).getmajer() );
			
			LOGGER.log(Level.INFO,"your furniture : ");
			LOGGER.log(Level.INFO,tenantLinst.get(i).getFurniture() );
			
			for (int j=0 ; j<houseAndTennantlist.size() ; j++) {
				if(usernamee.equals(houseAndTennantlist.get(j).getTenants())) {
					LOGGER.log(Level.INFO,"The apartment number booked in your name is : {0}  ",houseAndTennantlist.get(j).gethousingId() );
					IdHouse=houseAndTennantlist.get(j).gethousingId();
				
					
					for (int jj=0 ; jj<housingListAccepted.size() ; jj++) {
						if(IdHouse==housingListAccepted.get(jj).getHousingId()) {
							LOGGER.log(Level.INFO,"The owner Name is   : ");
							LOGGER.log(Level.INFO,housingListAccepted.get(jj).getOwnerName() );
							LOGGER.log(Level.INFO,"The owner Phone is  : ");
							LOGGER.log(Level.INFO,housingListAccepted.get(jj).getOwnerPhone() );
							LOGGER.log(Level.INFO,"The owner Email is  : ");
							LOGGER.log(Level.INFO,housingListAccepted.get(jj).getOwnerEmail() );
							LOGGER.log(Level.INFO,"The Residence Id is  : {0}",housingListAccepted.get(jj).getResidenceId());
							LOGGER.log(Level.INFO,"The Rent is  :{0} ",housingListAccepted.get(jj).getRent());
							LOGGER.log(Level.INFO,"Please pay the rent within the next month.");
							LOGGER.log(Level.INFO,"||||||||||||||||||||||||||||||||||||||||||||");

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
			LOGGER.log(Level.INFO,"what your choice from avalible housing ?");
			for(int j=0; j<housingListAccepted.size();j++) {
				LOGGER.log(Level.INFO,"{0}       ",housingListAccepted.get(j).getHousingId());
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

		LOGGER.log(Level.INFO,"Enter your Furniture to add  please");
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
		case 8 :LOGGER.log(Level.INFO,SOON);
		Scanner input2 = new Scanner(System.in);
		LOGGER.log(Level.INFO,ENTERNAME);
	 	username = input2.next();
	 	LOGGER.log(Level.INFO,ENTERPASS);
		String pass = input2.next();
		login(username , pass);
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

			LOGGER.log(Level.INFO,"House Id:   {0}" , housingListAccepted.get(j).getHousingId());
		 	LOGGER.log(Level.INFO," ||||||||   " );
		 	LOGGER.log(Level.INFO,housingListAccepted.get(j).getStatus());
		 	LOGGER.log(Level.INFO,"\n");



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
						
					  LOGGER.log(Level.INFO,"The apartment has been booked");

					  if(housingListAccepted.get(i).getMaxNumOfTenant()==c) {
						  housingListAccepted.get(i).setStatusUnavailable();
						  
					  }
					  
				  }
				  else	{h=false; LOGGER.log(Level.INFO,"This house is Unavailable"); }

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
		LOGGER.log(Level.INFO,"Enter the house number you want to modify");
		LOGGER.log(Level.INFO,"Your Houses ... ");
		for (int i=0 ; i<housingList.size() ;i++) {
    	if(housingList.get(i).getOwnerName().equals(username)) 
    		LOGGER.log(Level.INFO,"{0}    ",housingList.get(i).getHousingId());
    
		}
		
	    int id = scanner.nextInt();
	    
	    for(int i=0; i<housingList.size();i++) {
			 if(id == housingList.get(i).getHousingId()) {
				 LOGGER.log(Level.INFO,"Enter number to modify this point \n1)Residence Id .. \n2)Residence Name ..\n3)Location..\n4)Floor Number..\n5)Apartment Number..\n6)Photo.. \n7)Rent..\n8)Services..\n9)Max Number Of Tenant..\n10)Number Of Bedrooms..\n11)Number Of Bathrooms..\n12)Balcony..\n13)Owner Name..\n14)Owner Phone..\n15)Owner Email..\n16)Status..  ");
			    int number = scanner.nextInt();
			
			    editHousing(number,id,username);}
			 }
			showMenu();
			break;
		
			
	case 4 :		LOGGER.log(Level.INFO,"this all housing for acepted ot reject  from admin");
					ShowHousingj(username);
			showMenu();
			break;
			
	case 5 : 		
		WatchingReservationstoOwner();
		showMenu();
	break;	
	case 6 :LOGGER.log(Level.INFO,SOON);
	Scanner input2 = new Scanner(System.in);
	LOGGER.log(Level.INFO,ENTERNAME);
 	username = input2.next();
 	LOGGER.log(Level.INFO,ENTERPASS);
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
	LOGGER.log(Level.INFO,"Enter the residence ID :");
	int residenceId = input4.nextInt();
	LOGGER.log(Level.INFO,"Enter the residence name :");
	String residenceName = input4.next();
	LOGGER.log(Level.INFO,"Enter the residence location :");
	String location = input4.next();
	LOGGER.log(Level.INFO,"Enter the floor number :");
	int floorNumber = input4.nextInt(); 
	LOGGER.log(Level.INFO,"Enter the apartment number :");
	int apartmentNumber = input4.nextInt(); 
	LOGGER.log(Level.INFO,"Enter the apartment photo :");
	String photo = input4.next();
	LOGGER.log(Level.INFO,"Enter the monthly rent ( inclusive of electricity and water ) :");
	int rent = input4.nextInt(); 
	LOGGER.log(Level.INFO,"Enter the available services in the apartment :");
	String services = input4.next();
	LOGGER.log(Level.INFO,"Enter the Maximum number of tenants :");
	int maxNum = input4.nextInt();
	LOGGER.log(Level.INFO,"Enter the Number of bedrooms:");
	int numOfBedrooms = input4.nextInt();
	LOGGER.log(Level.INFO,"Enter the Number of bathrooms:");
	int numOfBathrooms = input4.nextInt();
	LOGGER.log(Level.INFO,"is there a balcony in the apartment? if ");
	int balcony = input4.nextInt();
	LOGGER.log(Level.INFO,"The name of the owner has been entered. If you want to change it, go to the Modify field. The name of the owner is: \n");
	LOGGER.log(Level.INFO,username);

	String ownerName = username;
	LOGGER.log(Level.INFO,"Enter the owner phone :");
	String ownerPhone = input4.next();
	LOGGER.log(Level.INFO,"Enter the owner email :");
	String ownerEmail= input4.next(); 
	Housing hh = new Housing();
	hh.setResidenceId(residenceId);
	hh.setResidenceName(residenceName);
	hh.setLocation(location);
	hh.setFloorNum(floorNumber);
	hh.setApartmentNum(apartmentNumber);
	hh.setPhoto(photo);
	hh.setRent(rent);
	hh.setServices(services);
	hh.setMaxNumOfTenant(maxNum);
	hh.setNumOfBedrooms(numOfBedrooms);
	hh.setNumOfBathrooms(numOfBathrooms);
	hh.setBalcony(balcony);
	hh.setOwnerUserName(username);
	hh.setOwnerName(ownerName);
	hh.setOwnerPhone(ownerPhone);
	hh.setOwnerEmail(ownerEmail);
	
    Housing h = new Housing (hh);
	
	Apartment apa = new Apartment();
	apa.setId(apartmentNumber);
	apa.setOwnerId(username);
	apa.setResidenceId(residenceId);
	apa.setFloorNum(floorNumber);
	apa.setPhoto(photo);
	apa.setMonthlyRent(rent);
	apa.setServices(services);
	apa.setMaxNum(maxNum);
	apa.setBedrooms(numOfBedrooms);
	apa.setBathrooms(numOfBathrooms);
	apa.setBalcony(balcony);
	apa.setAvailable(true);
	Apartment secondApartment32 = new Apartment(apa);
	apartmentList.add(secondApartment32);
		
		return h;
		
	}
    public static Boolean addHousing(Housing h,String getUserType) {                        /*** to add housing by the owner  ***/
		if (getUserType.equals(ADMIN)) {
			
			
			int flag=0;
			for (int i=0 ; i<housingListAccepted.size(); i++) {
				if( h.getHousingId() == housingListAccepted.get(i).getHousingId()) {
					flag=1;
				}			
				}
				if (flag ==0 ) {housingListAccepted.add(h);
				LOGGER.log(Level.INFO,"your housing has been added successfully");
				housing_not_found= true;
				return	housing_not_found;
				}
				else {
					LOGGER.log(Level.INFO,"this housing is already exist");
					housing_not_found = false;
					return housing_not_found ;
					
				   
				}
			
			
		}
		else if(getUserType.equals(OWNER)) {
		int flag=0;
		for (int i=0 ; i<housingList.size(); i++) {
			if( h.getHousingId() == housingList.get(i).getHousingId()) {
				flag=1;
			}			
			}
			if (flag ==0 ) {housingList.add(h);
			LOGGER.log(Level.INFO,"your housing has been added successfully");
			housing_not_found= true;
			return	housing_not_found;
			}
			else {
				LOGGER.log(Level.INFO,"this housing is already exist");
				housing_not_found = false;
				return housing_not_found ;
				
			   
			}}
		else {
			housing_not_found = false;
			return housing_not_found ;}
			
			
	
		
	}

 
 public static boolean editHousing1(int number,int id,String newValue ) {
     boolean flag=false; 
	 for(int i=0; i<housingList.size();i++) {
   		 if(id == housingList.get(i).getHousingId()) {
if(number==2) {
       	housingList.get(i).setResidenceName(newValue);
       	LOGGER.log(Level.INFO,"Done this update on ResidenceName");
   	flag = true ;}
if(number==3) { 
housingList.get(i).setLocation(newValue);
LOGGER.log(Level.INFO,"Done this update on location");
	flag = true ;
}
 if(number==6) {
 housingList.get(i).setPhoto(newValue);
 LOGGER.log(Level.INFO,"Done this update on Photo");
 
	flag = true ;

}
 if(number==8) {
 housingList.get(i).setServices(newValue);
 LOGGER.log(Level.INFO,"Done this update on Services");
	flag = true ; }


 if(number==13) {
 housingList.get(i).setOwnerName(newValue);
 LOGGER.log(Level.INFO,"Done this update on OwnerName");
	flag = true ;

}
 if(number==14) {
 housingList.get(i).setOwnerPhone(newValue);
 LOGGER.log(Level.INFO,"Done this update on OwnerPhone");
	flag = true ;

}
 if(number==15) {
 housingList.get(i).setOwnerEmail(newValue);
 LOGGER.log(Level.INFO,"Done this update on OwnerEmail");
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
			     LOGGER.log(Level.INFO,"Done this update ResidenceId");
			     flag= true;
	    	 
	    	 }
			  if(number==4) {
			     housingList.get(i).setFloorNum(newValue);
			     LOGGER.log(Level.INFO,"Done this update FloorNum");
			     flag= true;
				}
				 if(number==5) {
				 housingList.get(i).setApartmentNum(newValue);
				 LOGGER.log(Level.INFO,"Done this update ApartmentNum");
				 flag= true;
				}
				 if(number==7) {
				 housingList.get(i).setRent(newValue);
				 LOGGER.log(Level.INFO,"Done this update Rent");
				 flag= true;
}
				 if(number==9) {
				 housingList.get(i).setMaxNumOfTenant(newValue);
				 LOGGER.log(Level.INFO,"Done this update MaxNumOfTenant");
				 flag= true;
}
				 if(number==10) {
				 housingList.get(i).setNumOfBedrooms(newValue);
				 LOGGER.log(Level.INFO,"Done this update NumOfBedrooms");
				 flag= true;
}
				 if(number==11) {
				 housingList.get(i).setNumOfBathrooms(newValue);
				 LOGGER.log(Level.INFO,"Done this update NumOfBathrooms");
				 flag= true;
}
				 if(number==12) {
				 housingList.get(i).setBalcony(newValue);
				 LOGGER.log(Level.INFO,"Done this update Balcony");
				 flag= true;

}		 
			 }}
   	return flag;}
    
 
    public static boolean editHousing(int number,int id,String usernamee) {

    	scanner2 = new Scanner(System.in);
    	 for(int i=0; i<housingList.size();i++) {

    		 if(usernamee.equals(housingList.get(i).getOwnerName())&&(id == housingList.get(i).getHousingId())) {
    		 
			    	 if(number==1) {
			    		 LOGGER.log(Level.INFO,ENTERVLAUWTOEDIT);
					     int resId = scanner2.nextInt(); 
					     editHousing2( number, id, resId );
			    	 
			    	 }
				 if(number==2) {
					 LOGGER.log(Level.INFO,ENTERVLAUWTOEDIT);
					String resNmae = scanner2.next();
					editHousing1( number, id, resNmae );
				
				}
				 if(number==3) {LOGGER.log(Level.INFO,ENTERVLAUWTOEDIT);
				String location = scanner2.next(); 
				editHousing1( number, id, location );
				}
				 if(number==4) {LOGGER.log(Level.INFO,ENTERVLAUWTOEDIT);
			    int floorNum = scanner2.nextInt();
			     editHousing2( number, id, floorNum );

				}
				 if(number==5) {LOGGER.log(Level.INFO,ENTERVLAUWTOEDIT);
				int apartmentNum = scanner2.nextInt();
			     editHousing2( number, id, apartmentNum );

				}
				 if(number==6) {LOGGER.log(Level.INFO,ENTERVLAUWTOEDIT);
				String photo = scanner2.next();
				editHousing1( number, id, photo );
				}
				 if(number==7) {LOGGER.log(Level.INFO,ENTERVLAUWTOEDIT);
				int rent = scanner2.nextInt();
			     editHousing2( number, id, rent );

}
				 if(number==8) {LOGGER.log(Level.INFO,ENTERVLAUWTOEDIT);
				String services = scanner2.next();
				editHousing1( number, id, services );


				}
				 if(number==9) {LOGGER.log(Level.INFO,ENTERVLAUWTOEDIT);
				int max = scanner2.nextInt();
			     editHousing2( number, id, max );

}
				 if(number==10) {LOGGER.log(Level.INFO,ENTERVLAUWTOEDIT);
				int bed = scanner2.nextInt();
			     editHousing2( number, id, bed );

}
				 if(number==11) {LOGGER.log(Level.INFO,ENTERVLAUWTOEDIT);
				int bath = scanner2.nextInt();
			     editHousing2( number, id, bath );

}
				 if(number==12) {LOGGER.log(Level.INFO,ENTERVLAUWTOEDIT);
				 int balcony = scanner2.nextInt();
			     editHousing2( number, id, balcony );

}
				 if(number==13) {LOGGER.log(Level.INFO,ENTERVLAUWTOEDIT);
			String	name = scanner2.next();
			editHousing1( number, id, name );

}
				 if(number==14) {LOGGER.log(Level.INFO,ENTERVLAUWTOEDIT);
				String phone = scanner2.next();
				editHousing1( number, id, phone );

}
				 if(number==15) {LOGGER.log(Level.INFO,ENTERVLAUWTOEDIT);
				String email = scanner2.next();
				editHousing1( number, id, email );

}
				 if(number==16) {
					  if(housingList.get(i).getStatus().equals("Available") ) {
						  housingList.get(i).setStatusUnavailable();}
						  else { housingList.get(i).setStatusAvailable();}
					  LOGGER.log(Level.INFO,"Done this update ");
					  return true;   
						  
  
					  }
				else { return false;
			     	   }


    	 }	
				 
				 
			 }
		return true;}


	public static void AdminProcess(int choice) {
		
		switch(choice) {
		
		case 1 :LOGGER.log(Level.INFO,"accept And Reject!");
		  for(int i=0; i<housingList.size();i++) {
			  ShowHousingWithId(housingList.get(i).getHousingId());		
			scanner = new Scanner(System.in);
			LOGGER.log(Level.INFO,"Enter 1 to accept this House and Enter 2 to Reject this House... ");
			int n = scanner.nextInt();
			acceptAndReject(n,housingList.get(i));}
		
		  LOGGER.log(Level.INFO,"Array is empity..");
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
        
		case 5 :LOGGER.log(Level.INFO,SOON);
		Scanner input2 = new Scanner(System.in);
		LOGGER.log(Level.INFO,ENTERNAME);
	 	username = input2.next();
	 	LOGGER.log(Level.INFO,ENTERPASS);
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
			LOGGER.log(Level.INFO,"house id : {0}",houseAndTennantlist.get(i).gethousingId());
		 	LOGGER.log(Level.INFO,"|| have this ||");
		 	LOGGER.log(Level.INFO,houseAndTennantlist.get(i).getTenants());


			flag=true;
		}
		return flag;
	}
	
	
	

	public static Boolean WatchingReservationstoOwner() {
		boolean flag=false;
		for(int i=0; i<housingListAccepted.size();i++) {
		if(housingListAccepted.get(i).getOwnerName().equals(username)) {
	  
			showFromHousingListAccepted(i);  
			flag=true;
						  }}
		return flag;
		 
		 
		 
	}
   	
	 public static void showFromHousingListAccepted(int i) {
		 LOGGER.log(Level.INFO,"\nHouse Id:  {0} " , housingListAccepted.get(i).getHousingId());
			LOGGER.log(Level.INFO,"\nResidence Id:   {0}" ,housingListAccepted.get(i).getResidenceId());
			LOGGER.log(Level.INFO,"\nResidence Name:   ");
		 	LOGGER.log(Level.INFO, housingListAccepted.get(i).getResidenceName());

			LOGGER.log(Level.INFO,"\nHouse location:   " );
		 	LOGGER.log(Level.INFO, housingListAccepted.get(i).getLocation());

			LOGGER.log(Level.INFO,"\nfloor Number :  {0} " , housingListAccepted.get(i).getFloorNum());
			LOGGER.log(Level.INFO,"\nApartment Number: {0} " , housingListAccepted.get(i).getApartmentNum());
			LOGGER.log(Level.INFO,"\nHouse photo:   " );
		 	LOGGER.log(Level.INFO, housingListAccepted.get(i).getPhoto());

			LOGGER.log(Level.INFO,"\nHouse Rent:   {0}" , housingListAccepted.get(i).getRent());
			LOGGER.log(Level.INFO,"\nHouse Services:   " );
		 	LOGGER.log(Level.INFO, housingListAccepted.get(i).getServices());

			LOGGER.log(Level.INFO,"\nMax Number Of Tenant in House :   {0}" , housingListAccepted.get(i).getMaxNumOfTenant());
			LOGGER.log(Level.INFO,"\nNumber Of Bedrooms in House:   {0}" , housingListAccepted.get(i).getNumOfBedrooms());
			LOGGER.log(Level.INFO,"\nNumber Of Bethrooms in House:   {0}" , housingListAccepted.get(i).getNumOfBathrooms());
			LOGGER.log(Level.INFO,"\nNumber Of Balcony House:   {0}" , housingListAccepted.get(i).getBalcony());
			LOGGER.log(Level.INFO,"\nOwner Name to House :   ");
		 	LOGGER.log(Level.INFO, housingListAccepted.get(i).getOwnerName());

			LOGGER.log(Level.INFO,"\nOwner Phone to House :   " );
		 	LOGGER.log(Level.INFO, housingListAccepted.get(i).getOwnerPhone());

			LOGGER.log(Level.INFO,"\nOwner Email to House :   " );
		 	LOGGER.log(Level.INFO, housingListAccepted.get(i).getOwnerEmail());

			LOGGER.log(Level.INFO,"||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		 
	 }
	public static Boolean WatchingReservations() {
		boolean flag=false;
		for(int i=0; i<housingListAccepted.size();i++) {			
			showFromHousingListAccepted(i);  
								
flag=true;
						  }
		return flag;
		 
		 
		 
	}

    public static Boolean acceptAndReject(int n,Housing housing) {
    	
    	  
    	if(n==1) { housingListAccepted.add(housing); housingList.remove(housing);	accept=true; return accept;		}
    	else if(n==2) {housingList.remove(housing);	
    	return false;
    	}
    	else {LOGGER.log(Level.INFO,"Enter true value !!!");
    	accept=false;
    			return accept;
    	}
    	


    	
    	
    }			
    public static void showFromHousingList(int i) {
    	
    	 LOGGER.log(Level.INFO,"\nHouse Id:  {0} " , housingList.get(i).getHousingId());
			LOGGER.log(Level.INFO,"\nResidence Id:   {0}" ,housingList.get(i).getResidenceId());
			LOGGER.log(Level.INFO,"\nResidence Name:   ");
		 	LOGGER.log(Level.INFO, housingList.get(i).getResidenceName());

			LOGGER.log(Level.INFO,"\nHouse location:   " );
		 	LOGGER.log(Level.INFO, housingList.get(i).getLocation());

			LOGGER.log(Level.INFO,"\nfloor Number :  {0} " , housingList.get(i).getFloorNum());
			LOGGER.log(Level.INFO,"\nApartment Number: {0} " , housingList.get(i).getApartmentNum());
			LOGGER.log(Level.INFO,"\nHouse photo:   " );
		 	LOGGER.log(Level.INFO, housingList.get(i).getPhoto());

			LOGGER.log(Level.INFO,"\nHouse Rent:   {0}" , housingList.get(i).getRent());
			LOGGER.log(Level.INFO,"\nHouse Services:   " );
		 	LOGGER.log(Level.INFO, housingList.get(i).getServices());

			LOGGER.log(Level.INFO,"\nMax Number Of Tenant in House :   {0}" , housingList.get(i).getMaxNumOfTenant());
			LOGGER.log(Level.INFO,"\nNumber Of Bedrooms in House:   {0}" , housingList.get(i).getNumOfBedrooms());
			LOGGER.log(Level.INFO,"\nNumber Of Bethrooms in House:   {0}" , housingList.get(i).getNumOfBathrooms());
			LOGGER.log(Level.INFO,"\nNumber Of Balcony House:   {0}" , housingList.get(i).getBalcony());
			LOGGER.log(Level.INFO,"\nOwner Name to House :   ");
		 	LOGGER.log(Level.INFO, housingList.get(i).getOwnerName());

			LOGGER.log(Level.INFO,"\nOwner Phone to House :   " );
		 	LOGGER.log(Level.INFO, housingList.get(i).getOwnerPhone());

			LOGGER.log(Level.INFO,"\nOwner Email to House :   " );
		 	LOGGER.log(Level.INFO, housingList.get(i).getOwnerEmail());

    	
    	
    	
    	
		LOGGER.log(Level.INFO,"||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
    	
    	
    }
    
    public static boolean ShowHousingj(String usernamee) {
    	boolean flag=false;
		
		 for(int i=0; i<housingList.size();i++) {
			 if(usernamee.equals(housingList.get(i).getOwnerName())) {
				 showFromHousingList(i);	
	flag=true;
			 }
			  }
		 return flag;
			  }  
 
 public static boolean ShowHousingWithId(int id) {
	   boolean flag=false;
		
		 for(int i=0; i<housingList.size();i++) {
			 
		  if(housingList.get(i).getHousingId() == id ) {
				showFromHousingList(i);
			  flag=true;
		  }
			  }
		 return flag;
			  }
  
   public static void printInfoForCpanelOwner(int j,int m) {
	   LOGGER.log(Level.INFO,"Aapartment Id : {0}    ",apartmentList.get(j).getId());
	   LOGGER.log(Level.INFO,"number of balcony :{0}   ",apartmentList.get(j).getBalcony());
		LOGGER.log(Level.INFO,"number of bedrooms :{0}    ",apartmentList.get(j).getBedrooms());
				LOGGER.log(Level.INFO,"number of bathrooms :{0}     ",apartmentList.get(j).getBathrooms());
				
				
				
				String res = Integer.toString(residenceList.get(m).getId());
				String apa = Integer.toString(apartmentList.get(j).getId());
				String result = res + apa ;
				int housingId = Integer.parseInt(result);
				  
				LOGGER.log(Level.INFO,"House Id  :{0}  \n",housingId);
				
				 
			
		
		
		for(int jj=0; jj<houseAndTennantlist.size();jj++) {
			if(	housingId == houseAndTennantlist.get(jj).gethousingId()) {
 				LOGGER.log(Level.INFO,"\nTenant Name :");
 				LOGGER.log(Level.INFO,houseAndTennantlist.get(jj).getTenants());
 				LOGGER.log(Level.INFO,SPACE);

				
				for(int jjj=0; jjj<tenantLinst.size();jjj++) {
					if(	tenantLinst.get(jjj).getname().equals(houseAndTennantlist.get(jj).getTenants())) {
		 				LOGGER.log(Level.INFO,"Tenant phone :");
		 				LOGGER.log(Level.INFO,tenantLinst.get(jjj).getphone());
		 				LOGGER.log(Level.INFO,SPACE);


						}}}}
		   
   }
	
    public static boolean cPanel(String userName) {
    	boolean flag=false;
    	LOGGER.log(Level.INFO,"Welcome in Conrtol Panel ");
    	LOGGER.log(Level.INFO,userName);

			for (int m =0 ; m<residenceList.size();m++) {
				if(residenceList.get(m).getOwnerId().equals(userName)) {
					flag=true;
	 				LOGGER.log(Level.INFO,"\n||||||||||||||||||||||||||||||||||||||||||\nId for your residence is : {0}", residenceList.get(m).getId());

	 				LOGGER.log(Level.INFO,"Number Of Floor is : {0}", residenceList.get(m).getNumOfFloors());
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
        		if(tenantLinst.get(i).getIsStudent().equals("yes") &&(!(tenantLinst.get(i).getname().equals(name)))) {
        			 				LOGGER.log(Level.INFO,"*********Student Neighbors Information:*********");
 				LOGGER.log(Level.INFO,"Student Name:");
 				LOGGER.log(Level.INFO,tenantLinst.get(i).getname());

 				LOGGER.log(Level.INFO,"Student phone:");
 				LOGGER.log(Level.INFO,tenantLinst.get(i).getname());

 				LOGGER.log(Level.INFO,"Student age:{0}",tenantLinst.get(i).getage());
 				LOGGER.log(Level.INFO,"Student majer:");
 				LOGGER.log(Level.INFO,tenantLinst.get(i).getname());


 				
 				flag=true;
        			

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
		 
			
				if (userName.startsWith(ADMIN)) {
					
					setUserType(ADMIN);
				}
				
				else if (userName.startsWith(OWNER)) {
					
					setUserType(OWNER);
				}
				
				else if (userName.startsWith(TENANT)) {
					setUserType(TENANT);
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
		if (getUserType().equals(ADMIN))
		{

			LOGGER.log(Level.INFO,"\nChoose one :\n1)See housing and accept or reject it. \n2)Watching all accepted house.\n3)Add Housing. \n4)Watching reservations via the system\n5)Close porogram." );

			LOGGER.log(Level.INFO,YOURCHOICE);
			int userChoice = input3.nextInt();
			AdminProcess(userChoice);
		}
		else if (getUserType().equals(OWNER)) {
			LOGGER.log(Level.INFO,"\nChoose one :\n1)Add Housing .\n2)Your control panel. \n3) Modify housing.\n4)Show housing for accept ot reject  from admin. \n5)Show housing  acepted from admin.\n6)Close porogram.");

			LOGGER.log(Level.INFO,YOURCHOICE);
			int userChoice = input3.nextInt();
			ownerProcess(userChoice);
		}	
		else if (getUserType().equals(TENANT)) {
			LOGGER.log(Level.INFO,"\nChoose one :\n1)ability to view the available housing. \n2)ability to view information about houses. \n3)Book accommodation. \n4)See information who live araund you (if you are student.)\n5)Add Furniture.\n6)show your Furniture. \n7)control panel \n8)Close porogram.");
			LOGGER.log(Level.INFO,YOURCHOICE);
			int userChoice = input3.nextInt();
			tenantProcess(userChoice);
		}
		else {
			input2 = new Scanner(System.in);
			LOGGER.log(Level.INFO,ENTERNAME);
		 	username = input2.next();
		 	LOGGER.log(Level.INFO,ENTERPASS);
			String pass = input2.next();
			login(username , pass);
			showMenu();
		}
		
		
		
	}

	
	public static void main(String args[]) {


		fullInformation();
		input22 = new Scanner(System.in);
		LOGGER.log(Level.INFO,ENTERNAME);
	 	username = input22.next();
	 	LOGGER.log(Level.INFO,ENTERPASS);
		String pass = input22.next();
		login(username , pass);
		showMenu();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
