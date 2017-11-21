package silseup4;

abstract class Shape {
	// ������ ����ϴ� �߻�޼ҵ� ����
	public abstract int getArea();
	// �ѷ��� ����ϴ� �߻�޼ҵ� ����
	public abstract int getPerimetert();
	
}

//RectangleŬ������ �߻�Ŭ������ ShapeŬ�����κ��� ��ӹ޴´�.
//(�߻�Ŭ������ ��ӹ��� ����Ŭ������ �߻�Ŭ������ ���� �ʱ� ���ؼ��� �߻�޼ҵ带 ��� �������̵� �ؾ� �Ѵ�)
class Rectangle extends Shape {
	String name; // �̸�
	int length; // ����
	int width; // ����

	// ������ �޼ҵ�
	public Rectangle(String name, int length, int width){
		this.name = name;
		this.length = length;
		this.width = width;
	}

	// ������ ����Ͽ� ��ȯ�Ѵ�
	// getArea�޼ҵ带 �������̵� �Ѵ�.(�������̴�. ������?)
	public int getArea() {
		return width*length;
	}

	// �ѷ��� ����Ѵ�
	// getPerimeter�޼ҵ带 �������̵� �Ѵ�.(�������̴�. ������?)
	public int getPerimetert() {
		return 2*(width+length);
	}
}
