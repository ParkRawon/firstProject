package referece;

public class ArrayExample2 {
	public static void main(String[] args) {
		int[] intAry = { 10, 20, 30, 22, 17, 33 };
		System.out.println("�迭ũ��:" + intAry.length);
		System.out.println(intAry[0]);
		intAry[0] = 11; //�迭����
		int sum = 0;
		int maxValue = 0; //�迭�� �ִ� ���߿��� ���� ū ���� ���ʹ�.
		for (int i = 0; i < intAry.length; i++) {
			System.out.println("intAry[" + i + "]�� ��" + intAry[i]);
			sum = sum + intAry[i];
			//maxValue �� �迭�� �� ��ҿ� �� �� ū���� maxValue�� ����.
			if(intAry[i] > maxValue) {
				maxValue = intAry[i];
			} 
		}
		System.out.println("�հ�:" + sum);
		System.out.println("���� ū��: "+ maxValue);

//		double[] dblAry = { 1.0, 2.0, 3.0 };// double �Ǽ�
		//		String[] names = { "Ra", "Won", "Park" };// String ���ڿ�
		//	names[0] = "Hwang";
		//names
		// ���� for��. �ݺ���
		//	for(String name : names) {
		//		System.out.println(name);
		//	}
		//	for(double num : dblAry ) {
		//		System.out.println(num);
		//	}

	}// end of main

}//end of clss
