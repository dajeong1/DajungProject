package Java.FirstSecond;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a; double b; String c; String d;
		
		a = s.nextInt();
		System.out.print("int a = " + a);
		
		b = s.nextDouble();
		System.out.println("double b = " + b);
		
			
		c = s.next();
		System.out.println("String c = " + c);
		
		s.nextLine();
		
		d = s.nextLine();
		System.out.println("String d = " + d);

	}

}
