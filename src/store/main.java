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
		System.out.print("�����̸��� �Է��ϼ��� : ");
		name = s.next();
		System.out.print("����� ������ ���� �Է��ϼ��� : ");
		empl_num = s.nextInt();
		System.out.println("���԰� �����Ǿ����ϴ�~\n");

		
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
		System.out.println("������ " + year + "�� " + month + "�� " + day + "�� ��  "
				+ d_day + "��° ��");
	}

	
	static void printStore() {
		System.out.println("========��������=========");
		System.out.println("���Ը� : " + name);
		System.out.println("������ �� : " + empl_num);
		System.out.println("���� ���� : " + income);
		System.out.println("���� ���� : " + spend);
		System.out.println("�� ������ : " + net_income);
		System.out.println("======================");
	}

	
	static void printMenu() {
		System.out.println("�޴�");
		System.out.println("1. ������ �߰�");
		System.out.println("2. ����ϱ�");
		System.out.println("3. �� �ѱ��");
		System.out.println("4. �׸��ϱ�");
		System.out.print("�����ϼ��� : ");
	}

	
	static void Run() {
		Scanner s = new Scanner(System.in);
		int menu_num = s.nextInt();//�޴��Է� �ޱ�
		System.out.print("\n");

		if (menu_num == 1) {
			System.out.print("�߰��� ������ ���� �Է��ϼ��� : ");
			int empl = s.nextInt();
			empl_num = empl_num + empl;
			System.out.println("������ �� : " + empl_num + "\n");
		}

		else if (menu_num == 2) {
			income = income + 317983;
			spend = spend + 123856;
			net_income = income - spend;
			System.out.println("���� ����    +" + income);
			System.out.println("���� ����    -" + spend);
			System.out.println("���� ������  : " + (income - spend) + "\n");
		}

		else if (menu_num == 3) {
			System.out.println("���� ��� ��~\n");
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
			System.out.println("���Ը� �ݽ��ϴ� *^^*\n");
			flag = -1;
		}
	}
}
