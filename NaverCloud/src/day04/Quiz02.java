package day04;

public class Quiz02 {

	public static void main(String[] args) {
		// 5. �Ʒ��� ���� ����� 2���� �迭�� ����϶�
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
				
		
		/* ���ڿ� a�� "C++", b�� ", JAVA"�� �ʱ�ȭ�϶�.
		 * */
		
		String a = "C++", b =", JAVA";
		
		// 6-1. ���ڿ� a�� ���̸� ����϶�
		
		System.out.println(a.length());
		
		// 6-2. a,b �� ���ڿ��� �����ض�.
		
		System.out.println(a.concat(b));
		
		// 6-3. �ε��� 3���� ������ ����ϰ�
		
		String aStr = a.concat(b);
		System.out.println(aStr.substring(3));
		
		// 6-4. JAVA�� C#���� �����ض�
		
		System.out.println(b.replace("JAVA", "C##"));
		
		// 6-5. , �� �������� ���ڿ��� �и��ض�
		
		String [] arr =aStr.split(",");
		for(int i =0; i<arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
		
			}
		}



====================================================================================================


		// 1. ���� 10���� �Է¹޾� �迭�� ������ ��, �迭�� �˻��Ͽ� 4�� ����� ��� ����ϴ� ���α׷�
		import java.util.Scanner;
		
		public class Day4_Test {
			public static void main(String[] args) {
				int i =0;
				int[] arr = new int[10];
				Scanner s = new Scanner (System.in);
				System.out.println("���ڸ� �Է����ּ���"); 
				
				while(i <10) {
					arr[i] = s.nextInt();
					System.out.println(arr[i]);
					i++;
				}
		
				for (int j = 0; j < 10; j++) {
					//if(arr[j] % 4== 0 && arr[j] % 4 != 0) { 
					//4 �� ����� �̾ƾ��ϴµ� ���ʿ� ������ 4�� ����� �ƴϾ���Ѵٰ� �ϴٴ�!!!!!
						if(arr[j] % 4== 0) {
		            System.out.println(arr[j] + "�� 4�� ����̴�");
					}
				}
			}
		}
				// �ٸ���� ���
//				Scanner sc = new Scanner(System.in);
//		
//				System.out.println("���� 10���� �Է����ּ���.");
//				int[] ary = new int[10];
//		
//				for (int i = 0; i < ary.length; i++) {
//				ary[i] = sc.nextInt();
//				}
//		
//				for (int i = 0; i < ary.length; i++) {
//				if (ary[i] % 4 == 0) {
//				System.out.println(ary[i] + "��(��) 4�� ��� �Դϴ�.");
//					}
//				}
				
				

		// 2. ���� a=50, b=150���� �ʱ�ȭ�ؼ� a�� b���� ũ�� a�� b�� ��, �ƴϸ� a�� b�� ������ ���� ������ ���
		// (���� ���� ������ Ȱ��)


		public class Day4_Test {
			
			public static void main(String[] args) {
				int a = 50, b = 150;
				System.out.println( a>b ? a*b : (int) a%b);
			}
		}
	}

}
