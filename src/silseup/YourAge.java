package silseup;

import java.util.Scanner;

public class YourAge {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
		String name;
		int age;

		System.out.print("�̸� : ");
		name = input.next();

		System.out.print("���� : ");
		age = input.nextInt();

		System.out.println("����� �̸��� " + name + "�̰�, ���̴� " + age + "�Դϴ�.");

	}

}
