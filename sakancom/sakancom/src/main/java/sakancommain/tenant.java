package sakancommain;



public class tenant {

	
	
		private String name;            /***  Contact info for the owner   ***/
		private String phone;
		private int age;
		private String majer;
		private String isStudent;
        private String furniture = "" ;
		

		
		
		
		
		
		
		public tenant() {}
		public tenant(String name , String phone , int age , String majer,String isStudent ) {
			this.name = name;
			this.phone = phone;
			this.age = age;
			this.majer = majer;
			this.isStudent = isStudent;
			this.furniture="";
			
		}
		

		
		public String getIsStudent() {
			return isStudent;
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
