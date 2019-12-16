package automatingUptoPayement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo1stPage extends BaseForAll {
	public Pojo1stPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//button[@class='close'])[2]")
	private WebElement closeSignIn;
	
	public WebElement getCloseSignIn() {
		return closeSignIn;
	}
	
	
	@FindBy(xpath = "//input[@id='keywords']")
	private WebElement searchBox;
	public WebElement getSearchBox() {
		return searchBox;
	}
	

	
	@FindBy(xpath = "//button[@title='click to search']")
	private WebElement clickSearch;

	public WebElement getClickSearch() {
		return clickSearch;
	}

}
