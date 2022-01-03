//Here automation of Form is done filling all form details
//another Test case for testing password check box
//another Test case for testing password radio box
package inkoop_qa_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FormDetailsTest {

	public WebDriver driver;

	WebElement email, name, dob, city, state;
	WebElement zip, phone, pwd, checkboxoption, radioboxoption, formsubmitbutton;
	
	public FormDetailsTest(WebDriver driver) {
		this.driver = driver;
	}
	
	@Test(priority = 4)
	public void FormDetailsSetup() {
		System.out.println("Form Deatils Testing is Activated");
		driver.get("https://qa-question.inkoop.io/?search=test");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		email = driver.findElement(By.id("exampleInputEmail1"));
		email.sendKeys("fmjunagadh@gmail.com");
		System.out.println("Email has been entered");
		
		name = driver.findElement(By.id("exampleInputName1"));
		name.sendKeys("F M Junagadh");
		System.out.println("Name has been entered");
		
		dob = driver.findElement(By.id("date_of_birth"));
		dob.sendKeys("19/12/1999");
		dob.sendKeys(Keys.RETURN);
		System.out.println("Date of Birth has been entered");
		
		city = driver.findElement(By.id("exampleInputCity1"));
		city.sendKeys("Dharwad");
		city.sendKeys(Keys.RETURN);
		System.out.println("City has been entered");
		
		state = driver.findElement(By.id("exampleInputState1"));
		state.sendKeys("Karnataka");
		state.sendKeys(Keys.RETURN);
		System.out.println("State has been entered");
		
		zip = driver.findElement(By.id("exampleInputZip1"));
		zip.sendKeys("580025");
		zip.sendKeys(Keys.RETURN);
		System.out.println("Zip code has been entered");
		
		phone = driver.findElement(By.id("exampleInputPhone1"));
		phone.sendKeys("9922334567");
		phone.sendKeys(Keys.RETURN);
		System.out.println("Phone number has been entered");
		
		pwd = driver.findElement(By.id("exampleInputPassword1"));
		pwd.sendKeys("Testing@123");
		System.out.println("Password has been entered");
		
		formsubmitbutton = driver.findElement(By.cssSelector(".btn.btn-primary"));
		formsubmitbutton.click();
		System.out.println("Inkoop QA Question Form has been submitted successfully");
	}
	
	@Test(priority = 7)
	public void SelectCheckboxSetup() {
		checkboxoption = driver.findElement(By.cssSelector("input[type='checkbox']"));
		checkboxoption.click();
		System.out.println("Password Checkbox option is selected");
	}
	
	@Test(priority = 8)
	public void SelectRadioboxSetup() {
		radioboxoption = driver.findElement(By.id("optionsRadios2"));
		radioboxoption.click();
		System.out.println("Password Radiobox option is selected");
	}
	
}
