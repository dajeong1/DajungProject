package silseup;

import java.util.Scanner;

public class Stataics {

	public static void main(String[] args) {
		// ����ڷκ����� �Է� ������ �����ϴ� �������� �����Ѵ�
        int number1, number2, number3;

        // Ű����κ��� �Է��ϴ� �����͸� �б� ���� Scanner ��ü�� �����
        Scanner scan = new Scanner (System.in);

        // �Էµ� ������ �ִ밪, �ּҰ�, �հ�� ����� ���� �������� �����Ѵ�
        int maximum, minimum, sum;
        double avg;

        // ���� sum�� �ʱⰪ�� 0���� �Ѵ�
        sum = 0;        //�ڵ带 �ۼ��Ͻÿ�//

        // ����ڷκ��� ù���� ���� �Է��϶�� ��û�Ѵ�. �׸��� �Էµ� ���� �д´�
        System.out.print("ù��° ���� �Է��ϼ���: ");
        number1 = scan.nextInt();

        // ����ڷκ��� �ι�° ���� �Է��϶�� ��û�Ѵ�. �׸��� �Էµ� ���� �д´�
        System.out.print("�ι�° ���� �Է��ϼ���: ");
        number2 = scan.nextInt();      //�ڵ带 �ۼ��Ͻÿ�//

        // ����ڷκ��� ����° ���� �Է��϶�� ��û�Ѵ�. �׸��� �Էµ� ���� �д´�
        System.out.print("����° ���� �Է��ϼ���: ");
        number3 = scan.nextInt();        //�ڵ带 �ۼ��Ͻÿ�//

        // �ִ밪�� ����Ѵ�
        maximum = number1;
        if (maximum < number2) maximum = number2;
        if (maximum < number3) maximum = number3;

        // �ּҰ��� ����Ѵ�
        minimum = number1;       //�ڵ带 �ۼ��Ͻÿ�//
        if (minimum > number2) minimum = number2;
        if (minimum > number3) minimum = number3;
        
        // �հ�� ����� ����Ѵ�
        sum = number1 + number2 + number3;        //�ڵ带 �ۼ��Ͻÿ�//
        avg = sum / 3.0;
        // ������� ����Ѵ�
        System.out.println("�ִ밪: " + maximum);
        System.out.println("�ּҰ�: " + minimum);
        System.out.println("�հ�: " + sum);
        System.out.println("���: " + avg);
               //�ڵ带 �ۼ��Ͻÿ�//


	}

}
