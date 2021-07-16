package referece;

public class ArrayExample6 {
	public static void main(String[] args) {
		//배열을 선언. 학생의 점수 scores
		// 평균점수와 가장 높은 점수를 구하는 것.
		int[] scores = new int[3];  //{90, 80, 70};
		scores = new int[5];
		for(int i=0; i<scores.length; i++) {
		   scores[i] = (int) (Math.random()*20)+80;	
		} 
		double avg = 0;
		int maxValue = 0;
		// 코딩하세요..
		int sum = 0;
		
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores[" + i + "]의 값" + scores[i]);
			sum += scores[i];
			if (scores[i] > maxValue) {
				maxValue = scores[i];
			}
		} 
				
		 avg = (double) sum / scores.length;
		
		
		System.out.println("평균은 "+ avg);
		System.out.println("최고점수는" + maxValue);
		
	}

}
