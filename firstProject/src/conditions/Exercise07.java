package conditions;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		// ������ ������� ���α׷�.
		int balance = 0;   //main method
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("-----------------------");
			System.out.println("1.���� 2.��� 3.�ܾ� 4.����");
			System.out.println("-----------------------");
			System.out.println("����>");
			int menu = scn.nextInt(); //while���� �ȿ�����
			if(menu == 1) {
				System.out.println("����ó��");
				System.out.println("�ݾ��� �Է��ϼ���>>>");
				int temp = scn.nextInt();  //if���� �ȿ�����
				balance = balance + temp;
				//System.out.println("�ԱݵǾ����ϴ�");
				System.out.println("�Աݾ�>>" + temp);
				if (balance + temp >= 100000) {
					System.out.println("�ԱݺҰ�");
				} else {
					System.out.println("�Աݰ���");
				}
				
				
			} else if (menu == 2) {
				System.out.println("���ó��");
				System.out.println("�ݾ��� �Է��ϼ���>>>");
				int temp = scn.nextInt();
			   //balance = balance - temp;
				//System.out.println("��ݵǾ����ϴ�");
				//�ܾ׺��� ū �ݾ� ����Ϸ��� �ȵȴٰ� �޼���.
				 if (temp > balance) {
					System.out.println("����� �Ұ��մϴ�");
				} else {
					balance = balance - temp;
				}
				}else if (menu == 3) {
				System.out.println("�ܾ���ȸó��");
				System.out.println("���ܾ�:" + balance);
				
			} else if (menu == 4) {
				break;
			} 
		} //while
		System.out.println("���α׷��� �����մϴ�.");
	}//main

}//class
