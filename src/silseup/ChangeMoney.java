package silseup;

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; 
		int res;  
		int money; 
		
		Scanner s = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		money = s.nextInt();
		
		s.close();

		for(int i=0; i<unit.length; i++) {
			res = money / unit[i];
			
			String str1, str2;
	
			if (res > 0) {
				if (i <= 2) { 
					str1 = "원권 ";
					str2 = "매";
				} 
				else {
					str1 = "원짜리 동전 ";
					str2 = "개";				
				}
				System.out.println(unit[i] + str1 + res + str2);

				money -= res * unit[i];
			}
		}

	}

}
