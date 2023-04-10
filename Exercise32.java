package homework;

import java.util.Scanner;

public class Exercise32 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수도입니까?(수도: 1, 수도아님: 0) ");
        int c = scanner.nextInt();
        System.out.print("총 인구는?(단위: 만) ");
        int p = scanner.nextInt();
        System.out.print("연소득이 1억 이상인 인구는?(단위: 만) ");
        int i = scanner.nextInt();
		
        String result = (c==1 && p>=100) || i>=50 ? "메트로폴리스입니다." : "메트로폴리스가 아닙니다.";
        System.out.println("이 도시는 " + result );
	}

}
