package conditions;

public class WhileExample2 {
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("�ȳ��ϼ���.");
			int ran = (int)(Math.random()* 3) + 1;
			System.out.println("������ ��" + ran);
			
			if(ran == 3) {
				break;
			}
		}
		System.out.println("���α׷� ����.");
	}

}
