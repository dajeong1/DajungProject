package Java.Seventh;

public class MinMaxFind {
	private int min, max;
	
	MinMaxFind(){
		
	}
	
	IntFair minMax(int[] a){
		min = a[0];
		max = a[0];
		for(int i = 0; i < a.length; i++){//�Ű������� �迭�� �޾Ҵµ� length�� �迭 ���̸� �� �� ����!!
			if (min > a[i])
				min = a[i];
			else if (max < a[i])
				max = a[i];
		}
		
		IntFair result = new IntFair(min, max);
		
		return result;//��ü ��ȯ
	}
	
	public String toString(){
		return "min : " + min + "\n" + "max : " + max;
	}


}
