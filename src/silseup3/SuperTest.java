package silseup3;

public class SuperTest {
	String name;
	String addr;

	SuperTest(){
		this.name = "null";
		this.addr = "null";
	}
	
	
	SuperTest(String name, String addr){
		this.name = name;
		this.addr = addr;
	}
	
	
	public String toString(){
		return "���� �̸��� "+name+"�̰�, ��°��� "+addr+"�Դϴ�."+"\n";
	}
}
