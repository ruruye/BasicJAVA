package homework;

import java.util.Scanner;

public class Exercise25 {

	public static void main(String[] args) {
		//입력
		Scanner scanner = new Scanner(System.in);
					
		System.out.print("500원짜리 동전의 갯수: ");
		int c1 = scanner.nextInt();
		System.out.print("100원짜리 동전의 갯수: ");
		int c2 = scanner.nextInt();
		System.out.print("50원짜리 동전의 갯수: ");
		int c3 = scanner.nextInt();
		System.out.print("10원짜리 동전의 갯수: ");
		int c4 = scanner.nextInt();
		
		int total = (c1*500 + c2*100 + c3*50 + c4*10);
		
		//출력
		System.out.println("저금통 안의 동전의 총 액수: " + total);
		
		
		
		

	}

}
