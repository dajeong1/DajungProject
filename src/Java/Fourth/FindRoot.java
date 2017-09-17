package Java.Fourth;

import java.util.Scanner;

public class FindRoot {

	public static void main(String[] args) {
		double a, b, c, d, x1, x2;
		Scanner s = new Scanner(System.in);
		
		System.out.println("ax²+bx+c=0  근을 구하는 프로그램, a b c 수를 입력 :");
		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();
 
		d = (b * b) - (4 * a * c);
		
		if (d < 0) {
			System.out.println("허근을 가짐");
			System.exit(0);
		}
		
		x1 = (-b + Math.sqrt(d)) / (2 * a);
		
		if (d == 0)	System.out.println("하나의 근 : " + x1);
		
		else {
			x2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println("두개의 근 : " + x1 + ", " + x2);
		}
		

	}

}
