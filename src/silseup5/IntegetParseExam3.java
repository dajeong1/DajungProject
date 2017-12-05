package silseup5;
public class IntegetParseExam3 {

	public static void main(String[] args) {
		String[] stringNumber = {"12", "23", "998", "3.141592"};
		
		try{
			for(int i = 0; i < stringNumber.length; i++)
				//Integer j = Integer.parseInt(stringNumber[i]);
				//Sysout(j);
				System.out.println("숫자로 변환된 값은 "+Integer.parseInt(stringNumber[i]));
		}
		catch (NumberFormatException e){
			System.out.println("========================");
			System.out.println(e + " - 예외발생");
			System.out.println("정수로 변환할 수 없습니다.");
		} finally {
			System.out.println("**********************");
			System.out.println("예외 처리를 끝내고 finally 수행.");
		}

	}

}
