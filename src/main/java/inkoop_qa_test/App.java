//In this Main class other class functions are called
//FormDeatilsTest functions are called
//SearchBarTest functions are called
//SearchHrefTest functions are called
package inkoop_qa_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class App {
	public WebDriver driver;
	public final String  BASE_URL = "https://qa-question.inkoop.io/?search=test";
	public final String  DRIVER_PATH = "C:\\chromedriver\\chromedriver.exe\\";
	
	public App() {
		System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
		this.driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void openBrowser() {
		driver.get(BASE_URL);
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority = 1)
	public void AddFormDetailsTest() throws InterruptedException {
		FormDetailsTest form = new FormDetailsTest(driver);
		form.FormDetailsSetup();
		form.SelectCheckboxSetup();
		form.SelectRadioboxSetup();
	}
	
	@Test(priority = 2)
	public void AddHrefSearchingTest() throws InterruptedException {
		SearchHrefTest hrefsearch = new SearchHrefTest(driver);
		hrefsearch.HrefClickedSetup();
		
	}
	
	@Test(priority = 3)
	public void AddSearchingBarTest() throws InterruptedException {
		SearchBarTest searchbar = new SearchBarTest(driver);
		searchbar.SearchBarSetup();
	}
	
}
