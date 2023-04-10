package homework;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {


	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(100)+1;
		//int num = new Random().nextInt(100)+1;
		int count=0;
		while(true) {
			count++;
			System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요: ");
			Scanner scanner = new Scanner(System.in);
			int num1 = scanner.nextInt();
			
			
			if(num1<num) {
				System.out.println("정답은 더 큰 수입니다.");
			}else if(num1>num) {
				System.out.println("정답은 더 작은 수입니다.");
			}else {
				System.out.println("정답입니다.");
				
				
				
				break;
			}
		}
		System.out.println("게임을 종료합니다.");
		System.out.println("총 " +count+"번 만에 맞췄습니다.");

	}

}
