public class Add{
   public static void main(String args[]){
       int a = 0;
	   System.out.println(++a );
	   int b =0;
	   System.out.println(b++);
	   
	   int score = 80;int x = -100;
	   String  type = score < 60?"不及格":"及格";
	   int flag = x>0?1:(x==0?0:-1);
	   System.out.println("type="+type);
	   System.out.println("flag="+flag);
   }
}