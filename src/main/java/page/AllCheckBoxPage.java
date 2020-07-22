package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AllCheckBoxPage {

	WebDriver driver;

	public AllCheckBoxPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.NAME, using = "allbox")WebElement ALL_CHECKBOX_FIELD_LOCATOR;

	public void clickAllCheckbox() {
		ALL_CHECKBOX_FIELD_LOCATOR.click();

	}

}
