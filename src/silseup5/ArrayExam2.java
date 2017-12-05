package silseup5;
public class ArrayExam2 {

	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4, 5};
		
		try{
			for(int i= 0; i<intArray.length+1 ; i++){
				System.out.println("intArray["+i+"]="+intArray[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("==========================");
			System.out.println(e + " - 예외발생");
			System.out.println("인덱스 범위를 벗어났습니다.");
		} finally {
			System.out.println("************************");
			System.out.println("예외처리를 끝내고 finally 수행.");
		}
		

	}

}
