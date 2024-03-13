package day02.quiz;

import java.util.Scanner;

public class Discount_Quiz {

	public static void main (String[] args) {
		
		/*2. 시간과 물건 개수로 금액 할인해주는 프로그램
		(총 금액은 10만원으로 설정, 시간과물건 개수는 입력받기)
		14시에 마트를 방문하고 물건 개수가 3개 이하이면 5%로 할인
		18시에 마트를 방문하고 물건 개수가 5개 이하이면 10%로 할인
		20시에 마트를 방문하고 물건 개수가 10개 이하이면 20%로 할인
		 */
		int totalPrice = 100000;
		Scanner sc = new Scanner(System.in);
		System.out.println("구매할 물건의 개수를 적어주세요");
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

/* 선생님답안
 * double money = 100000;
 * Scanner sc = new Scanner(System.in);
	
	int time = sc.nextInt();
	
	System.out.println("구매할 물건의 개수를 적어주세요");
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
