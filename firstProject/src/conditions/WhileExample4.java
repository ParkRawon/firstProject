package conditions;

public class WhileExample4 {
	public static void main(String[] args) {
		//1-50���� 2 �Ǵ� 3�� ����� ��.
		//while������ ���.
		 int sum = 0;
		 int i = 1;
		 while (i<=50) {
		  if(i % 2 == 0 || i % 3 == 0 ) {
		      sum = sum + i ;
			 
			   }
		  i++;	     
		}
		 System.out.println("�հ�:"+sum);
		
	}

}
