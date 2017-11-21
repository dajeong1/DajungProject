package silseup3;

public class SubTest extends SuperTest {

	int age;
	double score;
		
	//superŬ�����κ��� ��ӹ��� name�� addr��  superŬ���� �����ڸ� ����Ͽ� �ʱ�ȭ�Ѵ�
	SubTest(){
		super();
		this.age = 0;
		this.score = 0;
	}
		
	//superŬ�����κ��� ��ӹ��� name�� addr�� superŬ���� �����ڸ� ����Ͽ� �ʱ�ȭ�Ѵ�
	SubTest(String name, String addr, int age, double score){
		super(name, addr);
		this.age = age;
		this.score = score;
	}

	//���ȭ��� ���� superŬ������ toString�� �����Ͽ� ����ϵ��� �ۼ��Ѵ�
	public String toString(){
		return super.toString()+"���� ���̴� "+age+"�̰�, ������ "+score+"�� �Դϴ�.";
	}
		

	public static void main(String[] args) {
		SuperTest ob1 = new SuperTest("�Ѹ�", "����");
		System.out.println(ob1.toString());
		System.out.println("--------------------------------------------");
		SubTest ob2 = new SubTest("������","â��",21,90.7);
		System.out.println(ob2.toString());
	}
}
