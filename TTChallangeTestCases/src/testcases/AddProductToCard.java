package testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import utils.TestUtils;

public class AddProductToCard {
	TestUtils util;
	Logger log;
	public AddProductToCard(TestUtils util, Logger log) {
		this.util = util;
		this.log = log;
	}
	
	public Boolean AddProductToCardCase() {
		try {
			this.util.driver.findElements(By.xpath("//div[@class = 'products']/div[@class = 'boutique-product']")).get(0).click();
			this.util.driver.findElement(By.xpath("//div[@style = 'display:flex']/button/div[@class = 'add-to-bs-tx']")).click();
			return true;
		} catch (Exception e) {
			log.error(e.getMessage());
			return false;
		}
	}
}
