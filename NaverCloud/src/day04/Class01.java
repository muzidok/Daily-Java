package day04;

public class Class01 {

	public static void main(String[] args) {
			// 다차원 배열
				// 2행 4열
				int arr[][] = {{1,2,3,4},{5,6,7,8}};
				
				// 4행 2열
				int arr1[][] = new int [4][2];
				
				//arr의 데이터ㅡㄹ arr1에 복사(위치는 다름)
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
				// 2차원 배열일때 
				// 행-> 배열명.length; 
				// 열 -> 배열명[행].length;
				
				
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
				String str1 = "오늘은 금요일, 공부하고티빕봄";
				String a[] = str1.split(","); // ,를 기준으로 문자열을 분리한다
				System.out.println(a[0]);
				/*String[]	split(String regex) -> 매개변수가 1개
				Splits this string around matches of the given regular expression.
				String[]	split(String regex, int limit) -> 매개변수가 2개
				Splits this string around matches of the given regular expression.
				 * */
				
				// -< for each문으로 추력해보기
				for(String result :a) { // for(변수 : 배열명
					System.out.println(result);
				}
				
				//인덱스 4부터 6까지 출력 -> substring 문자열을 추출한다.
				/*String	substring(int beginIndex)
				Returns a string that is a substring of this string. 
				String	substring(int beginIndex, int endIndex)0부터 시작한다. end index는 포함하지 않는다. 공백도 포함이다.
				Returns a string that is a substring of this string. 마지막 인덱스를 쓰지않으면 들어온 매개변수의 자리에서 끝까지 출력된다.*/ 
				String a2 = str1.substring(4,7);
				System.out.println(a2);
				
				String  b = str1.replace("공부", "study");
				System.out.println(b);
				
				
				// concat은 문자열을 연결한다.
				String  str2 = str1.concat("내일은 토요일");
				System.out.println(str2);
		
		}
	}

}

}
