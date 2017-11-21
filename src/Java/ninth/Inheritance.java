package Java.ninth;

class Person{
	String name;
	String addr;
	int age;
	
	Person(String name, String addr, int age){
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	
	void display(){
		System.out.println("Name :" + name);
		System.out.println("Address :" + addr);
		System.out.println("Age :" + age);
	}
}

class Student1 extends Person{
	int studentNumber;
	
	Student1(String name, String addr, int age, int num){
		super(name, addr, age);
		studentNumber = num;
	}
	
	int getStudentNumber(){
		return studentNumber;
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Student1 s1 = new Student1("박다정","진주",21,2016010867);
		s1.display();
		System.out.println("Student Number :"+s1.getStudentNumber());

	}

}
