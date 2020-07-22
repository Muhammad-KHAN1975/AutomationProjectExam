package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Util.BrowserFactory;
import page.AddCategoryPage;

public class DuplicateCategoryTest {
	
	WebDriver driver;

	@Test
	public void userShouldBeAbleAdddata() {

		driver = BrowserFactory.launchBrowser();

		AddCategoryPage addCategory = PageFactory.initElements(driver, AddCategoryPage.class);

		addCategory.enterAddCategoryData("abc");
		addCategory.clickAddCategoryButton();

	}


}
