package automatingUptoPayement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo3rdPage extends BaseForAll {
	public Pojo3rdPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//img[@class='sku-img'])[2]")
	private WebElement watchColour;
	
	public WebElement getWatchColour() {
		return watchColour;
	}
	
	
	@FindBy(xpath = "//input[@value='Add to Cart']")
	private WebElement watchToCart;
	
	public WebElement getWatchToCart() {
		return watchToCart;
	}
	
	
	@FindBy(xpath="//input[@value='Add to Cart']")
	private WebElement bagTocart;
	
	public WebElement getBagTocart() {
		return bagTocart;
	}
	 

	@FindBy(xpath="(//img[@src='https://li0.rightinthebox.com/images/50x50/201906/pcglcm1561629540298.jpg'])[2]")
	private WebElement bagColour;
	
	public WebElement getBagColour() {
		return bagColour;
	}
	@FindBy(xpath="//input[@id='keywords']")
	private WebElement search2;

	public WebElement getSearch2() {
		return search2;
	}
	@FindBy(xpath="//button[@title='click to search']")
	private WebElement clickSearch2;

	public WebElement getClickSearch2() {
		return clickSearch2;
	}



	
	
	

}

