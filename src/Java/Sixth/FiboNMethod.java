package Java.Sixth;

import java.util.Scanner;

public class FiboNMethod {

	public static void main(String[] args) {
		int num;
		int B[];
		
		Scanner s = new Scanner(System.in);
			
		System.out.print("피보나치 수열 몇 개의 항? : ");
		num = s.nextInt();
		B = fibo(num);
		for (int i = 1; i < num + 1; i++){
			System.out.print(B[i] + "  ");
		}
	}

	
	static int[] fibo(int num){
		int F[] = new int[num + 1]; //0사용 x
		
		for (int i = 1; i < num + 1; i++){
			if(i < 3)
				F[i] = 1;
			else
				F[i] = F[i - 1] + F[i - 2];
		}
		return F;
	}
	
}
