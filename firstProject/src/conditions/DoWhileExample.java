package conditions;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		do {
			System.out.println("�̸��� �Է�: ");
			String name = scn.nextLine();
			if (name.equals("quit")) {
				break;
			}
			System.out.println("�Է��̸�: "+ name);
		} while (false);
		System.out.println("���α׷��� ����.");
	}

}

