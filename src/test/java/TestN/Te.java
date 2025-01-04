package TestN;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Te {
	
	
	@Test(groups={"regression","sanity"})
public void m() {
	System.out.println("Aman");
}
	
	@Test(groups={"regression",})
public void ma() {
	System.out.println("kahal");
}
	@BeforeGroups(value="regression")
	public void beforegrou() {
		System.out.println("beforegroup");
	}

	@AfterGroups(value="regression")
	public void aftergrou() {
		System.out.println("aftergroup");
	}
	
}
