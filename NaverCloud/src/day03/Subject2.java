package day03;

public class Subject2 {

	public static void main(String[] args) {
		// 1. ��ø�ݺ������� 5�ܺ��� 9�ܱ��� ���
		for(int i =5; i <= 9; i++) {
			System.out.println(i + "��");
			for(int j =1; j <=9; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
		}
		
		
		//2. while���� ����ؼ� 1���� 100���� ������ 5�� ����� ������ ���

		int n =1;
		int sum = 0;
		
		while(n<=100) {
			if(n%5 ==0) {
				sum += n;
			}
			n++;
		}
		System.out.println(sum);
		
		
	//do-while ������
	// �ʱⰪ�� ���� �����ؾ��Ѵ�.
		int n =1; 
		int sum =0;
		
		do {
			sum += n; // sum = sum+n
			n++;
		}while(n<=20);// ���� �ɱ� + �ڿ� �����ݷ� ������
		System.out.println(sum);
		

		
	//1. 50 + 11.8���� ����� �Ҽ����� ������ Ǯ���ض�
		System.out.print(50 + (int)11.8);
		
		System.out.printf("%d\n", (int)(50+11.8));
		
		
	// 2. 0~30���� �߿��� 5�� ����� �����ϰ� ����ض�(���ѹݺ����� break,continue �ٻ��)
		
		int i =0;
		while(i<=30) {
			i++;
			if(i%5 ==0) {
				continue;
			}else {
				System.out.println(i);
			}
		}
		
		
		int [] irr = {1,2,3,4,5}; //�迭 ���� �� �ʱ�ȭ
		//int Ÿ�Ը� ���� �� �ִ�.
		
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
		
	// 5���� ������ �Է��� �迭�� �����ϰ� ������ ���
		Scanner s = new Scanner (System.in);
		
		int arr [] = new int [5];
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			System.out.println("���ڸ� �Է��ϼ���");
			
			arr[i] = s.nextInt();
			sum += arr[i];
		}
		System.out.println(sum);
		
		int[] array = {1,5,3,8,2};
		int max = 0; // �ִ밪 0���� �ϴ� ����
		
		for(int i =0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println(max);

		
	// �Է¹��� �迭�� �ִ밪 ���ϱ�
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

	// ���� 10�� �迭 ����
		int [] tenArr = new int [10];
		// 1 2 3 5 8 13 21 34 55 89(�Ǻ���ġ ���� ������ ������ ����)
		tenArr[0] = 1;
		tenArr[1] = 2;
		
		for(int i =0; i<8; i++) {
			tenArr[i+2]=tenArr[i] + tenArr[i+1];
		}
		for(int i = 0; i < tenArr.length; i++) {
			System.out.println(tenArr[i]);
		}
		
String str [] = {"��Ǫ��", "�ڹ�", "DB"};
for(String s : str) {
	System.out.println(s);
}

	}

}
