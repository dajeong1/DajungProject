package silseup2;

public class StaticEx {

	public static void main(String[] args) {
			
				System.out.println("*** �Ա� ����� �ݸ� ***");			
				BankAccount b1 = new BankAccount(1994,"Kim",1000,0.07);
				b1.view();
				BankAccount b2 = new BankAccount(1998,"lee",1000,0.12);
				b2.view();
				BankAccount b3 = new BankAccount(2005,"Park",1000,0.07);
				b3.view();				
			
				System.out.println("\n*** 2017�� ������ �ݸ� ***");
				b1.view();
				b2.view();
				b3.view();
	
				System.out.println("\n*** 0.04�� ������ �ݸ� ***");
			    BankAccount.setRate(0.04);
			    b1.view();
				b2.view();
				b3.view();
	}
}
