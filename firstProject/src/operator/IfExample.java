package operator;

public class IfExample {
	public static void main(String[] args) {
		//if () {} 
		int v1 = 30;
		int v2 = 30;
		
		if(v1 > v2) {
			System.out.println("v1 �� v2���� Ů�ϴ�.");
		} else if (v1 == v2) {
			System.out.println("v1�� v2�� �����ϴ�.");
		} else {
			System.out.println("v2�� v1���� Ů�ϴ�.");
		}
		
		String str1 = "ȫ�浿";
		String str2 = "ȫ�浿";
		String str3 = new String("ȫ�浿");
		
		if (str1.equals(str3)) {
			System.out.println("���� �̸��Դϴ�.");
		} else {
			System.out.println("�ٸ� �̸��Դϴ�.");
		}
			
		System.out.println("end of prog.");
	} 

}
