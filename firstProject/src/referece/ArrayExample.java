package referece;

import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] intAry = new int[3];  // �迭�� ũ�⸸ ����.
		intAry = new int[] { 55, 65,75,55}; //�� ���� ����.
		intAry[2] = 88;
		intAry[1] = 90;
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum = sum + intAry[i];
		}
		System.out.println("intAry�� ��: "+sum);
		
		
		int[] intAry2 = { 1, 2, 3, 4, 5 }; //�迭�� 5�� ũ���� �� ��ġ�� ���� ����.
		intAry2 = new int[] { 81, 82, 83, 84, 85};
 		sum = 0;
 		for(int i=0; i<intAry2.length; i++) {
			sum = sum + intAry2[i];
		}
 		System.out.println("intAry2�� ��: "+sum);
		
//		for(int i=0; i<3; i++) {
	//	System.out.println("���Է�>>>>");
		//	int num = scn.nextInt();
	//		intAry[i] = num;
	//	}
	//	System.out.println(intAry[0]);
	//	System.out.println(intAry[1]);
	//	System.out.println(intAry[2]);
	}
	public static void aryExam() {
		int[] scores = new int[5];
		scores[0] = 70;
		scores[1] = 75;
		scores[2] = 80;
		scores[2] = 88; //���� ��ȯ�ϰ� ������
		scores[3] = 85;
		scores[4] = 90;
		int sum = 0;
		for (int i=0; i<5; i++) {
			//System.out.println(scores[i]); //scores[0] 
			sum += scores[i];
 		}
		double avg = sum / 5.0;
		System.out.println("���: " + avg);
	}
	public static void intExam() {
		int score1 = 70;
		int score2 = 75;
		int score3 = 80;
		int score4 = 85;
		int score5 = 90; //�л��� 30���̸� ���� 30�� �����ϰ� 30���� ���ϵ��� �ڵ�.
		int sum = 0;
		sum = score1 + score2 + score3 + score4 + score5;
		double avg = sum / 5.0;
		System.out.println("���: " + avg);
	}

}
