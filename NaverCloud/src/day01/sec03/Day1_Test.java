package day01.sec03;

import java.util.Scanner;

public class Day1_Test {

	public static void main(String[] args) {
		// 1. 10/4 �� ������� �Ҽ������� ����ض�
		System.out.println(10/4.0);
		
		// 2. �ϳ��� ������ �Է¹޾� �� ���� ������ ���ض�.
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ���");
		int num = sc.nextInt();
		System.out.println(num * num);
	
		// 3. a�� 4.0, b�� 1.2�� �ʱ�ȭ�Ͽ� 4.0 + 1.2�� printf�� ����ض�. 
		// ���� ���) 4.0 + 1.2 = 5.2
		double a = 4.0;
		double b = 1.2;
		System.out.printf("%.1f + %.1f = %.1f\n", a, b, a + b);
	
		//3-1. �տ��� ����� 5.2�� �Ҽ����� ������.
		int c = (int) a + (int) b;
		System.out.println(c);
		
		//4. ScannerŬ������ �̿��Ͽ� �̸�, ��� ��, ����, ü���� �Է¹ް�, ����ϴ� ���α׷� �ۼ��ض�.

		/*���� ���) �Է��ض�: kim seoul 29 65.5
	      �� �̸��� kim�̴�.
	      ��� ���� seoul�̰�, ���̴� 29���̴�.
	      �����Դ� 65.5kg�̴�.
	      */
		System.out.println("�̸�, ��°�, ����, �����Ը� �ϳ��� �Է����ּ���");
		String name = sc.next();
		String city = sc.next();
		int age = sc.nextInt();
		double weight = sc.nextDouble();
		System.out.println("�� �̸��� " + name + "�̴�");
		System.out.println("��� ���� " + city + "�̰�, ���̴�" + age + "�̴�.");
		System.out.println("�����Դ� " + weight +"�̴�.");
		
	}

}
