package Java.Sixth;

public class Fibo20 {

	public static void main(String[] args) {
		int F[] = new int[21]; //0»ç¿ë x
		
		for (int n = 1; n < 21; n++){
			if(n < 3)
				F[n] = 1;
			else
				F[n] = F[n - 1] + F[n - 2];
			
			System.out.print(F[n] + "  ");
		}
		
	}
}
