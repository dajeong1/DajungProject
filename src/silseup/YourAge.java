package silseup;

import java.util.Scanner;

public class YourAge {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
		String name;
		int age;

		System.out.print("이름 : ");
		name = input.next();

		System.out.print("나이 : ");
		age = input.nextInt();

		System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "입니다.");

	}

}
