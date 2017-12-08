import java.io.*;

public class DownOrder {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		int[] a = new int[10];//파일 안 정수 10개 이하
		int x;
		
		for(int i = 0; i < 10; i++){
			if ((x = br.read()) == -1) break;
			if(x != ' ')
				a[i] = x - '0';
		}
		
		for (int i = 0; i < 10 - 1; i++)
	    {
	        for (int j = 0; j < 10 - 1 - i; j++)
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
		
		System.out.println("내림차순 정렬 후 : ");
		for (int i = 0; i < 10; i++){
			System.out.print(a[i] + " ");
		}
		
	}

}
