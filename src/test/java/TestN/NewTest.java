package TestN;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("TArun");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() { System.out.println("afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Beforeclass");
  }

  @AfterClass
  public void afterClass() {System.out.println("afterclass");
  }

  @BeforeTest
  public void beforeTest() { System.out.println("Beforetest");
  }

  @AfterTest
  public void afterTest() {System.out.println("aftertest");
  }

  @BeforeSuite
  public void beforeSuite() { System.out.println("Beforesuite");
  }

  @AfterSuite
  public void afterSuite() {System.out.println("aftersuite");
  }

}
