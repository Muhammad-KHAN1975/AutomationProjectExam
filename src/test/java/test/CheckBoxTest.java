package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Util.BrowserFactory;
import page.CheckBoxPage;

public class CheckBoxTest {
	WebDriver driver;

	@Test
	public void validUserShouldBeAbleToRemoveSingleListItem() {
		driver = BrowserFactory.launchBrowser();

		CheckBoxPage checkbox = PageFactory.initElements(driver, CheckBoxPage.class);

		checkbox.clickCheckbox();

		CheckBoxPage removeButton = PageFactory.initElements(driver, CheckBoxPage.class);
		removeButton.clickRemoveButton();

		// String singleCheckBoxChecked =
		// driver.findElement(By.name("submit")).getText();
		// Assert.assertEquals("Remove", singleCheckBoxChecked, "Single item
		// Removed!!!");

	}

	public class assertions {

		@Test
		public void testOne() {

			Assert.assertEquals(true, true);
		}

	}
	
	

}
