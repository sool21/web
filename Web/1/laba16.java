	import java.util.Scanner;
	public class laba16 {
	   public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a, b;
		String c="",s;
	       System.out.print("¬ведите a: ");
	       a = sc.nextInt();
	       while (a > 0)
	       {
	    	   b=a%16;
	    	   a/=16;
	    	   if(b==10){c="A"+c;} else {
	    		   if (b==11){c="B"+c;} else {
	    			   if (b==12){c="C"+c;} else {
	    				   if (b==13){c="D"+c;} else {
	    					   if (b==14){c="E"+c;} else {
	    						   if (b==15){c="F"+c;} else {s=Integer.toString(b); c=s+c;}
	    					   		}
	    				   				}
	    				   					}
	    		   								}
	    	   										}
	       }
	       System.out.print(c);
	   }
}
