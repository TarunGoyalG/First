import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lis {
@Test
public void m() {
	ArrayList<String>m=new ArrayList<>();
	m.add("Tarun");	
	m.add("Tarun");	
	m.add("Prachi");	
	m.add("Saloni");	
	m.add("Navi");	
	Collections.sort(m);
	System.out.println(m);
	Set<String>s=new HashSet<>(m);
	m.clear();
	m.addAll(s);
	System.out.println(m);
	WebDriver driver=new ChromeDriver();
	String z="sumitM28";
	String ma="";
	String mp="";
	String p="";
	for(int i=0;i<z.length();i++) {
		char ch=z.charAt(i);
	if(Character.isLowerCase(ch)) {
		ma+=ch;
	}else if(Character.isUpperCase(ch)){
		mp+=ch;
	}else {
		p+=ch;
	}

	}
	System.out.println(ma);
	System.out.println(mp);	System.out.println(p);
	
}
}
