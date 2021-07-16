package basic;

public class AvgExample {
  public static void main(String[] args) {
	  //국어, 영어, 수학 0 ~ 100
	  // 국어: 85, 수학: 88, 영어: 83
	  // 합계, 평균
	  //학생이름 : 홍길동
	  //홍길동의 점수합계는 256, 평균은 85.333...입니다
	  int kor = 75;
	  int math = 88;
	  int eng = 83;
	  
	  int sum = kor + math + eng;
	    System.out.println("합:" + sum);
	    
	  
	  double avg = sum / 3.0;
	   System.out.println("평균:" + avg);
	   
	  String name = "홍길동";
	   System.out.println( name + "의 점수합계는 " + sum +", 평균은" + avg + " 입니다.");
			  
	    		
	    
	  
	    
	  
	  
}
}
