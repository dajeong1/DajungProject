package silseup4;
//����� ����
class TempEmployee extends Employee
{								//�̸�, �μ�
   protected double payRate;	//�ð��� �ӱ�
   private int hoursWorked;		//�ٹ��ð�

   // ����������� �̸�, �ҼӺμ�, �ð��� �ӱ��� �־��� ������ �ʱ�ȭ�ϰ�
   // �ٹ� �ð��� 0���� �ʱ�ȭ�ϸ鼭 TempEmployee ��ü�� �����Ѵ�
   public TempEmployee (String name, String department, double payRate)
   {
	   super(name, department);
	   this.payRate = payRate;
	   this.hoursWorked = 0;
   }

   // ����� ������ ������ ����Ѵ�, ���� �ð��� 0����
   public double pay()
   {
	   double allHours = this.hoursWorked;
	   this.hoursWorked = 0;
       return this.payRate * allHours;
       //�ӱ�*�ٹ��ð�
   }

   // ����� ������ �߰� �ٹ��ð��� ������ �ٹ��ð��� ���Ѵ�
   public void addHours (int moreHours)
   {
        this.hoursWorked += moreHours;
   }

   public String toString(){
	   return "�̸�: "+this.name+", �ҼӺμ�: "+this.department+", �ð����ӱ�: "
       +this.payRate+", �ٹ��ð�: "+this.hoursWorked;
   }
}



