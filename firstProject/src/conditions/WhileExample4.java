package conditions;

public class WhileExample4 {
	public static void main(String[] args) {
		//1-50까지 2 또는 3의 배수의 합.
		//while구문을 사용.
		 int sum = 0;
		 int i = 1;
		 while (i<=50) {
		  if(i % 2 == 0 || i % 3 == 0 ) {
		      sum = sum + i ;
			 
			   }
		  i++;	     
		}
		 System.out.println("합계:"+sum);
		
	}

}
