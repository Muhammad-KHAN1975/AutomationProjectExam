package test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Util.BrowserFactory;
import page.AllCheckBoxPage;

public class AllCheckBoxTest {

	WebDriver driver;

	@Test
	public void UserShouldBeAbleToCheckAllCheckBox(){
		driver = BrowserFactory.launchBrowser();
		AllCheckBoxPage allcheckbox = PageFactory.initElements(driver, AllCheckBoxPage.class);

		allcheckbox.clickAllCheckbox();

	}

}

