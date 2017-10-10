package Java.Sixth;

public class MatrixSumMulti {

	public static void main(String[] args) {
		int a1[][] = {{2, 1}, {4, 3}};
		int a2[][] = {{6, 2}, {1, 5}};
		
		sum(a1, a2);
		System.out.println();
		multi(a1, a2);
	}
	
	static void sum(int a[][], int b[][]){
		System.out.println("a1 + a2   sum() 角青");
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				System.out.println((i+1) + "青 " + (j+1) + "凯 : " + (a[i][j] + b[i][j]));
			}
		}
	}
	
	
	static void multi(int a[][], int b[][]){
		System.out.println("a1 X a2   multi() 角青");
		int a3[][] = new int[2][2]; 
		
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){			
				for (int k = 0; k < 2; k++) 
	               a3[i][j] += a[i][k] * b[k][j];
	               
			}	
		}
		
		for(int l = 0; l < 2; l++)
			for(int j = 0; j < 2; j++)
				System.out.println((l+1) + "青 " + (j+1) + "凯 : " + a3[l][j]);
	}	
}
