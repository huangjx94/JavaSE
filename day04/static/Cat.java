/*
	è�ࣺ
		��Ա���������䣬��ɫ��Ʒ��
		��Ա��������

*/

//Cat  ĳ��Ʒ�ֵ�è 

public class Cat{
	//����
	
	//Ʒ��
	static String type; //�������  �������ڶ���       ����.�����
    //����	
	int age;            //ʵ�������������ڶ��� ��������.ʵ������  
	//��ɫ
	String color;                   
	
	//��̬�����
	static{//ʹ������ʼ�� �����
		type = "sssssss";
		//age = 123;      //����ʵ������
		//color = "sds";  //����ʵ������
		System.out.println("������static�������");
	}
	
	//����
	Cat(){
	  
	}
	
	Cat(int age,String color){
		this.type = "heimao";  	
		this.age = age;
		this.color = color;
	}
	
	//ʵ������:���Է��������  this��������ߵ�����
	void bark(){
		this.type = "baimao";
		System.out.println("barking");
	}
	
	//�෽�������ܷ���ʵ������-----����������
	static void bark1(){  
		//û�ж��󣬶��Բ��ܷ���ʵ��������ʵ������
		//ֻ�ܷ�����������ֲ�����
		//type = "laomao";
		//static��abstract����ͬʱ����
		System.out.println("�෽��");
	}
	
}