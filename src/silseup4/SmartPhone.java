package silseup4;

interface MobilePhone {
	public abstract void sendCall();
	public abstract void receiveCall();
	public abstract void sendSMS();
	public abstract void receiveSMS();
}
interface MP3 {
	public abstract void play();
	public abstract void stop();
}
class PDA {
    // 2개의 정수를 전달 받아 합을 구하여 반환
	public int calculate(int x, int y){
		return x + y;
	}	
}


//SmartPhone클래스는 PDA클래스를 상속받고, 인터페이스 MobilePhone과 MP3를 구현한다.
public class SmartPhone extends PDA implements MobilePhone, MP3{ //★★
	//1. 인터페이스 MobliePhone의 추상메소드 구현
	public void sendCall(){
		System.out.println("전화 걸기");
	}
	public void receiveCall(){
		System.out.println("전화 받기");
	}
	public void sendSMS(){
		System.out.println("SMS 보내기");
	}
	public void receiveSMS(){
		System.out.println("SMS 받기");
	}
	
	//2. 인터페이스 MobliePhone의 추상메소드 구현
	public void play(){
		System.out.println("음악 재생");
	}
	public void stop(){
		System.out.println("재생 중지");
	}

	//3. 추가 메소드 구현
	public void scheduler(){
		System.out.println("일정 관리");
	}
	public void applicationManager(){
		System.out.println("응용프로그램 설치/삭제");
	}

	
	
	public static void main(String[] args) {
		SmartPhone p = new SmartPhone();
		p.sendCall();
		p.play();
		System.out.println(p.calculate(3, 5));
		p.scheduler();
	}
}