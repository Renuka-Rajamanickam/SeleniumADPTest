package NewReleaseReminderEmail;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/* Test case reminder email submission*/
public class NewReleaseReminderEmailTest {
	private WebDriver driver;
	
	/*will execute before each tests run*/
	@BeforeTest
	public void SeleniumTestSetup() {
		/*Here implemented testing with the chrome browser*/
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\JavaBinding\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		/* source site to do the actual test */
		driver.get("https://rb-shoe-store.herokuapp.com/");
	}
	 
	 /*
	 * Story 2: 
	 * Step1:Enter value to the remind me of new shoes. 
	 * Step2:Trigger the Submit Event. 
	 * Step3: Verify the successful message.
	 */
	 @Test
	 public void ReminderEmailTest() throws Exception {
		 String _strEmail = "test@test.com";
		 String _strExpectedText ="Thanks! We will notify you of our new shoes at this email: ";
		 driver.findElement(By.id("remind_email_input")).sendKeys(_strEmail);
		 driver.findElement(By.id("remind_email_submit")).sendKeys(Keys.ENTER);
		 String _successText = driver.findElement(ByXPath.xpath("//div[@id='flash']//div[@class='flash flash_success']")).getText();
		 Assert.assertEquals(	_strExpectedText + _strEmail, _successText);
	 }
	
	 /*Executes after each test*/
	 @AfterTest
	 public void tearDown() throws Exception {
		driver.quit();	 
	 }
}
