package automatingUptoPayement;

import java.util.Date;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Final2 extends BaseForAll {
	@BeforeClass
	public static void testcase2() throws Throwable {
		launch("https://www.lightinthebox.com/");

	}

	@BeforeMethod
	public static void startTime2() {
		Date d = new Date();
		System.out.println(d);
}
	@Test
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
//		javaClick(p3.getBagColour());
		// click(p3.getBagColour());
		javaClick(p3.getBagTocart());
		close();
	}
	@AfterMethod
	public static void endTime2() {
		Date d = new Date();
		System.out.println(d);
	}

}
		
		
		
		
		
		
		
		
		
		
		
		