package TClass;

import org.testng.annotations.Test;

public class Prior {
@Test(priority=1)
public void abc() {
	System.out.println("abc");
}

@Test( invocationCount = 0)
public void def() {
	System.out.println("def");
}

@Test(priority=0)
public void gh() {
	System.out.println("gh");
}

@Test(priority=-1)
public void xyz() {
	System.out.println("xyz");
}

@Test(priority=-2)
public void mn() {
	System.out.println("mn");
}
}
