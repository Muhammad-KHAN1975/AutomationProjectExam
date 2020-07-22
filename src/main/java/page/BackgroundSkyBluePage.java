package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BackgroundSkyBluePage {

	WebDriver driver;

	public BackgroundSkyBluePage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//button[@onclick='myFunctionSky()']")
	WebElement BACKGROUND_SKYBLUE_FIELD_LOCATOR;

	public void clickBackgroundSkyBlueCheckbox() {
		BACKGROUND_SKYBLUE_FIELD_LOCATOR.click();

	}

}
