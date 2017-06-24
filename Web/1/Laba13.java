	public class Laba13 {
	   public static void main(String args[]){
		   int[][] twoD = new int[8][5]; // объ€вили двухмерный массив
		   int i, j;
		   for (i = 0; i < 8; i++)
		   {
		   	for (j = 0; j < 5; j++) 
		   		{
		   		
		   		twoD[i][j] =10+((int)(Math.random()*89));
		   		System.out.print(twoD[i][j] + " ");
		   		}
	   	    System.out.print("\n");
		   }

	   }
	}