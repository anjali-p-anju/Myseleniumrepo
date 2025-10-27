package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Waitutility;

public class Loginpage {

	public WebDriver driver;

	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name="username") WebElement username;
	@FindBy(name="password") WebElement password;
	@FindBy(xpath="//button[@type='submit']") WebElement login;
    @FindBy(xpath="//p[text()='Admin Users']") WebElement adminblock;
    @FindBy(xpath="//b[text()='7rmart supermarket']") WebElement text;
    @FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement alert;
	Waitutility waitutility=new Waitutility();//object created for wait utility
	
    public Loginpage enterusernameofusernamefield(String usernamevalue)
	{

		username.sendKeys(usernamevalue);
		return this;
	}
	public Loginpage enterpasswordofpasswordfield(String passwordvalue)
	{
		password.sendKeys(passwordvalue);
		return this;
	}
	public Homepage entersigninofsigninfield()
	{
		waitutility.waitUntilElementToBeClickable(driver,login);	//added wait
		login.click();
		return new Homepage(driver);
	}
	public boolean validatelogin()
	{
		return adminblock.isDisplayed();
	}
	public String istitledisplayed()
	{
		return text.getText();
	}
	public boolean validatewithinvalidpassword()
	{
		return alert.isDisplayed();
	}
	public boolean validatewithinvalidcredentials()
	{
		return alert.isDisplayed();
	}
	
	}
