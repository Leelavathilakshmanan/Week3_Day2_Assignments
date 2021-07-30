package week3_Day2Assignment5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioListSampleProgram {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ajio.com/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		driver.findElementByXPath("//div[@class='searchbar-view']//div/input").sendKeys("bags",Keys.ENTER);
	
	//	driver.findElementByXPath("//div[@class='searchbar-view']//span").click();
		
	//	driver.findElementByXPath("(//div[@class='facet-linkhead'])[2]/input").click();
		
	    driver.findElementByXPath("(//div[@class='facet-linkhead'])[2]").click();
	
	    Thread.sleep(2000);
	    driver.findElementByXPath("( //div[@class='facet-linkhead'])[7]").click();
	    
	    Thread.sleep(2000);
	   String numberOfItems= driver.findElementByXPath(" //div[@class='length']").getText();
	
	   System.out.println("The number of bags under mens fashion bags : " +numberOfItems);
	
	   Thread.sleep(2000);
	   List<WebElement> bagsList=driver.findElementsByXPath(" //div[@class='brand']");

	  // System.out.println("The list of brands in bags: " + bagsList.size());
	   
	   Set<String> brandList= new LinkedHashSet<String>();
	   for (WebElement webElement : bagsList) {
		   
		   brandList.add(webElement.getText());
	   }
	   System.out.println("The Brand list: " + brandList);
	   System.out.println("The list of brands in bags: " + brandList.size());
	   
	   Thread.sleep(2000);
	   
	   List<WebElement> bagsName=driver.findElementsByXPath("//div[@class='name']");
		  // System.out.println("The list of brands in bags: " + bagsList.size());
		   
		   List<String> bagsNameList= new ArrayList<String>();
		   for (WebElement webElement : bagsName) {
			   
			   bagsNameList.add(webElement.getText());
		   }
		   System.out.println("The Bags list: " + bagsNameList);
		   System.out.println("The list of bags name list : " + bagsNameList.size());
	   
	   
	}

}
