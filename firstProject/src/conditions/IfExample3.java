package conditions;

import java.util.Scanner;

public class IfExample3 { 
	public static void main(String[] args) {
		// ������ �� 1,2,3�� ����. => 1:���� 2:���� 3:�� 
		// ����� ���� �Է�.. 2 �Է�.
		// ������ �� = ����� �Է°�.
		// �����Դϴ�. Ʋ�Ƚ��ϴ�.
		int val1 = (int) (Math.random() *3) + 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ��");
		int val2  = scanner.nextInt();
		System.out.println("�Է°�" + val2 );
		if(val1 == val2) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
		}
		
		System.out.println("--------------");
		
		// ������ �� 1,2,3�� ����. => 1:���� 2:���� 3:��
		int ran = (int) (Math.random() *3) +1;
		String anyVal = "";
		if (ran == 1) {
			anyVal = "����";
		} else if (ran == 2) {
			anyVal = "����";
		} else if (ran == 3) {
			anyVal = "��";
		}
		// ����� ���� �Է�.. 2 �Է�.
		
		
		// ������ �� = ����� �Է°�.
		// �����Դϴ�. Ʋ�Ƚ��ϴ�.
		
	}

}//end of main
