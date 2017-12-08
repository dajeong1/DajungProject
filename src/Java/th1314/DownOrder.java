package Java.th1314;
import java.io.*;

public class DownOrder {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		int[] a = new int[10];//���� �� ���� 10�� ����
		String s;
		int count = 0;
		
		for(int i = 0; i < 10; i++){
			if ((s = br.readLine()) == null) break;//��readLine()   String���� ���� �о
			a[i] = Integer.parseInt(s);//String -> int(������) , ��ü���� �ʿ�x
			count++;
		}
		
		for (int i = 0; i < count - 1; i++)
		{
	        for (int j = 0; j < count - 1 - i; j++)
	        {
	            if (a[j] < a[j + 1])
	            {
	            	int temp;
	                temp = a[j];
	                a[j] = a[j + 1];
	                a[j + 1] = temp;
	            }
	        }
	    }
		
		System.out.println("�������� ���� ��2 : ");
		for (int i = 0; i < count; i++){
			System.out.print(a[i] + " ");
		}
		
	}

}
