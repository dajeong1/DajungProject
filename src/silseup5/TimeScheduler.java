package silseup5;

//클래스명 : TimeScheduler
//학생들의 상담 일정을 잡는다.
import java.util.*;

public class TimeScheduler {
	public static void main(String[] args) {
		// 변수들
		Student appointments[]; // 상담 시간을 예약하는 학생들을 저장하기 위한 배열, 상담 예약 목록
		int appointmentsMade; // 상담 예약한 학생들의 수
		int number; // 학번
		String name; // 이름
		boolean made; // 상담 예약 여부
		int time; // 상담 시간
		
		// 가능한 상담시간을 보여 준다
		System.out.println("상담 시간 예약하기");
		System.out.println("가능한 상담시간: 오후 1시, 2시, 3시. 4시, 5시, 6시\n");
		
		Scanner scan = new Scanner(System.in);
		
		// 상담 시간을 예약하는 학생들을 저장하기 위한 배열 객체를 만든다   //7개의 배열을 만든다.(참고 : 인덱스 1번이 1시, 인덱스 6번이 6시를 나타낼 수 
		//있도록 프로그래밍한다.
		appointments = new Student[7];
		
		// 상담 예약한 학생들의 수를 0으로 초기화한다
		appointmentsMade = 0;
		
		Scanner s = new Scanner(System.in);
		
		// 상담 시간이 남아 있는 한 상담 시간 예약을 계속한다
		while (appointmentsMade < 6) {
			// 학생의 학번을 입력받는다
			System.out.print("학생의 학번을 입력하세요 : ");
			number = s.nextInt();
					
			// 학생의 이름을 입력받는다
			System.out.print("학생의 이름을 입력하세요 : ");
			name = s.next();
		
			made = false;
		
			// 상담 시간 예약이 이루어지지 않은 동안 반복한다
			while (!made) {
				try {
					 // 원하는 상담시간을 입력 받는다
					 System.out.print("원하는 상담시간(1, 2, 3, 4, 5, 6 중 선택): ");
					 time = s.nextInt();
			
					 // 선택한 상담 시간이 범위 밖에 있으면 InvalidTimeException 예외를 발생시킨다
					 if (time < 1 || time > 6)
					   	throw new InvalidTimeException("선택한 시간이 범위 밖에 있음");
			
					// 선택한 상담 시간이 예약되어 있으면 TimeInUseException 예외를 발생시킨다
					 else if(appointments[time] != null)
						 throw new TimeInUseException("선택한 시간은 이미 예약 됨");
								
					// 선택한 상담 시간이 비어 있으면 그 시간을 신청한 학생에게 베정한다
					// 학생의 학번과 이름을 매개변수로 한다.
					 else{
						 appointments[time] = new Student(number, name);//상담신청 가능하면 학생객체 생성하여, 해당 상담 배열에 담음
						 // 상담 시간 예약이 이루어졌다고 기록한다
						made = true;
						// 상담 예약한 학생들의 수를 1만큼 증가시킨다
						 appointmentsMade++;
					}
			    }//try end
			
				// InvalidTimeException 예외를 처리한다
				catch (InvalidTimeException e) {
						System.out.println("예외 처리함: " + e.getMessage());
					}
			
				// TimeInUseException 예외를 처리한다
				catch (TimeInUseException e) {
					System.out.println("예외 처리함: " + e.getMessage());
				}
			
				// 일반 예외를 처리한다
				catch (Exception e) {
					System.out.println("예외 처리함 : 시간은 정수여야 합니다.");
					s.next();//입력 스트림 제거
				}	
			}
		}
		s.close();
		
		// 상담 시간 예약 목록을 출력한다
		System.out.println("\n상담 시간 예약 목록\n");
		System.out.println("상담시간\t학번\t이름");
		
		// 상담시간과 학번 이름을 반복문을 이용하여 배열의 내용을 출력한다.
		// 이때, 학번과 이름은 toString()을 접근하여 출력한다.
		for(int i = 1; i < appointments.length; i++){
			System.out.println("   " + i + "      " + appointments[i].number + "      " + appointments[i].name);
		}
		
		
	}
}