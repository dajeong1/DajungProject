package Java.Third;

public class Ampersand12 {

	public static void main(String[] args) {
		int a = 0;
		String b = "\0";
		
		if((a != 0) && (b="��� ����") == "��� ����")
			a = 0;
		System.out.println("&&�϶� b�� �� : " + b);
		
		b = "\0";
		
		if((a != 0) & (b="��� ����") == "��� ����")
			a = 0;
		System.out.println("&�϶� b�� �� : " + b);
		
	}
}
