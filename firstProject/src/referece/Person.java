package referece;
// ���Ǽ����� ��� (object) => �ʵ� , �޼ҵ�
public class Person {
	//�ʵ弱��.
    int age;// ���� 
     String name; //�̸�
     double height; //Ű 
     double weight; //������
     
     //�޼ҵ弱��.
     void walk() {
    	 System.out.println("�Ƚ��ϴ�.");
     }
     void sleep() {
    	 System.out.println("���� ��ϴ�.");
     }
     void showInfo() {
    	 System.out.println("�̸���"+name+"�̰� ���̴�" + age);
     }
  
     
}
