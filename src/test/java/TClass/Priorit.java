package TClass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Priorit {
@Test(priority=0)
public void abc() {
	System.out.println("abc");
}

@Test
public void mno() {
	System.out.println("mno");
}

@Test
public void pqr() {
	System.out.println("pqr");
}

@Test(priority=0)
public void xyz() {
	System.out.println("xyz");
	Assert.fail();
}

@Test(priority=1,invocationCount = 0)
public void qr() {
	System.out.println("qr");
}

}
