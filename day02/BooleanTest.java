public class BooleanTest{
   public static void main(String args[]){
        boolean flag = true;
		//[true] [false] 
	    //boolean flag = 0; //error
		if(!flag){
		System.out.println("��");
		}
		else{
		System.out.println("��");
		}
		//ʹ��boolean���ַ��������������㣬boolean���Զ�ת�����ַ���
		//""���ַ���+��ʾĬ�Ϻ�����Զ�ת�����ַ���
		String str = true + "";
		System.out .println("str="+str);
		
   }
}