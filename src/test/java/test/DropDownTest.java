package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Util.BrowserFactory;

import page.DropDownPage;

public class DropDownTest {

	WebDriver driver;

	@Test
	public void UserShouldBeAbleToCheckDropDownBox() {
		driver = BrowserFactory.launchBrowser();
		DropDownPage dropdownbox = PageFactory.initElements(driver, DropDownPage.class);

		dropdownbox.clickDropDownCheckbox();

	}

}
