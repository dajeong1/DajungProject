package Java.Fourth;

import java.io.*;

public class SmallLetterChange {

	public static void main(String[] args) throws IOException {
		char c;
		System.out.println("Enter Chars to change small letter(End : q) : ");
		do {
			c = (char)System.in.read();
			if(c < 'a') c += 'a' - 'A';
			System.out.print(c);
		}while(c != 'q');
	}
}
