package beakJune;

import java.util.Scanner;

public class FindSmallX {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arrnum, x;//원소갯수, 숫자
		
		arrnum = s.nextInt();
		x = s.nextInt();
		
		int a[] = new int[arrnum];
		
		
		for(int i = 0; i < arrnum; i++)
			a[i] = s.nextInt();
		
		
		for(int i = 0; i < arrnum; i++)
			if(a[i] < x) System.out.print(a[i]+" ");
		
	}

}
