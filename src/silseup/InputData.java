package silseup;

import java.util.Scanner;

public class InputData {

	public static void main(String[] args) {
				Scanner br = new Scanner(System.in);
				
				String name;
				int age;
				double tall;
				float weight;
				char gender;
								
				System.out.print("�̸��� �Է��Ͻÿ� : ");		
		        name = br.next();        
				System.out.print("������ �Է��Ͻÿ� : ");
		        gender = br.next().charAt(0);       
				System.out.print("���̸� �Է��Ͻÿ� : ");
		        age = br.nextInt();        
				System.out.print("Ű�� �Է��Ͻÿ� : ");
		        tall = br.nextDouble();        
				System.out.print("ü���� �Է��Ͻÿ� : ");   
		        weight = br.nextFloat();    
						
		        br.close();
				
				System.out.println();
				
				System.out.println("���� �̸��� " + name + "�Դϴ�");
				System.out.println("���� ������ " + gender + "�Դϴ�");
				System.out.println("���� ���̴� " + age + "�� �Դϴ�");
				System.out.println("���� Ű�� " + tall + "cm �Դϴ�");
				System.out.println("���� ü���� " + weight + "kg �Դϴ�");

	}

}
