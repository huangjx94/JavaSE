public class Class{
	//�����
	static String str = getStaticVar();
	//�෽��
	private static String  getStaticVar(){
		System.out.println("static����=�෽��");
		return " Static����";
	}
	//ʵ������
	int var ;
	//ʵ������
	private int getIntVar(){
		System.out.println("ʵ������");
		return 123;
	}
	
	//��̬�����
	//�ڼ���������ʱ���ִ��   ����ִֻ��һ��
	
	static {
		System.out.println("static�������");
	}
	
	// �Ǿ�̬�����
	// ÿ�ι������󶼻�ִ�� 
	// ���Դ��湹�췽��
	
	{
		System.out.println("�Ǿ�̬�����");
	}
	
	//���췽��
	public Class(){
		System.out.println("���췽��");
	}
	
	public static void main(String[] args){
		System.out.println("����main");
		Class cl = new Class();
		System.out.println("�˳�main");
	
	}
	
}