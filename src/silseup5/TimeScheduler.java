package silseup5;

//Ŭ������ : TimeScheduler
//�л����� ��� ������ ��´�.
import java.util.*;

public class TimeScheduler {
	public static void main(String[] args) {
		// ������
		Student appointments[]; // ��� �ð��� �����ϴ� �л����� �����ϱ� ���� �迭, ��� ���� ���
		int appointmentsMade; // ��� ������ �л����� ��
		int number; // �й�
		String name; // �̸�
		boolean made; // ��� ���� ����
		int time; // ��� �ð�
		
		// ������ ���ð��� ���� �ش�
		System.out.println("��� �ð� �����ϱ�");
		System.out.println("������ ���ð�: ���� 1��, 2��, 3��. 4��, 5��, 6��\n");
		
		Scanner scan = new Scanner(System.in);
		
		// ��� �ð��� �����ϴ� �л����� �����ϱ� ���� �迭 ��ü�� �����   //7���� �迭�� �����.(���� : �ε��� 1���� 1��, �ε��� 6���� 6�ø� ��Ÿ�� �� 
		//�ֵ��� ���α׷����Ѵ�.
		appointments = new Student[7];
		
		// ��� ������ �л����� ���� 0���� �ʱ�ȭ�Ѵ�
		appointmentsMade = 0;
		
		Scanner s = new Scanner(System.in);
		
		// ��� �ð��� ���� �ִ� �� ��� �ð� ������ ����Ѵ�
		while (appointmentsMade < 6) {
			// �л��� �й��� �Է¹޴´�
			System.out.print("�л��� �й��� �Է��ϼ��� : ");
			number = s.nextInt();
					
			// �л��� �̸��� �Է¹޴´�
			System.out.print("�л��� �̸��� �Է��ϼ��� : ");
			name = s.next();
		
			made = false;
		
			// ��� �ð� ������ �̷������ ���� ���� �ݺ��Ѵ�
			while (!made) {
				try {
					 // ���ϴ� ���ð��� �Է� �޴´�
					 System.out.print("���ϴ� ���ð�(1, 2, 3, 4, 5, 6 �� ����): ");
					 time = s.nextInt();
			
					 // ������ ��� �ð��� ���� �ۿ� ������ InvalidTimeException ���ܸ� �߻���Ų��
					 if (time < 1 || time > 6)
					   	throw new InvalidTimeException("������ �ð��� ���� �ۿ� ����");
			
					// ������ ��� �ð��� ����Ǿ� ������ TimeInUseException ���ܸ� �߻���Ų��
					 else if(appointments[time] != null)
						 throw new TimeInUseException("������ �ð��� �̹� ���� ��");
								
					// ������ ��� �ð��� ��� ������ �� �ð��� ��û�� �л����� �����Ѵ�
					// �л��� �й��� �̸��� �Ű������� �Ѵ�.
					 else{
						 appointments[time] = new Student(number, name);//����û �����ϸ� �л���ü �����Ͽ�, �ش� ��� �迭�� ����
						 // ��� �ð� ������ �̷�����ٰ� ����Ѵ�
						made = true;
						// ��� ������ �л����� ���� 1��ŭ ������Ų��
						 appointmentsMade++;
					}
			    }//try end
			
				// InvalidTimeException ���ܸ� ó���Ѵ�
				catch (InvalidTimeException e) {
						System.out.println("���� ó����: " + e.getMessage());
					}
			
				// TimeInUseException ���ܸ� ó���Ѵ�
				catch (TimeInUseException e) {
					System.out.println("���� ó����: " + e.getMessage());
				}
			
				// �Ϲ� ���ܸ� ó���Ѵ�
				catch (Exception e) {
					System.out.println("���� ó���� : �ð��� �������� �մϴ�.");
					s.next();//�Է� ��Ʈ�� ����
				}	
			}
		}
		s.close();
		
		// ��� �ð� ���� ����� ����Ѵ�
		System.out.println("\n��� �ð� ���� ���\n");
		System.out.println("���ð�\t�й�\t�̸�");
		
		// ���ð��� �й� �̸��� �ݺ����� �̿��Ͽ� �迭�� ������ ����Ѵ�.
		// �̶�, �й��� �̸��� toString()�� �����Ͽ� ����Ѵ�.
		for(int i = 1; i < appointments.length; i++){
			System.out.println("   " + i + "      " + appointments[i].number + "      " + appointments[i].name);
		}
		
		
	}
}