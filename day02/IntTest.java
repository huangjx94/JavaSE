public class IntTest{ 
    public static void main (String args[]){
	//С���γ���Ĭ���Զ�ת����int����
	int num =866;
	//�����γ��������Զ�ת��Ϊlong����
	long long1 = 8888888888888888L;  //����ʹ�ô�дL����������
      
	//�˽��Ʊ�ʾ���Σ���0��ͷ
	int var = 013;
	System.out.println("var:" + var);
	//ʮ�����Ʊ�ʾ���Σ���0x,0X��ͷ
	int hexnum = 0xFF;
	int hexnum1 = 0X1F;
	System.out.println("hexnum" +hexnum + "\n hexnum1" + hexnum1);
    //�����Ʊ�ʾ����0b��0B��ͷ	
    byte byteNum = (byte)0b11111111;
	int intNum = 0b11111111;
	System.out.println("bytenum" +byteNum + "\n intNum" +intNum );
	  
	}
}