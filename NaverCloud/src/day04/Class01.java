package day04;

public class Class01 {

	public static void main(String[] args) {
			// ������ �迭
				// 2�� 4��
				int arr[][] = {{1,2,3,4},{5,6,7,8}};
				
				// 4�� 2��
				int arr1[][] = new int [4][2];
				
				//arr�� �����ͤѤ� arr1�� ����(��ġ�� �ٸ�)
				for (int i =0; i <2; i++) {
					for (int j =0; j < 4; j++) {
						arr1[j][i] = arr[i][j];
						System.out.print(arr[i][j] + " ");
					
					}
					System.out.println();
				}
				for(int i =0; i<arr1.length; i++) {
					for (int j=0; j <arr1[i].length; j++) {
						System.out.print(arr1[i][j] + " ");
					}
					System.out.println();
				}
				// 2���� �迭�϶� 
				// ��-> �迭��.length; 
				// �� -> �迭��[��].length;
				
				
				String [][] str = {{"java"},
						{"c","c++"},
						{"htil", "css", "python"}};
				
				for(int i =0; i < str.length;i++) {
					for(int j = 0; j < str[i].length; j++) {
						System.out.println(str[i][j]);
					}
					System.out.println();
				}
				
				
			// 
				String str1 = "������ �ݿ���, �����ϰ�Ƽ����";
				String a[] = str1.split(","); // ,�� �������� ���ڿ��� �и��Ѵ�
				System.out.println(a[0]);
				/*String[]	split(String regex) -> �Ű������� 1��
				Splits this string around matches of the given regular expression.
				String[]	split(String regex, int limit) -> �Ű������� 2��
				Splits this string around matches of the given regular expression.
				 * */
				
				// -< for each������ �߷��غ���
				for(String result :a) { // for(���� : �迭��
					System.out.println(result);
				}
				
				//�ε��� 4���� 6���� ��� -> substring ���ڿ��� �����Ѵ�.
				/*String	substring(int beginIndex)
				Returns a string that is a substring of this string. 
				String	substring(int beginIndex, int endIndex)0���� �����Ѵ�. end index�� �������� �ʴ´�. ���鵵 �����̴�.
				Returns a string that is a substring of this string. ������ �ε����� ���������� ���� �Ű������� �ڸ����� ������ ��µȴ�.*/ 
				String a2 = str1.substring(4,7);
				System.out.println(a2);
				
				String  b = str1.replace("����", "study");
				System.out.println(b);
				
				
				// concat�� ���ڿ��� �����Ѵ�.
				String  str2 = str1.concat("������ �����");
				System.out.println(str2);
		
		}
	}

}

}
