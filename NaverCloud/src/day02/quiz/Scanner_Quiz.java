package day02.quiz;

import java.util.Scanner;

public class Scanner_Quiz {

	public static void main(String[] args) {
		/*
		 * 1. �� ���� ������ �Է��Ͽ� ��� ����ϴ� ���α׷�(������Ҽ��� ���� ù°�ڸ����� ���)
		��� ���) �� ���������� : 70 80
		��� : 75.0*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1��° ������ �Է����ּ���");
		int score = sc.nextInt();
		System.out.println("2��° ������ �Է����ּ���");
		int score2 = sc.nextInt();
		double avg = (score+score2)/2.0;
		
		System.out.printf("%.1f" ,avg);

	}

}
