package basic;

public class AvgExample {
  public static void main(String[] args) {
	  //����, ����, ���� 0 ~ 100
	  // ����: 85, ����: 88, ����: 83
	  // �հ�, ���
	  //�л��̸� : ȫ�浿
	  //ȫ�浿�� �����հ�� 256, ����� 85.333...�Դϴ�
	  int kor = 75;
	  int math = 88;
	  int eng = 83;
	  
	  int sum = kor + math + eng;
	    System.out.println("��:" + sum);
	    
	  
	  double avg = sum / 3.0;
	   System.out.println("���:" + avg);
	   
	  String name = "ȫ�浿";
	   System.out.println( name + "�� �����հ�� " + sum +", �����" + avg + " �Դϴ�.");
			  
	    		
	    
	  
	    
	  
	  
}
}
