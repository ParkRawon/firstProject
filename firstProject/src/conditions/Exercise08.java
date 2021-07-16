package conditions;

import java.util.Scanner;

public class Exercise08 {
	// �ʵ�..
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
		System.out.println("1.���� 2.��� 3.�ܾ� 4.����");
		System.out.println("-----------------------");
		System.out.println("����>");
	}

	public static void deposit() {
		System.out.println("�ݾ��� �Է��ϼ���>>>");
		int temp = scn.nextInt(); // if���� �ȿ�����
		// balance = balance + temp;
		// System.out.println("�ԱݵǾ����ϴ�");
		System.out.println("�Աݾ�>>" + temp);
		if (temp + balance > 100000) {
			System.out.println("�ԱݺҰ�");
		} else {
			System.out.println("�Աݰ���");
			//balance = balance + temp;
			balance = add(balance, temp);
		}
	}

	public static void withdraw() {
		System.out.println("�ݾ��� �Է��ϼ���>>>");
		int temp = scn.nextInt();
		// balance = balance - temp;
		// System.out.println("��ݵǾ����ϴ�");
		// �ܾ׺��� ū �ݾ� ����Ϸ��� �ȵȴٰ� �޼���.
		if (temp > balance) {
			System.out.println("����� �Ұ��մϴ�");
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
		// ������ ������� ���α׷�.
		boolean run = false;
		do {
			if (!run) {
				// id, pass = admin, 1234
				System.out.println("id�Է�>>>");
				String id = scn.nextLine();
				System.out.println("passwd�Է�>>>");
				String pass = scn.nextLine();

				run = checkAdmin(id, pass);
			} else {
				// �޴����.
				printMenu(); //�޼ҵ� ȣ��.
				int menu = scn.nextInt(); // while���� �ȿ�����
				if (menu == 1) {
					System.out.println("����ó��");
					deposit();
				} else if (menu == 2) {
					System.out.println("���ó��");
					withdraw();
				} else if (menu == 3) {
					System.out.println("�ܾ���ȸó��");
					System.out.println("���ܾ�:" + balance);

				} else if (menu == 4) {
					run = false;
				}
			} // else
		} while (run); // while
		System.out.println("���α׷��� �����մϴ�.");
	}// main

}// class
