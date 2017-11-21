package silseup4;

abstract class Shape {
	// 면적을 계산하는 추상메소드 선언
	public abstract int getArea();
	// 둘레를 계산하는 추상메소드 선언
	public abstract int getPerimetert();
	
}

//Rectangle클래스는 추상클래스인 Shape클래스로부터 상속받는다.
//(추상클래스를 상속받은 서브클래스가 추상클래스가 되지 않기 위해서는 추상메소드를 모두 오버라이딩 해야 한다)
class Rectangle extends Shape {
	String name; // 이름
	int length; // 가로
	int width; // 세로

	// 생성자 메소드
	public Rectangle(String name, int length, int width){
		this.name = name;
		this.length = length;
		this.width = width;
	}

	// 면적을 계산하여 반환한다
	// getArea메소드를 오버라이딩 한다.(강제성이다. 이유는?)
	public int getArea() {
		return width*length;
	}

	// 둘레를 계산한다
	// getPerimeter메소드를 오버라이딩 한다.(강제성이다. 이유는?)
	public int getPerimetert() {
		return 2*(width+length);
	}
}
