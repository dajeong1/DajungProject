package silseup2;

public class StaticEx {

	public static void main(String[] args) {
			
				System.out.println("*** 입금 당시의 금리 ***");			
				BankAccount b1 = new BankAccount(1994,"Kim",1000,0.07);
				b1.view();
				BankAccount b2 = new BankAccount(1998,"lee",1000,0.12);
				b2.view();
				BankAccount b3 = new BankAccount(2005,"Park",1000,0.07);
				b3.view();				
			
				System.out.println("\n*** 2017년 현재의 금리 ***");
				b1.view();
				b2.view();
				b3.view();
	
				System.out.println("\n*** 0.04로 변동된 금리 ***");
			    BankAccount.setRate(0.04);
			    b1.view();
				b2.view();
				b3.view();
	}
}
