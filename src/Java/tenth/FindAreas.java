package Java.tenth;

interface Figure {
	double area();//넓이를 구하는 구나~!
}


//abstract class Figure{
//	double width;
//	double depth;
//	
//	Figure(double a, double b){
//		width = a;
//		depth = b;
//	}
//	
//	abstract double area();
//}


class Rectangle implements Figure{
	double width;
	double depth;
	
	Rectangle(double a, double b){
		width = a;
		depth = b;
	}
	
	public double area(){
		System.out.println("The Area of a Rectangle.");
		return width*depth;
	}
}


class Triangle implements Figure{
	double width;
	double depth;
	
	Triangle(double a, double b){
		width = a;
		depth = b;
	}
	
	public double area(){
		System.out.println("The Area of a Triangle.");
		return width*depth/2;
	}
}

public class FindAreas {
	public static void main(String[] args) {
		//Figure f = new Figure(10,10); 1추상클래스,2인터페이스 객체 생성x, 레퍼런스 변수 가능!!!
		Figure f;
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);
		f = r;
		System.out.println(f.area());
		f = t;
		System.out.println(f.area());//★클래스,추상클래스,인터페이스 모두  가리키는 값에 따라 하는 형태가 달라지는 다형성이 가능
		
		Figure obj = new Rectangle(3, 5);
		System.out.println(obj.area());
	}
}

