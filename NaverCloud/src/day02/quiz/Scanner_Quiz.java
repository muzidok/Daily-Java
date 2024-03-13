package day02.quiz;

import java.util.Scanner;

public class Scanner_Quiz {

	public static void main(String[] args) {
		/*
		 * 1. 두 과목 점수를 입력하여 평균 출력하는 프로그램(평균은소수점 이하 첫째자리까지 출력)
		출력 결과) 두 과목의점수 : 70 80
		평균 : 75.0*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번째 점수를 입력해주세요");
		int score = sc.nextInt();
		System.out.println("2번째 점수를 입력해주세요");
		int score2 = sc.nextInt();
		double avg = (score+score2)/2.0;
		
		System.out.printf("%.1f" ,avg);

	}

}
