package sakancom;



public class tenant {

	
	
		private String name;            /***  Contact info for the owner   ***/
		private String phone;
		private int age;
		private String majer;
		private String IsStudent;
        private String furniture = null;
		

		
		
		
		
		
		
		public tenant() {}
		public tenant(String name , String phone , int age , String majer,String IsStudent ) {
			this.name = name;
			this.phone = phone;
			this.age = age;
			this.majer = majer;
			this.IsStudent = IsStudent;
			
			
		}
		

		public void setIsStudent(String IsStudent) {
			this.IsStudent = IsStudent;
		}
		public String getIsStudent() {
			return IsStudent;
		}
		
		
		
		public void setname(String name) {
			this.name = name;
		}
		public String getname() {
			return name;
		}
		
		
		
		public void setphone(String phone) {
			this.phone = phone ;
		}
		
		public String getphone() {
			return phone;
		}
		
		public void setage(int age) {
			this.age = age;
		}
		
		public int getage() {
			return age;
		}
		
		public void setmajer(String majer) {
			this.majer = majer ;
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
