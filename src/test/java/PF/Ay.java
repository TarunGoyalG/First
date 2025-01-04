package PF;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Ay {
@Test
public void m() {
	ArrayList<String>a=new ArrayList<>();
	a.add("TArun");
	a.add("run");
	a.add("un");
a.add(2, "prachi");
System.out.println(a);
System.out.println(a.contains("run"));
a.remove(2);
a.remove("un");
System.out.println(a);
a.set(1, "aman");
a.set(0, "reena");
System.out.println(a);

}
}
