/*	
	�ֻ���
		���ԣ�Ʒ�ƣ��۸���ɫ
		��Ϊ����绰�������ţ�����

		ת��ΪJava�е���
		
	�ֻ���:
		��Ա������Ʒ�ƣ��۸���ɫ
		��Ա��������绰�������ţ�����
*/

public class Phone{
	//Ʒ��
	String brand;
	//��ɫ
	String color;
	//�۸�
	int price;
	
	//��绰�ķ���
	public void call(String name){
		System.out.println("��"+name+"��绰");
	}
	
	//�����ŵķ���
	public void sendMessage(){
		System.out.println("Ⱥ������");
	}

	//�����ķ���
	public void online(){
		System.out.println("����");
	}
}