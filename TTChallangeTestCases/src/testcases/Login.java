package testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utils.TestUtils;

public class Login {
	TestUtils util;
	Logger log;
	public Login(TestUtils util, Logger log) {
		this.util = util;
		this.log = log;
	}
	public Boolean LoginCase() throws Exception {
		try {
			this.util.driver.findElement(By.id("accountBtn")).click();
			this.util.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id = 'popupLoginMain']")));
			this.util.driver.findElement(By.id("email")).sendKeys(this.util.username);
			this.util.driver.findElement(By.id("password")).sendKeys(this.util.password);
			this.util.driver.findElement(By.id("loginSubmit")).click();
			this.util.wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='fancybox-overlay fancybox-overlay-fixed']"))); // wait for page load
			if (this.util.driver.getCurrentUrl().equals("https://www.trendyol.com/butik/liste/erkek?e=login")) {
				System.out.println("Login was success");
				log.debug("Login was success");
				return true;
			}else {
				System.out.println("Login was not success");
				this.log.error("Login was not success with specified username and passowrd \n username:" + this.util.username + " password:" + this.util.password);
				return false;
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			return false;
		}
		
	}
}
