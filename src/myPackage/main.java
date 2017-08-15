package myPackage;

import java.util.Scanner;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		String name = "\0";
		Scanner s = new Scanner(System.in);
		System.out.print("가게이름을 입력하세요 : ");
		name = s.nextLine();
		

		Random random = new Random();
		int year = 0;
		int month = 0;
		int day = 0;

		year = 2001 + random.nextInt(17);
		month = 1 + random.nextInt(12);
		day = 1 + random.nextInt(30);
		System.out.println("오늘은 " + year + "년 " + month + "월 " + day + "일 ♡");

	}

}
