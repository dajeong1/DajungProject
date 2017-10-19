package Java.Seventh;

public class MinMaxUse {

	public static void main(String[] args) {
		int[] arr = {3, 6, 8, 25, 16, 31, 17};
		MinMaxFind a = new MinMaxFind();
		System.out.println(a.minMax(arr));//IntFair 객체, toString 호출/ 정수쌍으로 결과 출력
		System.out.println(a);//MinMaxFind 객체, toString 호출 (minMax()호출을 해야 값을 가짐)/ min,max값을 toString으로 출력
	}

}
