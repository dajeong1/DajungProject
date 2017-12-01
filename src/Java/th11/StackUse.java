package Java.th11;
import java.util.*;

public class StackUse {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(new String("1st"));
		s.push("2nd");
		s.push("3rd");
		
		String a;
		while(!s.empty()){
			a = (String)s.pop();
			System.out.println(a);
		}
	}

}
