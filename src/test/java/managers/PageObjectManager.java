package managers;

import org.openqa.selenium.WebDriver;

import pages.LoginPage;
import pages.NewAccountPage;

public class PageObjectManager {
	private WebDriver driver;
	
	//Everytime a new page is created, this page should be updated
	
	private LoginPage loginPage;
	private NewAccountPage newAccountPage;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public LoginPage getLoginPageObject()
	{
		return (loginPage==null)? loginPage=new LoginPage(this.driver):loginPage;
	}
	
	public NewAccountPage getNewAccountPageObject()
	{
		return (newAccountPage==null)? newAccountPage = new NewAccountPage(this.driver):newAccountPage;
	}
}
