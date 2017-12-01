package Java.th11;

public class CharIsDisit {

	public static void main(String[] args) {
		char a[] = {'a', 'B', '1', '5', 'C', '7'};
		for (int i = 0; i < a.length; i++){
			if (Character.isLowerCase(a[i]))
				System.out.println(a[i] + " : lowercase");
			else if (Character.isUpperCase(a[i]))
				System.out.println(a[i] + " : uppercase");
			else if (Character.isDigit(a[i]))
				System.out.println(a[i] + " : digit");	
		}
		
	}
}
