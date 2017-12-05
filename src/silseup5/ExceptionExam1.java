package silseup5;

import java.util.Scanner;
public class ExceptionExam1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		System.out.println("매개 변수로 받은 두개의 값");
		System.out.print("a = ");
		a = scan.nextInt();
		System.out.print("b = ");
		b = scan.nextInt();
		
		try{
			System.out.println(a + "를 " + b + "으로 나누면 몫은 " + a/b +"입니다.");
			System.out.println("나눗셈이 실행되었습니다.");
		} catch (ArithmeticException e){
			System.out.println("=============================");
			System.out.println(e);
			
		} finally {
			System.out.println("***************************");
			System.out.println("예외 처리를 끝내고 finally문장을 수행합니다.");
		}
		
	}

}
