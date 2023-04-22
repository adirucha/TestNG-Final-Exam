package page;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	WebDriver driver;
	
	
	public int generateRandomNum(int boundNum) {
		Random rnd = new Random();
		int generatedrndName = rnd.nextInt(99);
		return generatedrndName;
		
	}
	public void selectFromMonthDropDown(WebElement element, String visibleText) {
		Select sel=new Select(element);
		
		sel.selectByVisibleText(visibleText);
		List<WebElement> e= sel.getOptions();
		int itemCount=e.size();
		for(int i=0;i<itemCount;i++) {
			System.out.println(e.get(i).getText());
		}
	}
	public void duplicateValueAssertion() {
		
		
		
		
	}
}
