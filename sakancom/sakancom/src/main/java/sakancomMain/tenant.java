package sakancomMain;



public class tenant {

	
	
		private String name;            /***  Contact info for the owner   ***/
		private String phone;
		private int age;
		private String majer;
		private String IsStudent;
        private String furniture = "" ;
		

		
		
		
		
		
		
		public tenant() {}
		public tenant(String name , String phone , int age , String majer,String IsStudent ) {
			this.name = name;
			this.phone = phone;
			this.age = age;
			this.majer = majer;
			this.IsStudent = IsStudent;
			this.furniture="";
			
		}
		

		
		public String getIsStudent() {
			return IsStudent;
		}
		
		
		
		
		public String getname() {
			return name;
		}
		
		
		
	
		
		public String getphone() {
			return phone;
		}
		
		
		
		public int getage() {
			return age;
		}
		
		
		
		public String getmajer() {
			return majer;
		}
		
		public void setFurniture(String furniture) {
			this.furniture = furniture;
		}
		
		public String getFurniture() {
			return furniture;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
