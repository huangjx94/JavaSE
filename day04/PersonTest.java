//����person��
public class PersonTest{
	public static void main(String[] args){
		//ʵ����: ����=����=ʵ��
	   //�ڶ������ʱ��[û��]�Զ����޲ι�����������ϵͳ�Զ�ָ��������
	   //�ڶ������ʱ��[��]�Զ����޲ι�������ʹ���Զ���Ĺ�����
		
		Person geminno = new Person();
		Person gem = new Person("�߲�");
		Person gemptc = new Person("�߲�����",12);
		
		//�������ã�����.��Ա���� ����.��Ա����
		geminno.info();
	    gem.info();
		gemptc.info();
	 
	}//end main
}//end class