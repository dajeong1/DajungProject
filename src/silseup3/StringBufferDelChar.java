package silseup3;

import java.util.Scanner;

public class StringBufferDelChar {
	static String delChar(String before, String delCh) { //입력받은 문자열, 특수문자 모은 문자열
		
		StringBuffer result = new StringBuffer(before.length()); //특수문자가 아닌 문자열을 담음(입력받은 문자열 길이만큼)
	
		for(int i = 0; i < before.length(); i++)
		{	
			char ch = before.charAt(i); //한 문자씩 검사
			if (delCh.indexOf(ch) == -1) //★ ch가 특수 문자열에 없다면 result에 담음
				result.append(ch);
		}

		return result.toString(); //결과를 String형으로 변환하여 반환
	}

	public static void main(String[] args) {
		
		String before, after;
		Scanner scan = new Scanner(System.in);

		System.out.print("특수문자를 포함한 문자열을 입력하세요 : ");
		before = scan.nextLine();
		scan.close();

		after = delChar(before, "~!@#$%^&*()");

				System.out.print("특수문자를 제거한 문자열 출력 : "+ after);
	}
}
