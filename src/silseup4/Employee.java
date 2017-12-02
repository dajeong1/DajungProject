package silseup4;

public class Employee
{
    public String name;			// 이름
    public String department;	// 소속부서

    // 직원의 이름과 소속부서를 각각 주어진 값으로 초기화하면서
    // 새로운 Employee 객체를 생성한다.
    public Employee(String Name, String Department)//super()에 사용
    {
        this.name = Name;
        this.department = Department;
    }

	// 이름을 반환한다
	public String getName(){
        return this.name;
	}

	// 소속부서를 반환하는 메소드를 작성하시오
	public String getDepartment(){
        return this.department;
	}

	// 현 Employee 객체의 이름과 소속부서를 반환하는 메소드를 작성하시오
	public String toString(){
		return "이름: "+this.name+", 소속부서: "+this.department;
	}
 

	// 이름을 변경한다
	public void setName(String Name)
	{
        this.name = Name;
	}

	// 부서 이름 변경
	public void setDepartment(String Department)
	{
        this.department = Department;
	}
}
