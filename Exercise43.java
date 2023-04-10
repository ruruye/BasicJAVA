package homework;

import java.util.Scanner;

public class Exercise43 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		
		System.out.print("프로그래밍 기초: ");
		int a = scanner.nextInt();
		System.out.print("데이터베이스: ");
		int b = scanner.nextInt();
		System.out.print("화면 구현: ");
		int c = scanner.nextInt();
		System.out.print("애플리케이션 구현: ");
		int d = scanner.nextInt();
		System.out.print("머신러닝: ");
		int e = scanner.nextInt();
		
		int sum = a+b+c+d+e;
		double avg = sum/5.0;
		char grade = 0;
		
		System.out.println("총점: " +sum);
		System.out.println("평균: " +avg);
		System.out.print("학점: " +grade);
		
		if (avg>=90) {
			System.out.print("A");
		}else if(avg>=80) {
			System.out.print("B");
		}else if(avg>=70) {
			System.out.print("C");
		}else if(avg>=60) {
			System.out.print("D");
		}else {
			System.out.print("F");
		}
		
		
	}
}