package silseup3;

import java.util.Scanner;

public class StringBufferDelChar {
	static String delChar(String before, String delCh) { //�Է¹��� ���ڿ�, Ư������ ���� ���ڿ�
		
		StringBuffer result = new StringBuffer(before.length()); //Ư�����ڰ� �ƴ� ���ڿ��� ����(�Է¹��� ���ڿ� ���̸�ŭ)
	
		for(int i = 0; i < before.length(); i++)
		{	
			char ch = before.charAt(i); //�� ���ھ� �˻�
			if (delCh.indexOf(ch) == -1) //�� ch�� Ư�� ���ڿ��� ���ٸ� result�� ����
				result.append(ch);
		}

		return result.toString(); //����� String������ ��ȯ�Ͽ� ��ȯ
	}

	public static void main(String[] args) {
		
		String before, after;
		Scanner scan = new Scanner(System.in);

		System.out.print("Ư�����ڸ� ������ ���ڿ��� �Է��ϼ��� : ");
		before = scan.nextLine();
		scan.close();

		after = delChar(before, "~!@#$%^&*()");

				System.out.print("Ư�����ڸ� ������ ���ڿ� ��� : "+ after);
	}
}
