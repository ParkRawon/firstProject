package conditions;

public class ForInForExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
		}
	}

	public static void ex1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("i�� ��: " + i + " j�� ��:" + j + "\t	");
			} // print = �ٹٲ��ش�ȵ� println = �ٹٲ��ش��
			System.out.println();
		}
	}

}
