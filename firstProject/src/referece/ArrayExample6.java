package referece;

public class ArrayExample6 {
	public static void main(String[] args) {
		//�迭�� ����. �л��� ���� scores
		// ��������� ���� ���� ������ ���ϴ� ��.
		int[] scores = new int[3];  //{90, 80, 70};
		scores = new int[5];
		for(int i=0; i<scores.length; i++) {
		   scores[i] = (int) (Math.random()*20)+80;	
		} 
		double avg = 0;
		int maxValue = 0;
		// �ڵ��ϼ���..
		int sum = 0;
		
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores[" + i + "]�� ��" + scores[i]);
			sum += scores[i];
			if (scores[i] > maxValue) {
				maxValue = scores[i];
			}
		} 
				
		 avg = (double) sum / scores.length;
		
		
		System.out.println("����� "+ avg);
		System.out.println("�ְ�������" + maxValue);
		
	}

}
