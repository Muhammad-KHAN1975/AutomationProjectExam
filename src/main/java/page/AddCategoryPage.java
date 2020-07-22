package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCategoryPage {

	WebDriver driver;

	public AddCategoryPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.NAME, using = "categorydata")	WebElement ADDCATEGORY_FIELD_LOCATOR;
	@FindBy(how = How.CSS, using = "input[value='Add category']")	WebElement ADDCATEGORY_BUTTON_LOCATOR;

 

	
	public void enterAddCategoryData(String data) {
		ADDCATEGORY_FIELD_LOCATOR.sendKeys(data);
	}

	public void clickAddCategoryButton() {
		ADDCATEGORY_BUTTON_LOCATOR.click();
	}

}
