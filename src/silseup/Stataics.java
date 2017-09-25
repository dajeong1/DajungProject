package silseup;

import java.util.Scanner;

public class Stataics {

	public static void main(String[] args) {

        int number1, number2, number3;

        Scanner scan = new Scanner (System.in);

        int maximum, minimum, sum;
        double avg;

        sum = 0;

        System.out.print("첫번째 수를 입력하세요: ");
        number1 = scan.nextInt();

        System.out.print("두번째 수를 입력하세요: ");
        number2 = scan.nextInt();    

        System.out.print("세번째 수를 입력하세요: ");
        number3 = scan.nextInt();

        maximum = number1;
        if (maximum < number2) maximum = number2;
        if (maximum < number3) maximum = number3;

        minimum = number1;      
        if (minimum > number2) minimum = number2;
        if (minimum > number3) minimum = number3;
        
        sum = number1 + number2 + number3;       
        avg = sum / 3.0;

        System.out.println("최대값: " + maximum);
        System.out.println("최소값: " + minimum);
        System.out.println("합계: " + sum);
        System.out.println("평균: " + avg);
 
	}

}
