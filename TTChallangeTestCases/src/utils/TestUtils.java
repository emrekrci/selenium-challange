package utils;
import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

//TODO: This class can be static.
public class TestUtils {
	public WebDriver driver;
	public WebDriverWait wait;
	public String browser;
	public String username;
	public String password;
	
	/*
	 * This class will contain the properties like driver, username, password etc.
	 * There are two different constructor because of it is optional. 
	 * If you call constructor without driver name, it will get browser name from config.properties file. 
	 * If you call constructor with driver name, it will create driver instance with driver name which you defined.
	 */
	public TestUtils() throws Exception {
		LoadBrowserDriver(GetProperty("browser"));
		username = GetProperty("username");
		password = GetProperty("password");
		wait = new WebDriverWait(driver, 20);
	}
	
	public TestUtils(String driverName) throws Exception {
		LoadBrowserDriver(GetProperty(driverName));
		username = GetProperty("username");
		password = GetProperty("password");
		wait = new WebDriverWait(driver, 20);
	}
	
	//This method will use to get properties from config.properties file which it is under resources package.
	public String GetProperty(String propName) throws Exception {
		String name = new String();
		File configFile;
		FileReader reader;
		Properties prop;
		try {
			configFile = new File("./resources/config.properties");
			reader = new FileReader(configFile);
			prop = new Properties();
			prop.load(reader);
			name = prop.getProperty(propName);
		} catch (Exception e) {
			throw e;
		}
		return name;
	}
	
	//This method will define browser drivers into 'driver' property.
	public void LoadBrowserDriver(String name) throws Exception {
		switch (name) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "./browser_drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "Firefox":
			System.setProperty("webdriver.gecko.driver","./browser_drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "Safari":
			System.setProperty("webdriver.opera.driver","./browser_drivers/operadriver.exe");
			driver = new OperaDriver();
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver","./browser_drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		default:
			throw new Exception("Browser should be selected");
		}
	}
}
