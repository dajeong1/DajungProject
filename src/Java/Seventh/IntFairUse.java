package Java.Seventh;

public class IntFairUse {

	public static void main(String[] args) {
		IntFair a = new IntFair();
		IntFair b = new IntFair(1);
		IntFair c = new IntFair(2, 3);
		
		System.out.println("(" + a.first() + ", " + a.second() + ")");
		System.out.println("(" + b.first() + ", " + b.second() + ")");
		System.out.println("(" + c.first() + ", " + c.second() + ")");
	}

}
