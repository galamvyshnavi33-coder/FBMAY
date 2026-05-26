package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDowns {

	public static void main(String[] args) throws InterruptedException {
   System.setProperty("webDriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	    
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(3000);
		WebElement courseElement = driver.findElement(By.id("course"));
		Select courseNameDropdown=new Select(courseElement);
		
		courseNameDropdown.selectByIndex(1);
		Thread.sleep(3000);
		courseNameDropdown.selectByValue("net");
		Thread.sleep(3000);
		courseNameDropdown.selectByVisibleText("Javascript");
		Thread.sleep(3000);
        //String selectedText=courseNameDropdown.getFirstSelectedOption().getText();
       // System.out.println("selected visible text -"+selectedText);
	}

}
