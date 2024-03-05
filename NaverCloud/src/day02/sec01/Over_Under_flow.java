package day02.sec01;

public class Over_Under_flow {

	public static void main(String[] args) {
		/* 오버플로우?
		 * 타입이 허용하는 최대값을 벗어나는것
		 * 언더 플로우?
		 * 타입이 허용하는 최소값을 벗어나는것  
		 * 계산결과가 최대값을 넘거나 최소값보다 작을경우 음수는 양수로, 양수는 음수로 바뀌는것을 오버플로우라한다.
		 */
		
	    int num = 10;
	    int maxNum = Integer.MAX_VALUE; // 정수가 가질수 있는 최대값
	    
	    System.out.println(num + 1); // 11
	    System.out.println(maxNum + 1); // -2147483648
	}

}
