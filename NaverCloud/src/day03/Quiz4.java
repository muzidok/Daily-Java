package day03;

public class Quiz4 {

	public static void main(String[] args) {
		// 4-1
		char[] arr = new char [10];
		
		// 4-2
		int [] iArr = {0,1,2,3,4};
		
		//4-3
		String [] strArr = {"java", "c", "c++"};
		
		//4-4
		int [] iArr2 = new int [10];

-------------------------------------------------------------------------
		
		/**
		 * 4. 다음 코드를 보고 3가지로 변경하여 출력해라.
			double sum=0.0;
			double ary[]={1.0, 1.5, 2.0, 2.5};
			for(int i=0; i<4 ;i++) 
			sum+=ary[i];
			System.out.println(sum);
		 */


		
		//4-1 while문으로 바꾸어 출력해라.
		double sum=0.0;
		double ary[]={1.0, 1.5, 2.0, 2.5};
		int i = 0;
		while(i< ary.length) {
			sum +=ary[i];
			i++;
			if(i > ary.length) {
				break;
			}
		}
		System.out.println(sum);
		
-----------------------------------------------------------------------

		// 4.2)do~while문으로 바꾸어 출력해라.
		double sum=0.0;
		double ary[]={1.0, 1.5, 2.0, 2.5};
		int i = 0;
		do {
			sum += ary[i];
			i++;
		}while(i <ary.length);
		System.out.println(sum);
		
------------------------------------------------------------------------

		// 4.3)for~each문으로 바꾸어 출력해라.
		double sum=0.0;
		double ary[]={1.0, 1.5, 2.0, 2.5};
		for(double a: ary) {
			sum += a;
		}
		System.out.println(sum);

	}

}
