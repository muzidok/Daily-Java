package day02.sec01;

import java.util.Scanner;

public class MathRandom {

	public static void main(String[] args) {
		// 4~12���� ���� �������� ���
		int n = (int) (Math.random() * 9) + 4;// �� *10�� �ƴұ�? �����غ��� 9�� ���ϸ� 0~8������ 4���� ����̴ϱ� 0��4�� ���ؾ���. 8��4�����ؾ� 12��.
		// System.out.println(n);

		switch (n) {
		case 4:
			System.out.println("1");
			break;
		}

///////////////////////////////////////////////////////////////////

		Scanner sc = new Scanner(System.in);
		System.out.println("���ĺ��Է�");
		String day = sc.next();
		char ch = sc.next().charAt(0);

		switch (ch) {
		case 'M':
			System.out.println("MOVIE");
			break;
		case 'G':
			System.out.println("GAME");
			break;// break�� ������ ������������µȴ�.
		case 'C':
			System.out.println("CLIME");
			break;
		default:
			System.out.println("�� ����");
		}

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " �ʱ���");
		}
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i + " ���Ҹ�");
		}

	}

}
