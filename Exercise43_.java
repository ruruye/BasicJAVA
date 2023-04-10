package homework;

import java.util.Scanner;

public class Exercise43_ {

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
		String grade;
		
		if (avg>=90) {
			grade = "A";
		}else if(avg>=80) {
			grade = "B";
		}else if(avg>=70) {
			grade = "C";
		}else if(avg>=60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		
		System.out.println("총점: " +sum);
		System.out.println("평균: " +avg);
		System.out.print("학점: " + grade);
	}
}