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
			System.out.println(e + " - ���ܹ߻�");
			System.out.println("�ε��� ������ ������ϴ�.");
		} finally {
			System.out.println("************************");
			System.out.println("����ó���� ������ finally ����.");
		}
		

	}

}
