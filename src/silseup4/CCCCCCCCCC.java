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
		//AA ob1 = new AA();//�߻�Ŭ������ �ȵ�
		//ob1.view1();
		
		AA ob2 = new BB();//�߻�޼ҵ尡 �������̵��Ǽ� ��ü��������
		ob2.view1();//3���� �޽�� ȣ��
		
		ob2.view2();//2��° �޼ҵ� ȣ��
	}
}
