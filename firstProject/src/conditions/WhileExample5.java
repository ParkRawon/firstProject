package conditions;

import java.util.Scanner;

public class WhileExample5 {
	public static void main(String[] args) {
		// ������ �� => ����,����,��
		int ran = (int) (Math.random() * 3);
		String rsp = "";
		if (ran == 0) {
			rsp = "����";
		} else if (ran == 1) {
			rsp = "����";
		} else if (ran == 2) {
			rsp = "��";
		}
		Scanner scn = new Scanner(System.in);
		System.out.println("����,����,�� >>>>");
		String str = scn.nextLine();
		// ���ǹ�..��ǻ�� ����/����/�� <=> �� ����/����/��
		// you win...
		// you lose...
		// same same
		if (rsp.equals(str)) {
			System.out.println("same.");
		} else {
			if (rsp.equals("����")) {
				if (rsp.equals("����")) {
					System.out.println("You win");
				} else {
					System.out.println("You lose");
				}

			} else {
				if (rsp.equals("����")) {
					if (rsp.equals("��")) {
						System.out.println("you win");
					} else {
						System.out.println("you lose");
					}

				} else {
					if (rsp.equals("��")) {
						if (rsp.equals("����")) {
							System.out.println("you win");
						} else {
							System.out.println("you lose");
						}
					}
				}
			}
		}

	}
}
