package conditions;

public class SwitchExample {
	public static void main(String[] args) {
		int ran = (int) (Math.random()*5) + 1;
		switch (ran) {
		case 1 :
			System.out.println("1���� ���Խ��ϴ�.");	
			break;
		case 2 : 
		    System.out.println("2���� ���Խ��ϴ�.");
		    break;
		case 3 : 
		    System.out.println("3���� ���Խ��ϴ�.");
		    break;
		default :
			System.out.println("�׿�");
		}
		
	}

}