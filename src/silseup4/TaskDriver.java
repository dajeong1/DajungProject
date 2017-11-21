package silseup4;

//���̵��� ��Ȯ�ϰ� ������ �� �ִ� ��ü�� ���� �������̽��� ��Ÿ����.
interface Complexity
{	
	public abstract void setComplexity (int complexity);// ���̵��� �����Ѵ�
	public abstract int getComplexity();// ���̵��� �˷��ش�
}

// �켱������ ����ϰ� �Ҵ��� �� �ִ� ��ü�� ���� �������̽��� ��Ÿ����.
interface Priority
{
	public abstract void setPriority(int priority);// �켱������ �����Ѵ�
	public abstract int getPriority();// �켱������ �˷��ش�
}

// ������ ���Ѵ�
class Task implements Priority, Complexity
{
   private String name;		// �̸�
   private int time;		// �ҿ� �ð�
   private int priority;    // �켱����
   private int complexity;	// ���̵�

   // ������ �̸��� �ҿ�ð��� �� �־��� ������ �ʱ�ȭ�ϰ� 
   // �켱������ ���̵��� 1�� ���� Task ��ü�� �����Ѵ�
   public Task(String taskName, int taskTime)
   {
      this.name = taskName;
      this.time = taskTime;
      this.priority = 1;
      this.complexity = 1;
   }

   // ������ �̸��� ��ȯ�Ѵ�
   public String getName()
   {
      return this.name;
   }

   // ������ �ҿ�ð��� ��ȯ�Ѵ�
   public int getTime()
   {
      return this.time;
   }

   // ������ �켱������ ��ȯ�Ѵ�
   public int getPriority()
   {
      return this.priority;
   }

   // ������ ���̵��� ��ȯ�Ѵ�
   public int getComplexity()
   {
      return this.complexity;
   }

   // �����°� ���� toString�޼ҵ带 ����Ͽ� ��ü�� ��� �����͸� ��ȯ�Ѵ�.
   public String toString()
   {
       return "�̸� = "+name+"\n�ҿ� �ð�  = "+time+"\n�켱 ���� = "+priority+"\n���̵� = "+complexity+"\n";
   }

   // ������ �̸��� �����Ѵ�
   public void setName(String newName)
   {
      this.name = newName;
   }

   // ������ �ҿ�ð��� �����Ѵ�
   public void setTime(int newTime)
   {
      this.time = newTime;
   }

   // ������ �켱������ �����Ѵ�
   public void setPriority(int newPriority)
   {
      this.priority = newPriority;
   }

   // ������ ���̵��� �����Ѵ�
   public void setComplexity(int newComplexity)
   {
      this.complexity = newComplexity;
   }
}
   

// Task ��ü���� ����� �̿��Ѵ�
public class TaskDriver
{
   public static void main(String args[])
   {
	   // ������ �̸��� �����α׷� �ۼ����̰� �ҿ�ð��� 7�ð��� Task ��ü�� �����Ѵ�
       Task task1 = new Task("���α׷� �ۼ�", 7);
       task1.setPriority(7);//�켱������ 7�� ����
       task1.setComplexity(10);//���̵��� 10���� ����

   
       // ������ �̸��� ������̰� �ҿ�ð��� 1�ð��� Task ��ü�� �����Ѵ�
       Task task2 = new Task("�", 1);
       task2.setPriority(3);
       task2.setComplexity(2);

       
       // ������ �̸��� ������ �������̰� �ҿ�ð��� 2�ð��� Task ��ü�� �����Ѵ�
       Task task3 = new Task("���� ����", 2);
       task3.setPriority(9);
       task3.setComplexity(5);

       
       System.out.println("�ؾ� �� ���� ���\n");
       System.out.println(task1);
       System.out.println(task2);
       System.out.println(task3);   
   }
}
