package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AllCheckBoxRemovePage {
	
	WebDriver driver;

	public AllCheckBoxRemovePage(WebDriver driver) {
		this.driver = driver;

	}
	
	@FindBy(how = How.NAME, using = "submit") WebElement ALL_CHECKBOX_REMOVE_FIELD_LOCATOR;
	
	
	public void clickAllCheckboxRemove() {
		ALL_CHECKBOX_REMOVE_FIELD_LOCATOR.click();
	}

}
