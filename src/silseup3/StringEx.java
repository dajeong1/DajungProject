package silseup3;
public class StringEx {

	public static void main(String[] args) {
		String a = new String(" abcd");
		String b = new String(",efg");
		
		System.out.println("문자열 연결 전 주소:" + a.hashCode());

		//문자열 a에 a와 b를 연결하는 메소드를 사용
		a = a.concat(b);
		System.out.println("문자열 연결 후 값:" + a);
		System.out.println("문자열 연결 후 주소:" + a.hashCode());
		
		//문자열 a의 공백을 제거하는 메소드를 사용
		a = a.trim();
		System.out.println("공백 제거 후 값:" + a);
		
		//문자열 a의 값 중에서 “ab”를 “12”으로 대치하는 String 메소드를 사용
		a = a.replace("ab", "12");
		System.out.println("문자열 대치 후 값:" + a);
		
		
		//String 배열 s를 선언한 후, “,” 중심으로 스트링을 분리한 배열 반환
		String s[] = a.split(",");//★ string배열 반환
		for(int i = 0; i < s.length; i++)
			System.out.println("분리된"+i+"번 문자열"+s[i]);
		
		
		a = a.substring(3);//인덱스 3부터 값 출력     12cd(3),efg
		System.out.println("substring 후 값:"+a);
		
		//2번째 인덱스의 문자를 반환하는 메소드를 사용
		char c = a.charAt(2); //d,e(2)fg
		System.out.println("문자c의 값:"+c);

		
		System.out.println("문자열 a의 주소:" + a.hashCode());

	}

}
