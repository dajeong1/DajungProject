package silseup;

import java.util.Scanner;

public class InputData {

	public static void main(String[] args) {
		// Ű����κ��� �Է��ϴ� �����͸� �б� ���� Scanner ��ü�� �����.
				Scanner br = new Scanner(System.in);//�ڵ带 �ۼ��Ͻÿ�//
				
				// ���� ����
				String name;
				int age;
				double tall;
				float weight;
				char gender;
				
				// �̸�, ����, ����, Ű, ü���� �Է� �޴´�.
				System.out.print("�̸��� �Է��Ͻÿ� : ");		
		        name = br.next();        //�ڵ带 �ۼ��Ͻÿ�//
				System.out.print("������ �Է��Ͻÿ� : ");
		        gender = br.next().charAt(0);       //�ڵ带 �ۼ��Ͻÿ�//
				System.out.print("���̸� �Է��Ͻÿ� : ");
		        age = br.nextInt();        //�ڵ带 �ۼ��Ͻÿ�//
				System.out.print("Ű�� �Է��Ͻÿ� : ");
		        tall = br.nextDouble();        //�ڵ带 �ۼ��Ͻÿ�//
				System.out.print("ü���� �Է��Ͻÿ� : ");   
		        weight = br.nextFloat();      //�ڵ带 �ۼ��Ͻÿ�//
				
				// �Է� ����		
		        br.close();//�ڵ带 �ۼ��Ͻÿ�//
				
				System.out.println();
				
				// �Է¹��� ������ ������ó�� ����Ѵ�.
				System.out.println("���� �̸��� " + name + "�Դϴ�");
				System.out.println("���� ������ " + gender + "�Դϴ�");
				System.out.println("���� ���̴� " + age + "�� �Դϴ�");
				System.out.println("���� Ű�� " + tall + "cm �Դϴ�");
				System.out.println("���� ü���� " + weight + "kg �Դϴ�");
				//�ڵ带 �ۼ��Ͻÿ�//
				//�ڵ带 �ۼ��Ͻÿ�//
				//�ڵ带 �ۼ��Ͻÿ�//
				//�ڵ带 �ۼ��Ͻÿ�//	

	}

}
