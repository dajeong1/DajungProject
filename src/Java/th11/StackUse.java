package Java.th11;
import java.util.*;

public class StackUse {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push(new String("1st"));
		s.push("2nd");
		s.push("3rd");
		
		String a;
		while(!s.empty()){
			a = s.pop();//cast ÇÊ¿äx
			System.out.println(a);
		}
	}

}
