package operator;

public class LogicOperatorExample {
	public static void main(String[] args) {
		int val1 = 7;
		
		if ((val1 % 2 == 0) && (val1 % 3 == 0)) { //&& -and || - or
			System.out.println("2�� 3�� ����Դϴ�.");
		} else if (val1 % 3 ==0) {
			System.out.println("3�� ����Դϴ�.");
		} else if(val1 % 2 ==0) {
			System.out.println("2�� ����Դϴ�.");
		}
		
		if(val1 % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
	}

}
