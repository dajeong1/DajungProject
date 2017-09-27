package silseup;

public class SalesRevenue {

	public static void main(String[] args) {
		int aa[][] = {{90,90,110,110}, {120,110,100,110}, {120,140,130,150}};
		double sum = 0;
		
		for (int i = 0; i < aa.length; i++){
			for (int j = 0; j < aa[i].length; j++){
				sum = sum + aa[i][j];
			}
		}
		System.out.println("지난 3년간 매출 총액은 " + sum + "이며, 연평균 매출은 " + sum/aa.length + "입니다.");		
	}
}
