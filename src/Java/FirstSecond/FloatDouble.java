package Java.FirstSecond;

public class FloatDouble {
	public static void main(String[] args) {
		float a, b, c, d, e;
		double g, h, i, j, k;
		
		a = 'A';
		b = 15;
		//c = 1.5;  에러
		d = 1.5f;
		//e = 1.5d;  에러
		
		g = 'A';
		h = 15;
		i = 1.5;
		j = 1.5f;
		k = 1.5d;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("d = "+d+"\n");
		System.out.println("g = "+g);
		System.out.println("h = "+h);
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		System.out.println("k = "+k);
		
	}
}
