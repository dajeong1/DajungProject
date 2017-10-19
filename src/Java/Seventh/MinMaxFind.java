package Java.Seventh;

public class MinMaxFind {
	private int min, max;
	
	MinMaxFind(){
		
	}
	
	IntFair minMax(int[] a){
		min = a[0];
		max = a[0];
		for(int i = 0; i < a.length; i++){//매개변수로 배열을 받았는데 length로 배열 길이를 알 수 있음!!
			if (min > a[i])
				min = a[i];
			else if (max < a[i])
				max = a[i];
		}
		
		IntFair result = new IntFair(min, max);
		
		return result;//객체 반환
	}
	
	public String toString(){
		return "min : " + min + "\n" + "max : " + max;
	}


}
