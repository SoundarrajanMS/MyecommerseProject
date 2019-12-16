package automatingUptoPayement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo2ndPage extends BaseForAll {

	public Pojo2ndPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Blue Grey Gold')]")
	private WebElement selectWatch;
	
	public WebElement getSelectWatch() {
		return selectWatch;
	}
	
	

	@FindBy(xpath="(//span[contains(text(),'Oxford Cloth Zipper')])[2]")
	private WebElement selectBag;

	public WebElement getClickBag() {
		return selectBag;
	}
	
	
	
	
}
