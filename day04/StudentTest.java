//����Student�ĳ�Ա�����ͳ�Ա����
public class StudentTest{
	public static void main(String[] args){
		//���� ������ = new ����();
		Student s = new Student();//����һ��ѧ������
		
		//ʹ�ó�Ա����
		//System.out.println("s.name");//null
		//System.out.println("s.age");//0
		  System.out.println(s.name +"-----"+ s.age);
			
		//����Ա������ֵ
		s.name = "yonh";
		s.age = 20;
		System.out.println(s.name +"-----"+ s.age);
		
		//���÷���
		s.study();
		s.eat("������");
	}
}