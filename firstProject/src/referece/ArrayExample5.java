package referece;

import java.util.Scanner;

public class ArrayExample5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] names = new String[5];
		names[0] = "Hong"; // ù��°.
		names[1] = "Hwang"; // �ι�°.
		names[2] = "Park";
		names[3] = "Kim";
		names[4] = "Choi";
		
		String[] orders = new String[5];
		orders[0] = "ù��°";
		orders[1] = "�ι�°";
		orders[2] = "����°";
		orders[3] = "�׹�°";
		orders[4] = "�ټ���°";

		// Hong Enter => ù��° ��ġ�� �ֽ��ϴ�.
		// quit Enter => ���α׷� ����.
		// Lee Enter => �̷� �̸��� �����ϴ�.
		
		while(true) {
			boolean pass = false;
			System.out.println("�̸��� �Է�>>>>");
			String input = scn.nextLine();
			if (input.equals("quit")) {
				break;
			} 
			//�Է��� ���̶� �迭�� ����ִ� ���� ��...���°�Դϴ�.
			for (int i = 0; i < names.length; i++) {
		    if(input.equals(names[i])) {
		    	System.out.println(orders[i] + "�Դϴ�.");
		    	pass = true;
		    } 
		    	
		    }
		    } 
			
			//if(!pass) {
				System.out.println("���α׷� ����.");
			}
		
	}
	//}	

