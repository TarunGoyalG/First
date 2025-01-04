package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jav {

	  public static int strCount(String str, String sub) {
	        // Base case: if the length of the string is less than the substring, return 0
	        if (str.length() < sub.length()) {
	            return 0;
	        }
	        int c=0;
	       for(int i=0;i<str.length()-sub.length();i++) {
	    	   if(str.substring(i,i+sub.length()).contains(sub)) {
	    		   c++;
	    	   }
	       }return c;
	    }

	    public static void main(String[] args) {
	        // Example cases
	        System.out.println(strCount("catcowcat", "cat")); // 2
	        System.out.println(strCount("catcowcat", "cow")); // 1
	        System.out.println(strCount("catcowcat", "dog")); // 0
	    }
}
