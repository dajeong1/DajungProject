package Java.Seventh;

public class MinMaxUse {

	public static void main(String[] args) {
		int[] arr = {3, 6, 8, 25, 16, 31, 17};
		MinMaxFind a = new MinMaxFind();
		System.out.println(a.minMax(arr));//IntFair ��ü, toString ȣ��/ ���������� ��� ���
		System.out.println(a);//MinMaxFind ��ü, toString ȣ�� (minMax()ȣ���� �ؾ� ���� ����)/ min,max���� toString���� ���
	}

}
