package Java.th1314;
import java.io.*;

public class DownOrder {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		int[] a = new int[10];//파일 안 정수 10개 이하
		String s;
		int count = 0;
		
		for(int i = 0; i < 10; i++){
			if ((s = br.readLine()) == null) break;//★readLine()   String으로 값을 읽어냄
			a[i] = Integer.parseInt(s);//String -> int(원시형) , 객체생성 필요x
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
		
		System.out.println("내림차순 정렬 후2 : ");
		for (int i = 0; i < count; i++){
			System.out.print(a[i] + " ");
		}
		
	}

}
