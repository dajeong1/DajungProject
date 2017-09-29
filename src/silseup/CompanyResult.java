package silseup;

import java.util.Scanner;

public class CompanyResult {

			public static int total(int toe, int it){
				return (toe + it);
			}
			

			public static String result(int tot) {
				if (tot >= 800) return "합격";
				else return "불합격";
			}

			public static void main(String[] args) {
				int toeic, interview;
				
				Scanner scan = new Scanner(System.in);
				
				System.out.print("토익점수 입력 : ");
				toeic = scan.nextInt();
				System.out.print("면접점수 입력 : ");
				interview = scan.nextInt();

				System.out.println("입사총점 : " + total(toeic, interview) + "점");
				System.out.println("입사결과 : " + result(total(toeic,interview)));
		}
}

