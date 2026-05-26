package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		WebElement abc = driver.findElement(By.xpath("//textarea[@name='q']"));
		abc.sendKeys("hyr tutorials");
		abc.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement xyz = driver.findElement(By.xpath("//h3[@id='_V1sEaqiSLYDRwcsPgrzu0Q8_44']"));
		xyz.click();
		Thread.sleep(3000);
		
		

	}

}
