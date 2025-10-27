package testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.exec.LogOutputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


import automationbasis.Testngbase;
import constant.Constant;
import pages.Homepage;
import pages.Loginpage;
import utility.Excelutility;

public class Hometest  extends Testngbase
{
	Homepage logout;//reference created
@Test(description="userisabletosuccessfullyloginandlogoutwithvalidcredentials")

public void verifytheuserisabletosuccessfullyloginandlogoutwithvalidcredentials() throws IOException
{
		
	   String usernamevalue=Excelutility.getStringData(0, 0,"Loginpage");
	   String passwordvalue=Excelutility.getStringData(0, 1,"Loginpage");
	   Loginpage loginpage=new Loginpage(driver);
	   loginpage.enterusernameofusernamefield(usernamevalue).enterpasswordofpasswordfield(passwordvalue);//chaining
	  // Homepage logout=new Homepage(driver);
	   logout= loginpage.entersigninofsigninfield().clickadminfieldofadmin();//chaining
	   loginpage= logout.enterlogoutoflogoutfield();//
	   
	   String expected="7rmart supermarket";
	   String actualvalue=logout.istitledisplayed();
	   Assert.assertEquals(actualvalue, expected, Constant.verifytheuserisabletosuccessfullyloginandlogoutwithvalidcredential);
}
}
