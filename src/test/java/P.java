import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchShadowRootException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class P {

//	Points p=new Points(new Promote(10,"aman"),new Promote(10,"raju"),new Promote(10,"hhhh"));
//	ArrayList<LevelData>m=new ArrayList<>();
//	m.add(new LevelData("Level 2", 2, "https://static", p));
//	JT pa=new JT(m);
//	ObjectMapper t=new ObjectMapper();
//	
//	System.out.println(t.writerWithDefaultPrettyPrinter().writeValueAsString(pa));
//	 String str = "1234";
//Integer m=	 Integer.valueOf(str);
//	System.out.println(m*2);
	
//	Robot map=new Robot();
//	map.keyPress(KeyEvent.VK_ENTER);
//	List<Integer>mz=List.of(1,2,3,4);
//	List<Integer>mp=List.of(5,4,3,1);
//	mz.retainAll(mp);
//	System.out.println(mz);
	
	
//	Integer[] m= {1,2,3,4,5};
//	m[2]=10;
//	Integer[] p = Arrays.copyOf(m, m.length);
//	Arrays.sort(p);
//	System.out.println(Arrays.toString(p));
	
	
	
	
	
//	 public static void findNextGreaterElements(int[] arr) {
//	        int n = arr.length;
//for(int i=0;i<n;i++) {
//	int lar=-1;
//	for(int j=i+1;j<n;j++) {
//		if(arr[j]>arr[i]) {
//			lar=arr[j];
//			break;
//		}
//	}System.out.println(lar);
//	        
//	        }
//	    }
//
//	    public static void main(String[] args) {
//	        int[] arr = {4, 5, 2, 25};
//	        findNextGreaterElements(arr);
//	    }
//WebDriver driver=new ChromeDriver();
//String url = driver.getCurrentUrl();

	
//	public static String amp(String j) {
//	char[] m=	j.toCharArray();
//		int n=m.length;
//		int l=0,r=n-1;
//		while(l<r) {
//			while(l<r && Character.isLetterOrDigit(m[l])) {
//			l++;
//		}
//		while(l<r && Character.isLetterOrDigit(m[r])) {
//		r--;}
//		char t=m[l];
//		m[l]=m[r];
//		m[r]=t;
//		l++;
//		r--;
//	}
//		
//		return new String(m);
//	}
//	
//	public static void main(String[] args) {
//		System.out.println(amp("a4545tre#@#erw%4erte"));
//	}
public static void main(String[] args) throws InterruptedException {
//	ArrayList list = new ArrayList<>();
//    list.add("Hello");
//	list.add(1);
//System.out.println(list);
	
	WebDriver driver=new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.nimblework.com/");
	//WebElement t=driver.findElement(By.xpath("//iframe[@style='display: none; visibility: hidden;']"));
//	driver.switchTo().frame(t);
	//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
	Wait<WebDriver>waiit=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30L))
		.pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
//	//waiit.until(ExpectedConditions.visibilityOfElementLocated(By.id("kairon-client-container")));
//	WebElement ra=driver.findElement(By.id("kairon-client-container"))
//	.getShadowRoot().findElement(By.xpath("//button[@class='ka-button']"));
//	Thread.sleep(2000);
//	ra.click();
//	Thread.sleep(2000);}
//	catch(NoSuchShadowRootException e) {
//		e.printStackTrace();
//	}finally {
//	      driver.quit();
//	    }
try {

WebElement hostElement = driver.findElement(By.id("kairon-client-container"));

// Access the shadow root element
WebElement shadowRootElement = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", hostElement);

// Execute actions within the shadow root
WebElement element = shadowRootElement.findElement(By.id("elementId"));
element.click();
} catch (NoSuchShadowRootException e) {
System.out.println("Unable to find the shadow root: " + e.getMessage());
} finally {
driver.quit();
} 
}
}