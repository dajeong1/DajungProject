package silseup4;

public class ShapeDriver {
	public static void main (String [] args) {
		
		//Rectangle ��ü ����
		Rectangle myRect = new Rectangle("�� ��", 5, 3);
		
		System.out.println("�̸� : "+myRect.name);
		System.out.println("���� : "+myRect.width);
		System.out.println("���� : "+myRect.length);
		System.out.println("�ѷ� : "+myRect.getPerimetert());
		System.out.println("���� : "+myRect.getArea());
	}
}
