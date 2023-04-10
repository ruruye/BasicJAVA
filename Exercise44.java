package homework;

import java.util.Scanner;

public class Exercise44 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위 바위 보 게임");
		
		System.out.print("철수: ");
		String a = scanner.nextLine();
		System.out.print("영희: ");
		String b = scanner.nextLine();
		
		if (a.equals(b)) {
			System.out.println("비겼습니다");
		} else if ("바위".equals(a) && "가위".equals(b) || "보".equals(a) && "주먹".equals(b) ||  "가위".equals(a) && "보".equals(b)) {
			System.out.println("결과: 철수 승리!");
		} else {
			System.out.println("결과: 영희 승리!");

	}
  }
}

//else if (a.equals("가위") && b.equals("바위") || a.equals("바위") && b.equals("보") || a.equals("보") && b.equals("가위")){
//System.out.println("결과: 영희 승리!");
//}