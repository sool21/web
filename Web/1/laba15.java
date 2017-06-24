	import java.util.Scanner;
	public class laba15 {
	   public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		short a, b, i;
		char c;
	       System.out.print("¬ведите a: ");
	       a = sc.nextShort();
	       System.out.print("¬ведите b: ");
	       b = sc.nextShort();
	       for (i = a; i <= b; i++)
		   {
	    	   c=(char)i;
	    	   System.out.print(c+" ");
		   }

	   }
}
