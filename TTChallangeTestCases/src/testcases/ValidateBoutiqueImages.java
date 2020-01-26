package testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utils.TestUtils;

public class ValidateBoutiqueImages {
	TestUtils util;
	Logger log;
	public ValidateBoutiqueImages(TestUtils util, Logger log) {
		this.util = util;
		this.log = log;
	}
	
	public Boolean BoutiqueImagesCase() {
		Integer count = 0;
		try {
			this.util.driver.findElement(By.xpath("//li/a[@href = '/butik/liste/elektronik']")).click();
			this.util.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'homepage-wrapper']/div/div[@class = 'sticky-wrapper']/div[@class = 'component-list component-big-list']")));
			this.util.driver.findElements(By.xpath("//div/article[@class = 'component-item']")).get(0).click();
			java.util.List<WebElement> images=null;
			images = this.util.driver.findElements(By.xpath("//div[@class = 'products']/div[@class = 'boutique-product']")); // get products
			for (WebElement image : images) { // check product images
				WebElement imageFile = image.findElement(By.xpath("//a/img"));
				Boolean imagePresent = (Boolean) ((JavascriptExecutor)this.util.driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", imageFile);
				if (imagePresent) {
					System.out.println("image was displayed");
				}else {
					System.out.println("image was not displayed");
					count++;
					log.error("image was not displayed. Image url:" + imageFile.getAttribute("class"));
				}
			}
			//if count does not equal 0, that means one or more images did not displayed. 
			if(count != 0) return false;
			else return true;
		} catch (Exception e) {
			log.error(e.getMessage());
			return false;
		}
	}
}
