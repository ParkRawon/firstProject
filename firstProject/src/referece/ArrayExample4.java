package referece;

import java.util.Scanner;

public class ArrayExample4 {

	static int n = 25;
	static int[] intAry = new int[n];

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		// �ߺ��� ����.
		//int n = 25;
		//int[] intAry = new int[n];

		for (int i = 0; i < intAry.length; i++) {
			boolean pass = true;
			intAry[i] = (int) (Math.random() * n) + 1;
			// �������� ��.
			for (int j = 0; j < i; j++) {
				if (intAry[i] == intAry[j]) {
					pass = false;
					break; // ������ ���� ������ for �ݺ��� �����.
				}
			}
			if (!pass) {
				i--;
			}

		}
		// �迭�� �� ���� ���.
		// ȭ�鿡 ���.
		for (int i = 0; i < intAry.length; i++) {
			show(i);
			if (i % 5 == 4) {
				System.out.println();
			}
		}
		// �ݺ�..
		while (true) {
			System.out.println("���� 10�� ã������(0~24)>>>>");
			int idx = scn.nextInt();
			if(idx >24 || idx <0) { //�߸��� ������ ���� �Է��� ���...
				System.out.println("�߸��� ���� �־����ϴ�.");
				continue; //continue; �Ʒ��κ��� �������� �ʰ� �ٽ� �ݺ��� ó������..
			}
			if (intAry[idx] == 10) {
				System.out.println("ã�ҽ��ϴ�.");
				break;
			} else {
				intAry[idx] = 0;
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}

			for (int i = 0; i < intAry.length; i++) {
				show(i);
				if (i % 5 == 4) {
					System.out.println();
				}
			}
			
			}
		System.out.println("������ �����߽��ϴ�.");
	}
		

	public static void show(int idx) {
		if (intAry[idx] > 0) {
			System.out.printf("(%2d)", idx);
		} else {
			System.out.printf("(**)", idx);
		}
	}
}

