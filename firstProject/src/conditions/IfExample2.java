package conditions;

import java.util.Scanner;

public class IfExample2 {
	public static void main(String[] args) {
		// ������� �Է°��� �о���̴� Ŭ���� Scanner
		Scanner scanner = new Scanner(System.in); // System.in : Ű�����Է�.
		System.out.println("�����Է�..");
		int val = scanner.nextInt();
		System.out.println("�Է°�:" + val);
		// Ȧ������ ¦������ �����ϴ� �ڵ�. 
		if(val % 2 ==0) {
			 System.out.println("¦���Դϴ�.");
			} else {
			System.out.println("Ȧ���Դϴ�.");
			}
		 
	}

}
