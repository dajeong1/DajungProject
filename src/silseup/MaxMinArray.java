import java.util.Scanner;

public class MaxMinArray {

	public static void main(String[] args) {
		int intArray[] = new int[5];
		int max, min;

		Scanner scan = new Scanner(System.in);
				
		for(int i = 0; i < intArray.length; i++) {
			System.out.print("intArray[" + i +"]�� ���� �Է� : ");
			intArray[i]	= scan.nextInt();
		}
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + "\t");
		}
		System.out.println();
		
		//intArray�迭�� ��Ҹ� ����Ѵ�.
		//for(int arr:intArray)
		//	System.out.print(arr + "\t");
				
		scan.close();
				
		max = intArray[0];
		min = intArray[0];
				
		for(int i = 0; i < intArray.length; i++) {
			if(intArray[i] > max) max = intArray[i];
			if(intArray[i] < min) min = intArray[i];
		}
							
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);

	}	
}

