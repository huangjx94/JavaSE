//��Ա������ʼ��������  ====���캯��
public class CatTest{
	public static void main(String[] args){
		//�����:1.�������ڶ����������ʵ������ 2.�����ڶ������ 
		//       3.û�������κ�ʵ�����ܷ���4.ֱ��ʹ������������:��.�ֶ�
		System.out.println("Cat.type=" + Cat.type);
		Cat.type = "��˹è"; 
		System.out.println("Cat.type=" + Cat.type);
		
		//�෽��
		Cat.bark1();
	
		/* Cat.age = 123;
		Cat.bark(); */
		
	
		Cat c = new Cat(10,"yellow");
		Cat c1 = new Cat(13,"black");
		
		//ʹ�ö������÷��� �෽��
		c.bark1();   //this===c
		c1.bark1();	//this===c1
/*		
		 //�����	
		System.out.println("c.type=" + Cat.type);
		System.out.println("Cat.type=" + Cat.type);
		System.out.println("c1.type=" + Cat.type);
		
		//ʵ������:�����ڶ���
		System.out.println("c.age=" + c.age);
		System.out.println("c1.age=" +c1.age);
		
		
*/
		
		
	}
}