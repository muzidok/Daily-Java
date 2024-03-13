package day02.quiz;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		//2. 키(double)를 하나 입력받아 160보다 작으면 “small”, 170보다 작으면 “medium”, 180보다 작으면 “large” 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("키를 입력해주세요");
		int height = sc.nextInt();
		
		if(height < 160) {
			System.out.println("small");
		}else if (height < 170) {
			System.out.println("medium");
		}else if(height < 180) {
			System.out.println("large");
		}
		sc.close();
		
		/*선생님 답안.
		 * Scanner...
		 * double d = s.nextDouble();
		 * if()...{}...
		*/

	}

}
