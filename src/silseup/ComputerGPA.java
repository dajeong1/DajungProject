package silseup;

import java.util.Scanner;

public class ComputerGPA {

	public static void main(String[] args) {
		String coursename, flag="y";
        int attendscore;  //출석
        int homeworkscore;  //과제
        int quizscore;  //수시시험
        int midtermscore;  //중간시험
        int finalscore;  //기말시험
        int count=0;  //과목수

        // 각 과목의 총점과 학점 그리고 평점을 저장하는 변수들과 그 밖에 필요한
        // 변수들을 선언한다.
        double totalscore, gpa, gpasum=0;
        char grade;

        // 키보드로부터 입력하는 데이터를 읽기 위한 Scanner 객체를 만든다.
        Scanner scan = new Scanner(System.in);//코드를 작성하시오//

        // 사용자가 계속하기를 원한다면 다음을 반복한다.
        do {
           // 사용자로부터 과목의 이름과 각 평가 요소의 점수를 한 번에 하나씩
           // 입력하라고 요청한다. 그리고 입력된 점수를 읽는다.
           System.out.print("과목의 이름을 입력하세요: ");
           coursename = scan.next();
           
           System.out.print("출석 점수를 입력하세요: ");
           attendscore = scan.nextInt();
           
           System.out.print("과제 점수를 입력하세요: ");
           homeworkscore = scan.nextInt();
           
           System.out.print("수시시험 점수를 입력하세요: ");
           quizscore = scan.nextInt();
           
           System.out.print("중간시험 점수를 입력하세요: ");
           midtermscore = scan.nextInt();
           
           System.out.print("기말시험 점수를 입력하세요: ");
           finalscore = scan.nextInt();
           
           count++;

           // 과목의 총점을 계산하고 출력한다.
           totalscore = attendscore*0.1 + homeworkscore*0.4 + quizscore*0.1 + midtermscore*0.2 + finalscore*0.2;//코드를 작성하시오//
           System.out.printf("과목 %s의 총점: \t\t%f\n", coursename, totalscore);

           // 과목의 학점을 결정한다.
           // 문제에서 제시된 총점에 따른 학점과 평점을 지정 
           if(totalscore>=90){
              grade = 'A';
              gpa = 4.0;
           }
           
           else if(totalscore>=80){
              grade = 'B';
              gpa = 3.0;
           }
           
           else if(totalscore>=70){
              grade = 'C';
              gpa = 2.0;
           }
           
           else if(totalscore>=60){
              grade = 'D';
              gpa = 1.0;
           }
           
           else{
              grade = 'E';
              gpa = 0.0;
           }

           // 과목의 이름과 학점을 출력한다.
           System.out.printf("과목 %s의 학점: \t\t%c\n", coursename, grade);

           // 학점들의 누계를 계산한다.
           gpasum += gpa;

           // 사용자가 계속하기를 원하는 지를 예(y) 혹은 아니오(n)로 입력하라고
           // 요청한다. 그리고 입력된 값을 읽는다.
           System.out.print("계속하기를 원하세요?");
           System.out.print("그렇다면 y를 아니면 n를 입력하세요:");

           flag = scan.next();//코드를 작성하시오//
        } while (flag.equals("y"));
                  scan.close();

        // 평균 평점을 계산하고 출력한다.
        gpa = gpasum / count;//코드를 작성하시오//
        System.out.printf("평점: \t%f\n", gpa);
		}

}
