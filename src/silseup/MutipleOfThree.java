package silseup;

import  java.util.Scanner;

public class MutipleOfThree {

	public static void main(String[] args) {
		int a[] = new int[10];

		Scanner sin = new Scanner(System.in);
			
		System.out.println("정수 10개를 입력하시오>>");

		for (int i = 0; i < a.length; i++)
		{
			a[i] = sin.nextInt();
		}
		
		sin.close();
			
		System.out.print("3의 배수>>");
		for (int i = 0; i < a.length; i++){
			if (a[i] % 3 == 0) 
				System.out.print(a[i] + " ");
		}
	}
}
