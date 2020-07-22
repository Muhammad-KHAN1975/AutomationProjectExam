package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckBoxPage {

	WebDriver driver;

	public CheckBoxPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.NAME, using = "todo[7]") WebElement SINGLE_CHECKBOX_FIELD_LOCATOR;
	@FindBy(how = How.NAME, using = "submit")  WebElement REMOVE_BUTTON_FIELD_LOCATOR;

	public void clickCheckbox() {
		SINGLE_CHECKBOX_FIELD_LOCATOR.click();
	}

	public void clickRemoveButton() {
		REMOVE_BUTTON_FIELD_LOCATOR.click();
	}


}
