package store;

import java.util.Scanner;
import java.util.Random;

public class main {
	static String name = "\0";
	static int empl_num = 0;
	static int flag = 0;
	static int income = 0;
	static int spend = 0;
	static int net_income = 0;
	static int d_day = 1;
	static int year = 0;
	static int month = 0;
	static int day = 0;
	

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("가게이름을 입력하세요 : ");
		name = s.next();
		System.out.print("고용할 종업원 수를 입력하세요 : ");
		empl_num = s.nextInt();
		System.out.println("가게가 생성되었습니다~\n");

		
		Random random = new Random();
		year = 2001 + random.nextInt(17);
		month = 1 + random.nextInt(12);
		day = 1 + random.nextInt(30);

		while (true) {
			flag = 0;
			printDate();
			printStore();

			while (flag == 0) {
				printMenu();
				Run();
			}

			if (flag == 1)
				continue;
			if (flag == -1)
				break;
		}

	}

	
	
	static void printDate() {
		System.out.println("오늘은 " + year + "년 " + month + "월 " + day + "일 ♡  "
				+ d_day + "번째 날");
	}

	
	static void printStore() {
		System.out.println("========가게정보=========");
		System.out.println("가게명 : " + name);
		System.out.println("종업원 수 : " + empl_num);
		System.out.println("오늘 수입 : " + income);
		System.out.println("오늘 지출 : " + spend);
		System.out.println("총 순이익 : " + net_income);
		System.out.println("======================");
	}

	
	static void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 종업원 추가");
		System.out.println("2. 장사하기");
		System.out.println("3. 턴 넘기기");
		System.out.println("4. 그만하기");
		System.out.print("선택하세요 : ");
	}

	
	static void Run() {
		Scanner s = new Scanner(System.in);
		int menu_num = s.nextInt();//메뉴입력 받기
		System.out.print("\n");

		if (menu_num == 1) {
			System.out.print("추가할 종업원 수를 입력하세요 : ");
			int empl = s.nextInt();
			empl_num = empl_num + empl;
			System.out.println("종업원 수 : " + empl_num + "\n");
		}

		else if (menu_num == 2) {
			income = income + 317983;
			spend = spend + 123856;
			net_income = income - spend;
			System.out.println("오늘 수입    +" + income);
			System.out.println("오늘 지출    -" + spend);
			System.out.println("오늘 순이익  : " + (income - spend) + "\n");
		}

		else if (menu_num == 3) {
			System.out.println("오늘 장사 끝~\n");
			income = 0;
			spend = 0;
			d_day = d_day + 1;
			day = day + 1;
			if (day == 31) {
				day = 1;
				month = month + 1;
			}
			if (month == 13) {
				month = 1;
				year = year + 1;
			}
			flag = 1;
		}

		else if (menu_num == 4) {
			System.out.println("가게를 닫습니다 *^^*\n");
			flag = -1;
		}
	}
}
