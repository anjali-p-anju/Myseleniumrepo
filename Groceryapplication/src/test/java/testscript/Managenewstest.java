package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationbasis.Testngbase;
import constant.Constant;
import pages.Adminuserpage;
import pages.Homepage;
import pages.Loginpage;
import pages.Managenewspage;
import utility.Excelutility;

public class Managenewstest extends Testngbase

{
	Homepage home;
	Managenewspage login;

	@Test(description="user is able to add news")
	public void verifywhetheruserabletoaddnews() throws IOException
	{
		   String usernamevalue=Excelutility.getStringData(0, 0,"Loginpage");
		   String passwordvalue=Excelutility.getStringData(0, 1,"Loginpage");
		   Loginpage loginpage=new Loginpage(driver);
		   loginpage.enterusernameofusernamefield(usernamevalue).enterpasswordofpasswordfield(passwordvalue);//chaining
		   home= loginpage.entersigninofsigninfield(); 
		   login=home.clicknewsmoreinfo();
		   String newscontent =Excelutility.getStringData(0, 0,"News");
		   login.newsnewbutton().newsfield(newscontent).newssavebutton();//chaining
		   boolean validate=login.validatenewssavebutton();
		   Assert.assertTrue(validate,Constant.verifywhetheruserabletoaddnews);
	}
	@Test(description="user is able to search the news")
	public void verifywhetheruserisabletosearchthenews() throws IOException
	{
		String usernamevalue=Excelutility.getStringData(0, 0,"Loginpage");
		   String passwordvalue=Excelutility.getStringData(0, 1,"Loginpage");
		   Loginpage loginpage=new Loginpage(driver);
		   loginpage.enterusernameofusernamefield(usernamevalue).enterpasswordofpasswordfield(passwordvalue);//chaining
		   home=loginpage.entersigninofsigninfield(); 
		   login= home.clicknewsmoreinfo();
		   String newscontent =Excelutility.getStringData(0, 0,"News");
		   login.newssearchbutton().newssearchfieldofnews(newscontent).newssearchbuttonclick();//chaining
		   boolean validate=login.validatenewssearch();
		   Assert.assertTrue(validate,Constant.verifywhetheruserisabletosearchthenews );
	}
}
