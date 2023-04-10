package homework;

import java.util.Scanner;

public class Exercise24 {

	public static void main(String[] args) {
		//입력
		Scanner scanner = new Scanner(System.in);
			
	    System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위: cm): "); 
	    double r = scanner.nextDouble();
		System.out.print("원기둥의 높이를 입력하시오.(단위: cm): ");
		double h = scanner.nextDouble();
		
		double area = r * r * Math.PI;  // 반지름*반지름*원주율
	    double volume = area *  h ;      // 원기둥 밑변넓이 * 높이 
		
		//출력
		System.out.println("원기둥 밑변의 넓이는 " + area + "cm²고, " + "원기둥의 부피는 " + volume + "cm³다.");
	}

}
