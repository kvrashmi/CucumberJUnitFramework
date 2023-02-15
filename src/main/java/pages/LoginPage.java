package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import selenium.BasePage;

public class LoginPage extends BasePage{
	WebDriver driver;

	
	public LoginPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}

	//WebElements List
		public @FindBy(how=How.XPATH,using="//input[@id='username']")WebElement USER_NAME;
		public @FindBy(how=How.XPATH,using="//input[@id='password']")WebElement PASS_WORD;
		public @FindBy(how=How.NAME,using="login")WebElement SIGNIN_BUTTON;
		
		
		//Methods
		public void inputUserName(String userName)
		{
			USER_NAME.sendKeys(userName);
		}
		
		public void inputPassWord(String passWord)
		{
			PASS_WORD.sendKeys(passWord);
		}
		
		public void login()
		{
			SIGNIN_BUTTON.click();
		}
		
		public String getTitle()
		{
			System.out.println("Title:"+driver.getTitle());
			return driver.getTitle();
		}
}
