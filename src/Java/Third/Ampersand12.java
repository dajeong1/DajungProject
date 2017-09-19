package Java.Third;

public class Ampersand12 {

	public static void main(String[] args) {
		int a = 0;
		String b = "\0";
		
		if((a != 0) && (b="계산 실행") == "계산 실행")
			a = 0;
		System.out.println("&&일때 b의 값 : " + b);
		
		b = "\0";
		
		if((a != 0) & (b="계산 실행") == "계산 실행")
			a = 0;
		System.out.println("&일때 b의 값 : " + b);
		
	}
}
