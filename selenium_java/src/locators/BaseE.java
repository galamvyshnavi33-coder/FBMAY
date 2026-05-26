package locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseE {
 private static int i;

 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.google.com");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("testing");
	 
	 List<WebElement>values=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	 System.out.println(values.size());
	 
	 for(int i=0;i<=values.size()-1;i++)
			 
		 if("xperts".equals(values.get(i).getText()))
		 {
			 values.get(i).click();
		 }
      
	 Thread.sleep(3000);
 
	 System.out.println("hello");
 }
	 
}



	