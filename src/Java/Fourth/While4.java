package Java.Fourth;

public class While4 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		int sum2 = 0;
		while(i <= 100){
			sum = sum + i;
			sum2 = sum2 + sum;
			i++;
		}
		System.out.println("1 + (1 + 2) + (1 + 2 + 3) + ... + (1 + 2 + ... + 100) : " + sum2);
	}

}
