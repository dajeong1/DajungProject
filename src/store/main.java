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
		System.out.print("�����̸��� �Է��ϼ��� : ");
		name = s.nextLine();
		System.out.print("����� ������ ���� �Է��ϼ��� : ");
		empl_num = s.nextInt();
		System.out.println("���԰� �����Ǿ����ϴ�~\n");
		

		Random random = new Random();
		int year = 0;
		int month = 0;
		int day = 0;

		year = 2001 + random.nextInt(17);
		month = 1 + random.nextInt(12);
		day = 1 + random.nextInt(30);
		System.out.println("������ " + year + "�� " + month + "�� " + day + "�� ��");
		printStore(name, empl_num, income, spend);
		
		

	}
	
	static void printStore (String name, int num, int income, int spend) {
		System.out.println("========��������========");
		System.out.println("���Ը� : " + name);
		System.out.println("������ �� : " + num);
		System.out.println("���� : " + income);
		System.out.println("���� : " + spend);
		System.out.println("======================");
	}
	
	
	
	

}
