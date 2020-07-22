package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Util.BrowserFactory;
import page.BackgroundWhitePage;

public class BackgroundWhiteTest {
	
	WebDriver driver;

	@Test
	public void UserShouldBeAbleToCheckChangeBackground() {
		driver = BrowserFactory.launchBrowser();
		BackgroundWhitePage white = PageFactory.initElements(driver, BackgroundWhitePage.class);

		white.clickBackgroundWhiteCheckbox();

	}

}
