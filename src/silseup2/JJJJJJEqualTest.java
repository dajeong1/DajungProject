package silseup2;

public class JJJJJJEqualTest {

	public static void main(String[] args) {
		String a = "자바";//1번 자바
		String b = "자바";//같은주소가리킴 1번
		String c = new String("자바");//따로객체가 생김 2번
		String d = new String("자바");// 마찬가지 3번
		
		System.out.println(a==b);//주소 같음
		System.out.println(c==d);//주소 다름
		System.out.println(a.equals(b));//객체내용 같다
		System.out.println(c.equals(d));//객체내용 같다
	}

}
