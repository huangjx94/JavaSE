import java.util.*;
public class WeiShu{
	public static void main(String[] args){
		System.out.println("������һ��1-9999֮�����"); 
	    
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		System.out.println("������ֵ�λ����"+st.length());
		StringBuffer b = new StringBuffer();
		b.append(st);//append()���ַ�������֮������µ�����
		b.reverse();//��StringBufferʵ�����ַ����б���䵹����ַ�����
		if(st.equals(b.toString())){   //toString()�������ǰѶ���ת����String����
			System.out.println(st + "�ǻ�����");
		}else{
			System.out.println(st + "���ǻ�����");
		}	
	}
}