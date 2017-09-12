package silseup;

import java.util.Scanner;

public class InputData {

	public static void main(String[] args) {
				Scanner br = new Scanner(System.in);
				
				String name;
				int age;
				double tall;
				float weight;
				char gender;
								
				System.out.print("이름을 입력하시오 : ");		
		        name = br.next();        
				System.out.print("성별을 입력하시오 : ");
		        gender = br.next().charAt(0);       
				System.out.print("나이를 입력하시오 : ");
		        age = br.nextInt();        
				System.out.print("키를 입력하시오 : ");
		        tall = br.nextDouble();        
				System.out.print("체중을 입력하시오 : ");   
		        weight = br.nextFloat();    
						
		        br.close();
				
				System.out.println();
				
				System.out.println("나의 이름은 " + name + "입니다");
				System.out.println("나의 성별은 " + gender + "입니다");
				System.out.println("나의 나이는 " + age + "세 입니다");
				System.out.println("나의 키는 " + tall + "cm 입니다");
				System.out.println("나의 체중은 " + weight + "kg 입니다");

	}

}
