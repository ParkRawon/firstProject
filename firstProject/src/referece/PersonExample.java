package referece;

public class PersonExample {
	public static void main(String[] args) {
		
		Person prw = new Person(); //���� ���縦 ����� ��: �ν��Ͻ�ȭ(��ü)���⼱ Person
		prw.name = "�ڶ��";         //prw= ��������
	    prw.age = 27;
	    prw.height = 161.0;
	    prw.weight = 50;
//���Ұ�	    prw.brith = "19951029";
	    prw.walk();
	    prw.sleep();
	    prw.showInfo();
	    
	    Person psy = null;  //��ü(�ν��Ͻ�)
	    
	    
	    
	    //�����ȸ���
	    psy.walk();
	}

}
