package day02.quiz;

import java.util.Scanner;

public class Discount_Quiz {

	public static void main (String[] args) {
		
		/*2. �ð��� ���� ������ �ݾ� �������ִ� ���α׷�
		(�� �ݾ��� 10�������� ����, �ð������� ������ �Է¹ޱ�)
		14�ÿ� ��Ʈ�� �湮�ϰ� ���� ������ 3�� �����̸� 5%�� ����
		18�ÿ� ��Ʈ�� �湮�ϰ� ���� ������ 5�� �����̸� 10%�� ����
		20�ÿ� ��Ʈ�� �湮�ϰ� ���� ������ 10�� �����̸� 20%�� ����
		 */
		int totalPrice = 100000;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ ������ �����ּ���");
		int count = sc.nextInt();
		
		if(count <=3) {
			int price = totalPrice - (int)(totalPrice * 0.05);
			System.out.printf("%d", price);
		}else if ( count <= 5) {
			int price = totalPrice - (int)(totalPrice * 0.10);
			System.out.printf("%d", price);
		}else if (count <= 10) {
			int price = totalPrice - (int)(totalPrice * 0.20);
			System.out.printf("%d", price);
		}
		
}

/* �����Դ��
 * double money = 100000;
 * Scanner sc = new Scanner(System.in);
	
	int time = sc.nextInt();
	
	System.out.println("������ ������ ������ �����ּ���");
	int count = sc.nextInt();
	
	switch(time){
	case 14: 
		if(num <= 3){
			money*0.95;
			}
		break;
		case 18: 
		if(num <= 3){
			money*0.9;
			}
		break;
		case 20: 
		if(num <= 3){
		money*0.8;
			}
		break;
	}
	System.out.println(money);
 * */

}
