package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Util.BrowserFactory;
import page.BackgroundSkyBluePage;

public class BackgroundSkyBlueTest {

	WebDriver driver;

	@Test
	public void UserShouldBeAbleToCheckChangeBackground() {
		driver = BrowserFactory.launchBrowser();
		BackgroundSkyBluePage skyblue = PageFactory.initElements(driver, BackgroundSkyBluePage.class);

		skyblue.clickBackgroundSkyBlueCheckbox();

	}

	/*
	 * public class assertions {
	 * 
	 * @Test public void testOne() {
	 * 
	 * Assert.assertEquals("Skyblue", "Skyblue"); }
	 * 
	 * }
	 */

	public class assertions {

		@Test
		public void testOne() {

			Assert.assertEquals("skyblue", "skyblue", "Some comman error");
		}

	}

}
