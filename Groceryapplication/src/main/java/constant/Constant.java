package constant;

public class Constant {
public static final String configfile=System.getProperty("user.dir")+"\\src\\main\\resources\\config.property";//then copy as path of Confing.property
public static final String testdata=System.getProperty("user.dir")+"\\src\\test\\resources\\Testdata.xlsx";//URL taken from excelutility
public static final String validateloginwithvalidcredentails=("User is unable to login with valid credentials");//logintest1 assertion
public static final String validateloginwithinvalidusernameandvalidpassword=("user was able to login with valid password");//logintest2 assertion
public static final String validateloginwithinvalidpasswordandvalidusename=("Alert not displayed");//logintest3 assertion
public static final String  validateloginwithinvalidpasswordandinvalidusename=("Alert not displayed");//logintest4 assertion
public static final String verifywhetheruserisabletoaddnewuser=("unabled to create new user");//adminusertest1 assertion 
public static final String verifywhetheruserisabletosearchthenewlyaddeduser=("searched user is not displayed");//adminusertest2 assertion
public static final String verifywhethertheuserisabletoresettheusers=("page reset is not working");//adminuserest3 assertion
public static final String verifytheuserisabletosuccessfullyloginandlogoutwithvalidcredential=("user is unable to logout");//hometestcase1
public static final String verifywhetheruserabletoaddnews=("The news is not saved");//managenewstest1 assertion
public static final String verifywhetheruserisabletosearchthenews=("The news is not displayed");//managenewstest2 assertion

}
