package silseup3;

class EmployeeDriver
{
   public static void main (String[] args)
   {
      // �̸��� ���Ѹ����̰� �ҼӺμ��� �������á��̰� ������ 6,000�̰�
      // ���ʽ� ���޷��� 0.4�� ������ ������ ��Ÿ���� RegEmployee ��ü�� �����Ѵ�
      RegEmployee employeeOne = new RegEmployee("�Ѹ�", "������", 6000, 0.4);

      // ��ü�� ���� ���¸� ����Ѵ�
        System.out.println(employeeOne.toString());

      // ������ ������ ������ ����� �� ����Ѵ�
        employeeOne.pay();

      // �̸��� ����ġ���̰� �ҼӺμ��� ���������ߡ��̰� �ð��� �ӱ��� 1��
      // ����� ������ ��Ÿ���� TempEmployee ��ü�� �����Ѵ�
        TempEmployee employeeTwo = new TempEmployee("��ġ", "��������", 1);

      // ����� ������ �ٹ��ð��� 300�� ���Ѵ�
        employeeTwo.addHours(300);

      // ��ü�� ���� ���¸� ����Ѵ�
        System.out.println(employeeTwo.toString());

      // ����� ������ ������ ����� �� ����Ѵ�
        employeeTwo.pay();
   }
}