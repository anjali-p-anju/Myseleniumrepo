package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Managenewspage {

	public WebDriver driver;

	public  Managenewspage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//a[@class=\"btn btn-rounded btn-danger\"]") WebElement newbuttonnews;
	@FindBy(id="news") WebElement news;
	@FindBy(xpath="//button[@type=\"submit\"]") WebElement newssavebutton;
	@FindBy(xpath="//a[@class=\"btn btn-rounded btn-primary\"]") WebElement newssearch;
	@FindBy(xpath="//input[@class=\"form-control\"]") WebElement newssearchfield;
	@FindBy(xpath="//button[@class=\"btn btn-danger btn-fix\"]") WebElement newssearchbutton;
	
	
	public Managenewspage newsnewbutton()
	{
		newbuttonnews.click();
		return this;
	}
	public Managenewspage newsfield(String newscontent)
	{
		news.sendKeys(newscontent);
		return this;
	}
	public Managenewspage newssavebutton()
	{
		newssavebutton.click();
		return this;
	}
	public boolean validatenewssavebutton()
	{
		return newssavebutton.isEnabled();
	}
	public Managenewspage newssearchbutton()
	{
		newssearch.click();
		return this;
	}
	public Managenewspage newssearchfieldofnews(String newscontent)
	{
		newssearchfield.sendKeys(newscontent);
		return this;
	}
	public Managenewspage newssearchbuttonclick()
	{
		newssearchbutton.click();
		return this;
	}
	public boolean validatenewssearch()
	{
		return newssearch.isDisplayed();
	}
	}

