public class BooleanTest{
   public static void main(String args[]){
        boolean flag = true;
		//[true] [false] 
	    //boolean flag = 0; //error
		if(!flag){
		System.out.println("真");
		}
		else{
		System.out.println("假");
		}
		//使用boolean和字符串进行连接运算，boolean会自动转换成字符串
		//""空字符串+表示默认后面的自动转换成字符串
		String str = true + "";
		System.out .println("str="+str);
		
   }
}