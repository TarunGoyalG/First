package PF;

import java.io.File;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class exist {
@Test
public void m() {
File f=new File("exle_2.json");
if(f.exists()) {
	System.out.println("File exists");
}else {
	System.out.println("File not exists");
}
}
@Parameters({"ul","ui"})
@Test
public void mt() {
	System.out.println("Man");
}

}
