package Java.Seventh;

public class Complex {
	int x, y; //x�� ������, y�� �����
	
	Complex(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(){ //�ݵ�� public ���ϰ�
		return x + " + " + y + "i";
	}
}
