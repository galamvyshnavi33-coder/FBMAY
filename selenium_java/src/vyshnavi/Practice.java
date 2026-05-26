package vyshnavi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//input[@name='search_query']"));
		Thread.sleep(3000);
		element.sendKeys("hit songs");
		Thread.sleep(3000);
		element.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
		WebElement abc = driver.findElement(By.xpath("//textarea[@name='q']"));
		Thread.sleep(3000);
		abc.sendKeys("hyr tutorials");
		Thread.sleep(3000);
		abc.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

	}

}
