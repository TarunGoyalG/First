package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DyanmicMin {
	WebDriver ldriver;

	public DyanmicMin(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath ="//ul[@class='pagination']//a")
	List<WebElement> paginationLinks;
	
	@FindBy(xpath="//table[@id='productTable']//td[3]")
	List<WebElement> tablerows;
	
	public void findNameAndClick() throws InterruptedException
	{
		boolean nameFound=false;
		
		for(int pageIndex =1;pageIndex<paginationLinks.size();pageIndex++)
		{	Double max=(double) Integer.MIN_VALUE;	
			for(int i=1;i<tablerows.size();i++)
			{
						
				WebElement fullname = tablerows.get(i-1).findElement(By.xpath("//table[@id='productTable']//tbody//tr[" +i+ "]//td[2]"));
				String name =fullname.getText().replace("$", "").trim();
				Double d=Double.parseDouble(name);
				System.out.println("Searching name in row " + i + ": " + name);
				
				if(d>max){
					max=d;
				
				
					
				}
			}
			
			WebElement checkbox =ldriver.findElement(By.xpath("td["+max+"]//td[4]//input"));
			checkbox.click();
			
			
			
			if(pageIndex<paginationLinks.size())
			{
				WebElement nextpage=paginationLinks.get(pageIndex);
				nextpage.click();
			}
			
		}
		
		
	
	
	}
}
