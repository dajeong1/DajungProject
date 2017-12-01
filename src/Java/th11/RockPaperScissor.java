package Java.th11;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {

	public static void main(String[] args) {
		int computer, user;
		int flag = 0;//1:이김  -1:짐
		Random r = new Random();
		computer = r.nextInt(3);//0,1,2
		
		System.out.print("선택: 0(가위), 1(바위), 2(보): ");
		Scanner s = new Scanner(System.in);
		user = s.nextInt();
		
		
		System.out.print("당신은 ");
		if(user == 0) System.out.print("가위");
		else if(user == 1) System.out.print("바위");
		else System.out.print("보");
		System.out.println("를 내었습니다.");
		
		System.out.print("컴퓨터는 ");
		if(computer == 0) System.out.print("가위");
		else if(computer == 1) System.out.print("바위");
		else System.out.print("보");
		System.out.println("를 내었습니다.");
		
		
		
		if(computer == user)
			System.out.println("비겼습니다.");
		else {
			if (computer == 0)//가위
				if(user == 1) flag = 1;//바위 (이김)
				else flag = -1;//보 (짐)
			
			else if (computer == 1)//바위
				if(user == 2) flag = 1;//보 (이김)
				else flag = -1;//가위 (짐)
			
			else if (computer == 2)//보
				if(user == 0) flag = 1;//가위 (이김)
				else flag = -1;//바위 (짐)
			
			if(flag == 1) System.out.println("당신이 이겼습니다.");
			else System.out.println("당신이 졌습니다.");		
		
		}
		
	}

}
