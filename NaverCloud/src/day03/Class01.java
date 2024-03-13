package day03;
import java.util.Scanner;

public class Class01 {

	public static void main(String[] args) {
				// 별찍기
				for (int i =1; i <=3; i++) {
					for(int j = 1; j <5; j++) {
						System.out.print("*");
					}
					System.out.println("");
				}
				
				System.out.println("---------------------------------");
				
				for(int i =0; i <=4; i++) { //행 기준
					for(int j = 0; j < 4-i; j++  ) { //여기서 j=0은 범위이지 값이 아니다.
						System.out.print(" ");
					}
					for(int j =0; j< i+1; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				
				System.out.println("---------------------------------");
				
				for(int i = 0; i <9; i++) {
					if(i < 5) {
						for(int j=0; j<4-i;j++) {
							System.out.print(" ");
						}
						for(int j =0; j <i+1; j++) {
							System.out.print("*");
						}
					}else {
						for(int j=0; j<i-4;j++) {
							System.out.print(" ");
						}
						for(int j=0; j<9-i;j++) {
							System.out.print("*");
						}
					}
					System.out.println();
				}
						
				System.out.println("---------------------------------");

				
				for(int i =0; i<5; i++) {
					for(int j =0; j<4-i;j++ ) {
						System.out.print(" ");
					}
					int n =1;
					for(int j =0; j<(2*i)+1;j++) {
						System.out.print(n);
						n++;
					}
					System.out.println();
				}

				System.out.println("---------------------------------");
				
				System.out.println("한 문자 입력");
				Scanner s =new Scanner(System.in);
				
				char ch = s.next().charAt(0); // c = 99
				int n = (int) ch; //내가 입력한 문자를 정수로 강제형변환
				
				for(int i =97; i<=n;i++) {
					for(int j=i; j<n; j++) { //97 98
						char c = (char) j;  // a b
						System.out.print(c);
					}
					System.out.println();
				}

				System.out.println("---------------------------------");

				
// do while 문
				
		String str; // 참조 변수 설정
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("문자열 입력");
			str = sc.next();
			
			if(str.equals("exit")) {
				System.out.println("프로그램종료");
			}else {
				System.out.println(str);
			} //여기까지 반복문
		}while(!str.equals("exit")); //조건
				
		
		System.out.println("---------------------------------");

// 배열
			/*배열의 초기화		
			1. int [] arr = {...}
			2. int [] arr;
				arr = new int[] {...}
			3.	int arr [] =new int[] {...}
			*/		

			// 정수 5개를 저장할 배열 생성하기
			int arr [] = new int[5];	
			
			//실수 10개 저장할 배열
			
			//  배열 요소 수가 3개인 int형 배열
			int c [] = new int [3];
					
			// 인덱스의 최대값이 4인 char형 배열
			char cArr [] = new char [5]; // index는 0부터 시작하는것을 잊지말자
	
			Scanner s1 = new Scanner(System.in);
	
			System.out.println("실수 5개 입력");
	
			double arr1[] =new double[5];
			
			for(int i =0; i < arr.length; i++) {
				arr1[i] = s1.nextDouble();
				System.out.println(arr[i]);
			}
				
			System.out.println("---------------------------------");
	
			int [][] a = new int [2][3]; //2행 3열
			int [][] d = {{1,2,3},
						  {1,2,3}};
			
			int [] b = new int [5];
			int [] c2 = {1,2,3};

			int ary [][] = {{1,2,3,4},
					{5,6,7,8}}; // 2행 4열
			System.out.println(ary[0][0]);
			System.out.println(ary[0][1]);
			System.out.println(ary[0][2]);
			System.out.println(ary[0][3]);
			
			System.out.println(ary[1][0]);
			System.out.println(ary[1][1]);
			System.out.println(ary[1][2]);
			System.out.println(ary[1][3]);
			
			System.out.println("============");
			
			for(int i = 0; i < 2; i++) {
				for(int j =0; j < 4; j++) {
					System.out.println(ary[i][j]);
				}
			}
			
				
		int [][] arr2 = {{1,2,3,4},{5,6,7}};

		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < arr2[i].length;j++) { //행의 개수
				System.out.println(arr2[i][j]);
			}
		}
			}
		}

