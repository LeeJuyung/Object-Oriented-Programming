package org.object_code.object;

public class Student {
	private String name;
	private String major;
	private String std_no;
	
	Student(String na, String ma, String no){
		name = na;
		major = ma;
		std_no = no;
	}
	
	Student(String na, String no){
		name = na;
		major = "자유전공";
		std_no = no;
	}
	
	Student(){
		major="자유전공";
	}

	public static void main(String[] args) {
		Student s01 = new Student("김경정", "경영정보", "60201234");
		Student s02 = new Student("박경정", "60201111");
		Student s03 = new Student();
	}

}
