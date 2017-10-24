package silseup2;

public class BankAccount {
	int year;
	String name;
	int money;
	static double rate;

	public BankAccount(int year, String name, int money, double r){
		this.year = year;
		this.name = name;
		this.money = money;
		rate = r;
	}
	
	public static void setRate(double r) { 
		if(r < 0.02 || r > 0.12){
			System.out.println("금리를 확인하고 가실께요~");
			System.exit(0);
		}
			rate = r;
		}

		public void view(){
			System.out.println(year+"\t"+name+"\t"+money+"\t"+rate);
		}
}
