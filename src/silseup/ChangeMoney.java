package silseup;

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		//ȯ���� ���� ������ ��Ÿ���� �迭�� �����Ѵ�.
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; 
		int res;   //���� �ż� �Ǵ� ������ ����
		int money;  //�Է¹޴� �ݾ�
		
		Scanner s = new Scanner(System.in);
		//Ű����κ��� �Է��ϴ� �����͸� �б� ���� Scanner ��ü�� �����.
		//money ������ Ű����κ��� �Է¹��� �ݾ��� �����Ѵ�.
		//�ڵ带 �ۼ��Ͻÿ�//
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		money = s.nextInt();
		
		s.close();
		//�Է��� �����Ѵ�.
		//�ڵ带 �ۼ��Ͻÿ�//
		
		//unit[i]�� ������ ����Ѵ�.
		for(int i=0; i<unit.length; i++) {
                        //�Է¹��� �ݾ��� �迭���� ��Ҹ� ���� ȯ���� ���� ����Ѵ�.
                        //������ �ż� �Ǵ� ������ ���� = �ݾ�/ȯ���� �ݾ��� ����
			//�ڵ带 �ۼ��Ͻÿ�//
			res = money / unit[i];
			//����ǰ� �������� ��Ÿ���� ���� ���ڿ� ������ �����Ѵ�.
			String str1, str2;
			
			if (res > 0) {
		  // 50000, 10000, 1000�� ��� ���� ���� "����", "��"�� ���ڿ� ������ �����Ѵ�.
				if (i <= 2) { 
					str1 = "���� ";
					str2 = "��";
			//�� �̿��� ��� ������ ���� "��¥�� ����", "��"�� ���ڿ� ������ �����Ѵ�.
				} else {
					str1 = "��¥�� ���� ";
					str2 = "��";				
				}
				System.out.println(unit[i] + str1 + res + str2);
				//money�� ���� �ܾ��� �����Ѵ�. 
				money -= res * unit[i];
			}
		}

	}

}
