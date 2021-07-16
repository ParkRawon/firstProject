package conditions;

import java.util.Scanner;

public class WhileExample5 {
	public static void main(String[] args) {
		// 임의의 수 => 가위,바위,보
		int ran = (int) (Math.random() * 3);
		String rsp = "";
		if (ran == 0) {
			rsp = "가위";
		} else if (ran == 1) {
			rsp = "바위";
		} else if (ran == 2) {
			rsp = "보";
		}
		Scanner scn = new Scanner(System.in);
		System.out.println("가위,바위,보 >>>>");
		String str = scn.nextLine();
		// 조건문..컴퓨터 가위/바위/보 <=> 내 가위/바위/보
		// you win...
		// you lose...
		// same same
		if (rsp.equals(str)) {
			System.out.println("same.");
		} else {
			if (rsp.equals("가위")) {
				if (rsp.equals("바위")) {
					System.out.println("You win");
				} else {
					System.out.println("You lose");
				}

			} else {
				if (rsp.equals("바위")) {
					if (rsp.equals("보")) {
						System.out.println("you win");
					} else {
						System.out.println("you lose");
					}

				} else {
					if (rsp.equals("보")) {
						if (rsp.equals("가위")) {
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
