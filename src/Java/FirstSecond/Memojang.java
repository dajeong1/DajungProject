package Java.FirstSecond;
import java.util.Scanner;

public class Memojang {
	public static void main(String[] args) {
		int price, change, coin100, coin10;
		Scanner s = new Scanner(System.in);
		price = s.nextInt();
		s.close();
		change = 1000 - price;
		coin100 = change / 100;
		coin10 = (change % 100) / 10;
		System.out.println("100�� ���� ���� = " + coin100);
		System.out.println("10�� ���� ���� = " + coin10);
		
	}
}
