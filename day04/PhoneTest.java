//����PhoneTest��ĳ�Ա�����ͳ�Ա����
public class PhoneTest{
	public static void main(String[] args){
		//ʵ����
		Phone p = new Phone();//����һ��Phone����
		System.out.println(p.brand+"-----"+p.color+"------"+p.price);
		
		//����Ա������ֵ
		p.brand = "xiaomi";
		p.color = "black";
		p.price = 1850;
		System.out.println(p.brand+"-----"+p.color+"------"+p.price);
		
		
		//���÷���
		p.call("kangkang");
		p.sendMessage();
		p.online();
	}
}