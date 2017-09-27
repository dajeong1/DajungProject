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

            System.out.print("���簢���� ���� ���̸� �Է��ϼ���:\t");
            length = scan.nextDouble();
            System.out.print("���簢���� ���� ���̸� �Է��ϼ���:\t");
            width = scan.nextDouble();
            
            scan.close();

            perimeter = calculatePerimeter(length, width);
            area = calculateArea(length, width);
            diagonal = calculateDiagonal(length, width);
 
            System.out.println("�ѷ��� " + perimeter + " �̴�.");
            System.out.println("������ " + area + " �̴�.");
            System.out.println("�밢���� " + diagonal + " �̴�.");
    }
}
