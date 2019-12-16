package automatingUptoPayement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseForAll {

	static WebDriver driver;

	public static void launch(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Ecommerce\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}

	public static void click(WebElement locator) {
		locator.click();
	}

	public static void fillbox(WebElement locator, String type) {
		locator.sendKeys(type);

	}

	public static void ClickEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void close() {
		driver.quit();

	}

	public static void javaClick(WebElement loc) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", loc);
	}

	public static String getData(int rowNo,int cellNo) throws Throwable {
		String value = null;
		File f = new File("C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Ecommerce\\Excel\\brightinlight.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);

		Sheet sheet = w.getSheet("sheet1");
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		int cellType = cell.getCellType();
		if (cellType == 1) {
			value = cell.getStringCellValue();
		} else if (cellType == 0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date cellValue = cell.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-MMM-yy");
				value = sim.format(cellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long) numericCellValue;
				value = String.valueOf(l);

			}
		}
		return value;

	}

}
