package day01.sec02;

public class String {

	public static void main(java.lang.String[] args) {
//	public static void main(java.lang.String[] args) { //String은 예약어라구!!
		/*
		 * \\ 은 \문자를 포함한다.
		 * \t 은 출력시 탭만큼 띄운다. 
		 * \n 은 출력시 줄바꿈(라인피드)한다. 
		 */
		
		/*
		*String name1 = "무지";
		*String job1 = "프로그래머";
		*Type mismatch: cannot convert from java.lang.String to 패키지명의 에러가 발생한다. 
		*이유는 class명을 내가 String으로 주었는데 사용할 수 없는 클래스 명이기때문에 모든 패키지내의 String 타입에서 에러가 발생한것..
		*
		*String 클래스명을 사용하면서 문자열을 사용하는 방법 
		*java.lang.String을 사용한다.
		*java.lang.String: 이것은 자바의 표준 라이브러리에 있는 String 클래스를 의미한다. 
		*이 클래스는 java.lang 패키지에 포함되어 있으므로 별도의 임포트 없이 사용할 수 있다.
		*/
		
		java.lang.String name2 = "무지";
		java.lang.String job2 = "프로그래머";
		
		System.out.println(name2);
		System.out.println(job2);

		java.lang.String str = "나는 \"자바\"를 배웁니다";
		System.out.println(str);
		
		str = "번호\t이름\t작업";
		System.out.println(str);
		
		System.out.println("나는\n 자바를\n 배웁니다\n");
	}

}
