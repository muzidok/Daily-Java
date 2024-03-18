package day04;
import java.util.Scanner;

public class Subject {

	public static void main(String[] args) {

				// 하나의 문자 5행 5 열
				char [][] arr = new char [5][5];
				// 실수형
						doueble [][] b =new double[5][2];
			int c[][] = {{1,2,3},{5,1 ,3}};
			
			for(int i=0; i<3 ; i++) {
				for(int j =0; j<3;j++) {
					System.out.println(c[i][j]);
					
					// 실수형 2차원 배열 2행 3열을생성
					// 실수형 값을 입력한 값을  다 출력하라.
					double [][] a = new double [2][3];
					Scanner s = new Scanner(System.in);
//					double input = s.nextDouble();
					
					for(int i =0; i <a.length; i++) {
						for(int j =0; j < a[i].length; j++) {
							a[i][j] = s.nextDouble();
							System.out.println(a[i][j]);
						}
					}
					System.out.println(a[i][j]);
					
					//199쪽 8번
					int [][] array = {{95,86},{83,92,96},{78,83,93,87,88}};
					int sum =0;
					
					for(int i =0; i < array.length; i++) {
						for ( int j =0;j < array[i].length; j++) {
							sum += array[i][j]; //i 를 돌면서 i안의 j들을 하나씩 더하니까 이렇게 쓰는거야.
							// sum +=array[i]; sum += array[j] 하면 에러남
						}
						System.out.println(sum/(array.length + array[i].length));//36,75,110
					}
					System.out.println(sum);
					System.out.println((double) sum /10);
				
	==============================================================================================================

				Scanner s = new Scanner(System.in);
				String arr[][] = {
									{"book", "책"},
									{"apple","사과"},
									{"rice","쌀"}
								};//3행 2열
				for (int i =0; i <arr.length; i++) { //i = 0,1,2
					System.out.println(arr[i][0] + "를 한글로?");
					String str =s.next();
					
					if(str.equals(arr[i][1])) {
						System.out.println("정답이다");
					}else {
						System.out.println("틀렸다.");
					}
				}
			}

		}


	}

}
