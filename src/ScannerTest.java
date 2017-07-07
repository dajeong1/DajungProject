import java.util.Scanner;


public class ScannerTest {
	public static void main(String args[]) {
		int a;
		
		Scanner cs = new Scanner(System.in);
		
		System.out.println("입력하셈");
		a = cs.nextInt();
		
		System.out.println("입력 값은 " + a);
	}
}
