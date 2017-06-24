package com;
import java.util.Scanner;
class Laba1 {
public static void main(String[] args)
{
    System.out.println("¬ведите текст");
    Scanner in = new Scanner(System.in);
    String string = in.nextLine();
    boolean t;
    String[] words = string.split("[ ,:;.!?]\\s*");
    int[] v = new int[words.length];
    for (int i=0; i<words.length; i++) {
    	v[i]=1;
    	for (int j=0; j<i; j++) {
    		t = words[i].equals(words[j]);
    		if(t==true){ words[i]="0"; v[j]++;}
    	}
    }
    for (int i=0; i<words.length; i++) {
    	t = words[i].equals("0");
    	if (t==false){words[i]=words[i]+" "+Integer.toString(v[i]);System.out.println(words[i]);};
    }
}
}
