package Java.Eighth;

public class SortString {

	public static void main(String[] args) {
		StringBuffer strb = new StringBuffer("BELeaTwZPpqSUv");
		
		System.out.println("���� �� : " + strb);
		
		for (int i = 0; i < strb.length(); i++){
			for (int j = 0; j < strb.length() - 1 - i; j++){
				if(strb.charAt(j) > strb.charAt(j+1)){
					char s = strb.charAt(j); //�ΰ��� ���� �̿��ؾ� �ϱ⶧���� �ٲ�� ���� �Ѱ��� ������ ����
					strb.setCharAt(j, strb.charAt(j+1));
					strb.setCharAt(j+1, s);
				}				
			}
		}
		
		System.out.println("���� �� : " + strb);
	}

}
