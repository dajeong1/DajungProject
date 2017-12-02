package silseup4;

public class EmployeeDriver
{
   public static void main (String[] args)
   {
      RegEmployee employeeOne;  // RegEmployee ��ü ��������
      TempEmployee employeeTwo;	// TempEmployee ��ü ��������

      // �̸��� ���Ѹ����̰� �ҼӺμ��� �������á��̰� ������ 6,000�̰�
      // ���ʽ� ���޷��� 0.4�� ������ ������ ��Ÿ���� RegEmployee ��ü�� �����Ѵ�
      employeeOne = new RegEmployee("�Ѹ�", "������", 6000, 0.4);

      // ��ü�� ���� ���¸� ����Ѵ�
      System.out.print(employeeOne);

      // ������ ������ ������ ����� �� ����Ѵ�
      
      System.out.println(", ���޾�: " + employeeOne.pay());


      // �̸��� ����ġ���̰� �ҼӺμ��� ���������ߡ��̰� �ð��� �ӱ��� 1��
      // ����� ������ ��Ÿ���� TempEmployee ��ü�� �����Ѵ�
      employeeTwo = new TempEmployee("��ġ", "��������", 1);

      // ����� ������ �ٹ��ð��� 300�� ���Ѵ�
      employeeTwo.addHours(300);

      // ��ü�� ���� ���¸� ����Ѵ�
      System.out.print(employeeTwo);

      // ����� ������ ������ ����� �� ����Ѵ�
      System.out.println(", ���޾�: " + employeeTwo.pay());
      
      
      employeeTwo.addHours(555);//0���� �ʱ�ȭ�Ǿ����� Ȯ�� ok
      System.out.println(", ���޾�: " + employeeTwo.pay());
   }
}