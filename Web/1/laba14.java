	public class laba14 {
	   public static void main(String args[]){
		   int[][] twoD = new int[8][5]; // объ€вили двухмерный массив
		   int i, j, k=-100;
		   for (i = 0; i < 8; i++)
		   {
		   	for (j = 0; j < 5; j++) 
		   		{
		   		
		   		twoD[i][j] =((int)(Math.random()*198))-99;
		   		if (twoD[i][j]>k) {k=twoD[i][j];}
		   		System.out.print(twoD[i][j] + " ");
		   		}
	   	    System.out.print("\n");
		   }
		   System.out.print(k);
	   }
	}