package silseup;

import java.util.Scanner;

public class ComputerGPA {

	public static void main(String[] args) {
		String coursename, flag="y";
        int attendscore;  //�⼮
        int homeworkscore;  //����
        int quizscore;  //���ý���
        int midtermscore;  //�߰�����
        int finalscore;  //�⸻����
        int count=0;  //�����

        // �� ������ ������ ���� �׸��� ������ �����ϴ� ������� �� �ۿ� �ʿ���
        // �������� �����Ѵ�.
        double totalscore, gpa, gpasum=0;
        char grade;

        // Ű����κ��� �Է��ϴ� �����͸� �б� ���� Scanner ��ü�� �����.
        Scanner scan = new Scanner(System.in);//�ڵ带 �ۼ��Ͻÿ�//

        // ����ڰ� ����ϱ⸦ ���Ѵٸ� ������ �ݺ��Ѵ�.
        do {
           // ����ڷκ��� ������ �̸��� �� �� ����� ������ �� ���� �ϳ���
           // �Է��϶�� ��û�Ѵ�. �׸��� �Էµ� ������ �д´�.
           System.out.print("������ �̸��� �Է��ϼ���: ");
           coursename = scan.next();
           
           System.out.print("�⼮ ������ �Է��ϼ���: ");
           attendscore = scan.nextInt();
           
           System.out.print("���� ������ �Է��ϼ���: ");
           homeworkscore = scan.nextInt();
           
           System.out.print("���ý��� ������ �Է��ϼ���: ");
           quizscore = scan.nextInt();
           
           System.out.print("�߰����� ������ �Է��ϼ���: ");
           midtermscore = scan.nextInt();
           
           System.out.print("�⸻���� ������ �Է��ϼ���: ");
           finalscore = scan.nextInt();
           
           count++;

           // ������ ������ ����ϰ� ����Ѵ�.
           totalscore = attendscore*0.1 + homeworkscore*0.4 + quizscore*0.1 + midtermscore*0.2 + finalscore*0.2;//�ڵ带 �ۼ��Ͻÿ�//
           System.out.printf("���� %s�� ����: \t\t%f\n", coursename, totalscore);

           // ������ ������ �����Ѵ�.
           // �������� ���õ� ������ ���� ������ ������ ���� 
           if(totalscore>=90){
              grade = 'A';
              gpa = 4.0;
           }
           
           else if(totalscore>=80){
              grade = 'B';
              gpa = 3.0;
           }
           
           else if(totalscore>=70){
              grade = 'C';
              gpa = 2.0;
           }
           
           else if(totalscore>=60){
              grade = 'D';
              gpa = 1.0;
           }
           
           else{
              grade = 'E';
              gpa = 0.0;
           }

           // ������ �̸��� ������ ����Ѵ�.
           System.out.printf("���� %s�� ����: \t\t%c\n", coursename, grade);

           // �������� ���踦 ����Ѵ�.
           gpasum += gpa;

           // ����ڰ� ����ϱ⸦ ���ϴ� ���� ��(y) Ȥ�� �ƴϿ�(n)�� �Է��϶��
           // ��û�Ѵ�. �׸��� �Էµ� ���� �д´�.
           System.out.print("����ϱ⸦ ���ϼ���?");
           System.out.print("�׷��ٸ� y�� �ƴϸ� n�� �Է��ϼ���:");

           flag = scan.next();//�ڵ带 �ۼ��Ͻÿ�//
        } while (flag.equals("y"));
                  scan.close();

        // ��� ������ ����ϰ� ����Ѵ�.
        gpa = gpasum / count;//�ڵ带 �ۼ��Ͻÿ�//
        System.out.printf("����: \t%f\n", gpa);
		}

}
