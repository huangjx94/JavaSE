/*	
	����
		���ԣ���ɫ�����䣬����
		��Ϊ���ܣ���

		ת��ΪJava�е���
		
	�ֻ���:
		��Ա��������ɫ�����䣬����
		��Ա�������ܣ���
*/

public class Dog{
	//��ɫ
	String color ;
	//����
	int age;
	//����
	String name;
	
	//����һ��jump����
	public void jump(){
		System.out.println("����ִ��jump����");
	}
	//����һ��run������run������Ҫ����jump����
	public void run(){
		//ʹ��this���õ���run()����
		this.jump();
		System.out.println("����ִ��run����");
	}
	
}