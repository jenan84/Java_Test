import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		/*driver.get("https://smartbuy-me.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"shopify-section-template--23554639757622__featured_collection_AyKFpr\"]/section/div[1]/header/a")).click();
		
		
		List<WebElement> add_buttons = driver.findElements(By.className("button--small"));
		
		for(int i = 0; i < add_buttons.size(); i++) {
			add_buttons.get(i).click();
			
			driver.findElement(By.xpath("//*[@id=\"modal-quick-view-template--23554639036726__main\"]/div/button")).click();
			Thread.sleep(5000);
		}
		*/
		
		
		/*driver.get("https://www.saucedemo.com/inventory.html");
		driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		List<WebElement> add_buttons = driver.findElements(By.className("btn"));
		
		for(int i = 0; i < add_buttons.size(); i++) {
			add_buttons.get(i).click();
		}
*/
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.google.co.uk/");
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("jenan" + Keys.RETURN);
		List<WebElement> url_text = driver.findElements(By.className("LC20lb"));
		for(int i=0; i< url_text.size(); i++) {
			
			System.out.println(url_text.get(i).getText());
		}
		
		
		
	}

}
