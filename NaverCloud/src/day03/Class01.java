package day03;
import java.util.Scanner;

public class Class01 {

	public static void main(String[] args) {
				// �����
				for (int i =1; i <=3; i++) {
					for(int j = 1; j <5; j++) {
						System.out.print("*");
					}
					System.out.println("");
				}
				
				System.out.println("---------------------------------");
				
				for(int i =0; i <=4; i++) { //�� ����
					for(int j = 0; j < 4-i; j++  ) { //���⼭ j=0�� �������� ���� �ƴϴ�.
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
				
				System.out.println("�� ���� �Է�");
				Scanner s =new Scanner(System.in);
				
				char ch = s.next().charAt(0); // c = 99
				int n = (int) ch; //���� �Է��� ���ڸ� ������ ��������ȯ
				
				for(int i =97; i<=n;i++) {
					for(int j=i; j<n; j++) { //97 98
						char c = (char) j;  // a b
						System.out.print(c);
					}
					System.out.println();
				}

				System.out.println("---------------------------------");

				
// do while ��
				
		String str; // ���� ���� ����
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("���ڿ� �Է�");
			str = sc.next();
			
			if(str.equals("exit")) {
				System.out.println("���α׷�����");
			}else {
				System.out.println(str);
			} //������� �ݺ���
		}while(!str.equals("exit")); //����
				
		
		System.out.println("---------------------------------");

// �迭
			/*�迭�� �ʱ�ȭ		
			1. int [] arr = {...}
			2. int [] arr;
				arr = new int[] {...}
			3.	int arr [] =new int[] {...}
			*/		

			// ���� 5���� ������ �迭 �����ϱ�
			int arr [] = new int[5];	
			
			//�Ǽ� 10�� ������ �迭
			
			//  �迭 ��� ���� 3���� int�� �迭
			int c [] = new int [3];
					
			// �ε����� �ִ밪�� 4�� char�� �迭
			char cArr [] = new char [5]; // index�� 0���� �����ϴ°��� ��������
	
			Scanner s1 = new Scanner(System.in);
	
			System.out.println("�Ǽ� 5�� �Է�");
	
			double arr1[] =new double[5];
			
			for(int i =0; i < arr.length; i++) {
				arr1[i] = s1.nextDouble();
				System.out.println(arr[i]);
			}
				
			System.out.println("---------------------------------");
	
			int [][] a = new int [2][3]; //2�� 3��
			int [][] d = {{1,2,3},
						  {1,2,3}};
			
			int [] b = new int [5];
			int [] c2 = {1,2,3};

			int ary [][] = {{1,2,3,4},
					{5,6,7,8}}; // 2�� 4��
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
			for(int j = 0; j < arr2[i].length;j++) { //���� ����
				System.out.println(arr2[i][j]);
			}
		}
			}
		}

