package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BackgroundWhitePage {
	
		WebDriver driver;

		public BackgroundWhitePage(WebDriver driver) {
			this.driver = driver;

		}

		@FindBy(how = How.XPATH, using = "//button[@onclick='myFunctionWhite()']")WebElement BACKGROUND_WHITE_FIELD_LOCATOR;
	     

		public void clickBackgroundWhiteCheckbox() {
			BACKGROUND_WHITE_FIELD_LOCATOR.click();

		}

}
