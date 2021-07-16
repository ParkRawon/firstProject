package referece;

public class PersonExample {
	public static void main(String[] args) {
		
		Person prw = new Person(); //실제 존재를 만드는 것: 인스턴스화(개체)여기선 Person
		prw.name = "박라원";         //prw= 참조변수
	    prw.age = 27;
	    prw.height = 161.0;
	    prw.weight = 50;
//사용불가	    prw.brith = "19951029";
	    prw.walk();
	    prw.sleep();
	    prw.showInfo();
	    
	    Person psy = null;  //실체(인스턴스)
	    
	    
	    
	    //아직안만듬
	    psy.walk();
	}

}
