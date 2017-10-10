package Java.Sixth;

public class Sort {

	public static void main(String[] args) {
		int[] a = {8, 23, 32, 14, 7, 18, 30, 2};	
		int i, j, tmp;
		
		for (i = 0; i < a.length; i++){
			for (j = 0; j < a.length - 1; j++){
				if(a[j] > a[j+1]){
					tmp=a[j];
					a[j]=a[j+1];
					a[j+1]=tmp;
				}				
			}
		}

		System.out.print("Á¤·Ä : ");
		for(i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		
	}
}
