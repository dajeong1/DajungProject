package silseup;

import  java.util.Scanner;

public class MutipleOfThree {

	public static void main(String[] args) {
		int a[] = new int[10];

		Scanner sin = new Scanner(System.in);
			
		System.out.println("���� 10���� �Է��Ͻÿ�>>");

		for (int i = 0; i < a.length; i++)
		{
			a[i] = sin.nextInt();
		}
		
		sin.close();
			
		System.out.print("3�� ���>>");
		for (int i = 0; i < a.length; i++){
			if (a[i] % 3 == 0) 
				System.out.print(a[i] + " ");
		}
	}
}
