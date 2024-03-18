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
		
		// 2. while문을 이용하여 정수를 여러개 입력받고 평균을 출력.
		// 0이 입력되면 입력이 종료
		Scanner s = new Scanner(System.in);
		int [] arr = new int[5];
		int sum3 = 0;
		
		for(int i2 =0; i2<arr.length;i2++) {
		System.out.println( i +"번째 숫자를 입력하세요");
		int input = s.nextInt();
		sum3 += input;
		if(input == 0) {
			System.out.println("0은 폭탄이야");
			break;
		}
		}
		System.out.println("평균값은 " + sum3/arr.length);
		
		/*
		int count = 0;
		int totalScore = 0;

		while (true) {
		int input = sc.nextInt();

		if (input == 0) break;

		count++;
		totalScore += input;
		}
		System.out.println("평균 : " + totalScore/count);
		}
		}
		*/

	}

}
