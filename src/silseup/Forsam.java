package silseup;

public class Forsam {

	public static void main(String[] args) {
		int i, j=0;
		
		for(i=1; i <=10 ; i++){
			j=j+i;
			System.out.println(i);
			if(i==10){
				System.out.print("=");
				System.out.print(j);
			}
			else
				System.out.print("+");
			System.out.print(j);
		}
	}

}
