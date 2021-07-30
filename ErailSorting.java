package week3_Day2Assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*Assignment 2: ErailSorting

1.Launch the browser

2.Launch the URL - https://erail.in/
		
3.Uncheck the check box - sort on date
		
4.clear and type in the source station 
		
5.clear and type in the destination station
		
6.Find all the train names using xpath and store it in a list
		
7.Use Java Collections sort to sort it and then print it
		*/

public class ErailSorting {

	public static void main(String[] args) {
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
		driver.findElementById("txtStationTo").sendKeys("Chennai Egmore",Keys.ENTER);
		
		driver.findElementById("buttonFromTo").click();
		

		List<WebElement> listOfTrains=driver.findElementsByXPath("//div[@id='divTrainsList']/table[1]/tbody/tr/td[2]/a");
		
		ArrayList<String> myTrainlist = new ArrayList<String>();
		for (WebElement webElement : listOfTrains) {
			//System.out.println(webElement.getText());
			myTrainlist.add(webElement.getAttribute("title"));
		}
		Collections.sort(myTrainlist);
		System.out.println(myTrainlist);
		

		
	
	}

}
