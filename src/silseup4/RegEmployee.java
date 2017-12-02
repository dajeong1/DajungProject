package silseup4;
//정직원
class RegEmployee extends Employee
{									//이름, 부서
   protected double yearlySalary;  	// 연봉
   protected double bonusRate;		// 보너스 지급률

   // 정규직 직원의 이름, 소속부서, 연봉과 보너스 지급률을
   // 각각 주어진 값으로 초기화하면서 RegEmployee 객체를 생성한다
   public RegEmployee (String name, String department, double yearlySalary, double bonusRate)
   {
	   super(name, department);
	   this.yearlySalary = yearlySalary;
	   this.bonusRate = bonusRate;
   }

   // 정규직 직원의 월급을 계산한다
   public double pay()
   {	//“연봉/12*(1+보너스 지급률)
	   return this.yearlySalary / 12 * (1 + this.bonusRate);
   }

   public String toString(){  //4개의 필드값
	   return "이름: "+this.name+", 소속부서: "+this.department+", 연금: "
       +this.yearlySalary+", 보너스지급률: "+this.bonusRate;
   }
}