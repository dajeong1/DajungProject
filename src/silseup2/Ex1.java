package silseup2;

public class Ex1 {
	int x;
	int y;
	static int z;    

	Ex1(int x, int y, int z1) 
	{
		this.x = x;
		this.y = y;
		z = z1;
	}
	
	public void view(){
		System.out.println(x + " " + y + " " + z);
	}
}
