package silseup;

import java.util.Scanner;

public class CalRectangle {

    static double calculatePerimeter(double length, double width){
            return (2 * (length + width));
    }

    static double calculateArea(double length, double width){
    	return (length * width);
    }
    
    static double calculateDiagonal(double length, double width){
    	return Math.sqrt(length * length + width * width);
    }

    public static void main(String[] args) {
            double length, width;
            double perimeter, area, diagonal;
         
            Scanner scan = new Scanner(System.in);

            System.out.print("직사각형의 가로 길이를 입력하세요:\t");
            length = scan.nextDouble();
            System.out.print("직사각형의 세로 길이를 입력하세요:\t");
            width = scan.nextDouble();
            
            scan.close();

            perimeter = calculatePerimeter(length, width);
            area = calculateArea(length, width);
            diagonal = calculateDiagonal(length, width);
 
            System.out.println("둘레는 " + perimeter + " 이다.");
            System.out.println("면적은 " + area + " 이다.");
            System.out.println("대각선은 " + diagonal + " 이다.");
    }
}
