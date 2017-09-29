package silseup;

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		//환산할 돈의 종류를 나타내는 배열을 선언한다.
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; 
		int res;   //지폐 매수 또는 동전의 개수
		int money;  //입력받는 금액
		
		Scanner s = new Scanner(System.in);
		//키보드로부터 입력하는 데이터를 읽기 위한 Scanner 객체를 만든다.
		//money 변수에 키보드로부터 입력받은 금액을 저장한다.
		//코드를 작성하시오//
		System.out.print("금액을 입력하시오>>");
		money = s.nextInt();
		
		s.close();
		//입력을 종료한다.
		//코드를 작성하시오//
		
		//unit[i]의 개수를 계산한다.
		for(int i=0; i<unit.length; i++) {
                        //입력받은 금액을 배열안의 요소를 나눠 환산할 돈을 계산한다.
                        //지폐의 매수 또는 동전의 개수 = 금액/환산할 금액의 단위
			//코드를 작성하시오//
			res = money / unit[i];
			//지폐권과 동전권을 나타내기 위해 문자열 변수를 선언한다.
			String str1, str2;
			
			if (res > 0) {
		  // 50000, 10000, 1000원 경우 지폐에 대한 "원권", "매"를 문자열 변수에 지정한다.
				if (i <= 2) { 
					str1 = "원권 ";
					str2 = "매";
			//그 이외의 경우 동전에 대한 "원짜리 동전", "개"를 문자열 변수에 지정한다.
				} else {
					str1 = "원짜리 동전 ";
					str2 = "개";				
				}
				System.out.println(unit[i] + str1 + res + str2);
				//money에 대한 잔액을 갱신한다. 
				money -= res * unit[i];
			}
		}

	}

}
