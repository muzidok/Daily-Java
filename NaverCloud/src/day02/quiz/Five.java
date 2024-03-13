package day02.quiz;

import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		// 5. a=10, b=20으로 초기화하고, 연산자(+,-,*,/)중 하나를 입력받는다. +이면 두수의 합, -이면 차, *이면 곱, /이면
		// 몫을 구하여 출력해라.(switch-case문 사용)

		int a = 10, b = 20;
		Scanner s = new Scanner(System.in);
		System.out.println("+,-,*,/ 중 하나를 입력해주세요");
		String insertValue = s.next();

		switch (insertValue) {
		case "+":
			System.out.println(a + b);
			break;
		case "-":
			System.out.println(a - b);
			break;
		case "*":
			System.out.println(a * b);
			break;
		case "/":
			System.out.println(a / b);
			break;
		}

	}

}

/*
 * 선생님 답안 int a = 10, b = 20; Scanner s = new Scanner(System.in); char ch =
 * s.next().charAt(0);
 * 
 * switch(ch){ case '+' : System.out.println(a+b); break; ... 반복
 */

// 나의 시도 1
// CharAt(0) 으로 푸는데 에러남.

// 나의 시도 2
// 안되는 이유 문자열은 == 으로 안되고 equals()함수 써야한다고!!!!
// int a = 10, b =20;
// Scanner s = new Scanner(System.in);
// System.out.println("+,-,*,/ 중 하나를 입력해주세요");
// String insertValue = s.next();
//
// if(insertValue == "+") {
// System.out.println(a + b);
// }else if(insertValue == "-") {
// System.out.println(a - b);
// }else if(insertValue == "*") {
// System.out.println(a * b);
// }else if(insertValue == "/") {
// System.out.println(a / b);
// }

// 나의 시도 3 -> 에러가 나는데 이유를 모르겠다.
// int a = 10, b =20;
// Scanner s = new Scanner(System.in);
// System.out.println("+,-,*,/ 중 하나를 입력해주세요");
// String insertValue = s.next();
//
// if(insertValue.equals("+")) {
// System.out.println(a + b);
// }else if(insertValue.equals("-")) {
// System.out.println(a - b);
// }else if(insertValue.equals("*")) {
// System.out.println(a * b);
// }else if(insertValue.equals("/")) {
// System.out.println(a / b);
// }
