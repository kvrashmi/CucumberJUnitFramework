package managers;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import enums.DriverType;
import enums.EnvironmentType;

/*
 * Purpose: 
 * Decide in which browser we are going to conduct the testing,
 * Decide whether the testing is going to be remote or local
 * Based on the above two categories get the appropriate driver
 * 
 */
public class WebDriverManager {
	private WebDriver driver;
	private static DriverType driverType;
	private static EnvironmentType environmentType;
	private Map<String,String> configFileData = FileReaderManager.getInstance().getConfigReader().getConfigFileData();
	
	public WebDriverManager()
	{
		WebDriverManager.driverType = DriverType.valueOf(FileReaderManager.getInstance().getConfigReader().getValueOfProperty("browser").toUpperCase());
		WebDriverManager.environmentType=EnvironmentType.valueOf(FileReaderManager.getInstance().getConfigReader().getValueOfProperty("environment").toUpperCase());
	}
	
	public WebDriver setUp()
	{
		if(driver==null)
		{
			switch (environmentType) {
			case LOCAL:
				switch(driverType)
				{
				case CHROME:
					System.setProperty(configFileData.get("chromeDriverProp"), configFileData.get("chromeDriverPath"));
					driver.get(configFileData.get("url"));
					if(Boolean.parseBoolean(configFileData.get("maximize")))
					{
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(Integer.parseInt(configFileData.get("implicitlyWait")), TimeUnit.SECONDS);
						driver.manage().deleteAllCookies();
					}
					break;
				case FIREFOX:
					System.setProperty(configFileData.get("firefoxDriverProp"), configFileData.get("firefoxDriverPath"));
					driver.get(configFileData.get("url"));
					if(Boolean.parseBoolean(configFileData.get("maximize")))
					{
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(Integer.parseInt(configFileData.get("implicitlyWait")), TimeUnit.SECONDS);
						driver.manage().deleteAllCookies();
					}
					break;
				case INTERNETEXPLORER:
					break;
				case SAFARI:
					break;
				case OPERA:
					break;
				case EDGE:
					break;
				case ALL:
					break;
				}
			case REMOTE:
				switch(driverType) {
				case CHROME:
					ChromeOptions chromeOptions = new ChromeOptions();
					try {
						driver = new RemoteWebDriver(new URL(configFileData.get("url")), chromeOptions);
						if(Boolean.parseBoolean(configFileData.get("maximize")))
						{
							driver.manage().window().maximize();
							driver.manage().timeouts().implicitlyWait(Integer.parseInt(configFileData.get("implicitlyWait")), TimeUnit.SECONDS);
							driver.manage().deleteAllCookies();
						}
					} 
					catch (MalformedURLException e) 
					{
						e.printStackTrace();
					}
					break;
				case FIREFOX:
					break;
				case INTERNETEXPLORER:
					break;
				case SAFARI:
					break;
				case OPERA:
					break;
				case EDGE:
					break;
				case ALL:
					break;
				}
				
			}
				
		return driver;	
		}
		return driver;
	}
	
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}
}
