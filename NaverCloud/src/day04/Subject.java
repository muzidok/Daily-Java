package day04;
import java.util.Scanner;

public class Subject {

	public static void main(String[] args) {

				// �ϳ��� ���� 5�� 5 ��
				char [][] arr = new char [5][5];
				// �Ǽ���
						doueble [][] b =new double[5][2];
			int c[][] = {{1,2,3},{5,1 ,3}};
			
			for(int i=0; i<3 ; i++) {
				for(int j =0; j<3;j++) {
					System.out.println(c[i][j]);
					
					// �Ǽ��� 2���� �迭 2�� 3��������
					// �Ǽ��� ���� �Է��� ����  �� ����϶�.
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
					
					//199�� 8��
					int [][] array = {{95,86},{83,92,96},{78,83,93,87,88}};
					int sum =0;
					
					for(int i =0; i < array.length; i++) {
						for ( int j =0;j < array[i].length; j++) {
							sum += array[i][j]; //i �� ���鼭 i���� j���� �ϳ��� ���ϴϱ� �̷��� ���°ž�.
							// sum +=array[i]; sum += array[j] �ϸ� ������
						}
						System.out.println(sum/(array.length + array[i].length));//36,75,110
					}
					System.out.println(sum);
					System.out.println((double) sum /10);
				
	==============================================================================================================

				Scanner s = new Scanner(System.in);
				String arr[][] = {
									{"book", "å"},
									{"apple","���"},
									{"rice","��"}
								};//3�� 2��
				for (int i =0; i <arr.length; i++) { //i = 0,1,2
					System.out.println(arr[i][0] + "�� �ѱ۷�?");
					String str =s.next();
					
					if(str.equals(arr[i][1])) {
						System.out.println("�����̴�");
					}else {
						System.out.println("Ʋ�ȴ�.");
					}
				}
			}

		}


	}

}
