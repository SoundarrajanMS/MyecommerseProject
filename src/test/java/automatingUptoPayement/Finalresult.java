package automatingUptoPayement;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Finalresult extends BaseForAll {
	@BeforeClass
	public static void testcase1() throws Throwable {
		launch("https://www.lightinthebox.com/");

	}

	@BeforeMethod
	public static void startTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test(priority=-1)
	public static void addWatch() throws Throwable {
		/*WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='close'])[2]")));
*/
		Pojo1stPage p1 = new Pojo1stPage();
		 javaClick(p1.getCloseSignIn());

//		click(p1.getCloseSignIn());
		 
		fillbox(p1.getSearchBox(),getData(2,1));
		click(p1.getClickSearch());

		Pojo2ndPage p2 = new Pojo2ndPage();
		click(p2.getSelectWatch());
		
//		Thread.sleep(20000);

		Pojo3rdPage p3 = new Pojo3rdPage();
		// javaClick(p3.getWatchColour());

		WebDriverWait w1 = new WebDriverWait(driver, 50);
	//	w1.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@image-id=\'37708677\']")));
		//w1.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		click(p3.getWatchColour());

		click(p3.getWatchToCart());
		
		/*
		SoftAssert sf = new SoftAssert();
		String currentUrl = driver.getCurrentUrl();
		sf.assertEquals("https://www.lightinthebox.com/index.php?main_page=shopping_cart",currentUrl);
		

		fillbox(p3.getSearch2(),getData(3, 1));
		 
		javaClick(p3.getClickSearch2());
		
		click(p3.getClickSearch2());
		
		click(p2.getClickBag());

		javaClick(p3.getBagColour());
		// click(p3.getBagColour());
		click(p3.getBagTocart());
//        sf.assertAll();
*/	}

/*	@Test(enabled = false)
	public static void addBag() throws Throwable {
		// WebDriverWait w = new WebDriverWait(driver, 50);
		// w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='close'])[2]")));

		Pojo1stPage p1 = new Pojo1stPage();
		javaClick(p1.getCloseSignIn());
		fillbox(p1.getSearchBox(),getData(3, 1));
		click(p1.getClickSearch());

		Pojo2ndPage p2 = new Pojo2ndPage();
		click(p2.getClickBag());
		// Thread.sleep(20000);

		Pojo3rdPage p3 = new Pojo3rdPage();
		javaClick(p3.getBagColour());
		// click(p3.getBagColour());
		click(p3.getBagTocart());
		close();
		

	}
*/
	@AfterMethod
	public static void endTime() {
		Date d = new Date();
		System.out.println(d);
	}

	/*
	 @AfterClass
	 public static void quit() { 
		 close(); }
	 */

}
