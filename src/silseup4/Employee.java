package silseup4;

public class Employee
{
    public String name;			// �̸�
    public String department;	// �ҼӺμ�

    // ������ �̸��� �ҼӺμ��� ���� �־��� ������ �ʱ�ȭ�ϸ鼭
    // ���ο� Employee ��ü�� �����Ѵ�.
    public Employee(String Name, String Department)//super()�� ���
    {
        this.name = Name;
        this.department = Department;
    }

	// �̸��� ��ȯ�Ѵ�
	public String getName(){
        return this.name;
	}

	// �ҼӺμ��� ��ȯ�ϴ� �޼ҵ带 �ۼ��Ͻÿ�
	public String getDepartment(){
        return this.department;
	}

	// �� Employee ��ü�� �̸��� �ҼӺμ��� ��ȯ�ϴ� �޼ҵ带 �ۼ��Ͻÿ�
	public String toString(){
		return "�̸�: "+this.name+", �ҼӺμ�: "+this.department;
	}
 

	// �̸��� �����Ѵ�
	public void setName(String Name)
	{
        this.name = Name;
	}

	// �μ� �̸� ����
	public void setDepartment(String Department)
	{
        this.department = Department;
	}
}
