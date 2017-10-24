package silseup2;

public class StaticMember {

	public static void main(String[] args) {
		CurrentConverter r = new CurrentConverter();
		r.setRate(1215);
		
		System.out.println("백만원은"+r.toDollar(1000000)+"달러입니다.");
		System.out.println("백달러는"+r.toKWR(100)+"원입니다.");
	}
}
