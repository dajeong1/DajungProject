package silseup5;

public class Student {
	// 학번과 이름의 변수들을 선언한다
	int number;
	String name;
	
	// 이름과 학번을 초기화하는 생성자를 만든다.
	public Student(int number, String name){
		this.number = number;
		this.name = name;
	}

	// 현 Student 객체의 모든 데이터를 문자열로 반환한다.
	public String toString() {
		return (number + "\t" + name);
	}
}



//선택한 상담 시간이 유효하지 않다는 예외 클래스
class InvalidTimeException extends Exception {
	// 예외가 발생한 이유를 넘겨 받아 객체를 생성한다
	public InvalidTimeException(String message){
		super(message);
	}
}

//선택한 상담 시간이 예약되어 있다는 예외 클래스
class TimeInUseException extends Exception {
	// 예외가 발생한 이유를 넘겨 받아 객체를 생성한다
	public TimeInUseException(String message){
		super(message);
	}
}
