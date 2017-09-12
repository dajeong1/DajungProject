package beakJune;

import java.util.Scanner;

public class Star8 {

	public static void main(String[] args) {
		int num;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오 (1 <= num <= 100) : ");
		num = s.nextInt();
		
		for(int j = 1; j <= num; j++){
			for(int i = 0; i < j; i++)
				System.out.print("*");
			for(int k = 0; k < 2*(num - j); k++)
				System.out.print(" ");
			for(int i = 0; i < j; i++)
				System.out.print("*");
			System.out.print("\n");
		}

		for(int j = num - 1; j > 0; j--){
			for(int i = 0; i < j; i++)
				System.out.print("*");
			for(int k = 0; k < 2*(num - j); k++)
				System.out.print(" ");
			for(int i = 0; i < j; i++)
				System.out.print("*");
			System.out.print("\n");
		}
		
		
		
	}
}
