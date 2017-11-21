package silseup3;

class RegEmployee extends Employee
{
   protected double yearlySalary;     // 연봉
   protected double bonusRate;      // 보너스 지급률

   // 정규직 직원의 이름, 소속부서, 연봉과 보너스 지급률을
   // 각각 주어진 값으로 초기화하면서 RegEmployee 객체를 생성한다
   public RegEmployee (String name, String department, double yearlySalary, double bonusRate)
   {
      super(name, department);
      this.yearlySalary = yearlySalary;
      this.bonusRate = bonusRate;
   }

   // 정규직 직원의 월급을 계산한다
   public double pay ()
   {
       return (yearlySalary/12.0*(1.0 + bonusRate));
   }

   public String toString() {
      return "이름 : " + name + ", 소속부서: " + department + ", 연봉: " + yearlySalary + ", 보너스지급률: " + bonusRate + ", 월급액:" + pay();
   }
}