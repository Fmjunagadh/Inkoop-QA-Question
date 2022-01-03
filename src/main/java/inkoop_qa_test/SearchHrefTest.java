//Here Automation is done onclick of zipcode link Search bar should search the pin code
//Here the functional error is search bar 
package inkoop_qa_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchHrefTest {
	public WebDriver driver;
	WebElement clickhref,searching, clickButton;
	
	public SearchHrefTest(WebDriver driver) {
		this.driver = driver;
	}

	@Test(priority = 5)
	public void HrefClickedSetup() {
		System.out.println("Search Testing is activated");
		driver.get("https://qa-question.inkoop.io/?search=test/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		clickhref = driver.findElement(By.cssSelector("#hire_wrapper > div > div > form:nth-child(4) > div:nth-child(6) > div > small > a"));
		clickhref.click();
		System.out.println("Clicked on Href link ");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		searching = driver.findElement(By.id("search"));
		System.out.println("Search bar has been accessed");
		searching.sendKeys("560064");
		System.out.println("Pincode search has been entered");
	
		
		clickButton = driver.findElement(By.cssSelector(".btn.btn-primary"));
		clickButton.click();
		System.out.println("Search has been Submit successfully");
	}
}

