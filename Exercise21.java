package homework;

import java.util.Scanner;

public class Exercise21 {

	public static void main(String[] args) {
		//입력
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("가로의 길이는?(단위: m): "); 
		double width = scanner.nextDouble();
		System.out.print("세로의 길이는?(단위: m): ");
		double height = scanner.nextDouble();
		
		//처리
		double area = width * height; 
		double parimeter = (width + height) * 2;
		
		//출력
		System.out.println("직사각형의 넓이: " + area);
		System.out.println("직사각형의 둘레: " + parimeter);

	}

}
