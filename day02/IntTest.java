public class IntTest{ 
    public static void main (String args[]){
	//小整形常量默认自动转化成int类型
	int num =866;
	//大整形常量不会自动转化为long类型
	long long1 = 8888888888888888L;  //建议使用大写L，容易区分
      
	//八进制表示整形：以0开头
	int var = 013;
	System.out.println("var:" + var);
	//十六进制表示整形：以0x,0X开头
	int hexnum = 0xFF;
	int hexnum1 = 0X1F;
	System.out.println("hexnum" +hexnum + "\n hexnum1" + hexnum1);
    //二进制表示：以0b，0B开头	
    byte byteNum = (byte)0b11111111;
	int intNum = 0b11111111;
	System.out.println("bytenum" +byteNum + "\n intNum" +intNum );
	  
	}
}