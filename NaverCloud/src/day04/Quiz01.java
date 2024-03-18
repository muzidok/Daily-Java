package day04;

public class Quiz01 {
	// 1.

	static double area(double r) {
		return 3.14 * r * r;
	}

	static double round(double r) {
		return 3.14 * 2 * r;
	}

	public static void main(String[] args) {
		System.out.println("원의 넓이" + area(3.5));
		System.out.println("원의 둘레" + round(4.5));

		// 넓이 : 3.14*반지름*반지름
		// 둘레 : 3.14*2*반지금

	}

	====================================================================================================
//public class Day4_Test {

	public static void main(String[] args) {
	// 5.1) 3행 3열 배열을 0~8까지정수로 초기화해라. -> 초기화니까 nw 안써도된다. [3][3]는 선언만할때 쓸 수 있고 초기화에 쓰면 에러난다. 
		int [][] arr = {{0,1,2},{3,4,5},{6,7,8}};
	
		// 5.2) 2행 3열 배열을 a~f까지문자로 초기화해라.
		char [][] ch = {{'a','b','c'},{'d','e','f'}};
		
	/*1. 3행 4열의정수형 배열을 생성하여 0~9 범위의정수를 랜덤하게 저장한다.
	저장후 2차원 배열과 합을 출력해라.
	실행결과) 5 4 1 5
	0 5 3 5
	7 8 1 4
	합은 48 
	 */

		int [][] a = new int [3][4];
		int sum =0;
		
		for(int i =0; i<a.length; i++) {
			for(int j =0; j < a[i].length; j++) {
				int b =(int)(Math.random()*9)+1;
				a[i][j] = b;
				sum += b;
			}
		}
		System.out.println(sum);

		// 3. main함수를 보고 adder, exp함수를 작성해라.
		//	main()
		//	int result = adder(10,20); // 두수의 합 출력
		//	System.out.println(result);
		//	System.out.println(exp(3.5)); // 3.5의 제곱한 값 출력
		
		public class Day4_Test {
			
			static int adder(int a, int b) {
				return a + b;
			}
			
			static double exp (double a) {
				return a*a;
			}
			
			public static void main(String[] args) {
				int a = adder(10, 20);
				double b = exp(3.5); 
				System.out.println(a);
				System.out.println(b);
			}
		}
	
====================================================================================================
		
		// 4. 원의 반지름 정보를 전달하면, 원의 넓이를 계산해서 반환하는 메소드를 만들어라.
		// (메소드명은 임의)
		
		// 4.1 출력을 main에서 하기
		public class Day4_Test {

			static double area (double r){
				return 3.14*r*r;
			}
			
			public static void main(String[] args) {
				System.out.println(area(3));
			}
		}
		
		// 4.2 출력을 메소드안에서 하기 -> 이게 무슨말인지 모르겠음
		// 함수는 다른곳에서 작성하고  public main 안에서 함수이름만 불러오는 거인듯?
		public class Day4_Test {	
			public static void main(String[] args) {
				System.out.println(area(3));		
				static int area (int a) {
					return 3.14*a*a;
				}
			}
		}

	====================================================================================================

	// 5-1

	static double are(double a) {
	return e.14*a*a;	
	}public static....

	{
		Scanner s = new Scanner(System.in);
		System.out.println("반지름을 입력하세요");
		double r = s.nextDouble();

		System.out.println(area(r));

	}

	====================================================================================================

	// 단숫자만큼만 곱하기
	for(int i = 1;i<=9;i++)
	{
		for (int j = 1; j <= i; j++) {
			if (i % 2 != 0) {
				break;
			}
			System.out.printf("%d*%d=%d\n", i, j, i * j);
		}
		system.out.println();
	}

}
