package Java.th11;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {

	public static void main(String[] args) {
		int computer, user;
		int flag = 0;//1:�̱�  -1:��
		Random r = new Random();
		computer = r.nextInt(3);//0,1,2
		
		System.out.print("����: 0(����), 1(����), 2(��): ");
		Scanner s = new Scanner(System.in);
		user = s.nextInt();
		
		
		System.out.print("����� ");
		if(user == 0) System.out.print("����");
		else if(user == 1) System.out.print("����");
		else System.out.print("��");
		System.out.println("�� �������ϴ�.");
		
		System.out.print("��ǻ�ʹ� ");
		if(computer == 0) System.out.print("����");
		else if(computer == 1) System.out.print("����");
		else System.out.print("��");
		System.out.println("�� �������ϴ�.");
		
		
		
		if(computer == user)
			System.out.println("�����ϴ�.");
		else {
			if (computer == 0)//����
				if(user == 1) flag = 1;//���� (�̱�)
				else flag = -1;//�� (��)
			
			else if (computer == 1)//����
				if(user == 2) flag = 1;//�� (�̱�)
				else flag = -1;//���� (��)
			
			else if (computer == 2)//��
				if(user == 0) flag = 1;//���� (�̱�)
				else flag = -1;//���� (��)
			
			if(flag == 1) System.out.println("����� �̰���ϴ�.");
			else System.out.println("����� �����ϴ�.");		
		
		}
		
	}

}
