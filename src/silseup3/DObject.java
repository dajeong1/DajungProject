package silseup3;

public class DObject {
	public String next;

	public DObject(){
		this.next="null";
	}

	public void draw(){
		System.out.println("DObject");
	}
}

//Line클래스 생성, DObject를 상속받는다.
class Line extends DObject{
	public void draw() {
		System.out.println("Line");
	}
}
		
//Rect클래스 생성, DObject를 상속받는다.
class Rect extends DObject{
	public void draw(){
		System.out.println("Rect");
	}
}

//Circle클래스 생성, DObject를 상속받는다.
class Circle extends DObject{
	public void draw(){
		System.out.println("Circle");
	}
}


