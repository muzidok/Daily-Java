package day03;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 1.
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		int sum1 = 0;
		int i =1;
		while(true) {
			sum1 += i;
			i++;
		if(i > 10) {
			break;
		}
		}
		System.out.println(sum1);
		
		int sum2 = 0;
		int i1 = 1;
		do {
			sum += i1;
			i1++;
		}while(i1<=10);
		System.out.println(sum1);
		
		// 2. while���� �̿��Ͽ� ������ ������ �Է¹ް� ����� ���.
		// 0�� �ԷµǸ� �Է��� ����
		Scanner s = new Scanner(System.in);
		int [] arr = new int[5];
		int sum3 = 0;
		
		for(int i2 =0; i2<arr.length;i2++) {
		System.out.println( i +"��° ���ڸ� �Է��ϼ���");
		int input = s.nextInt();
		sum3 += input;
		if(input == 0) {
			System.out.println("0�� ��ź�̾�");
			break;
		}
		}
		System.out.println("��հ��� " + sum3/arr.length);
		
		/*
		int count = 0;
		int totalScore = 0;

		while (true) {
		int input = sc.nextInt();

		if (input == 0) break;

		count++;
		totalScore += input;
		}
		System.out.println("��� : " + totalScore/count);
		}
		}
		*/

	}

}
