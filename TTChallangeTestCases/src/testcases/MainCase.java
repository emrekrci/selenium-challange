package testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utils.TestUtils;



public class MainCase {
	public static void main(String[] args) throws Exception {
		
		//load configurations. This will get property from config.properties to define environment.
		TestUtils utils = new TestUtils();
		
		//create logger instance.
		Logger log = Logger.getLogger("devpinoyLogger");
		
		//create subcases to implement main test case with defined parameters.
		Login login = new Login(utils, log);
		ValidateBoutiques validateBoutique = new ValidateBoutiques(utils, log);
		ValidateBoutiqueImages validateBoutiqueImages = new ValidateBoutiqueImages(utils, log);
		AddProductToCard addProductToCard = new AddProductToCard(utils, log);
		
		//open web site which it will verify.
		utils.driver.navigate().to("https://www.trendyol.com");
		
		//close advertisement if it exists. We are pressing ESCAPE to close advertisement. 
		utils.driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
		utils.wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='fancybox-overlay fancybox-overlay-fixed']")));
		if(login.LoginCase()) {
			
			//walk around the boutique images
			if(!validateBoutique.ValidateBoutiqueCase()) {
				log.error("Boutique validation was failed.");
			}else {
				log.debug("Boutique validation was passed.");
			}
			
			//Click random boutique and validate images.
			if(!validateBoutiqueImages.BoutiqueImagesCase()) {
				log.error("Boutique Image validation was failed.");
			}else {
				log.debug("Boutique Image validation was passed.");
			}
			
			//click random product and add shopping card.
			if(!addProductToCard.AddProductToCardCase()) {
				log.error("Add Product To Card validation was failed.");
			}else {
				log.debug("Add Product To Card validation was passed.");
			}
			
			
		}else {
			System.out.println("Test case is closing..");
			log.debug("TestCase is closing");
		}
	}
}
