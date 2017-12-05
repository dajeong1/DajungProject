package silseup5;

public class Student {
	// �й��� �̸��� �������� �����Ѵ�
	int number;
	String name;
	
	// �̸��� �й��� �ʱ�ȭ�ϴ� �����ڸ� �����.
	public Student(int number, String name){
		this.number = number;
		this.name = name;
	}

	// �� Student ��ü�� ��� �����͸� ���ڿ��� ��ȯ�Ѵ�.
	public String toString() {
		return (number + "\t" + name);
	}
}



//������ ��� �ð��� ��ȿ���� �ʴٴ� ���� Ŭ����
class InvalidTimeException extends Exception {
	// ���ܰ� �߻��� ������ �Ѱ� �޾� ��ü�� �����Ѵ�
	public InvalidTimeException(String message){
		super(message);
	}
}

//������ ��� �ð��� ����Ǿ� �ִٴ� ���� Ŭ����
class TimeInUseException extends Exception {
	// ���ܰ� �߻��� ������ �Ѱ� �޾� ��ü�� �����Ѵ�
	public TimeInUseException(String message){
		super(message);
	}
}
