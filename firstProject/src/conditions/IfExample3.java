package conditions;

import java.util.Scanner;

public class IfExample3 { 
	public static void main(String[] args) {
		// 임의의 수 1,2,3을 생성. => 1:가위 2:바위 3:보 
		// 사용자 값을 입력.. 2 입력.
		// 임의의 값 = 사용자 입력값.
		// 정답입니다. 틀렸습니다.
		int val1 = (int) (Math.random() *3) + 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("임의의 값");
		int val2  = scanner.nextInt();
		System.out.println("입력값" + val2 );
		if(val1 == val2) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("틀렸습니다.");
		}
		
		System.out.println("--------------");
		
		// 임의의 수 1,2,3을 생성. => 1:가위 2:바위 3:보
		int ran = (int) (Math.random() *3) +1;
		String anyVal = "";
		if (ran == 1) {
			anyVal = "가위";
		} else if (ran == 2) {
			anyVal = "바위";
		} else if (ran == 3) {
			anyVal = "보";
		}
		// 사용자 값을 입력.. 2 입력.
		
		
		// 임의의 값 = 사용자 입력값.
		// 정답입니다. 틀렸습니다.
		
	}

}//end of main
