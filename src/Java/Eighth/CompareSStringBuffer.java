package Java.Eighth;

public class CompareSStringBuffer {

	public static void main(String[] args) {
		String s1 = "abc";
		System.out.println(s1.replace('b', 'x'));
		System.out.println(s1);
		
		System.out.println();
		
		StringBuffer s2 = new StringBuffer("Java ");
		s2.append("is easy");
		System.out.println(s2);
	}

}
