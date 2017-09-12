package silseup;

import java.util.Scanner;

public class InputData {

	public static void main(String[] args) {
		// 키보드로부터 입력하는 데이터를 읽기 위한 Scanner 객체를 만든다.
				Scanner br = new Scanner(System.in);//코드를 작성하시오//
				
				// 변수 선언
				String name;
				int age;
				double tall;
				float weight;
				char gender;
				
				// 이름, 성별, 나이, 키, 체중을 입력 받는다.
				System.out.print("이름을 입력하시오 : ");		
		        name = br.next();        //코드를 작성하시오//
				System.out.print("성별을 입력하시오 : ");
		        gender = br.next().charAt(0);       //코드를 작성하시오//
				System.out.print("나이를 입력하시오 : ");
		        age = br.nextInt();        //코드를 작성하시오//
				System.out.print("키를 입력하시오 : ");
		        tall = br.nextDouble();        //코드를 작성하시오//
				System.out.print("체중을 입력하시오 : ");   
		        weight = br.nextFloat();      //코드를 작성하시오//
				
				// 입력 종료		
		        br.close();//코드를 작성하시오//
				
				System.out.println();
				
				// 입력받은 내용을 모범출력처럼 출력한다.
				System.out.println("나의 이름은 " + name + "입니다");
				System.out.println("나의 성별은 " + gender + "입니다");
				System.out.println("나의 나이는 " + age + "세 입니다");
				System.out.println("나의 키는 " + tall + "cm 입니다");
				System.out.println("나의 체중은 " + weight + "kg 입니다");
				//코드를 작성하시오//
				//코드를 작성하시오//
				//코드를 작성하시오//
				//코드를 작성하시오//	

	}

}
