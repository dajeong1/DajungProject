package silseup3;
public class StringEx {

	public static void main(String[] args) {
		String a = new String(" abcd");
		String b = new String(",efg");
		
		System.out.println("���ڿ� ���� �� �ּ�:" + a.hashCode());

		//���ڿ� a�� a�� b�� �����ϴ� �޼ҵ带 ���
		a = a.concat(b);
		System.out.println("���ڿ� ���� �� ��:" + a);
		System.out.println("���ڿ� ���� �� �ּ�:" + a.hashCode());
		
		//���ڿ� a�� ������ �����ϴ� �޼ҵ带 ���
		a = a.trim();
		System.out.println("���� ���� �� ��:" + a);
		
		//���ڿ� a�� �� �߿��� ��ab���� ��12������ ��ġ�ϴ� String �޼ҵ带 ���
		a = a.replace("ab", "12");
		System.out.println("���ڿ� ��ġ �� ��:" + a);
		
		
		//String �迭 s�� ������ ��, ��,�� �߽����� ��Ʈ���� �и��� �迭 ��ȯ
		String s[] = a.split(",");//�� string�迭 ��ȯ
		for(int i = 0; i < s.length; i++)
			System.out.println("�и���"+i+"�� ���ڿ�"+s[i]);
		
		
		a = a.substring(3);//�ε��� 3���� �� ���     12cd(3),efg
		System.out.println("substring �� ��:"+a);
		
		//2��° �ε����� ���ڸ� ��ȯ�ϴ� �޼ҵ带 ���
		char c = a.charAt(2); //d,e(2)fg
		System.out.println("����c�� ��:"+c);

		
		System.out.println("���ڿ� a�� �ּ�:" + a.hashCode());

	}

}
