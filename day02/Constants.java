import java.util.*;
public class Constants{
    public static void main(String args[]){
       final double CM_PER_INCH = 2.54;
	   double paperWidth = 8.5;
	   double paperHeight = 11;
	   System.out.println("Paper size in centimeters:" 
	   + paperHeight*CM_PER_INCH + "by" + paperWidth*CM_PER_INCH);
	   
	   int x = 5,y = 4,z = 2;
	   double w = x*y/z;
	   System.out.println(w);
	   
	   int n = 12;
	   n++;
	   System.out.println(n);
	   
	  /* int m = 6;
	   int n1 = 9;
	   int a = 3 * m++;
	   int b = 3 * ++n1;
	   System.out.println("a" +a + "\n  b" +b);
	   */
	   
	 /* String exp = "exp";
	   String PG13 = "deleted";
	   String message = exp + PG13;
	   System.out.println("The message is " + message);
	   
	   Scanner in = new Scanner(System.in);
	   System.out.print("What is your name?");
	   String name = in.nextLine();
	   System.out.print("How old are you?");
	   int age = in.nextInt();
	   System.out.println("Hello" + name + "Next year,you will be" + (age + 1));
	  */   
		 
	   int yoursales = 5000;
	   int target = 4500;
	   double bonus;
	   String performance;
	   if(yoursales >=target){
	      performance = "Satisfactory";
		  bonus = 100 + 0.01 * (yoursales-target);  
	   }
	   else{
          performance = "Unsatisfactory"; 
          bonus = 0;		  
 	   }  
       System.out.println("performance" + performance +"\n target" +target);	   
    }
}