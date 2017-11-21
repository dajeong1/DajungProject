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
		return "나의 이름은 "+name+"이고, 사는곳은 "+addr+"입니다."+"\n";
	}
}
