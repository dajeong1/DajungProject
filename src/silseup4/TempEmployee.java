package silseup4;
//계약직 직원
class TempEmployee extends Employee
{								//이름, 부서
   protected double payRate;	//시간당 임금
   private int hoursWorked;		//근무시간

   // 계약직직원의 이름, 소속부서, 시간당 임금을 주어진 값으로 초기화하고
   // 근무 시간은 0으로 초기화하면서 TempEmployee 객체를 생성한다
   public TempEmployee (String name, String department, double payRate)
   {
	   super(name, department);
	   this.payRate = payRate;
	   this.hoursWorked = 0;
   }

   // 계약직 직원의 월급을 계산한다, 일한 시간은 0으로
   public double pay()
   {
	   double allHours = this.hoursWorked;
	   this.hoursWorked = 0;
       return this.payRate * allHours;
       //임금*근무시간
   }

   // 계약직 직원의 추가 근무시간을 누적돤 근무시간에 더한다
   public void addHours (int moreHours)
   {
        this.hoursWorked += moreHours;
   }

   public String toString(){
	   return "이름: "+this.name+", 소속부서: "+this.department+", 시간당임금: "
       +this.payRate+", 근무시간: "+this.hoursWorked;
   }
}



