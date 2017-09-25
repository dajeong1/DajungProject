package Java.Five;

public class FactonPrnCr {

	public static void main(String[] args) {
		System.out.println(factorial(4));
		System.out.println(perm(5, 2));
		System.out.println(combi(5, 4));
	}

	static int factorial(int n){
		if (n <= 1)
			return 1;
		else
			return n * factorial(n - 1);
	}
	
	static int perm(int n, int r) {
		return factorial(n)/factorial(n-r);
	}
	
	static int combi(int n, int r) {
		return perm(n, r)/factorial(r);
	}
}
