package locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	    String parentWindowHandle=driver.getWindowHandle();
	    System.out.println("parent window handle-"+parentWindowHandle);
	    driver.findElement(By.id("newWindowBtn")).click();
	    Set<String>windowHandles=driver.getWindowHandles();
	    for(String windowHandle:windowHandles)
	    {
	    	if(!windowHandle.equals(parentWindowHandle))
	    	{
	    		driver.switchTo().window(windowHandle);
	    		driver.manage().window().maximize();
	    	}
	    	System.out.println(windowHandle);
	    }
	    driver.quit();
	    

	}

}
