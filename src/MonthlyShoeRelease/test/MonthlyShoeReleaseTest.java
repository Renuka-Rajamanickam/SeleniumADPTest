package MonthlyShoeRelease.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;

/* MonthlyShoeReleaseTest class reflects the Story1 scenarios*/
public class MonthlyShoeReleaseTest {
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
		 * Story 1:
		 * 
		 * Month should display a small Blurb of each shoe. 
		 * Month should display an image each shoe being released. 
		 * Each shoe should have a suggested price pricing
		 * 
		 */

		//-------January--------------------------------
		/* JanuaryNewReleaseBlurbDisplayTest checks the value exists for Blurb*/
		@Test
		public void JanuaryNewReleaseBlurbDisplayTest() throws InterruptedException {
			NamedMonthlyNewReleaseBlurbTest("january");
		}
	
		/* JanuaryNewReleaseSuggestedPriceTest checks the value exists of price
		 * against the given price value and also the filtering based on the shoe name
		 * */
		@Test
		public void JanuaryNewReleaseSuggestedPriceTest() throws InterruptedException {
			NamedMonthlyNewReleaseSuggestedPriceTest("january", "Jimmy Choo Kendall Crystal Pump", "$2,995.00");
			NamedMonthlyNewReleaseSuggestedPriceTest("january", "Brian Atwood Tribeca Laser Sandal", "$1,695.00");
			NamedMonthlyNewReleaseSuggestedPriceTest("january", "Sergio Rossi Mermaid Caged Sanda", "$1,670.00");
			NamedMonthlyNewReleaseSuggestedPriceTest("january", "Charlotte Olympia Priscilla Genuine Python Pump", "$1,495.00");
			NamedMonthlyNewReleaseSuggestedPriceTest("january", "Jimmy Choo", "$1,495.00");
		}
		
		/* JanuaryNewReleasePriceTest simply checks the value exists on Price element*/
		@Test
		public void JanuaryNewReleasePriceTest() throws InterruptedException {
			NamedMonthlyNewReleasePriceTest("january");
		}
		
		/* JanuaryNewReleaseImageDisplayTest verify the existence of the image source */
		@Test
		public void JanuaryNewReleaseImageDisplayTest() throws InterruptedException {
			NamedMonthlyNewReleaseImageTest("january");
		}

		//-------February--------------------------------
		/* FebruaryNewReleaseBlurbDisplayTest checks the value exists for Blurb*/ 
		@Test 
		public void FebruaryNewReleaseBlurbDisplayTest() throws InterruptedException { 
			NamedMonthlyNewReleaseBlurbTest("february"); 
		}
		
		/* FebruaryNewReleaseSuggestedPriceTest checks the value exists of price 
		 * against the given price value and also the filtering based on shoe name
		 * */
		@Test
		public void FebruaryNewReleaseSuggestedPriceTest() throws InterruptedException {
			NamedMonthlyNewReleaseSuggestedPriceTest("february", "Jimmy Choo Kera Platform Sandal", "$2,195.00");
			NamedMonthlyNewReleaseSuggestedPriceTest("february", "Valentino Camo Rockstud Pump", "$1,595.00");
		}
		
		/* FebruaryNewReleasePriceTest simply checks the value exists on Price element*/  
		@Test
		public void FebruaryNewReleasePriceTest() throws InterruptedException { 
			NamedMonthlyNewReleasePriceTest("february"); 
		}
		/* FebruaryNewReleaseImageDisplayTest verify the existence of the image source */
		@Test 
		public void FebruaryNewReleaseImageDisplayTest() throws InterruptedException { 
			  NamedMonthlyNewReleaseImageTest("february"); 
		}
		
	
	  //-------March--------------------------------
	  /* MarchNewReleaseBlurbDisplayTest checks the value exists for Blurb*/
	  @Test 
	  public void MarchNewReleaseBlurbDisplayTest() throws InterruptedException { 
		NamedMonthlyNewReleaseBlurbTest("march"); 
	  }
	  
	  /* MarchNewReleaseSuggestedPriceTest checks the value exists of price 
		 * against the given price value and also the filtering based on shoe name
		 * */
	  @Test
	  public void MarchNewReleaseSuggestedPriceTest() throws InterruptedException {
		NamedMonthlyNewReleaseSuggestedPriceTest("march", "Miu Miu Ankle Strap Platform Sandal", "$2,100.00");
		NamedMonthlyNewReleaseSuggestedPriceTest("march", "Valentino Camo Rockstud Flat", "$1,595.00");
	  }
		
	  /* MarchNewReleasePriceTest simply checks the value exists on Price element*/  
	  @Test 
	  public void MarchNewReleasePriceTest() throws InterruptedException  { 
		  NamedMonthlyNewReleasePriceTest("march"); 
	  }
	  
	  /* MarchNewReleaseImageDisplayTest verify the existence of the image source */
	  @Test 
	  public void MarchNewReleaseImageDisplayTest() throws  InterruptedException { 
		  NamedMonthlyNewReleaseImageTest("march"); 
	  }
	  
	  
	  //-------April--------------------------------
	  /* AprilNewReleaseBlurbDisplayTest checks the value exists for Blurb*/
	  @Test 
	  public void AprilNewReleaseBlurbDisplayTest() throws  InterruptedException { 
		  NamedMonthlyNewReleaseBlurbTest("april"); 
	  }
	  
	  /* AprilNewReleaseSuggestedPriceTest checks the value exists of price
		 * against the given price value and also the filtering based on shoe name
		 * */
	  @Test
	  public void AprilNewReleaseSuggestedPriceTest() throws InterruptedException {
		NamedMonthlyNewReleaseSuggestedPriceTest("april", "Jimmy Choo Kalpa Sandal", "$1,995.00");
		NamedMonthlyNewReleaseSuggestedPriceTest("april", "Sergio Rossi Murmansk Sandal", "$1,595.00");
	  }
		
	  /* AprilNewReleasePriceTest simply checks the value exists on Price element*/  
	  @Test 
	  public void AprilNewReleasePriceTest() throws InterruptedException { 
		  NamedMonthlyNewReleasePriceTest("april"); 
	  }
	  
	  /* AprilNewReleaseImageDisplayTest verify the existence of the image source */
	  @Test public void AprilNewReleaseImageDisplayTest() throws  InterruptedException {
		  NamedMonthlyNewReleaseImageTest("april"); 
	  }
	  
	  
	  //-------May--------------------------------  
	  /* MayNewReleaseBlurbDisplayTest checks the value exists for Blurb*/
	  @Test public void MayNewReleaseBlurbDisplayTest() throws InterruptedException { 
		  NamedMonthlyNewReleaseBlurbTest("may"); 
	  }
	  
	  /* MayNewReleaseSuggestedPriceTest checks the value exists of price 
		 * against the given price value and also the filtering based on shoe name
		 * */
	  @Test
	  public void MayNewReleaseSuggestedPriceTest() throws InterruptedException {
		  NamedMonthlyNewReleaseSuggestedPriceTest("may", "Brian Atwood Maia Sandal", "$1,995.00");
		  NamedMonthlyNewReleaseSuggestedPriceTest("may", "Lanvin Lucite® Wedge Sandal", "$1,590.00");
	  }
		
	  /* MayNewReleasePriceTest simply checks the value exists on Price element*/  
	  @Test 
	  public void MayNewReleasePriceTest() throws InterruptedException {
		  NamedMonthlyNewReleasePriceTest("may"); 
	  }
	  
	  /* MayNewReleaseImageDisplayTest verify the existence of the image source */
	  @Test 
	  public void MayNewReleaseImageDisplayTest() throws InterruptedException {
		  NamedMonthlyNewReleaseImageTest("may"); 
	  }
	  
	  
	  //-------June--------------------------------  
	  /* JuneNewReleaseBlurbDisplayTest checks the value exists for Blurb*/
	  @Test 
	  public void JuneNewReleaseBlurbDisplayTest() throws InterruptedException { 
		  NamedMonthlyNewReleaseBlurbTest("june"); 
	  }
	  
	  /* FebruaryNewReleaseSuggestedPriceTest checks the value exists of price 
		 * against the given price value and also the filtering based on shoe name
		 * */
	  @Test
	  public void JuneNewReleaseSuggestedPriceTest() throws InterruptedException {
		NamedMonthlyNewReleaseSuggestedPriceTest("june", "Old Gringo Diego Swarovski Boot", "$1,889.95");
		NamedMonthlyNewReleaseSuggestedPriceTest("june", "Lanvin Pointy Toe Python Pump", "$1,550.00");
	  }
		
	  /* JuneNewReleasePriceTest simply checks the value exists on Price element*/  
	  @Test 
	  public void JuneNewReleasePriceTest() throws InterruptedException {
		  NamedMonthlyNewReleasePriceTest("june"); 
	  }
	  
	  /* JuneNewReleaseImageDisplayTest verify the existence of the image source */
	  @Test 
	  public void JuneNewReleaseImageDisplayTest() throws InterruptedException {
		  NamedMonthlyNewReleaseImageTest("june"); 
	  }
	  
	  
	  //-------July--------------------------------  
	  /* JulyNewReleaseBlurbDisplayTest checks the value exists for Blurb*/
	  @Test 
	  public void JulyNewReleaseBlurbDisplayTest() throws InterruptedException { 
		  NamedMonthlyNewReleaseBlurbTest("july"); 
	  }
	  
	  /* JulyNewReleaseSuggestedPriceTest checks the value exists 
		 * against the given price value and also the filtering based on shoe name
		 * */
	  @Test
	  public void JulyNewReleaseSuggestedPriceTest() throws InterruptedException {
		NamedMonthlyNewReleaseSuggestedPriceTest("july", "Prada Crystal Platform Sandal", "$1,800.00");
		NamedMonthlyNewReleaseSuggestedPriceTest("july", "Lanvin Metal Heel Boot", "$1,550.00");
	  }
		
	  /* JulyNewReleasePriceTest simply checks the value exists on Price element*/  
	  @Test 
	  public void JulyNewReleasePriceTest() throws InterruptedException {
		NamedMonthlyNewReleasePriceTest("july"); 
	  }
	  
	  /* JulyNewReleaseImageDisplayTest verify the existence of the image source */
	  @Test 
	  public void JulyNewReleaseImageDisplayTest() throws  InterruptedException { 
		  NamedMonthlyNewReleaseImageTest("july"); 
	  }
	  
	  
	  //-------August--------------------------------  
	  /* AugustNewReleaseBlurbDisplayTest checks the value exists for Blurb*/
	  @Test 
	  public void AugustNewReleaseBlurbDisplayTest() throws InterruptedException { 
		  NamedMonthlyNewReleaseBlurbTest("august");  
	  }
	  
	  /* AugustNewReleaseSuggestedPriceTest checks the value exists 
		 * against the given price value and also the filtering based on shoe name
		 * */
	  @Test
	  public void AugustNewReleaseSuggestedPriceTest() throws InterruptedException {
		NamedMonthlyNewReleaseSuggestedPriceTest("august", "Sergio Rossi Mermaid Bootie", "$1,760.00");
		NamedMonthlyNewReleaseSuggestedPriceTest("august", "Gucci Noah Crystal dOrsay Pump", "$1,550.00");
	  }
		
	  /* AugustNewReleasePriceTest simply checks the value exists on Price element*/  
	  @Test 
	  public void AugustNewReleasePriceTest() throws InterruptedException	{ 
		  NamedMonthlyNewReleasePriceTest("august"); 
	  }
	  
	  /* AugustNewReleaseImageDisplayTest verify the existence of the image source */
	  @Test public void AugustNewReleaseImageDisplayTest() throws InterruptedException { 
		  NamedMonthlyNewReleaseImageTest("august"); 
	  }
	  
	  
	  //-------September--------------------------------  
	  /* SeptemberNewReleaseBlurbDisplayTest checks the value exists for Blurb*/
	  @Test 
	  public void SeptemberNewReleaseBlurbDisplayTest() throws	InterruptedException { 
		  NamedMonthlyNewReleaseBlurbTest("september"); 
	  }
	  
	  /* SeptemberNewReleaseSuggestedPriceTest checks the value exists 
		 * against the given price value and also the filtering based on shoe name
		 * */
	  @Test
	  public void SeptemberNewReleaseSuggestedPriceTest() throws InterruptedException {
		NamedMonthlyNewReleaseSuggestedPriceTest("september", "Prada Ankle Cuff Sandal", "$1,750.00");
		NamedMonthlyNewReleaseSuggestedPriceTest("september", "Old Gringo Eagle Swarovski Boot", "$1,549.95");
	  }
		
	  /* SeptemberNewReleasePriceTest simply checks the value exists on Price element*/  
	  @Test 
	  public void SeptemberNewReleasePriceTest() throws	InterruptedException { 
		  NamedMonthlyNewReleasePriceTest("september"); 
	  }
	  
	  /* SeptemberNewReleaseImageDisplayTest verify the existence of the image source */
	  @Test 
	  public void SeptemberNewReleaseImageDisplayTest() throws  InterruptedException { 
		  NamedMonthlyNewReleaseImageTest("september"); 
	  }
	  
	  
	  //-------October--------------------------------  
	  /* OctoberNewReleaseBlurbDisplayTest checks the value exists for Blurb*/
	  @Test 
	  public void OctoberNewReleaseBlurbDisplayTest() throws  InterruptedException { 
		  NamedMonthlyNewReleaseBlurbTest("october"); 
	  }
	  
	  /* OctoberNewReleaseSuggestedPriceTest checks the value exists 
		 * against the given price value and also the filtering based on shoe name
		 * */
	  @Test
	  public void OctoberNewReleaseSuggestedPriceTest() throws InterruptedException {
		NamedMonthlyNewReleaseSuggestedPriceTest("october", "Charlotte Olympia Cherie Sandal", "$1,695.00");
		NamedMonthlyNewReleaseSuggestedPriceTest("october", "Jimmy Choo Kalpa Sandal", "$1,495.00");
	  }
		
	  /* OctoberNewReleasePriceTest simply checks the value exists on Price element*/  
	  @Test 
	  public void OctoberNewReleasePriceTest() throws	InterruptedException { 
		  NamedMonthlyNewReleasePriceTest("october"); 
	  }
	  
	  /* OctoberNewReleaseImageDisplayTest verify the existence of the image source */
	  @Test 
	  public void OctoberNewReleaseImageDisplayTest() throws  InterruptedException { 
		  NamedMonthlyNewReleaseImageTest("october"); 
	  }
	  
	  
	//-------November--------------------------------  
	  	/* NovemberNewReleaseBlurbDisplayTest checks the value exists for Blurb*/
		@Test 
		public void NovemberNewReleaseBlurbDisplayTest() throws  InterruptedException { 
			NamedMonthlyNewReleaseBlurbTest("november"); 
		}
		
		/* FebruaryNewReleaseSuggestedPriceTest checks the value exists 
		 * against the given price value and also the filtering based on shoe name
		 * */
		@Test
		public void NovemberNewReleaseSuggestedPriceTest() throws InterruptedException {
			NamedMonthlyNewReleaseSuggestedPriceTest("november", "Charlotte Olympia Parisienne Sandal", "$1,695.00");
			NamedMonthlyNewReleaseSuggestedPriceTest("november", "Jimmy Choo Lola Ankle Strap Sandal", "$1,495.00");
		}
			
		/* NovemberNewReleasePriceTest simply checks the value exists on Price element*/  
		@Test 
		public void NovemberNewReleasePriceTest() throws	InterruptedException { 
			NamedMonthlyNewReleasePriceTest("november"); 
		}
	  
  	  	/* NovemberNewReleaseImageDisplayTest verify the existence of the image source */
		@Test 
		public void NovemberNewReleaseImageDisplayTest() throws		InterruptedException {
			NamedMonthlyNewReleaseImageTest("november"); 
		}
		
		
		//-------December--------------------------------  
		/* DecemberNewReleaseBlurbDisplayTest checks the value exists for Blurb*/
		@Test 
		public void DecemberNewReleaseBlurbDisplayTest() throws	  InterruptedException { 
			NamedMonthlyNewReleaseBlurbTest("december"); 
		}
		
		/* DecemberNewReleaseSuggestedPriceTest checks the value exists 
		 * against the given price value and also the filtering based on shoe name
		 * */
		@Test
		public void DecemberNewReleaseSuggestedPriceTest() throws InterruptedException {
			/*there is no shoe items to display*/
		}
		
		/* DecemberNewReleasePriceTest simply checks the value exists on Price element*/  
		@Test 
		public void DecemberNewReleasePriceTest() throws	InterruptedException { 
			/*there is no shoe items to display*/
			NamedMonthlyNewReleasePriceTest("december"); 
		}
	  
		/* DecemberNewReleaseImageDisplayTest verify the existence of the image source */
		@Test 
		public void DecemberNewReleaseImageDisplayTest() throws InterruptedException  { 
		  NamedMonthlyNewReleaseImageTest("december"); 
		}
	 
		/*Executes after each test*/
		@AfterTest
		public void tearDown() throws Exception {
			driver.quit();
		}

		/*Get the page based on input month for the description*/
		private void NamedMonthlyNewReleaseBlurbTest(String monthName) throws InterruptedException {
			WebElement linkElement = driver.findElement(ByXPath.xpath("//ul[@class='nav navbar-nav']//li//a[@href='/months/" + monthName + "']"));
			driver.navigate().to(linkElement.getAttribute("href"));
			Thread.sleep(2000);
			// have the collection of shoe description columns
			List<WebElement> blurbElements = driver.findElements(
					ByXPath.xpath("//tr[@class='shoe_result_row']//td[@class='shoe_result_value shoe_description']"));
			java.util.Iterator<WebElement> i = blurbElements.iterator();
			while (i.hasNext()) {
				WebElement blurbElement = i.next();
				//Verifying it has field displayed and also having the text.
				Assert.assertTrue(blurbElement.isDisplayed() && blurbElement.getText().length() > 0);
			}
		}
		
		/*Get the page based on input month for the price existence*/
		private void NamedMonthlyNewReleasePriceTest(String monthName) throws InterruptedException {
			WebElement linkElement = driver
					.findElement(ByXPath.xpath("//ul[@class='nav navbar-nav']//li//a[@href='/months/" + monthName + "']"));
			driver.navigate().to(linkElement.getAttribute("href"));
			Thread.sleep(2000);
			
			// have the collection of shoe price columns	
			List<WebElement> blurbElements1 = driver.findElements(
					ByXPath.xpath("//tr[@class='shoe_result_row']//td[@class='shoe_result_value shoe_price']"));
			java.util.Iterator<WebElement> i1 = blurbElements1.iterator();
			while (i1.hasNext()) {
				WebElement blurbElement1 = i1.next();
				Assert.assertTrue(blurbElement1.isDisplayed() && blurbElement1.getText().length() > 0);
			}
		}
	
		/*Get the page based on input month with the price value*/
		private void NamedMonthlyNewReleaseSuggestedPriceTest(String monthName, String shoeName, String priceValue)
				throws InterruptedException {
			WebElement linkElement = driver.findElement(ByXPath.xpath("//ul[@class='nav navbar-nav']//li//a[@href='/months/" + monthName + "']"));
			driver.navigate().to(linkElement.getAttribute("href"));
			Thread.sleep(2000);
			try  {
				//verifying given shoe price against the given value
				 Assert.assertTrue( driver.findElement(By.xpath("//tr[td[contains(text(),'"+shoeName+"')]]/following-sibling::tr//td[contains(text(),'"+priceValue+"')]")).isDisplayed());
		    }
		 	catch(NoSuchElementException e) {
		 		 Assert.fail();
		 	}
		}
		
		/*Get the page based on input month for the image display*/
		private void NamedMonthlyNewReleaseImageTest(String monthName) throws InterruptedException {
			WebElement linkElement = driver
					.findElement(ByXPath.xpath("//ul[@class='nav navbar-nav']//li//a[@href='/months/" + monthName + "']"));
			driver.navigate().to(linkElement.getAttribute("href"));
			Thread.sleep(2000);
			//	have the collection of shoe image columns	
			List<WebElement> blurbElements2 = driver
					.findElements(ByXPath.xpath("//tr[@class='shoe_result_row']//td[@class='shoe_image']//img"));
			java.util.Iterator<WebElement> i2 = blurbElements2.iterator();
			while (i2.hasNext()) {
				WebElement blurbElement2 = i2.next();
				//Verifying it has field displayed and also having the text.
				Assert.assertTrue(blurbElement2.isDisplayed() && blurbElement2.getAttribute("src").length() > 0);
			}
		}
}
