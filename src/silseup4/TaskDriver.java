package silseup4;

//난이도를 명확하게 배정할 수 있는 객체에 대한 인터페이스를 나타낸다.
interface Complexity
{	
	public abstract void setComplexity (int complexity);// 난이도를 변경한다
	public abstract int getComplexity();// 난이도를 알려준다
}

// 우선순위를 명백하게 할당할 수 있는 객체를 위한 인터페이스를 나타낸다.
interface Priority
{
	public abstract void setPriority(int priority);// 우선순위를 변경한다
	public abstract int getPriority();// 우선순위를 알려준다
}

// 과업을 모델한다
class Task implements Priority, Complexity
{
   private String name;		// 이름
   private int time;		// 소요 시간
   private int priority;    // 우선순위
   private int complexity;	// 난이도

   // 과업의 이름과 소요시간을 을 주어진 값으로 초기화하고 
   // 우선순위와 난이도를 1로 정한 Task 객체를 생성한다
   public Task(String taskName, int taskTime)
   {
      this.name = taskName;
      this.time = taskTime;
      this.priority = 1;
      this.complexity = 1;
   }

   // 과업의 이름을 반환한다
   public String getName()
   {
      return this.name;
   }

   // 과업의 소요시간을 반환한다
   public int getTime()
   {
      return this.time;
   }

   // 과업의 우선순위를 반환한다
   public int getPriority()
   {
      return this.priority;
   }

   // 과업의 난이도를 반환한다
   public int getComplexity()
   {
      return this.complexity;
   }

   // 모범출력과 같이 toString메소드를 사용하여 객체의 모든 데이터를 반환한다.
   public String toString()
   {
       return "이름 = "+name+"\n소요 시간  = "+time+"\n우선 순위 = "+priority+"\n난이도 = "+complexity+"\n";
   }

   // 과업의 이름을 변경한다
   public void setName(String newName)
   {
      this.name = newName;
   }

   // 과업의 소요시간을 변경한다
   public void setTime(int newTime)
   {
      this.time = newTime;
   }

   // 과업의 우선순위를 변경한다
   public void setPriority(int newPriority)
   {
      this.priority = newPriority;
   }

   // 과업의 난이도를 변경한다
   public void setComplexity(int newComplexity)
   {
      this.complexity = newComplexity;
   }
}
   

// Task 객체들을 만들어 이용한다
public class TaskDriver
{
   public static void main(String args[])
   {
	   // 과업의 이름이 “프로그램 작성”이고 소요시간이 7시간인 Task 객체를 생성한다
       Task task1 = new Task("프로그램 작성", 7);
       task1.setPriority(7);//우선순위를 7로 변경
       task1.setComplexity(10);//난이도를 10으로 변경

   
       // 과업의 이름이 “운동”이고 소요시간이 1시간인 Task 객체를 생성한다
       Task task2 = new Task("운동", 1);
       task2.setPriority(3);
       task2.setComplexity(2);

       
       // 과업의 이름이 “강의 수강”이고 소요시간이 2시간인 Task 객체를 생성한다
       Task task3 = new Task("강의 수강", 2);
       task3.setPriority(9);
       task3.setComplexity(5);

       
       System.out.println("해야 할 일의 목록\n");
       System.out.println(task1);
       System.out.println(task2);
       System.out.println(task3);   
   }
}
