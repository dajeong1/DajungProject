package silseup3;

public class StringFindCount {

	public static int count(String src, String target) {
		int count = 0; // 찾은 횟수
		int pos = 0; // 찾기 시작할 위치

		while (true) {

			pos = src.indexOf(target, pos); //지정된 pos부터!!!
			
			if (pos != -1) { //찾으면 (찾는 값이 없으면 -1 반환)
				count++;
				pos = pos + target.length(); //pos를 찾은 단어 이후로 옮긴다 .
			} 
			
			else		
                break;
			
		}
		
		return count;
	}


	public static void main(String[] args) {
		System.out.println("찾는 문자열의 갯수 : "+ count("12345AB12AB345AB", "AB")); //조건:A다음에 B가 있어야함
		System.out.println("찾는 문자열의 갯수 : "+ count("12345", "AB"));

	}
}
