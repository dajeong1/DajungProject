package Java.Seventh;

public class Complex {
	int x, y; //x는 정수부, y는 허수부
	
	Complex(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(){ //반드시 public 붙일것
		return x + " + " + y + "i";
	}
}
