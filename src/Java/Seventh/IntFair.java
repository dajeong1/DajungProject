package Java.Seventh;

public class IntFair {
	int x, y;
	IntFair(){
		x = y = 0;
	}
	
	IntFair(int x){
		this.x = x;
		y = 0;
	}
	
	IntFair(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	int first(){
		return x;
	}
	
	int second(){
		return y;
	}
	
	public String toString(){
		return "(" + x + ", " + y + ")";
	}
	
}
