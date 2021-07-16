package operator;

public class IfElseExample {
	public static void main(String[] args) {
		int score = 90;
		// 60보다 크면 consol "합격입니다.";
		// 60보다 작으면 console "불합격입니다.";
		if (60 <= score) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		System.out.println("-----------------");
		// 90점 이상 A학점.
		// 80점 이상 B학점.
		// 70점 이상 C학점.
		// 60점 이상 D학점.
		// 이하 F학점.

		if (90 <= score) {
			if (score >= 95) {
				System.out.println("A+학점");
			}else {
				System.out.println("A학점.");
			}
			
		} else if (80 <= score) {
			System.out.println("B학점.");
			
		} else if (70 <= score) {
			System.out.println("C학점.");
			
			
		} else if (60 <= score) {
			System.out.println("D학점.");
			
		} else {
			System.out.println("F학점.");
			
		}//end of main
		//end class

	}

}
