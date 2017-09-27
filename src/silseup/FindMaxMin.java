package silseup;

import java.util.Scanner;

public class FindMaxMin {

	public static void main(String[] args) {
		int num1, num2;
		int max, min;
		
		Scanner scan = new Scanner(System.in);
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		scan.close();
		
		if(num1 >= num2) {
			max = num1;
			min = num2;
		}
		else {
			max = num2;
			min = num1;
		}
		System.out.println("최대값은" + max + "입니다.");
		System.out.println("최소값은" + min + "입니다.");
	}

}
