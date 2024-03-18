package day04;

public class Class02 {

	public static void main(String[] args) {
	//static 하나의 클래스에서 함수를 공유하기위해서 사용한다. void는 반환형이 없다. 
	// 반환형이 void이면 함수는 대부분 출력문이 들어간다.	
	// 메소드는 반드시 클래스 안에 있어야 한다.(캡슐화의 원칙 - 정보 은닉때문에 필요하다)
	
		//	pro(2); // 힘수를 호출 -> 함수의 {}(실행블럭) 을 찾아 확인한다.
		//	pro(53);
		//	System.out.println("끝");

	// 실행 결과 시작 안녕 나이는 2이다 안녕 나이는 53이다 끝
	//메인을 먼저 찾고 그안에서 함수를 찾아서 실행한다.


=========================================================================================

/* 함수에서 추렭을 어디에서 할것인가
 * 1. main에서 출력할거라면 함수에서 리턴
 * -> 함수 호출과 동시에 출력이 가능하다.
 * -> 변수를 주면서 리턴값을저장.
 * 2. 하수에서 할거라면 리터문이 필요없다.(void)
 * 
 * */

	static void total(int a, int b) { // 매개변수는 자료형을 따로 적어줘야한다.
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		total(1, 10);
		total(1, 100);
		// 1`10까지 출력
		// 1-100까지 합 출력
	}
}

=========================================================================================

////main에 출력하기 -> 함수에서 리턴해야함
public class Day4_2 {

	public static void main(String[] args) {
		System.out.println(multi(2, 10)); // 2가 밑수고 10이 지수다.
	}

	static int multi(int a, int b) {
		int m = 1;
		for (int i = 1; i <= b; i++) {
			m *= a;
		}
		return m;
	}
}

public class Day4_2 {

	public static void main(String[] args) {
		System.out.println(big(5.5, 6.5));
	}

	// 두 수중 큰 값을 출력하는 함수를 삼항연산자를 활용
	static double big(double a, double b) {
		return a > b ? a : b;
	}
}

=========================================================================================

// 전연 변수와 지역변수

public class Day4_2 {

	static void in() {
		int a = 10; // 지역변수
		System.out.println(a);
	}

	public static void main(String[] args) {
		int a = 0; // 지역변수(local variables)
		in(); // 함수 호출
		System.out.println(a);
	}

}

=========================================================================================

public class Day4_2 {

	public static void main(String[] args) {
		aa(); // 10
		b();
		c(); // 20 위에서부터 읽어오기때문에 가장 마지막에 설정한 a가 출력된다.
		System.out.println(a);
	}

	static int a; // static은 공유하겠다는 뜻으로 전역변수가되어 a 모양이 달라진다.

	static void aa() {
		a = 10;
	}

	static void b() {
		int a = 20; // 지역변수 라서 b 함수내부에서만 사용할 수 있다.
	}

	static void c() {
		a = 20;
	}

}

	=========================================================================================

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// 정수형 7개 넣을 수 있느 배열a 생성
		int arr[] = new int[7];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println(big(arr)); // 7개 중 제일 큰 값 출력
		// 매개벼누가 배열명일때
		// 배열을 호출할 때 배열명 만 적으면 됨
	}
}

=========================================================================================

public class Day4_2 {

	static int in() {
		// 입력된 정수를 출력해주세요.
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		return input;
	}

	public static void main(String[] args) {
		System.out.println(in());
	}
}

// 나 지금 어딘가에서 막혔는데 배열로 함수만드는 부분인가..?함수를 만드는 부분에서 인가..?
//public class Day4_2 {
//	
//static int total (int b[]) {
//	int sum = 0;
//	for(int i=0; i<b.length; i++) {
//		sum += b[i];
//	}
//	return sum;
//}
//	
//	public static void main(String[] args) {
//		
//		int arr [] = {1,2,3,4,5};
//		System.out.println(total(arr));
//		
//	}
//}

// 버블정렬이란 인접한 ..?
public class Day4_2 {
	public static void main(String[] args) {
		int arr[] = {3,2,1,6,5};
		
		for(int i =0; i <4; i++) { // i를 배열의 길이로하면 j는 배열의 길이를 초과하니까 1작게 함.
			int temp; // i와 j의 값을 바꿀때 하나에 다른 값을 저장하면 다른값은 참조할 주소를 잊어버리니까 임시로 저장하려고 선언.
			for(int j = i+1; j < 5; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
}

}

}
