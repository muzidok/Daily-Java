package day01.sec02;

public class String {

	public static void main(java.lang.String[] args) {
//	public static void main(java.lang.String[] args) { //String�� ������!!
		/*
		 * \\ �� \���ڸ� �����Ѵ�.
		 * \t �� ��½� �Ǹ�ŭ ����. 
		 * \n �� ��½� �ٹٲ�(�����ǵ�)�Ѵ�. 
		 */
		
		/*
		*String name1 = "����";
		*String job1 = "���α׷���";
		*Type mismatch: cannot convert from java.lang.String to ��Ű������ ������ �߻��Ѵ�. 
		*������ class���� ���� String���� �־��µ� ����� �� ���� Ŭ���� ���̱⶧���� ��� ��Ű������ String Ÿ�Կ��� ������ �߻��Ѱ�..
		*
		*String Ŭ�������� ����ϸ鼭 ���ڿ��� ����ϴ� ��� 
		*java.lang.String�� ����Ѵ�.
		*java.lang.String: �̰��� �ڹ��� ǥ�� ���̺귯���� �ִ� String Ŭ������ �ǹ��Ѵ�. 
		*�� Ŭ������ java.lang ��Ű���� ���ԵǾ� �����Ƿ� ������ ����Ʈ ���� ����� �� �ִ�.
		*/
		
		java.lang.String name2 = "����";
		java.lang.String job2 = "���α׷���";
		
		System.out.println(name2);
		System.out.println(job2);

		java.lang.String str = "���� \"�ڹ�\"�� ���ϴ�";
		System.out.println(str);
		
		str = "��ȣ\t�̸�\t�۾�";
		System.out.println(str);
		
		System.out.println("����\n �ڹٸ�\n ���ϴ�\n");
	}

}
