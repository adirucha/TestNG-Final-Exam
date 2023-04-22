package page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ValidateUserAddCategory extends BasePage {

	WebDriver driver;

	// constructor of ValidateUserAddCategory class is called to refer the driver to
	// this class

	public ValidateUserAddCategory(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.CSS, using = "input[type='text']")
	WebElement ENTER_NEW_TODOLIST_CATEGORY;

	@FindBy(how = How.CSS, using = "input[value='Add']")
	WebElement CLICK_ADD_BUTTON;
	@FindBy(how = How.CSS, using = "input[name='todo[0]']")
	WebElement VALIDATE_NEW_ADDCATEGORY_LIST;
	@FindBy(how = How.CSS, using = "select[name='due_month']")
	WebElement MONTH_DROP_DOWN_ELEMENT;
	@FindBy(how=How.CSS,using="input[name='allbox']")WebElement CLICK_TOGGLEALL_CHECKBOX;
	@FindBy(how = How.CSS, using = "input[value='Remove']")
	WebElement CLICK_REMOVE_BUTTON;

	public void insertNewAddCategoryToDoLIst(String category) {
		String categoryname= category + generateRandomNum(999);
		ENTER_NEW_TODOLIST_CATEGORY.sendKeys(categoryname);
		System.out.println("==============="+categoryname);

	}

	public void clickAddButton() {
		CLICK_ADD_BUTTON.click();

	}

	public void selectMonthDropDown(String month) {

		selectFromMonthDropDown(MONTH_DROP_DOWN_ELEMENT, month);

	}
	public void clickRemoveButton() {
		CLICK_REMOVE_BUTTON.click();

	}
	public void clickToggleAllCheckbox() {
		CLICK_TOGGLEALL_CHECKBOX.click();
		
	}
	

	}

