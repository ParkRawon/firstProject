package conditions;

public class ForExample {
	public static void main(String[] args) {
		int sum =0;
		for (int i =1; i <= 10; i++) {
			if (i % 2 ==0) {
				sum =sum + 1;	
			System.out.println("���� i :" +i);
			System.out.println("���� sum :" + sum);
			try {
				Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		} else if (i == 5) {
			break;
		}
	}
            System.out.println("�����հ�" + sum);
}
}
