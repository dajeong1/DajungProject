package silseup3;

public class Employee
{
    public String name;         // �̸�
    public String department;   // �ҼӺμ�

    // ������ �̸��� �ҼӺμ��� ���� �־��� ������ �ʱ�ȭ�ϸ鼭
    // ���ο� Employee ��ü�� �����Ѵ�.
    public Employee(String Name, String Department)
    {
        this.name = Name;
        this.department = Department; 
    }

   // �̸��� ��ȯ�Ѵ�
   public String getName( ){
        return name;
   }

   // �ҼӺμ��� ��ȯ�ϴ� �޼ҵ带 �ۼ��Ͻÿ�
    public String getDepartment() {
       return department;
    }

   // �̸��� �����Ѵ�
   public void setName(String Name)
   {
       this.name = Name;
   }

   // �ҼӺμ��� �����ϴ� �޼ҵ带 �ۼ��Ͻÿ�
    public void setDepartment(String Department)
    {
       this.department = Department;
    }
}