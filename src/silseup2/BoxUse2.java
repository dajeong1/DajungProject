package silseup2;

public class BoxUse2 {

	public static void main(String[] args) {
		
		Box box1 = new Box(2, 3, 4, "Green", "GreenBox");
		Box box2 = new Box(2, 1, 1, "Yellow", "YellowBox");
		Box box3 = new Box(5, 5, 5, "Red", "RedBox");
		
		System.out.println(box1.toString());
		System.out.println(box2.toString());
		System.out.println(box3.toString());
		
		
		
//		Box GreenBox = new Box(2, 3, 4, "Green");
//		Box yellowBox = new Box();
//		yellowBox.setSize(5, 5, 5);
//		yellowBox.setColor("Yellow");
//		
//		Box grayBox = new Box(2, 4, 2, "Gray");
//		
//		System.out.println(yellowBox.toString());
//		System.out.println(grayBox.toString());

	}

}
