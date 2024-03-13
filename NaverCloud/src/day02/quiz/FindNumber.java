package day02.quiz;

import java.util.Scanner;

public class FindNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tryCount = 0;

		while (true) {
			System.out.println("숫자를 입력하세요");
			int input = sc.nextInt();

			if (input > 18) {
				System.out.println(input + "보다 작다!!");
				tryCount++;
			} else if (input < 18) {
				System.out.println(input + "보다 크다!!");
				tryCount++;
			} else if (input == 18) {
				System.out.println("정답이다!!");
				System.out.println("시도한 횟수는" + tryCount + "번 이다");
				break;

			}

		}
	}
}
