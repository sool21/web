import java.util.Scanner;

public class laba17 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String[] poem=new String[10];
		for (int j = 0; j < 10; j++) {
			 poem[j] = sc.nextLine();
		}
		for (int j = 0; j < poem.length; j++) {
			for (int i = j + 1; i < poem.length; i++) {
				if (poem[i].compareTo(poem[j]) < 0) {
					String temp = poem[j];
					poem[j] = poem[i];
					poem[i] = temp;
				}
			}
			System.out.println(poem[j]);
		}
	}
}