package day02.quiz;

import java.util.Scanner;

public class FindNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tryCount = 0;

		while (true) {
			System.out.println("���ڸ� �Է��ϼ���");
			int input = sc.nextInt();

			if (input > 18) {
				System.out.println(input + "���� �۴�!!");
				tryCount++;
			} else if (input < 18) {
				System.out.println(input + "���� ũ��!!");
				tryCount++;
			} else if (input == 18) {
				System.out.println("�����̴�!!");
				System.out.println("�õ��� Ƚ����" + tryCount + "�� �̴�");
				break;

			}

		}
	}
}
