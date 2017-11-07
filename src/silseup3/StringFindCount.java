package silseup3;

public class StringFindCount {

	public static int count(String src, String target) {
		int count = 0; // ã�� Ƚ��
		int pos = 0; // ã�� ������ ��ġ

		while (true) {

			pos = src.indexOf(target, pos); //������ pos����!!!
			
			if (pos != -1) { //ã���� (ã�� ���� ������ -1 ��ȯ)
				count++;
				pos = pos + target.length(); //pos�� ã�� �ܾ� ���ķ� �ű�� .
			} 
			
			else		
                break;
			
		}
		
		return count;
	}


	public static void main(String[] args) {
		System.out.println("ã�� ���ڿ��� ���� : "+ count("12345AB12AB345AB", "AB")); //����:A������ B�� �־����
		System.out.println("ã�� ���ڿ��� ���� : "+ count("12345", "AB"));

	}
}
