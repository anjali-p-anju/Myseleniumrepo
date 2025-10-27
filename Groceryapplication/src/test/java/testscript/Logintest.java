package testscript;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;
import automationbasis.Testngbase;
import constant.Constant;
import pages.Homepage;
import pages.Loginpage;
import utility.Excelutility;

public class Logintest extends Testngbase
{
    Homepage home;//homepage reference created
    
	@Test(priority=1,description="user is  trying  to login with valid credentials",groups={"Smoke"})
	public void validateloginwithvalidcredentails() throws IOException
	{
			
		   String usernamevalue=Excelutility.getStringData(0, 0,"Loginpage");
		   String passwordvalue=Excelutility.getStringData(0, 1,"Loginpage");
		   Loginpage loginpage=new Loginpage(driver); 
		   loginpage.enterusernameofusernamefield(usernamevalue).enterpasswordofpasswordfield(passwordvalue);//chaining
		   home=loginpage.entersigninofsigninfield();
		   boolean validate=loginpage.validatelogin();
		   Assert.assertTrue(validate,Constant.validateloginwithvalidcredentails);//Assert true
	}
    @Test(priority=2,description="user is unable to login with invalid credentials",retryAnalyzer = retry.Retry.class)
	public void validateloginwithinvalidusernameandvalidpassword() throws IOException
	{
		
		   String usernamevalue=Excelutility.getStringData(1, 0,"Loginpage");//for retry mechanism excel value change from 1 to 11
		   String passwordvalue=Excelutility.getStringData(1, 1,"Loginpage");
		   Loginpage loginpage=new Loginpage(driver);
		   loginpage.enterusernameofusernamefield(usernamevalue).enterpasswordofpasswordfield(passwordvalue).entersigninofsigninfield();//chaining
		   String expected="7rmart supermarket";
		   String actualvalue=loginpage.istitledisplayed();
		   Assert.assertEquals(actualvalue, expected,Constant.validateloginwithinvalidusernameandvalidpassword);//Assert Equals
		   
	}
	@Test(priority=3,description="user is unable to login with invalid credentials")
	
	public void validateloginwithinvalidpasswordandvalidusename() throws IOException
	{
		
		   String usernamevalue=Excelutility.getStringData(2, 0,"Loginpage");
		   String passwordvalue=Excelutility.getStringData(2, 1,"Loginpage");
		   Loginpage loginpage=new Loginpage(driver);
		   loginpage.enterusernameofusernamefield(usernamevalue).enterpasswordofpasswordfield(passwordvalue).entersigninofsigninfield();//chaining
		   boolean validate=loginpage.validatewithinvalidpassword();
		   Assert.assertTrue(validate, Constant.validateloginwithinvalidpasswordandvalidusename);
		   
		   
	}
	@Test(priority=4,description="user is unable to login with invalid credentials",groups= {"Smoke"},dataProvider="loginProvider")
	
	public void validateloginwithinvalidpasswordandinvalidusename(String usernamevalue,String passwordvalue) throws IOException
	{
		
		//String usernamevalue=Excelutility.getStringData(3, 0,"Loginpage");//commented for data provider run
		  // String passwordvalue=Excelutility.getStringData(3, 1,"Loginpage");//commented for data provider run
		
		   Loginpage loginpage=new Loginpage(driver);
		   loginpage.enterusernameofusernamefield(usernamevalue).enterpasswordofpasswordfield(passwordvalue).entersigninofsigninfield();//chaining
		   boolean validate=loginpage.validatewithinvalidcredentials();
		   Assert.assertTrue(validate, Constant.validateloginwithinvalidpasswordandinvalidusename);
		   
	}
	@DataProvider(name = "loginProvider")//data provider
	public Object[][] getDataFromDataProvider() throws IOException {

	return new Object[][] { new Object[] { "admin", "admin22" }, new Object[] { "admin123", "123" },
	// new Object[] {ExcelUtility.getStringData(3,
	// 0,"Login"),ExcelUtility.getStringData(3,1 ,"Login")}
	};
	}
	
	
}
