package Java.th11;
import java.util.*;
public class ArrayListPrint {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Character('d'));
		list.add(new Double(5.2));
		list.add(new Integer(1));
		list.add(new Character('c'));
		list.add(new Integer(7));
		list.add(new Double(7.5));
		list.add(5);//원시형도 가능하긴하나 객체형으로!!
		
		
		//순차적 출력 세가지 방법
		System.out.println(list); 
		
		
		for(int i = 0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		Iterator it = list.iterator();//★
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}
}
