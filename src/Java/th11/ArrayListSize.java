package Java.th11;
import java.util.*;
public class ArrayListSize {

	public static void main(String[] args) {
		double sum = 0.0;
		double avg = 0.0;
		ArrayList<Double> list = new ArrayList<Double>();//생성자의 매개변수 = ArrayList의 size
		list.add(new Double(89.5));
		list.add(new Double(62.0));
		list.add(new Double(96.1));
		list.add(new Double(75.4));
		list.add(new Double(84.0));

		for(int i = 0; i<list.size(); i++){
			sum += list.get(i);//cast 필요x
		}
		avg = sum / list.size();	
		
		
		sum = 0;
		
		int count = 0;
		Iterator<Double> it = list.iterator();
		while(it.hasNext()){
			sum += it.next();
			count++;
		}
		avg = sum / count;
				
		System.out.println("시험 점수\n합 : " + sum + "\n평균 : " + avg);
	}
}
