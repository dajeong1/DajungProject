package Java.Fourth;

public class While3 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while(sum <= 100){
			sum = sum + (i);
			i++;
		}
		System.out.println("1에서100까지의 합하는 중 100이 넘는 최소값: " + sum);
	}
}
