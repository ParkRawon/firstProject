package conditions;

public class ForExample4 {
	public static void main(String[] args) {
		forSum();		
	}

	public static void whileSum() {
		// while ���� 1~10 ¦�� ��.
		int sum = 0;
		int i = 1;
		while (i <= 10) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println("1~10������ ¦�� �� :" + sum);
	}

	public static void forSum() {
		// 1����10���� i������ Ȱ��.
		// int sum = 0;
		// 1 ~10 ���� Ȧ�� ��:
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				sum = sum + i;
			    System.out.println(" sum> "+sum+", i>"+ i);
			}
		}
		System.out.println("1~10������ Ȧ�� �� :" + sum);
	}

}
