package silseup;

import java.util.Scanner;

public class CumputeAverage {

	public static void main(String[] args) {
		int score;
        int sum = 0;
        int count = 0; 
        float average = 0;     
     
// ��ĳ�� Ŭ������ ��ü ���� 
        Scanner scan = new Scanner(System.in); //�ڵ带 �ۼ��Ͻÿ�//

        // ����ڷκ��� ù���� ������ �Է��϶�� ��û�Ѵ�. �׸��� �Էµ� ���� �д´�.
        System.out.print("����(�� �̻� ������ ���ٸ� -1)�� �Է��ϼ���:");
        score = scan.nextInt();

        // ����ڰ� ������ �Է��ϴ� ���� ���踦 ����Ѵ�. 
        // �Էµ� ���� -1�̸� �ݺ����� ������.(����)
        while (score != -1){
	// ������ �հ迡 ���Ѵ� 
                sum += score;
                count++;
                System.out.print("����(�� �̻� ������ ���ٸ� -1)�� �Է��ϼ���:");
                score = scan.nextInt();
        }

        scan.close();
        
        average = (float)sum/count;// ����� ���
        //�ڵ带 �ۼ��Ͻÿ�//
        
        System.out.println("�Էµ� �������� �� : "+count);// �Էµ� �������� ���� ����� ���
        System.out.println("������ ��� : "+ average);
//�ڵ带 �ۼ��Ͻÿ�//
    //�ڵ带 �ۼ��Ͻÿ�//
        
	}

}
