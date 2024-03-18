package day04;

public class Quiz02 {

	public static void main(String[] args) {
		// 5. 아래와 같은 모양의 2차원 배열을 출력하라
		// 1 3 5 7 9 
		// 11 13 15 17 19

		public class Day4_Test {
			public static void main(String[] args) {
				int [][] arr = {{1,3,5,7,9},{11,13,15,17,19}};
				
				for(int i= 0; i < arr.length; i++) {
					for(int j =0; j < arr[i].length; j++) {
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
			}
		}



====================================================================================================



		public class Day4_Test {
			public static void main(String[] args) {
				
		
		/* 문자열 a에 "C++", b에 ", JAVA"를 초기화하라.
		 * */
		
		String a = "C++", b =", JAVA";
		
		// 6-1. 문자열 a의 길이를 출력하라
		
		System.out.println(a.length());
		
		// 6-2. a,b 의 문자열을 연결해라.
		
		System.out.println(a.concat(b));
		
		// 6-3. 인덱스 3부터 끝까지 출력하가
		
		String aStr = a.concat(b);
		System.out.println(aStr.substring(3));
		
		// 6-4. JAVA를 C#으로 변경해라
		
		System.out.println(b.replace("JAVA", "C##"));
		
		// 6-5. , 를 기준으로 문자열을 분리해라
		
		String [] arr =aStr.split(",");
		for(int i =0; i<arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
		
			}
		}



====================================================================================================


		// 1. 정수 10개를 입력받아 배열에 저장한 후, 배열을 검색하여 4의 배수만 골라 출력하는 프로그램
		import java.util.Scanner;
		
		public class Day4_Test {
			public static void main(String[] args) {
				int i =0;
				int[] arr = new int[10];
				Scanner s = new Scanner (System.in);
				System.out.println("숫자를 입력해주세요"); 
				
				while(i <10) {
					arr[i] = s.nextInt();
					System.out.println(arr[i]);
					i++;
				}
		
				for (int j = 0; j < 10; j++) {
					//if(arr[j] % 4== 0 && arr[j] % 4 != 0) { 
					//4 의 배수를 뽑아야하는데 뒤쪽에 조건을 4의 배수가 아니어야한다고 하다니!!!!!
						if(arr[j] % 4== 0) {
		            System.out.println(arr[j] + "는 4의 배수이다");
					}
				}
			}
		}
				// 다른사람 답안
//				Scanner sc = new Scanner(System.in);
//		
//				System.out.println("정수 10개를 입력해주세요.");
//				int[] ary = new int[10];
//		
//				for (int i = 0; i < ary.length; i++) {
//				ary[i] = sc.nextInt();
//				}
//		
//				for (int i = 0; i < ary.length; i++) {
//				if (ary[i] % 4 == 0) {
//				System.out.println(ary[i] + "은(는) 4의 배수 입니다.");
//					}
//				}
				
				

		// 2. 정수 a=50, b=150으로 초기화해서 a가 b보다 크면 a와 b의 곱, 아니면 a를 b로 나눴을 때의 나머지 출력
		// (삼항 조건 연산자 활용)


		public class Day4_Test {
			
			public static void main(String[] args) {
				int a = 50, b = 150;
				System.out.println( a>b ? a*b : (int) a%b);
			}
		}
	}

}
