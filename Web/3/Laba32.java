package com;


public class st {
	    public static void main(String[] args) {
	    	
	    String st = "1. <HTML> <HEAD>"+
					"2. <TITLE>Управление разрывом строк </Title>"+
					"3. </HEAD>"+
					"4. <BODY>"+
					"5. <marquee>Это моя учебная страница.</marquee>"+
					"6. <H2>Меня зовут <kbd>Ольга. </kbd></H2>"+
					"7. <H3 align='center'>Я живу во <em>Владивостоке</em>.</H3>"+
					"8. <H4 align='right'>Моя маленькая родина - <font"+
					"face='Academy' color='Red'>Сахалин</font>. </H4>"+
					"9. <H5 align=left>ДВГУ - ВУЗ в котором я работаю.</H5>"+
					"10. <B>Здесь</B>"+
					"11. <I>продемонстрированы</I>"+
					"12. <Blink>различные</Blink>"+
					"13. <U> способы </U>"+
					"14. <KBD>управления </KBD>"+
					"15. <FONT SIZE=5 COLOR=FF80C0>шрифтом:</FONT> его"+
					"16. <FONT SIZE=5 COLOR=FF00FF>цветом</FONT> и"+
					"17. <FONT SIZE=+3 COLOR=FF00FF>размером.</FONT>"+
					"18. </BODY> </HTML>";
	    String[] arr = st.split("[<]\\s*");
	    int k=0, pos, pos1;
	    String sm,teg;
	    boolean f;
	    for (int i=1; i<arr.length; i++) {
	    	f=arr[i].startsWith("/");
	    	if(f==false) {k++;}
	    	}
	    	System.out.println("a. "+k);
	    	pos = st.indexOf("<marquee>");
	    	pos1 = st.indexOf("</marquee>", pos+1);
	    	teg= st.substring(pos+9,pos1);
	    	System.out.println("b. "+teg);
	    	k=0;
	    	pos = st.toUpperCase().indexOf("<kbd>".toUpperCase(),k);
	    	System.out.print("c. ");
	    	while (pos != -1){
		    	pos1 = st.toUpperCase().indexOf("</kbd>".toUpperCase(), pos+1);
		    	teg= st.substring(pos+5,pos1);
		    	System.out.println(teg);
	    		k=pos1+1;
	    		pos = st.toUpperCase().indexOf("<kbd>".toUpperCase(),k);
	    	}
	    	pos = st.indexOf("16.");
	    	pos = st.indexOf("COLOR",pos);
	    	teg= st.substring(pos+6,pos+12);
	    	System.out.print("d. ");
	    	System.out.println(teg);

}
}