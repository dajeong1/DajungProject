package silseup4;
//������
class RegEmployee extends Employee
{									//�̸�, �μ�
   protected double yearlySalary;  	// ����
   protected double bonusRate;		// ���ʽ� ���޷�

   // ������ ������ �̸�, �ҼӺμ�, ������ ���ʽ� ���޷���
   // ���� �־��� ������ �ʱ�ȭ�ϸ鼭 RegEmployee ��ü�� �����Ѵ�
   public RegEmployee (String name, String department, double yearlySalary, double bonusRate)
   {
	   super(name, department);
	   this.yearlySalary = yearlySalary;
	   this.bonusRate = bonusRate;
   }

   // ������ ������ ������ ����Ѵ�
   public double pay()
   {	//������/12*(1+���ʽ� ���޷�)
	   return this.yearlySalary / 12 * (1 + this.bonusRate);
   }

   public String toString(){  //4���� �ʵ尪
	   return "�̸�: "+this.name+", �ҼӺμ�: "+this.department+", ����: "
       +this.yearlySalary+", ���ʽ����޷�: "+this.bonusRate;
   }
}