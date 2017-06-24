import java.util.Scanner;

public class laba41 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[][] twoD = new int[5][5]; // объ€вили двухмерный массив
		int i, j = 0;
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				twoD[i][j] = (int) (Math.random() * 100);
				System.out.print(twoD[i][j] + " ");
			}
			System.out.print("\n");
		}
		System.out.print("Search: ");
		int a = sc.nextShort();
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if (a == twoD[i][j]) {break;};
			}
			if (a == twoD[i][j]) {break;};
		}
		i++;
		j++;
		System.out.print(i + " " + j);
	}
}