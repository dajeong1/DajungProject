package silseup3;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println("StringBuffer ��üsb �ּҰ�:" + sb.hashCode());

		System.out.println();
		
		sb.append(" is pencil");
		System.out.println("���ڿ� �����̱� ���:" + sb);

		//(This is(7==����)pencil)���� "my"�߰� 
		sb.insert(7, " my"); //7���� ����
		System.out.println("���ڿ� ���� ���:" + sb);

		
        //��my���� ��your���� ��ü  
		//(This is my pencil) m->8 y->9
		sb.replace(8, 10, "your"); //end +1 //StringBuffer �޼ҵ�
		System.out.println("���ڿ� ��ġ ���:" + sb);
		
		
		//��This(����)���� ��µǵ��� StringBuffer �� ���ڿ� ���̸� ���� 
		sb.setLength(5); //+1
		System.out.println("���ڿ� ���̸� ������ �� sb�� ��:" + sb);

		
		System.out.println();

        //�ּҰ� ��
		System.out.println("StringBuffer ��üsb �ּҰ�:" + sb.hashCode());

	}

}
