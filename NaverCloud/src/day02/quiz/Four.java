package day02.quiz;

public class Four {

	public static void main(String[] args) {
	//4.1 1~50 정수 중 6의 배수를 출력해라.(for, if)
	for(int i =1; i<=50; i++) {
		if(i % 6 == 0) {
		System.out.println(i);
	}
			
	//4.2 1~50까지의 총합 출력해라.
	int sum = 0;
	for(int j = 1; j <= 50; j++) {
			sum += j;
		}
	System.out.println(sum);
		}		
	
	//4.3 1~50 정수를 random함수로 범위 설정 한 후 무작위 수 하나(난수)출력해라.
	System.out.println((int)(Math.random()*51));
	
	}

}
