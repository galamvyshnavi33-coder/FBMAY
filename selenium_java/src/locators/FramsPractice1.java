package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramsPractice1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.get("https://demo.guru99.com/test/guru99home/");
	    Thread.sleep(3000);
        WebElement ele = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
        driver.switchTo().frame(ele);
        WebElement source = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
        source.click();
        driver.switchTo().defaultContent();
	    
	}

}
