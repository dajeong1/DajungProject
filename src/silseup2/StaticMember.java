package silseup2;

public class StaticMember {

	public static void main(String[] args) {
		CurrentConverter r = new CurrentConverter();
		r.setRate(1215);
		
		System.out.println("�鸸����"+r.toDollar(1000000)+"�޷��Դϴ�.");
		System.out.println("��޷���"+r.toKWR(100)+"���Դϴ�.");
	}
}
