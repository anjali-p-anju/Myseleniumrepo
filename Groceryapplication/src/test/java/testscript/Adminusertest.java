package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;


import automationbasis.Testngbase;
import constant.Constant;
import pages.Adminuserpage;
import pages.Homepage;
import pages.Loginpage;
import utility.Excelutility;
import utility.Randomdatautility;

public class Adminusertest extends Testngbase
{
	Homepage home;
	Adminuserpage adminpage;
@Test(description="user is able to add new user")
public void verifywhetheruserisabletoaddnewuser() throws IOException
{
	   String usernamevalue=Excelutility.getStringData(0, 0,"Loginpage");
	   String passwordvalue=Excelutility.getStringData(0, 1,"Loginpage");
	   Loginpage loginpage=new Loginpage(driver);
	   loginpage.enterusernameofusernamefield(usernamevalue).enterpasswordofpasswordfield(passwordvalue);
	   home=loginpage.entersigninofsigninfield(); 
	    //Homepage homepage=new Homepage(driver);
	    adminpage= home.clickadminmoreinfo();	
	   
	    //String usernamenew=Excelutility.getStringData(0, 0,"Adminpage");//excel data read commented for performing Radomutility
	   //String passwordnew=Excelutility.getStringData(0, 1,"Adminpage"); //excel data read commented for performing Radomutility
	  
	   Randomdatautility randomutility=new Randomdatautility();
	   String usernamenew=randomutility.randomusername();
	   String passwordnew=randomutility.randompassword(); 
	   adminpage.clickonnewuser().enterusernameofusernamefield(usernamenew).enterpasswordofpasswordfield(passwordnew).selectuser().clickonsavebutton();//chaining
	   boolean validate=  adminpage.validatenewuser();
	   Assert.assertTrue(validate, Constant.verifywhetheruserisabletoaddnewuser);
	   	  	  
}
@Test(description="user is able to search newly added user details")
public void verifywhetheruserisabletosearchthenewlyaddeduser() throws IOException 
{
	   String usernamevalue=Excelutility.getStringData(0, 0,"Loginpage");
	   String passwordvalue=Excelutility.getStringData(0, 1,"Loginpage");
	   Loginpage loginpage=new Loginpage(driver);
	   loginpage.enterusernameofusernamefield(usernamevalue).enterpasswordofpasswordfield(passwordvalue);
	    home= loginpage.entersigninofsigninfield();
	   String usernamenew=Excelutility.getStringData(0, 0,"Adminpage");
	   adminpage=home.clickadminmoreinfo();	
	   adminpage.clickonsearchbutton().searchusernamefield(usernamenew).searchusertype().searchclick();
	  boolean validate= adminpage.validatesearch();
	  Assert.assertTrue(validate,Constant.verifywhetheruserisabletosearchthenewlyaddeduser);
	   
}
@Test(description="user is able reset the users")
public void verifywhethertheuserisabletoresettheusers() throws IOException 
{
	  String usernamevalue=Excelutility.getStringData(0, 0,"Loginpage");
	   String passwordvalue=Excelutility.getStringData(0, 1,"Loginpage");
	   Loginpage loginpage=new Loginpage(driver);
	   loginpage.enterusernameofusernamefield(usernamevalue).enterpasswordofpasswordfield(passwordvalue);
	   home= loginpage.entersigninofsigninfield();
	   adminpage=home.clickadminmoreinfo();	
	   adminpage.clickonresetbutton(); 
	   boolean validate=adminpage.validatereset();
	   Assert.assertTrue(validate,Constant.verifywhethertheuserisabletoresettheusers);	   
	  
}

}
