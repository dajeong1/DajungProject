package silseup;

import java.util.Scanner;

public class Stataics {

	public static void main(String[] args) {

        int number1, number2, number3;

        Scanner scan = new Scanner (System.in);

        int maximum, minimum, sum;
        double avg;

        sum = 0;

        System.out.print("ù��° ���� �Է��ϼ���: ");
        number1 = scan.nextInt();

        System.out.print("�ι�° ���� �Է��ϼ���: ");
        number2 = scan.nextInt();    

        System.out.print("����° ���� �Է��ϼ���: ");
        number3 = scan.nextInt();

        maximum = number1;
        if (maximum < number2) maximum = number2;
        if (maximum < number3) maximum = number3;

        minimum = number1;      
        if (minimum > number2) minimum = number2;
        if (minimum > number3) minimum = number3;
        
        sum = number1 + number2 + number3;       
        avg = sum / 3.0;

        System.out.println("�ִ밪: " + maximum);
        System.out.println("�ּҰ�: " + minimum);
        System.out.println("�հ�: " + sum);
        System.out.println("���: " + avg);
 
	}

}
