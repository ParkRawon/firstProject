package variable;  //F2 - ��Ű���̸��ٲٱ�

public class BoolExample {
    public static void main(String[] args) {
		boolean existOrNot = true;
		int notExist = 10;
		
		existOrNot = notExist != 50;      //==-���� !-�ٸ���
		
		if (!existOrNot) {
			System.out.println("�����ϴ� ���Դϴ�.");
			
		}
	       
		    System.out.println(Byte.MAX_VALUE);
		    if (Byte.MAX_VALUE < 200) {
		    	System.out.println("���Դϴ�.");
		    }
		    
		    System.out.println(Long.MAX_VALUE);
		    
		    System.out.println("end or prog");
	}
}
