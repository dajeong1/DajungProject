package Java.Seventh;

public class ComplexSum {

	public static void main(String[] args) {
		Complex[] cmplx = new Complex[5];
		Complex e1 = new Complex(2, 1);
		Complex e2 = new Complex(3, 3);
		Complex e3 = new Complex(4, 5);
		Complex e4 = new Complex(0, 0);
		
		cmplx[0] = e1;
		cmplx[1] = e2;
		cmplx[2] = e3;
		cmplx[3] = e4;
		
		for(int i = 0; i < 3; i++){
			cmplx[3].x += cmplx[i].x;
			cmplx[3].y += cmplx[i].y;
		}
		
		System.out.println(e4);
		System.out.println(cmplx[3]);
	}

}
