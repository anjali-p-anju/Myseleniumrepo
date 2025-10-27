package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Pageutility;

public class Adminuserpage {

	public WebDriver driver;

	public  Adminuserpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//@FindBy(xpath="//a[@class='small-box-footer'][1]")WebElement adminmoreinfo;
	 @FindBy(xpath="//a[@class=\"btn btn-rounded btn-danger\"]") WebElement newuser;
	 @FindBy(id="username") WebElement username;
	 @FindBy(id="password") WebElement password;
	 @FindBy(xpath="//select[@id='user_type']") WebElement usertype;
	 @FindBy(name="Create") WebElement save;
	 @FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement searchclickbutton;
	 @FindBy(xpath="//input[@id='un']") WebElement usernamesearch;
	 @FindBy(xpath="//select[@id='ut']") WebElement usertypesearch;
	 @FindBy(xpath="//button[@class='btn btn-block-sm btn-danger'][1]") WebElement search;
	 @FindBy(xpath="//span[@class='badge bg-success']") WebElement usersearchstatus;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']") WebElement resetbutton;
	@FindBy(xpath="(//div[@class='container-fluid'])[2]") WebElement resetdata;
	
	Pageutility pageutility=new Pageutility();//object created for page utility
	
	 public Adminuserpage clickonnewuser()
	 {
		 newuser.click();
		 return this;
	 }
	 
	
	 public Adminuserpage enterusernameofusernamefield(String usernamenew)
		{

			username.sendKeys(usernamenew);
			return this;
		}
		public Adminuserpage enterpasswordofpasswordfield(String passwordnew)
		{
			password.sendKeys(passwordnew);
			return this;
		}
		public Adminuserpage selectuser()
		{
			//Select select=new Select(usertype);
			//select.selectByVisibleText("Staff");
			pageutility.selectByContainsVisibleText(usertype, "Staff");//called by using page utility object
		return this;
		}
		public Adminuserpage clickonsavebutton()
		{
			save.click();
			return this;
		}
		public boolean validatenewuser()
		{
			return newuser.isEnabled();
		}
		public Adminuserpage clickonsearchbutton() 
		{
			searchclickbutton.click();
			return this;
		}
		public Adminuserpage searchusernamefield(String usernamenew)
		{
			usernamesearch.sendKeys(usernamenew);
			return this;
		}
		public Adminuserpage searchusertype()
		{
			//Select select=new Select(usertypesearch);
			//select.selectByVisibleText("Staff");
			pageutility.selectByContainsVisibleText(usertypesearch, "Staff");//called by using page utility object
		return this;
		}
		public Adminuserpage searchclick()
		{
			search.click();
			return this;
		}
		public boolean validatesearch()
		{
			return usersearchstatus.isDisplayed();
		}
		public Adminuserpage clickonresetbutton()
		{
			resetbutton.click();
			return this;
		}
		
		public boolean validatereset() 
		{
			return resetdata.isDisplayed();
		}	
		
}
