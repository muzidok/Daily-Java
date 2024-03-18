package day03;

public class Quiz3 {

	public static void main(String[] args) {
	//	3
	Scanner s = new Scanner(System.in);
	int [] arr = new int[10];
	int sum = 0;
	
	for(int i =0; i <arr.length; i++) {
		System.out.println("숫자를 입력해주세요");
		arr[i] = s.nextInt();
		sum += arr[i];
	}
			System.out.println(sum/arr.length);
			
-----------------------------------------------------------------------			

	// 3-1
	Scanner s = new Scanner(System.in);
	int [] arr = new int [10];
	
	for(int i =0; i < arr.length; i++) {
		System.out.println("숫자를 입력해주세요");
		arr[i] = s.nextInt();
		if(arr[i]%7 ==0) {
			System.out.println(arr[i]);
		}
	}
	
-----------------------------------------------------------------------
	//for-each문
	for (int k: arr) {
		if(k%7 == 0 && k !=0) {
			System.out.println(k);
		}
	}
	

	}

}
