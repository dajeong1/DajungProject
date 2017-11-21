package Java.ninth;

abstract class Figure {
	double width;
	double depth;

	public Figure(double a, double b) {
		this.width = a;
		this.depth = b;
	}

	abstract double area();
}

class Rectangle extends Figure {

	public Rectangle(double a, double b) {
		super(a, b);
	}

	@Override
	double area() {
		System.out.println("the Area of a Rectangle.");
		return width * depth;
	}
}

class Triangle extends Figure {
	Triangle(double a, double b) {
		super(a, b);
	}

	@Override
	double area() {
		System.out.println("the Area of a Triangle.");
		return width * depth / 2;
	}
}

public class AbstractClass {
	public static void main(String[] args) {
		// Figure f = new Figure(a,b); -> 추상클래스이므로 직접 객체를 만들지 못함!!
		Rectangle r = new Rectangle(10, 5);
		Triangle t = new Triangle(5, 7);
		Figure poly;

		poly = r;
		System.out.println("Area : " + poly.area());
		poly = t;
		System.out.println("Area : " + poly.area());
	}
}
