package silseup5;
public class IntegetParseExam3 {

	public static void main(String[] args) {
		String[] stringNumber = {"12", "23", "998", "3.141592"};
		
		try{
			for(int i = 0; i < stringNumber.length; i++)
				//Integer j = Integer.parseInt(stringNumber[i]);
				//Sysout(j);
				System.out.println("���ڷ� ��ȯ�� ���� "+Integer.parseInt(stringNumber[i]));
		}
		catch (NumberFormatException e){
			System.out.println("========================");
			System.out.println(e + " - ���ܹ߻�");
			System.out.println("������ ��ȯ�� �� �����ϴ�.");
		} finally {
			System.out.println("**********************");
			System.out.println("���� ó���� ������ finally ����.");
		}

	}

}
