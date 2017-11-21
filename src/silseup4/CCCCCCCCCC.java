package silseup4;

abstract class AA{
	abstract public void view1();
	public void view2(){}
}

class BB extends AA{
	public void view1(){}
}
public class CCCCCCCCCC {
	public static void main(String[] args){
		//AA ob1 = new AA();//추상클래스라서 안됨
		//ob1.view1();
		
		AA ob2 = new BB();//추상메소드가 오버라이딩되서 객체생성ㅇㅋ
		ob2.view1();//3번쨰 메쏘드 호출
		
		ob2.view2();//2번째 메소드 호출
	}
}
