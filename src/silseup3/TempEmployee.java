package silseup3;

class TempEmployee extends Employee
{
   // ����� ������ ���� ��ü �������� �����Ѵ�
   protected double payRate;   // �ð��� �ӱ�
   private int hoursWorked;      // �ٹ��ð�

   // ����������� �̸�, �ҼӺμ�, �ð��� �ӱ��� �־��� ������ �ʱ�ȭ�ϰ�
   // �ٹ� �ð��� 0���� �ʱ�ȭ�ϸ鼭 TempEmployee ��ü�� �����Ѵ�
   public TempEmployee (String name, String department, double payRate)
   {
      super(name, department);
      this.payRate = payRate;
      this.hoursWorked = 0;
   }

   // ����� ������ ������ ����Ѵ�
   public double pay ()
   {
        return (payRate * hoursWorked);
   }

   // ����� ������ �߰� �ٹ��ð��� ������ �ٹ��ð��� ���Ѵ�
   public int addHours (int moreHours)
   {
      hoursWorked = moreHours;
      return hoursWorked;
   }

   //  ����� ������ ��� �����͸� ��ȯ�ϴ� �޼ҵ带 �ۼ��Ͻÿ�
   public String toString() {
      return "�̸� : " + name + ", �ҼӺμ�: " + department + ", �ð����ӱ�: " + payRate + ", �ٹ��ð�: " + addHours(hoursWorked) + ", ���޾�:" + pay();
   }
}