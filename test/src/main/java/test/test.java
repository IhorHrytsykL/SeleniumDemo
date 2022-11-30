package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	
	
	public static void main(String wiki_url, int number_int) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(wiki_url);

		Thread.sleep(1000);
		
		String[] wikiLinksArray = new String[20];
				
		int max_n = 0;
				
		while (number_int > max_n ) {

			driver.findElement(By.cssSelector("a[href*='wikipedia']")).click();
			wikiLinksArray[max_n] = driver.getCurrentUrl();
			System.out.println(wikiLinksArray[max_n]);
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//a[contains(@href,'wikipedia')]")).sendKeys(Keys.BACK_SPACE);
			max_n = max_n+1;
		}
				
		driver.close();

	}

}
