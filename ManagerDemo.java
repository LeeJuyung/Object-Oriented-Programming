package org.object_code.object;

class Employee{
	String name;
	int age;
	
	public void overridingTest() {
		System.out.println("사원의 이름은 "+name+"이고 나이는 "+age+"입니다.");
	}
}
class Manager extends Employee{
	String jobId;
	
	public void overridingTest() {
		System.out.println("사원의 이름은 "+name+"이고 나이는 "+age+"입니다.");
		System.out.println("그의 직업은 "+jobId+"입니다.");
	}
	void show_info() {
		System.out.println(name+"("+age+")의 직업은 "+jobId+"입니다.");
	}
	Manager(String jobId,int age, String name){
		this.jobId=jobId;
		this.age=age;
		this.name=name;
	}
}
public class ManagerDemo {
	public static void main(String[] args) {
		System.out.println("60201359 이주영");
		
		Manager m=new Manager("유튜버", 26, "홍길동");
		m.show_info();
	}
}