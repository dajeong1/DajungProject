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

		//ù��° ���
		for(int i = 0; i<list.size(); i++){
			sum += list.get(i);//cast �ʿ�x
		}
		avg = sum / list.size();	
		
		
		sum = 0;
		//�ι�° ���
		int count = 0;
		Iterator<Double> it = list.iterator();//Ÿ�� �Ķ���� ���ʸ� ����
		while(it.hasNext()){
			sum += it.next();
			count++;
		}
		avg = sum / count;
				
		System.out.println("���� ����\n�� : " + sum + "\n��� : " + avg);
	}
}
