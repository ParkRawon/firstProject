package referece;

public class ArrayExample2 {
	public static void main(String[] args) {
		int[] intAry = { 10, 20, 30, 22, 17, 33 };
		System.out.println("배열크기:" + intAry.length);
		System.out.println(intAry[0]);
		intAry[0] = 11; //배열변경
		int sum = 0;
		int maxValue = 0; //배열에 있는 값중에서 제일 큰 값을 담고싶다.
		for (int i = 0; i < intAry.length; i++) {
			System.out.println("intAry[" + i + "]의 값" + intAry[i]);
			sum = sum + intAry[i];
			//maxValue 에 배열의 각 요소와 비교 후 큰값을 maxValue에 대입.
			if(intAry[i] > maxValue) {
				maxValue = intAry[i];
			} 
		}
		System.out.println("합계:" + sum);
		System.out.println("가장 큰값: "+ maxValue);

//		double[] dblAry = { 1.0, 2.0, 3.0 };// double 실수
		//		String[] names = { "Ra", "Won", "Park" };// String 문자열
		//	names[0] = "Hwang";
		//names
		// 향상된 for문. 반복문
		//	for(String name : names) {
		//		System.out.println(name);
		//	}
		//	for(double num : dblAry ) {
		//		System.out.println(num);
		//	}

	}// end of main

}//end of clss
