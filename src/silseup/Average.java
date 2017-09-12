package silseup;

public class Average {

	public static void main(String[] args) {

		int datagrade, softgrade, webgrade;
		double average;

        datagrade = 90;
        softgrade = 94;
        webgrade = 85;
        average = (datagrade + softgrade + webgrade)/3.0;        

        System.out.println("자료구조 과목의 점수: " + datagrade);
        System.out.println("소프트웨어공학론 과목의 점수: " + softgrade);
        System.out.println("웹프로그래밍 과목의 점수: " + webgrade);
        System.out.println("평균 점수: " + average);
 
	}

}
