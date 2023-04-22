package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.DuplicateValues;
import page.ValidateUserAddCategory;
import util.BrowserFactory;

public class ValidateUserAddCategoryTest {
	WebDriver driver;
	String category = "Jaya";
	String category1="TechFios2022";
	String month = "Jan";
	// ValidateUserAddCategory validateuseraddcategory =
	// PageFactory.initElements(driver, ValidateUserAddCategory.class);

	@Test(priority = 1)
	public void validUserAddsCategoryToDoList() throws InterruptedException {
		driver = BrowserFactory.init();
		ValidateUserAddCategory validateuseraddcategory = PageFactory.initElements(driver,
				ValidateUserAddCategory.class);
		validateuseraddcategory.insertNewAddCategoryToDoLIst(category);
		validateuseraddcategory.clickAddButton();
		validateuseraddcategory.selectMonthDropDown(month);
		Thread.sleep(3000);
		validateuseraddcategory.clickToggleAllCheckbox();
		validateuseraddcategory.clickRemoveButton();
		Thread.sleep(3000);

	}

	@Test(priority = 2)
	public void duplicateValueAdded() throws InterruptedException {

		DuplicateValues duplicatevalues = PageFactory.initElements(driver, DuplicateValues.class);
		//validUserAddsCategoryToDoList();
		duplicatevalues.userIsNotAbleToAddDuplicateValue(category1);

	}

}
