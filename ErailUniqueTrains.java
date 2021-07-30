package week3_Day2Assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUniqueTrains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://erail.in/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.findElementById("chkSelectDateOnly").click();

		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("Delhi",Keys.ENTER);
		
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("Coimbatore",Keys.ENTER);
		
		driver.findElementById("buttonFromTo").click();
		
	    Thread.sleep(2000);

		List<WebElement> listOfTrains=driver.findElementsByXPath("//div[@id='divTrainsList']/table[1]/tbody/tr/td[2]/a");
		
		ArrayList<String> myTrainlist = new ArrayList<String>();
		for (WebElement webElement : listOfTrains) {
			
			myTrainlist.add(webElement.getAttribute("title"));
		}
		Collections.sort(myTrainlist);
		
		System.out.println("The size of list : " + myTrainlist.size());
		Set<String> trainList=new LinkedHashSet<String>(myTrainlist);
		
		System.out.println("The size of the set : " + trainList.size());

		driver.quit();
	}
	

}
