package silseup;

import java.util.Scanner;

public class CompanyResult {

			public static int total(int toe, int it){
				return (toe + it);
			}
			

			public static String result(int tot) {
				if (tot >= 800) return "�հ�";
				else return "���հ�";
			}

			public static void main(String[] args) {
				int toeic, interview;
				
				Scanner scan = new Scanner(System.in);
				
				System.out.print("�������� �Է� : ");
				toeic = scan.nextInt();
				System.out.print("�������� �Է� : ");
				interview = scan.nextInt();

				System.out.println("�Ի����� : " + total(toeic, interview) + "��");
				System.out.println("�Ի��� : " + result(total(toeic,interview)));
		}
}

