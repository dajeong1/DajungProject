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

//LineŬ���� ����, DObject�� ��ӹ޴´�.
class Line extends DObject{
	public void draw() {
		System.out.println("Line");
	}
}
		
//RectŬ���� ����, DObject�� ��ӹ޴´�.
class Rect extends DObject{
	public void draw(){
		System.out.println("Rect");
	}
}

//CircleŬ���� ����, DObject�� ��ӹ޴´�.
class Circle extends DObject{
	public void draw(){
		System.out.println("Circle");
	}
}


