package silseup;

import java.util.Scanner;

public class CompanyResult {
	//�Ի����� ����ϰ� ������� ��ȯ
			public static int total(int toe, int it) {
				//�ڵ带 �ۼ��Ͻÿ�//
			}
			
	                //�Ի������� ��ȯ
			public static String result(int tot) {
				//�ڵ带 �ۼ��Ͻÿ�//
			}

			public static void main(String[] args) {
				int toeic, interview;
				
				//���������� ���������� �Է¹޴´�.
				Scanner scan = new Scanner(System.in);//�ڵ带 �ۼ��Ͻÿ�//
				
				System.out.print("�������� �Է� : ");
				toeic = scan.nextInt();
				System.out.print("�������� �Է� : ");
				interview = scan.nextInt();
				//�ڵ带 �ۼ��Ͻÿ�//
				
				//�Ի������� ����ϴ� �޼ҵ�� �հݿ��θ� �Ǵ��ϴ� �޼ҵ带 
	                        //ȣ���ϰ� ����Ѵ�.
				System.out.println("�Ի����� : " + total(toeic, interview) + "��");
				System.out.println("�Ի��� : " + result(total(toeic,interview)));

		}
	}
}
