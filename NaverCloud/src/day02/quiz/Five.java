package day02.quiz;

import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		// 5. a=10, b=20���� �ʱ�ȭ�ϰ�, ������(+,-,*,/)�� �ϳ��� �Է¹޴´�. +�̸� �μ��� ��, -�̸� ��, *�̸� ��, /�̸�
		// ���� ���Ͽ� ����ض�.(switch-case�� ���)

		int a = 10, b = 20;
		Scanner s = new Scanner(System.in);
		System.out.println("+,-,*,/ �� �ϳ��� �Է����ּ���");
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
 * ������ ��� int a = 10, b = 20; Scanner s = new Scanner(System.in); char ch =
 * s.next().charAt(0);
 * 
 * switch(ch){ case '+' : System.out.println(a+b); break; ... �ݺ�
 */

// ���� �õ� 1
// CharAt(0) ���� Ǫ�µ� ������.

// ���� �õ� 2
// �ȵǴ� ���� ���ڿ��� == ���� �ȵǰ� equals()�Լ� ����Ѵٰ�!!!!
// int a = 10, b =20;
// Scanner s = new Scanner(System.in);
// System.out.println("+,-,*,/ �� �ϳ��� �Է����ּ���");
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

// ���� �õ� 3 -> ������ ���µ� ������ �𸣰ڴ�.
// int a = 10, b =20;
// Scanner s = new Scanner(System.in);
// System.out.println("+,-,*,/ �� �ϳ��� �Է����ּ���");
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
