package homework;

import java.util.Scanner;

public class Exercise43_switch {

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
		
		char grade;
		switch ((int) avg / 10) {
		case 10: case 9:
			grade = 'A';
			break;
		case  8:
			grade = 'B';
			break;
		case  7:
			grade = 'C';
			break;
		case  6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
			
	}
	System.out.println("총점: " +sum);
	System.out.println("평균: " +avg);
	System.out.print("학점: " + grade);	

  }
}