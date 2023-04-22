package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DuplicateValues extends BasePage{
	WebDriver driver;
	public DuplicateValues(WebDriver driver) {
		this.driver = driver;

	}
	
@FindBy(how=How.CSS,using="input[value='Remove']")WebElement CLICK_REMOVE_BUTTON;
@FindBy(how=How.CSS,using="input[type='text']")WebElement ENTER_NEW_TODOLIST_CATEGORY;
@FindBy(how=How.CSS,using="input[name='todo[0]']")WebElement CLICK_NEWTODO_LIST_CHECKBOX;

@FindBy(how=How.CSS,using="input[value='Add']")WebElement CLICK_ADD_BUTTON;


	
public void userIsNotAbleToAddDuplicateValue(String category1) {
	
	ENTER_NEW_TODOLIST_CATEGORY.sendKeys(category1);
	System.out.println("==============="+category1);
	CLICK_ADD_BUTTON.click();
	ENTER_NEW_TODOLIST_CATEGORY.sendKeys(category1);
	CLICK_ADD_BUTTON.click();
	System.out.println("\"The category you want to add already exists:"+category1);
	}
	

}


	
	

