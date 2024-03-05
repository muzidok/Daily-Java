package day02.sec01;

import java.util.Scanner;

public class LoopStatement {

	public static void main(String[] args) {
		// for 반복문
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 6 == 0) {
				System.out.println(i);
			}
		}
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i; // 예상: 2의 배수들을 누적해서 더한값?
			}
		}
		System.out.println(sum);

		for (int i = 1; i <= 15; i++) {
			System.out.print("*");
			if (i % 5 == 0) {
				System.out.println(); // enter -> 5개 출력하고 줄을 바꿔서 출력하라
			}
		}

		// while 반복문
		// 정해진 횟수만큼 반복한다. 하지만 조건문이 true일 경우 무한반복문이 되고 조건이 false가 되면 반복을 종료한다.
		Scanner s = new Scanner(System.in);
		int sum1 = 0, n = 100;

		while (n != 0) {
			System.out.println("입력해주세요");
			n = s.nextInt();
			sum1 += n;
		}
		System.out.println(sum1);

		s.close();

		// 무한 반복문

		while (true) { // 무한반복문 -> 멈추도록 제어하는 문자: break!!!!
			System.err.println("이름 입력");
			String name = s.next();

			//if(name == "길동") // 문자열이라서 이거 안된다
			// 문자열 비교는 ==이 아닌 equals함수를 사용해야한다.
			if (name.equals("길동")) {
				break; // 무한반복문 종료(if문을 종료하는게아니야)
			}
		}

		// continue를 사용해서 특정 조건 제외
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개 입력");
		int sum3 = 0;

		for(int i = 1; i <= 5; i++) {
			int n1 = sc.nextInt(); //5회 입력
			if(n1<0) {
				continue; // 제외(올라가서 반복문 다시실행)
			}else { // n >=0
				sum3 += n1;
			}
			System.out.println(sum);
		}

	}

}
