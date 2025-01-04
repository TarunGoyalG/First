package Sle;

import org.testng.annotations.Test;

public class Tomorrow {
@Test
public void m() {
	String s="Tomorrow";
	int b=1;
	StringBuilder sa=new StringBuilder();
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='o') {
			for(int j=0;j<b;j++) {
				sa.append("&");
				}b++;
		}
		else {
			sa.append(s.charAt(i));
		}
	}System.out.println(sa.toString());
	
	
	
}
}
