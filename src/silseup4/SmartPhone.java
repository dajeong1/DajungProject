package silseup4;

interface MobilePhone {
	public abstract void sendCall();
	public abstract void receiveCall();
	public abstract void sendSMS();
	public abstract void receiveSMS();
}
interface MP3 {
	public abstract void play();
	public abstract void stop();
}
class PDA {
    // 2���� ������ ���� �޾� ���� ���Ͽ� ��ȯ
	public int calculate(int x, int y){
		return x + y;
	}	
}


//SmartPhoneŬ������ PDAŬ������ ��ӹް�, �������̽� MobilePhone�� MP3�� �����Ѵ�.
public class SmartPhone extends PDA implements MobilePhone, MP3{ //�ڡ�
	//1. �������̽� MobliePhone�� �߻�޼ҵ� ����
	public void sendCall(){
		System.out.println("��ȭ �ɱ�");
	}
	public void receiveCall(){
		System.out.println("��ȭ �ޱ�");
	}
	public void sendSMS(){
		System.out.println("SMS ������");
	}
	public void receiveSMS(){
		System.out.println("SMS �ޱ�");
	}
	
	//2. �������̽� MobliePhone�� �߻�޼ҵ� ����
	public void play(){
		System.out.println("���� ���");
	}
	public void stop(){
		System.out.println("��� ����");
	}

	//3. �߰� �޼ҵ� ����
	public void scheduler(){
		System.out.println("���� ����");
	}
	public void applicationManager(){
		System.out.println("�������α׷� ��ġ/����");
	}

	
	
	public static void main(String[] args) {
		SmartPhone p = new SmartPhone();
		p.sendCall();
		p.play();
		System.out.println(p.calculate(3, 5));
		p.scheduler();
	}
}