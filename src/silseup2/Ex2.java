package silseup2;
//
//class Test{
//	int x;
//	int y;
//	static int z;    //�޼ҵ� ���� ��ü�����Ǳ� �� ������� ���α׷� ����Ǹ� ������ static, ��������
//
//	public Test(int x, int y, int z1) //z�� ������ �ȵ�, static�̿���
//	{
//		this.x = x;
//		this.y = y;
//		z = z1;
//	}
//	
//	public void view1(){
//		System.out.println(x + " " + y + " " + z);
//	}
//}//heap ��ü����, �ڵ��Ҹ�, new //stack ��������, �Ű�����   {����    }����



public class Ex2 {

	public static void main(String[] args) {
		Ex1 ob1 = new Ex1(1, 2, 3);
		Ex1 ob2 = new Ex1(5, 6, 7);
		ob1.view();
		ob2.view();
	}
	
}

//method ���� : main, z
//heap ���� : x, y
//stack ���� : ob1
