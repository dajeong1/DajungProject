package Java.th1314;

public class ErrorArrayOver {
	public static void main(String[] args) {
		int[] a = new int[3];//0~2
		int i = 0;
		System.out.println("< a[3]�� ÷�� 0~4 ���� >\n");
		while(true){//0~4�ε��� ����
			try {
				a[i++] = 0;  //�����߻��ϸ� �� ���常 �����ϰ� catch��!
				System.out.println("a["+(i-1)+"] : "+a[i-1]);
				 //i 0~2�ε����� �� 0 ����
			} catch (ArrayIndexOutOfBoundsException e){//java.lang.~  import�ʿ�x
				System.out.println("�迭�� ÷�� ������ �Ѿ���ϴ�.");
				if(i==5) break;//i 3,4 �ε��� ���� ����, 4++ -> 5 Ż��
			} finally {
				System.out.println("!������ ���!\n");
			}
		
		}
	}
}
