package day02.sec01;

import java.util.Scanner;

public class Quiz_99dan {

	public static void main(String[] args) {
		// ������ ������
		Scanner sc = new Scanner(System.in);

		System.out.println("���?");
		int dan = sc.nextInt();
		for (int i = 9; i >= 1; i--) {
			System.out.println(dan + "*" + dan + "=" + dan * i);
		}

		switch (dan) {
		case 3:
			for (int i = 1; i <= 9; i++) {
				System.out.println(3 * i);
			}
			break;
		case 4:
			for (int i = 1; i <= 9; i++) {
				System.out.println(4 * i);
			}
			break;
		default:
			System.out.println("������ ����");
		}

	}

}
