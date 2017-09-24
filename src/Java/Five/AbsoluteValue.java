package Java.Five;

public class AbsoluteValue {
	public static void main(String[] args) {
		double a = -9;
		a = abs(a);
		System.out.println("-9인 a의 절댓값 : " + a);
	}

	
	static double abs(double a) {
		if (a < 0) a = a * (-1);
		return a;
	}
}