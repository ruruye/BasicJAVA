package homework;

import java.util.Scanner;

public class Exercise42_ {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력해");
		int season = scanner.nextInt();
		
		if(season>=3 && season<=5) {
			System.out.println(season + "월은 봄입니다.");
		}else if(season>=6 && season<=8) {
			System.out.println(season + "월은 여름입니다.");
		}else if(season>=9 && season<=11) {
			System.out.println(season + "월은 가을입니다.");
		}else if(season<=2 || season==12) {
			System.out.println(season + "월은 겨울입니다.");
		}else {
			System.out.print(season + "월은 잘못된 입력입니다.");
		}

	}

}
