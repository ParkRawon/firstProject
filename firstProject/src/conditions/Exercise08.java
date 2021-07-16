package conditions;

import java.util.Scanner;

public class Exercise08 {
	// 필드..
	static int balance = 0; // main method
	static Scanner scn = new Scanner(System.in);

	public static boolean checkAdmin(String id, String pass) {
		if (id.equals("admin") && pass.equals("1234")) {
			return true;
		}
		return false;
	}

	public static void printMenu() {  
		System.out.println("-----------------------");
		System.out.println("1.예금 2.출금 3.잔액 4.종료");
		System.out.println("-----------------------");
		System.out.println("선택>");
	}

	public static void deposit() {
		System.out.println("금액을 입력하세요>>>");
		int temp = scn.nextInt(); // if구문 안에서만
		// balance = balance + temp;
		// System.out.println("입금되었습니다");
		System.out.println("입금액>>" + temp);
		if (temp + balance > 100000) {
			System.out.println("입금불가");
		} else {
			System.out.println("입금가능");
			//balance = balance + temp;
			balance = add(balance, temp);
		}
	}

	public static void withdraw() {
		System.out.println("금액을 입력하세요>>>");
		int temp = scn.nextInt();
		// balance = balance - temp;
		// System.out.println("출금되었습니다");
		// 잔액보다 큰 금액 출금하려면 안된다고 메세지.
		if (temp > balance) {
			System.out.println("출금이 불가합니다");
		} else {
			//balance = balance - temp;
			balance = add(balance, -temp);
		}

	}
	
	public static int add(int balance, int amount) {
		int sum =balance + amount;
		return sum;
		
	}

	public static void main(String[] args) {
		// 간단한 예금출금 프로그램.
		boolean run = false;
		do {
			if (!run) {
				// id, pass = admin, 1234
				System.out.println("id입력>>>");
				String id = scn.nextLine();
				System.out.println("passwd입력>>>");
				String pass = scn.nextLine();

				run = checkAdmin(id, pass);
			} else {
				// 메뉴출력.
				printMenu(); //메소드 호출.
				int menu = scn.nextInt(); // while구문 안에서만
				if (menu == 1) {
					System.out.println("예금처리");
					deposit();
				} else if (menu == 2) {
					System.out.println("출금처리");
					withdraw();
				} else if (menu == 3) {
					System.out.println("잔액조회처리");
					System.out.println("현잔액:" + balance);

				} else if (menu == 4) {
					run = false;
				}
			} // else
		} while (run); // while
		System.out.println("프로그램을 종료합니다.");
	}// main

}// class
