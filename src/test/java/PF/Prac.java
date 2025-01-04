package PF;

import java.util.HashMap;
import java.util.Map;

public class Prac {
public static void main(String[] args) {
	String input = "abbccddd";
	StringBuilder t=new StringBuilder();
	HashMap<Character,Integer>s=new HashMap<>();
	for(int i=0;i<input.length();i++) {
		char ch=input.charAt(i);
		if(s.containsKey(ch)) {
			s.put(ch, s.get(ch)+1);
		}else {
			s.put(ch,1);
		}
	}
	for(Map.Entry<Character, Integer> e:s.entrySet()) {
		t.append(e.getKey());
		t.append(e.getValue());
	}
	System.out.println(t.toString());
	
}
}
