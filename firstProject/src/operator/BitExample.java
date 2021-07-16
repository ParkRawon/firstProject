package operator;

public class BitExample {
	public static void main(String[] args) {
		int numb1 = 10;
		numb1 = -numb1;
		
		System.out.println("numb1曖 高:"+ (~numb1 + 1)); //-11+1
		
		int var1, var2, result;
		var2 = var1 = 10;
		
		result = var1 + var2;
		result = sum(10, 10) + sum(20,20) + sum(30, 30);				
		System.out.println("唸婁高:" + result);
		
		String name ="梯團熱";
		String str = welcomeMessage(name);
		System.out.println(str);
		
	}
	
	public static int sum(int a, int b) {
		int val = a + b -5;
		return val;		
	} 
	
	public static String welcomeMessage(String n) {
		String name = "Welcome" + n;
        return name;
		
	}

}
