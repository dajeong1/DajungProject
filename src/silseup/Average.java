package silseup;

public class Average {

	public static void main(String[] args) {

		int datagrade, softgrade, webgrade;
		double average;

        datagrade = 90;
        softgrade = 94;
        webgrade = 85;
        average = (datagrade + softgrade + webgrade)/3.0;        

        System.out.println("�ڷᱸ�� ������ ����: " + datagrade);
        System.out.println("����Ʈ������з� ������ ����: " + softgrade);
        System.out.println("�����α׷��� ������ ����: " + webgrade);
        System.out.println("��� ����: " + average);
 
	}

}
