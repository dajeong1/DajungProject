package Java.Five;

public class AbsoluteValue {
	public static void main(String[] args) {
		double a = -9;
		a = abs(a);
		System.out.println("-9�� a�� ���� : " + a);
	}

	
	static double abs(double a) {
		if (a < 0) a = a * (-1);
		return a;
	}
}