package silseup5;

import java.util.Scanner;
public class ExceptionExam1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		System.out.println("�Ű� ������ ���� �ΰ��� ��");
		System.out.print("a = ");
		a = scan.nextInt();
		System.out.print("b = ");
		b = scan.nextInt();
		
		try{
			System.out.println(a + "�� " + b + "���� ������ ���� " + a/b +"�Դϴ�.");
			System.out.println("�������� ����Ǿ����ϴ�.");
		} catch (ArithmeticException e){
			System.out.println("=============================");
			System.out.println(e);
			
		} finally {
			System.out.println("***************************");
			System.out.println("���� ó���� ������ finally������ �����մϴ�.");
		}
		
	}

}
