package silseup3;

public class SubTest extends SuperTest {

	int age;
	double score;
		
	//super클래스로부터 상속받은 name과 addr는  super클래스 생성자를 사용하여 초기화한다
	SubTest(){
		super();
		this.age = 0;
		this.score = 0;
	}
		
	//super클래스로부터 상속받은 name과 addr는 super클래스 생성자를 사용하여 초기화한다
	SubTest(String name, String addr, int age, double score){
		super(name, addr);
		this.age = age;
		this.score = score;
	}

	//출력화면과 같이 super클래스의 toString을 연결하여 출력하도록 작성한다
	public String toString(){
		return super.toString()+"나의 나이는 "+age+"이고, 점수는 "+score+"점 입니다.";
	}
		

	public static void main(String[] args) {
		SuperTest ob1 = new SuperTest("둘리", "진주");
		System.out.println(ob1.toString());
		System.out.println("--------------------------------------------");
		SubTest ob2 = new SubTest("마이콜","창원",21,90.7);
		System.out.println(ob2.toString());
	}
}
