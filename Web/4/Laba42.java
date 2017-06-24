import java.util.Arrays;
import java.util.Scanner;
public class Laba42 {
	 private static Scanner win= new Scanner(System.in); 
	public static void main(String[] args) {
		int j = 0;
		        System.out.println("Text: ");
		        String text = win.nextLine();
		String sentences[] = text.split("[.!?]\\s*");
		int v=0;
		for (int i = 0; i < sentences.length; i++) {
			if(v < sentences[i].split(" ").length) {v=sentences[i].split(" ").length;}
		}
		String words[][] = new String[sentences.length][v];
		for (int i = 0; i < sentences.length; i++) { 
			String retval[] = sentences[i].split(" ");
				for (j=0; j<retval.length; j++) {
				words[i][j] = retval[j];
				System.out.print(words[i][j] + " ");}
			System.out.print("."+"\n");
		}
	}
}
