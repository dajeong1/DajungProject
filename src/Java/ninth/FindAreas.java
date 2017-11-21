package Java.ninth;

abstract class Figure{
	double width;
	double depth;
	
	Figure(double a, double b){
		width = a;
		depth = b;
	}
	
	abstract double area();
}


class Rectangle extends Figure{
	Rectangle(double a, double b){
		super(a,b);
	}
	
	double area(){
		System.out.println("The Area of a Rectangle.");
		return width*depth;
	}
}


class Triangle extends Figure{
	Triangle(double a, double b){
		super(a,b);
	}
	
	double area(){
		System.out.println("The Area of a Triangle.");
		return width*depth/2;
	}
}

public class FindAreas {
	public static void main(String[] args) {
		//Figure f = new Figure(10,10); 추상클래스 객체 생성x, 레퍼런스 변수 가능!!!
		Figure f;
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);
		f = r;
		System.out.println(f.area());
		f = t;
		System.out.println(f.area());
	}

}
