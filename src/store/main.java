package store;

import java.util.Scanner;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		String name = "\0";
		int empl_num = 0;
		int d_day = 0;
		int income = 0;
		int spend = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.print("가게이름을 입력하세요 : ");
		name = s.nextLine();
		System.out.print("고용할 종업원 수를 입력하세요 : ");
		empl_num = s.nextInt();
		System.out.println("가게가 생성되었습니다~\n");
		

		Random random = new Random();
		int year = 0;
		int month = 0;
		int day = 0;

		year = 2001 + random.nextInt(17);
		month = 1 + random.nextInt(12);
		day = 1 + random.nextInt(30);
		System.out.println("오늘은 " + year + "년 " + month + "월 " + day + "일 ♡");
		printStore(name, empl_num, income, spend);
		
		

	}
	
	static void printStore (String name, int num, int income, int spend) {
		System.out.println("========가게정보========");
		System.out.println("가게명 : " + name);
		System.out.println("종업원 수 : " + num);
		System.out.println("수입 : " + income);
		System.out.println("지출 : " + spend);
		System.out.println("======================");
	}
	
	
	
	

}
