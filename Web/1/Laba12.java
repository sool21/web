import java.util.Scanner;
public class Laba12 {
   public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
       double a, b, c, d, x1, x2, d1;
       System.out.print("Введите a: ");
       a = sc.nextDouble();
       System.out.print("Введите b: ");
       b = sc.nextDouble();
       System.out.print("Введите c: ");
       c = sc.nextDouble();
       d=b*b-4*a*c;
       if( d < 0 )
         {
         System.out.print("Корней нет");
         }
         else {if (d==0){ x1=0-b/2*a; System.out.print(x1);} else {d1=Math.sqrt(d); x1=0-(b-d1)/2*a; x2=0-(b+d1)/2*a; System.out.print(x1); System.out.print(x2);}
         }
   }
}
