package silseup2;

public class JJJJJJEqualTest {

	public static void main(String[] args) {
		String a = "�ڹ�";//1�� �ڹ�
		String b = "�ڹ�";//�����ּҰ���Ŵ 1��
		String c = new String("�ڹ�");//���ΰ�ü�� ���� 2��
		String d = new String("�ڹ�");// �������� 3��
		
		System.out.println(a==b);//�ּ� ����
		System.out.println(c==d);//�ּ� �ٸ�
		System.out.println(a.equals(b));//��ü���� ����
		System.out.println(c.equals(d));//��ü���� ����
	}

}
