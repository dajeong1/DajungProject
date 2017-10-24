package silseup2;
//
//class Test{
//	int x;
//	int y;
//	static int z;    //메소드 공간 객체생성되기 전 만들어짐 프로그램 종료되면 없어짐 static, 전역변수
//
//	public Test(int x, int y, int z1) //z로 적으면 안됨, static이여서
//	{
//		this.x = x;
//		this.y = y;
//		z = z1;
//	}
//	
//	public void view1(){
//		System.out.println(x + " " + y + " " + z);
//	}
//}//heap 객체생성, 자동소멸, new //stack 지역변수, 매개변수   {시작    }삭제



public class Ex2 {

	public static void main(String[] args) {
		Ex1 ob1 = new Ex1(1, 2, 3);
		Ex1 ob2 = new Ex1(5, 6, 7);
		ob1.view();
		ob2.view();
	}
	
}

//method 공간 : main, z
//heap 공간 : x, y
//stack 공간 : ob1
