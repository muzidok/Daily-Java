package day02.quiz;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		//2. Ű(double)�� �ϳ� �Է¹޾� 160���� ������ ��small��, 170���� ������ ��medium��, 180���� ������ ��large�� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("Ű�� �Է����ּ���");
		int height = sc.nextInt();
		
		if(height < 160) {
			System.out.println("small");
		}else if (height < 170) {
			System.out.println("medium");
		}else if(height < 180) {
			System.out.println("large");
		}
		sc.close();
		
		/*������ ���.
		 * Scanner...
		 * double d = s.nextDouble();
		 * if()...{}...
		*/

	}

}
