package day02.quiz;

public class One {

	public static void main(String[] args) {
		// 1. 5/3 한 결과값을 소수점 둘째 자리 까지 출력해라. (printf 사용)
		double a = 5;
		int b = 3;
		System.out.printf("%.2f", a / b);

		 System.out.printf("%.2f", 5 / 3.0);
		 double d = 5/3;
		 System.out.printf("%.2f\n",d);

		 

		/*
		 * 선생님 답안 
		 * System.out.printf("%f:", (double) 5/3);
		 System.out.printf("%.2f", 5/3);
		 * 쓸모없는 PORT어쩌고 에러뜨던게 f때문이였다. INT를 실수로 출력하려고해서 발생.
		 */

	}

}
