package Java.th11;
import java.util.*;
public class ArrayListSize {

	public static void main(String[] args) {
		double sum = 0.0;
		double avg = 0.0;
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(new Double(89.5));
		list.add(new Double(62.0));
		list.add(new Double(96.1));
		list.add(new Double(75.4));
		list.add(new Double(84.0));

		//첫번째 방법
		for(int i = 0; i<list.size(); i++){
			sum += list.get(i);//cast 필요x
		}
		avg = sum / list.size();	
		
		
		sum = 0;
		//두번째 방법
		int count = 0;
		Iterator<Double> it = list.iterator();//타입 파라미터 한쪽만 적기
		while(it.hasNext()){
			sum += it.next();
			count++;
		}
		avg = sum / count;
				
		System.out.println("시험 점수\n합 : " + sum + "\n평균 : " + avg);
	}
}
