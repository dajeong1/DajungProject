package silseup;

import java.util.Scanner;

public class CompanyResult {
	//입사총점 계산하고 결과값을 반환
			public static int total(int toe, int it) {
				//코드를 작성하시오//
			}
			
	                //입사결과값을 반환
			public static String result(int tot) {
				//코드를 작성하시오//
			}

			public static void main(String[] args) {
				int toeic, interview;
				
				//토익점수와 면접점수를 입력받는다.
				Scanner scan = new Scanner(System.in);//코드를 작성하시오//
				
				System.out.print("토익점수 입력 : ");
				toeic = scan.nextInt();
				System.out.print("면접점수 입력 : ");
				interview = scan.nextInt();
				//코드를 작성하시오//
				
				//입사총점을 계산하는 메소드와 합격여부를 판단하는 메소드를 
	                        //호출하고 출력한다.
				System.out.println("입사총점 : " + total(toeic, interview) + "점");
				System.out.println("입사결과 : " + result(total(toeic,interview)));

		}
	}
}
