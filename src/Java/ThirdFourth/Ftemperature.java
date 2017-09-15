package Java.ThirdFourth;

import java.util.Scanner;

public class Ftemperature {
	public static void main(String[] args) {
		double c, f;
		Scanner s = new Scanner(System.in);
		System.out.print("화씨온도로 변환할 섭씨온도 입력 : ");

		c = s.nextDouble();
		f = 1.8 * c + 32;
		
		System.out.println("변환한 화씨온도 : " + f);

	}
}
