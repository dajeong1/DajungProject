package silseup4;

public class ShapeDriver {
	public static void main (String [] args) {
		
		//Rectangle 객체 생성
		Rectangle myRect = new Rectangle("내 땅", 5, 3);
		
		System.out.println("이름 : "+myRect.name);
		System.out.println("가로 : "+myRect.width);
		System.out.println("세로 : "+myRect.length);
		System.out.println("둘레 : "+myRect.getPerimetert());
		System.out.println("면적 : "+myRect.getArea());
	}
}
