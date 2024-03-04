package day01.sec03;

import java.util.Scanner;

public class Day1_Test {

	public static void main(String[] args) {
		// 1. 10/4 한 결과값을 소수점까지 출력해라
		System.out.println(10/4.0);
		
		// 2. 하나의 정수를 입력받아 그 수의 제곱을 구해라.
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		int num = sc.nextInt();
		System.out.println(num * num);
	
		// 3. a를 4.0, b를 1.2로 초기화하여 4.0 + 1.2를 printf로 출력해라. 
		// 실행 결과) 4.0 + 1.2 = 5.2
		double a = 4.0;
		double b = 1.2;
		System.out.printf("%.1f + %.1f = %.1f\n", a, b, a + b);
	
		//3-1. 앞에서 출력한 5.2를 소수점을 버려라.
		int c = (int) a + (int) b;
		System.out.println(c);
		
		//4. Scanner클래스를 이용하여 이름, 사는 곳, 나이, 체중을 입력받고, 출력하는 프로그램 작성해라.

		/*실행 결과) 입력해라: kim seoul 29 65.5
	      내 이름은 kim이다.
	      사는 곳은 seoul이고, 나이는 29살이다.
	      몸무게는 65.5kg이다.
	      */
		System.out.println("이름, 사는곳, 나이, 몸무게를 하나씩 입력해주세요");
		String name = sc.next();
		String city = sc.next();
		int age = sc.nextInt();
		double weight = sc.nextDouble();
		System.out.println("내 이름은 " + name + "이다");
		System.out.println("사는 곳은 " + city + "이고, 나이는" + age + "이다.");
		System.out.println("몸무게는 " + weight +"이다.");
		
	}

}
