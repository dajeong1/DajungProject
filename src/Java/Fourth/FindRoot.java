package Java.Fourth;

import java.util.Scanner;

public class FindRoot {

	public static void main(String[] args) {
		double a, b, c, d, x1, x2;
		Scanner s = new Scanner(System.in);
		
		System.out.println("ax��+bx+c=0  ���� ���ϴ� ���α׷�, a b c ���� �Է� :");
		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();
 
		d = (b * b) - (4 * a * c);
		
		if (d < 0) {
			System.out.println("����� ����");
			System.exit(0);
		}
		
		x1 = (-b + Math.sqrt(d)) / (2 * a);
		
		if (d == 0)	System.out.println("�ϳ��� �� : " + x1);
		
		else {
			x2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println("�ΰ��� �� : " + x1 + ", " + x2);
		}
		

	}

}
