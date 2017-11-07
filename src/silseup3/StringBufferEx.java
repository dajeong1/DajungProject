package silseup3;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println("StringBuffer 객체sb 주소값:" + sb.hashCode());

		System.out.println();
		
		sb.append(" is pencil");
		System.out.println("문자열 덧붙이기 결과:" + sb);

		//(This is(7==공백)pencil)사이 "my"추가 
		sb.insert(7, " my"); //7부터 삽입
		System.out.println("문자열 삽입 결과:" + sb);

		
        //“my”를 “your”로 대체  
		//(This is my pencil) m->8 y->9
		sb.replace(8, 10, "your"); //end +1 //StringBuffer 메소드
		System.out.println("문자열 대치 결과:" + sb);
		
		
		//“This(공백)”가 출력되도록 StringBuffer 내 문자열 길이를 설정 
		sb.setLength(5); //+1
		System.out.println("문자열 길이를 설정한 후 sb의 값:" + sb);

		
		System.out.println();

        //주소값 비교
		System.out.println("StringBuffer 객체sb 주소값:" + sb.hashCode());

	}

}
