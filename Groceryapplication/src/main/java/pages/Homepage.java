package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepage {

	public WebDriver driver;

	public  Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//a[@class='nav-link'])[2]")WebElement admin;
	@FindBy(xpath="//i[@class='ace-icon fa fa-power-off']")WebElement logout;
	@FindBy(xpath="(//a[@class=\"small-box-footer\"])[1]")WebElement adminmoreinfo;
	@FindBy(xpath="(//a[@class=\"small-box-footer\"])[7]") WebElement newsmoreinfo;
	@FindBy(xpath="//b[text()='7rmart supermarket']") WebElement text;
	
	
	public Homepage clickadminfieldofadmin()
	{
		admin.click();
		return this;
	}
	public Loginpage enterlogoutoflogoutfield()
	{
		logout.click();
		return new Loginpage(driver);
	}
	public Adminuserpage clickadminmoreinfo()
	{
		adminmoreinfo.click();	
		return new Adminuserpage(driver);
		}
	
	public Managenewspage clicknewsmoreinfo()
	{
		newsmoreinfo.click();
		return new Managenewspage(driver);
	}
	public String istitledisplayed()
	{
		return text.getText();
	}
	}

