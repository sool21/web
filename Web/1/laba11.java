import java.util.Scanner;
public class laba11 {
   public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
       double x1, x2, x11=0, x22=0;
       System.out.print("¬ведите x1: ");
       x1 = sc.nextDouble();
       System.out.print("¬ведите x2: ");
       x2 = sc.nextDouble();
	   x11-=10;
	   Math.abs(x11);
	   x22-=10;	
	   Math.abs(x22);
       if( x11 < x22 )
         {
         System.out.print(x1);
         }
         else System.out.print(x2);
         }
   }