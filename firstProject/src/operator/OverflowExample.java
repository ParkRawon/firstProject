package operator;

public class OverflowExample {
	public static void main(String[] args) {
		try {
		long r1 = add(30L, 20L);
		
		System.out.println("결과: " + r1);
	} catch (ArithmeticException e) {
		System.out.println(e.getMessage());
	}	
	System.out.println("end of prog.");
}
	public static long add(long a, long b) {
		return a + b;
	}
	
	public static int add (int a, int b) {
          //a > max - b : 100 +  2147483647 >  2147483647
		 // a < min + b : a - b < min  ->  -10 -  2147483647 <  2147483647 
		if(a > Integer.MAX_VALUE - b) {
			throw new ArithmeticException("범위 밖의 값입니다1.");
		}  else if (a < Integer.MIN_VALUE + b) {
			throw new ArithmeticException("범위 밖의 값입니다2.");
			
		}
		int result = a + b;
		return result;
		
	}

}
