package silseup3;

class RegEmployee extends Employee
{
   protected double yearlySalary;     // ����
   protected double bonusRate;      // ���ʽ� ���޷�

   // ������ ������ �̸�, �ҼӺμ�, ������ ���ʽ� ���޷���
   // ���� �־��� ������ �ʱ�ȭ�ϸ鼭 RegEmployee ��ü�� �����Ѵ�
   public RegEmployee (String name, String department, double yearlySalary, double bonusRate)
   {
      super(name, department);
      this.yearlySalary = yearlySalary;
      this.bonusRate = bonusRate;
   }

   // ������ ������ ������ ����Ѵ�
   public double pay ()
   {
       return (yearlySalary/12.0*(1.0 + bonusRate));
   }

   public String toString() {
      return "�̸� : " + name + ", �ҼӺμ�: " + department + ", ����: " + yearlySalary + ", ���ʽ����޷�: " + bonusRate + ", ���޾�:" + pay();
   }
}