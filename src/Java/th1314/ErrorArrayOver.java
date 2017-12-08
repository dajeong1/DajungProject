package Java.th1314;

public class ErrorArrayOver {
	public static void main(String[] args) {
		int[] a = new int[3];//0~2
		int i = 0;
		System.out.println("< a[3]에 첨자 0~4 접근 >\n");
		while(true){//0~4인덱스 접근
			try {
				a[i++] = 0;  //에러발생하면 이 문장만 실행하고 catch로!
				System.out.println("a["+(i-1)+"] : "+a[i-1]);
				 //i 0~2인덱스에 값 0 대입
			} catch (ArrayIndexOutOfBoundsException e){//java.lang.~  import필요x
				System.out.println("배열의 첨자 범위를 넘어섰습니다.");
				if(i==5) break;//i 3,4 인덱스 접근 에러, 4++ -> 5 탈출
			} finally {
				System.out.println("!무조건 출력!\n");
			}
		
		}
	}
}
