package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DropDownPage {

	WebDriver driver;

	public DropDownPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.NAME, using = "due_month")WebElement DROPDOWN_CHECKBOX_FIELD_LOCATOR;

	public void clickDropDownCheckbox() {
		DROPDOWN_CHECKBOX_FIELD_LOCATOR.click();

	}

}
