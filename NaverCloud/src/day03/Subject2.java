package day03;

public class Subject2 {

	public static void main(String[] args) {
		// 1. 중첩반복문으로 5단부터 9단까지 출력
		for(int i =5; i <= 9; i++) {
			System.out.println(i + "단");
			for(int j =1; j <=9; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
		}
		
		
		//2. while문을 사용해서 1부터 100까지 정수중 5의 배수의 총합을 출력

		int n =1;
		int sum = 0;
		
		while(n<=100) {
			if(n%5 ==0) {
				sum += n;
			}
			n++;
		}
		System.out.println(sum);
		
		
	//do-while 문으로
	// 초기값을 먼저 설정해야한다.
		int n =1; 
		int sum =0;
		
		do {
			sum += n; // sum = sum+n
			n++;
		}while(n<=20);// 조건 걸기 + 뒤에 세미콜론 찍어야함
		System.out.println(sum);
		

		
	//1. 50 + 11.8ㅡ이 결과를 소수점을 버리고 풀력해라
		System.out.print(50 + (int)11.8);
		
		System.out.printf("%d\n", (int)(50+11.8));
		
		
	// 2. 0~30까지 중에서 5의 배수를 제외하고 출력해라(무한반복문과 break,continue 다사용)
		
		int i =0;
		while(i<=30) {
			i++;
			if(i%5 ==0) {
				continue;
			}else {
				System.out.println(i);
			}
		}
		
		
		int [] irr = {1,2,3,4,5}; //배열 선언 과 초기화
		//int 타입만 넣을 수 있다.
		
		/*
		System.out.println(irr[0]); //1
		System.out.println(irr[1]); //2
		System.out.println(irr[2]); //3
		System.out.println(irr[3]); //4
		System.out.println(irr[4]); //5
		*/
		
		for (int i = 0 ; i < irr.length; i++) {
			System.out.println(irr[i]);
		}
		
		
		int [] arr = new int[30];
		
========================================================================
		
	// 5개의 정수를 입력할 배열을 생성하고 총합을 출력
		Scanner s = new Scanner (System.in);
		
		int arr [] = new int [5];
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			System.out.println("숫자를 입력하세요");
			
			arr[i] = s.nextInt();
			sum += arr[i];
		}
		System.out.println(sum);
		
		int[] array = {1,5,3,8,2};
		int max = 0; // 최대값 0으로 일단 설정
		
		for(int i =0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println(max);

		
	// 입력받은 배열의 최대값 구하기
		int[] array = {1,5,3,8,2};
		int max =0;
		Scanner s =new Scanner(System.in);
		int [] arr = new int [5];
		
		for(int i =0; i < array.length; i++){
			array[i] =s.nextInt();
			if(max < array[i]) {
				max=array[i];
			}
		System.out.println(max);
		}

	==================================================================

	// 정수 10개 배열 생성
		int [] tenArr = new int [10];
		// 1 2 3 5 8 13 21 34 55 89(피보나치 수열 인접한 수끼리 더함)
		tenArr[0] = 1;
		tenArr[1] = 2;
		
		for(int i =0; i<8; i++) {
			tenArr[i+2]=tenArr[i] + tenArr[i+1];
		}
		for(int i = 0; i < tenArr.length; i++) {
			System.out.println(tenArr[i]);
		}
		
String str [] = {"컴푸터", "자바", "DB"};
for(String s : str) {
	System.out.println(s);
}

	}

}
