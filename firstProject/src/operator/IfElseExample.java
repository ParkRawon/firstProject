package operator;

public class IfElseExample {
	public static void main(String[] args) {
		int score = 90;
		// 60���� ũ�� consol "�հ��Դϴ�.";
		// 60���� ������ console "���հ��Դϴ�.";
		if (60 <= score) {
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
		System.out.println("-----------------");
		// 90�� �̻� A����.
		// 80�� �̻� B����.
		// 70�� �̻� C����.
		// 60�� �̻� D����.
		// ���� F����.

		if (90 <= score) {
			if (score >= 95) {
				System.out.println("A+����");
			}else {
				System.out.println("A����.");
			}
			
		} else if (80 <= score) {
			System.out.println("B����.");
			
		} else if (70 <= score) {
			System.out.println("C����.");
			
			
		} else if (60 <= score) {
			System.out.println("D����.");
			
		} else {
			System.out.println("F����.");
			
		}//end of main
		//end class

	}

}
