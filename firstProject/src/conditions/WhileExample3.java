package conditions;

import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("�̸��� �Է�: ");
			String name = scn.nextLine();
			if (name.equals("quit")) {
				break;
			}
			System.out.println("�Է��̸�: "+ name);
		}
		System.out.println("���α׷��� ����.");
	}

}
