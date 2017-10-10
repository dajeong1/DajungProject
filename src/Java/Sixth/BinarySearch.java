package Java.Sixth;

public class BinarySearch {

	public static void main(String[] args) {
		char[] c = {'a', 'c', 'e', 'f', 'i', 'l', 'm', 'o', 'q', 's', 'w'};
		int index;
		
		index = binarySearch(c, 'm');
		System.out.println(index);	
	}
	
	static int binarySearch(char[] d, int key){
		int p;
		int from = 0, to = d.length - 1;
		
		while(from <= to){
			p = (from + to) / 2;
			if(d[p] == key) return p;
			else if (d[p] < key) from = p + 1;
			else to = p - 1;
		}
		return -1;
	}

}
