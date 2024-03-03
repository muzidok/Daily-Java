package day01.sec01;

public class VariableUse {

	public static void main(String[] args) {
		int hour = 3;
		int minute = 50;
		System.out.println(hour + "시간 " + minute + "분"); // 3시간 50분 출력
		
		int totalMinutes = (hour * 60) + minute;
		System.out.println("총" + totalMinutes + "분"); //230

	}

}
