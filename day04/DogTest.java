//����Dog�ĳ�Ա�����ͳ�Ա����
public class DogTest{
	public static void main(String[] args){
	
		//ʵ����
		Dog d = new Dog();
		
		//����Ա������ֵ
		d.color = "yellow";
		d.age = 8; 
		d.name = "xiaohei";
		System.out.println(d.color +"------"+ d.age +"------"+ d.name);
		
		//ʹ�÷���
		d.jump();
		d.run();
	}
}