package Java.ThirdFourth;

import java.util.Scanner;

public class Ftemperature {
	public static void main(String[] args) {
		double c, f;
		Scanner s = new Scanner(System.in);
		System.out.print("ȭ���µ��� ��ȯ�� �����µ� �Է� : ");

		c = s.nextDouble();
		f = 1.8 * c + 32;
		
		System.out.println("��ȯ�� ȭ���µ� : " + f);

	}
}
