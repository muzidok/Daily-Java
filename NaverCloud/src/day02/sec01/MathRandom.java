package day02.sec01;

import java.util.Scanner;

public class MathRandom {

	public static void main(String[] args) {
		// 4~12까지 수를 랜덤으로 출력
		int n = (int) (Math.random() * 9) + 4;// 왜 *10이 아닐까? 생각해보니 9를 곱하면 0~8까지고 4부터 출력이니까 0에4를 더해야함. 8에4를더해야 12고.
		// System.out.println(n);

		switch (n) {
		case 4:
			System.out.println("1");
			break;
		}

///////////////////////////////////////////////////////////////////

		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳입력");
		String day = sc.next();
		char ch = sc.next().charAt(0);

		switch (ch) {
		case 'M':
			System.out.println("MOVIE");
			break;
		case 'G':
			System.out.println("GAME");
			break;// break가 없으면 다음꺼까지출력된다.
		case 'C':
			System.out.println("CLIME");
			break;
		default:
			System.out.println("응 없어");
		}

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " 너구리");
		}
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i + " 오소리");
		}

	}

}
