package Java.Eighth;

public class SortString {

	public static void main(String[] args) {
		StringBuffer strb = new StringBuffer("BELeaTwZPpqSUv");
		
		System.out.println("정렬 전 : " + strb);
		
		for (int i = 0; i < strb.length(); i++){
			for (int j = 0; j < strb.length() - 1 - i; j++){
				if(strb.charAt(j) > strb.charAt(j+1)){
					char s = strb.charAt(j); //두개의 값을 이용해야 하기때문에 바뀌기 전에 한개의 내용을 저장
					strb.setCharAt(j, strb.charAt(j+1));
					strb.setCharAt(j+1, s);
				}				
			}
		}
		
		System.out.println("정렬 후 : " + strb);
	}

}
