package pojo;

public class Student {
		
		private Integer Age;
		private Integer Rollno;
		private String Name;		
		private Boolean isIndian;
		
		public Student() {
			Age = 0;
			Rollno = 0;
			Name = "";	
			isIndian = true;
		}

		public Student(Integer age, Integer rollno, String name, Boolean isIndian) {
			super();
			Age = age;
			Rollno = rollno;
			Name = name;
			isIndian = isIndian;
		}
		
		public Integer getAge() {
			return Age;
		}
		public void setAge(Integer age) {
			Age = age;
		}
		public Integer getRollno() {
			return Rollno;
		}
		public void setRollno(Integer rollno) {
			Rollno = rollno;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public Boolean getIsIndian() {
			return isIndian;
		}

		public void setIsIndian(Boolean isIndian) {
			this.isIndian = isIndian;
		}	

}
