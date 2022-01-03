//Automation of search bar and submit it
//Here the functional error is search bar 
package inkoop_qa_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchBarTest {
	public WebDriver driver;
	WebElement search, searchButton;
	
	public SearchBarTest(WebDriver driver) {
		this.driver = driver;
	}

	@Test(priority = 6)
	public void SearchBarSetup() {
		System.out.println("Search Testing is activated");
		driver.get("https://qa-question.inkoop.io/?search=test/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		search = driver.findElement(By.id("search"));
		System.out.println("Search bar has been accessed");
		search.sendKeys("560064");
		System.out.println("Pincode search has been entered");
	
		
		searchButton = driver.findElement(By.cssSelector(".btn.btn-primary"));
		searchButton.click();
		System.out.println("Searching has been Submit successfully");
	}
}

