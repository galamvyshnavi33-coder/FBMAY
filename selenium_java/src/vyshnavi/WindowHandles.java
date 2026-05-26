package vyshnavi;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
        String parentwindow=driver.getWindowHandle();
		Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@title='Remote']")).click();
        Set<String>allwindows=driver.getWindowHandles();
        System.out.println(allwindows);
        for(String tempwindow:allwindows)
        {
        	if(!tempwindow.equals(parentwindow))
          { 
        	  System.out.println(driver.getTitle());
      		Thread.sleep(3000);
      		driver.switchTo().window(tempwindow);
      		System.out.println(driver.getTitle());
      		driver.findElement(By.xpath("//span[@title='Work from office']")).click();
      		driver.close();
          }
        }
        driver.switchTo().window(parentwindow);
        System.out.println(driver.getTitle());
        Thread.sleep(4000);
        WebElement ele = driver.findElement(By.xpath("//a[@title='MNC']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", ele); 
	}
}
      		

         