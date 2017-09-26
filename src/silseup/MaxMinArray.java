import java.util.Scanner;

public class MaxMinArray {

	public static void main(String[] args) {
		int intArray[] = new int[5];
		int max, min;

		Scanner scan = new Scanner(System.in);
				
		for(int i = 0; i < intArray.length; i++) {
			System.out.print("intArray[" + i +"]의 값을 입력 : ");
			intArray[i]	= scan.nextInt();
		}
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + "\t");
		}
		System.out.println();
		
		//intArray배열의 요소를 출력한다.
		//for(int arr:intArray)
		//	System.out.print(arr + "\t");
				
		scan.close();
				
		max = intArray[0];
		min = intArray[0];
				
		for(int i = 0; i < intArray.length; i++) {
			if(intArray[i] > max) max = intArray[i];
			if(intArray[i] < min) min = intArray[i];
		}
							
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}	
}

