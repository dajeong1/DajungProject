package silseup;

import java.util.Scanner;

public class CumputeAverage {

	public static void main(String[] args) {
		int score;
        int sum = 0;
        int count = 0; 
        float average = 0;     
     
// 스캐너 클래스의 객체 생성 
        Scanner scan = new Scanner(System.in); //코드를 작성하시오//

        // 사용자로부터 첫번재 점수를 입력하라고 요청한다. 그리고 입력된 값을 읽는다.
        System.out.print("점수(더 이상 점수가 없다면 -1)를 입력하세요:");
        score = scan.nextInt();

        // 사용자가 점수를 입력하는 동안 누계를 계산한다. 
        // 입력된 값이 -1이면 반복문을 나간다.(조건)
        while (score != -1){
	// 점수를 합계에 더한다 
                sum += score;
                count++;
                System.out.print("점수(더 이상 점수가 없다면 -1)를 입력하세요:");
                score = scan.nextInt();
        }

        scan.close();
        
        average = (float)sum/count;// 평균을 계산
        //코드를 작성하시오//
        
        System.out.println("입력된 점수들의 수 : "+count);// 입력된 점수들의 수와 평균을 출력
        System.out.println("점수의 평균 : "+ average);
//코드를 작성하시오//
    //코드를 작성하시오//
        
	}

}
