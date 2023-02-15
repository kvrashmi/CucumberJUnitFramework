package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void selectFromDropDown(By locator,String visibleText)
	{
		Select sel=new Select(this.driver.findElement(locator));
		sel.selectByVisibleText(visibleText); 
	}
	
	public void selectFromDropDown(WebElement element,String visibleText)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(visibleText);
	}

	public void selectFromDropDown(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	public void explicitlyWaitForElements(String elemType,String locatorText)
	{
		WebDriverWait wait = new WebDriverWait(this.driver,30);
		if(elemType.equals("Select"))
		{
			wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(By.xpath(locatorText),By.tagName("option")));
		}
		else if(elemType.equals("Link"))
		{
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(locatorText))));
		}
		else if(elemType.equals("Div"))
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorText)));
		}
	}
	
	public int getTableColumnCount(String tableLocator)
	{
		//Get the number of columns in this table
		List <WebElement> col = this.driver.findElements(By.xpath(tableLocator));
	    return col.size();	    
	}
	
	public int getTableRowCount(String tableLocator)
	{
		List <WebElement> rows = this.driver.findElements(By.xpath(tableLocator)); 
		return rows.size();
	}
	
	public void hoverOverElement(WebElement element)
	{
		Actions action = new Actions(this.driver);
		action.moveToElement(element).perform();
	}

}
