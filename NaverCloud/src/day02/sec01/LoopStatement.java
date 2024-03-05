package day02.sec01;

import java.util.Scanner;

public class LoopStatement {

	public static void main(String[] args) {
		// for �ݺ���
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 6 == 0) {
				System.out.println(i);
			}
		}
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i; // ����: 2�� ������� �����ؼ� ���Ѱ�?
			}
		}
		System.out.println(sum);

		for (int i = 1; i <= 15; i++) {
			System.out.print("*");
			if (i % 5 == 0) {
				System.out.println(); // enter -> 5�� ����ϰ� ���� �ٲ㼭 ����϶�
			}
		}

		// while �ݺ���
		// ������ Ƚ����ŭ �ݺ��Ѵ�. ������ ���ǹ��� true�� ��� ���ѹݺ����� �ǰ� ������ false�� �Ǹ� �ݺ��� �����Ѵ�.
		Scanner s = new Scanner(System.in);
		int sum1 = 0, n = 100;

		while (n != 0) {
			System.out.println("�Է����ּ���");
			n = s.nextInt();
			sum1 += n;
		}
		System.out.println(sum1);

		s.close();

		// ���� �ݺ���

		while (true) { // ���ѹݺ��� -> ���ߵ��� �����ϴ� ����: break!!!!
			System.err.println("�̸� �Է�");
			String name = s.next();

			//if(name == "�浿") // ���ڿ��̶� �̰� �ȵȴ�
			// ���ڿ� �񱳴� ==�� �ƴ� equals�Լ��� ����ؾ��Ѵ�.
			if (name.equals("�浿")) {
				break; // ���ѹݺ��� ����(if���� �����ϴ°ԾƴϾ�)
			}
		}

		// continue�� ����ؼ� Ư�� ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 5�� �Է�");
		int sum3 = 0;

		for(int i = 1; i <= 5; i++) {
			int n1 = sc.nextInt(); //5ȸ �Է�
			if(n1<0) {
				continue; // ����(�ö󰡼� �ݺ��� �ٽý���)
			}else { // n >=0
				sum3 += n1;
			}
			System.out.println(sum);
		}

	}

}
