package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Util.BrowserFactory;
import page.AllCheckBoxRemovePage;

public class AllCheckBoxRemoveTest {
	WebDriver driver;

	@Test
	public void UserShouldBeAbleToRemoveAllCheckBoxItem() {
		driver = BrowserFactory.launchBrowser();

		AllCheckBoxRemovePage removecheckbox = PageFactory.initElements(driver, AllCheckBoxRemovePage.class);

		removecheckbox.clickAllCheckboxRemove();



	}

}
