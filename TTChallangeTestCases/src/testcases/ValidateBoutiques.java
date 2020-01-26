package testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utils.TestUtils;

public class ValidateBoutiques {
	TestUtils util;
	Logger log;
	public ValidateBoutiques(TestUtils util, Logger log) {
		this.util = util;
		this.log = log;
	}
	
	public Boolean ValidateBoutiqueCase() {
		try {
			this.util.driver.findElement(By.xpath("//li/a[@href = '/butik/liste/kadin']")).click();
			this.util.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'homepage-wrapper']/div/div[@class = 'sticky-wrapper']/div[@class = 'component-list component-big-list']")));
			if(!this.util.driver.getTitle().equals("Kadın, Moda, Giyim, Stil, Giyim Markaları | Trendyol")) {
				System.out.println("Title was not matched with specified variable");
				log.error("Page Title for /butik/liste/kadin url was not matched with specified variable. Actual Title:" + this.util.driver.getTitle());
				return false;
			}
			if(!this.util.driver.getCurrentUrl().equals("https://www.trendyol.com/butik/liste/kadin")) {
				System.out.println("Page url was not matched with specified url");
				log.error("Page url '/butik/liste/kadin' was not matched with specified url. Actual Url:" + this.util.driver.getCurrentUrl());
				return false;
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			return false;
		}
		try {
			this.util.driver.findElement(By.xpath("//li/a[@href = '/butik/liste/erkek']")).click();
			this.util.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'homepage-wrapper']/div/div[@class = 'sticky-wrapper']/div[@class = 'component-list component-big-list']")));
			if(!this.util.driver.getTitle().equals("Erkek Giyim, Erkek Kıyafetleri, Erkek Modası | Trendyol")) {
				System.out.println("Title was not matched with specified variable");
				log.error("Page Title for /butik/liste/erkek url was not matched with specified variable. Actual Title:" + this.util.driver.getTitle());
				return false;
			}
			if(!this.util.driver.getCurrentUrl().equals("https://www.trendyol.com/butik/liste/erkek")) {
				System.out.println("Page url was not matched with specified url");
				log.error("Page url '/butik/liste/erkek' was not matched with specified url. Actual Url:" + this.util.driver.getCurrentUrl());
				return false;
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			return false;
		}
		try {
			this.util.driver.findElement(By.xpath("//li/a[@href = '/butik/liste/cocuk']")).click();
			this.util.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'homepage-wrapper']/div/div[@class = 'sticky-wrapper']/div[@class = 'component-list component-big-list']")));
			if(!this.util.driver.getTitle().equals("Hamile Giyim, Bebek Kıyafetleri, Çocuk Giyim | Trendyol")) {
				System.out.println("Title was not matched with specified variable");
				log.error("Page Title for /butik/liste/cocuk url was not matched with specified variable. Actual Title:" + this.util.driver.getTitle());
				return false;
			}
			if(!this.util.driver.getCurrentUrl().equals("https://www.trendyol.com/butik/liste/cocuk")) {
				System.out.println("Page url was not matched with specified url");
				log.error("Page url '/butik/liste/cocuk' was not matched with specified url. Actual Url:" + this.util.driver.getCurrentUrl());
				return false;
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			return false;
		}
		try {
			this.util.driver.findElement(By.xpath("//li/a[@href = '/butik/liste/ayakkabi--canta']")).click();
			this.util.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'homepage-wrapper']/div/div[@class = 'sticky-wrapper']/div[@class = 'component-list component-big-list']")));
			if(!this.util.driver.getTitle().equals("Ayakkabı Al, Ayakkabı Markaları, Çanta Markaları | Trendyol")) {
				System.out.println("Title was not matched with specified variable");
				log.error("Page Title for /butik/liste/ayakkabi--canta url was not matched with specified variable. Actual Title:" + this.util.driver.getTitle());
				return false;
			}
			if(!this.util.driver.getCurrentUrl().equals("https://www.trendyol.com/butik/liste/ayakkabi--canta")) {
				System.out.println("Page url was not matched with specified url");
				log.error("Page url '/butik/liste/ayakkabi--canta' was not matched with specified url. Actual Url:" + this.util.driver.getCurrentUrl());
				return false;
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			return false;
		}
		try {
			this.util.driver.findElement(By.xpath("//li/a[@href = '/butik/liste/saat--aksesuar']")).click();
			this.util.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'homepage-wrapper']/div/div[@class = 'sticky-wrapper']/div[@class = 'component-list component-big-list']")));
			if(!this.util.driver.getTitle().equals("Kol Saati, Erkek Saat, Bayan Saat ve Gözlük Al | Trendyol")) {
				System.out.println("Title was not matched with specified variable");
				log.error("Page Title for /butik/liste/saat--aksesuar url was not matched with specified variable. Actual Title:" + this.util.driver.getTitle());
				return false;
			}
			if(!this.util.driver.getCurrentUrl().equals("https://www.trendyol.com/butik/liste/saat--aksesuar")) {
				System.out.println("Page url was not matched with specified url");
				log.error("Page url '/butik/liste/saat--aksesuar' was not matched with specified url. Actual Url:" + this.util.driver.getCurrentUrl());
				return false;
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			return false;
		}
		try {
			this.util.driver.findElement(By.xpath("//li/a[@href = '/butik/liste/kozmetik']")).click();
			this.util.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'homepage-wrapper']/div/div[@class = 'sticky-wrapper']/div[@class = 'component-list component-big-list']")));
			if(!this.util.driver.getTitle().equals("Online Kozmetik, Makyaj Ürünleri, Bakım Ürünleri | Trendyol")) {
				System.out.println("Title was not matched with specified variable");
				log.error("Page Title for /butik/liste/kozmetik url was not matched with specified variable. Actual Title:" + this.util.driver.getTitle());
				return false;
			}
			if(!this.util.driver.getCurrentUrl().equals("https://www.trendyol.com/butik/liste/kozmetik")) {
				System.out.println("Page url was not matched with specified url");
				log.error("Page url '/butik/liste/kozmetik' was not matched with specified url. Actual Url:" + this.util.driver.getCurrentUrl());
				return false;
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			return false;
		}
		try {
			this.util.driver.findElement(By.xpath("//li/a[@href = '/butik/liste/ev--yasam']")).click();
			this.util.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'homepage-wrapper']/div/div[@class = 'sticky-wrapper']/div[@class = 'component-list component-big-list']")));
			if(!this.util.driver.getTitle().equals("Ev Aksesuarları, Ev Eşyaları, Ev ve Yaşam | Trendyol")) {
				System.out.println("Title was not matched with specified variable");
				log.error("Page Title for /butik/liste/ev--yasam url was not matched with specified variable. Actual Title:" + this.util.driver.getTitle());
				return false;
			}
			if(!this.util.driver.getCurrentUrl().equals("https://www.trendyol.com/butik/liste/ev--yasam")) {
				System.out.println("Page url was not matched with specified url");
				log.error("Page url '/butik/liste/ev--yasam' was not matched with specified url. Actual Url:" + this.util.driver.getCurrentUrl());
				return false;
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			return false;
		}
		try {
			this.util.driver.findElement(By.xpath("//li/a[@href = '/butik/liste/elektronik']")).click();
			this.util.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'homepage-wrapper']/div/div[@class = 'sticky-wrapper']/div[@class = 'component-list component-big-list']")));
			if(!this.util.driver.getTitle().equals("En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da")) {
				System.out.println("Title was not matched with specified variable");
				log.error("Page Title for /butik/liste/elektronik url was not matched with specified variable. Actual Title:" + this.util.driver.getTitle());
				return false;
			}
			if(!this.util.driver.getCurrentUrl().equals("https://www.trendyol.com/butik/liste/elektronik")) {
				System.out.println("Page url was not matched with specified url");
				log.error("Page url '/butik/liste/elektronik' was not matched with specified url. Actual Url:" + this.util.driver.getCurrentUrl());
				return false;
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			return false;
		}
		try {
			this.util.driver.findElement(By.xpath("//li/a[@href = '/butik/liste/supermarket']")).click();
			this.util.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'homepage-wrapper']/div/div[@class = 'sticky-wrapper']/div[@class = 'component-list component-big-list']")));
			if(!this.util.driver.getTitle().equals("En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da")) {
				System.out.println("Title was not matched with specified variable");
				log.error("Page Title for /butik/liste/supermarket url was not matched with specified variable. Actual Title:" + this.util.driver.getTitle());
				return false;
			}
			if(!this.util.driver.getCurrentUrl().equals("https://www.trendyol.com/butik/liste/supermarket")) {
				System.out.println("Page url was not matched with specified url");
				log.error("Page url '/butik/liste/supermarket' was not matched with specified url. Actual Url:" + this.util.driver.getCurrentUrl());
				return false;
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			return false;
		}
		return true;
	}
}
