package Java.tenth;

interface Figure {
	double area();//���̸� ���ϴ� ����~!
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
		//Figure f = new Figure(10,10); 1�߻�Ŭ����,2�������̽� ��ü ����x, ���۷��� ���� ����!!!
		Figure f;
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);
		f = r;
		System.out.println(f.area());
		f = t;
		System.out.println(f.area());//��Ŭ����,�߻�Ŭ����,�������̽� ���  ����Ű�� ���� ���� �ϴ� ���°� �޶����� �������� ����
		
		Figure obj = new Rectangle(3, 5);
		System.out.println(obj.area());
	}
}

