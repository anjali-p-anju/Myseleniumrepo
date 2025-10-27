package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Pageutility {

	public void selectDragDropWithValue(WebElement element, String value) {
		Select object=new Select(element);
		object.selectByValue(value);
	}

	public void selectDragDropbyVisibleText(WebElement element, String text) {
		Select object=new Select(element);
		object.selectByVisibleText(text);
	}
	public void selectDragDropbyIndex(WebElement element, int index) {
		Select object=new Select(element);
		object.selectByIndex(index);
	}
	public void selectByContainsVisibleText(WebElement element, String Text) {
		Select object=new Select(element);
		object.selectByContainsVisibleText(Text);
	}
	public void ClickByRadiobutton(WebElement element) {
		element.click();
	}
	public void ClickByCheckbox(WebElement element) {
		element.click();
	}
	
	
	
}
