package conditions;

public class ForExample4 {
	public static void main(String[] args) {
		forSum();		
	}

	public static void whileSum() {
		// while 구문 1~10 짝수 합.
		int sum = 0;
		int i = 1;
		while (i <= 10) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println("1~10까지의 짝수 합 :" + sum);
	}

	public static void forSum() {
		// 1부터10까지 i변수를 활용.
		// int sum = 0;
		// 1 ~10 까지 홀수 합:
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				sum = sum + i;
			    System.out.println(" sum> "+sum+", i>"+ i);
			}
		}
		System.out.println("1~10까지의 홀수 합 :" + sum);
	}

}
