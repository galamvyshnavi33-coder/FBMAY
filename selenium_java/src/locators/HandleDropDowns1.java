package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDowns1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
//		WebElement courseElement = driver.findElement(By.id("course"));
//		Select courseNameDropdown=new Select(courseElement);
//		List<WebElement>courseNameDropdownOptions=courseNameDropdown.getOptions();
//		for(WebElement option:courseNameDropdownOptions)
//		{
//			System.out.println(option.getText());
//		}
//		courseNameDropdown.selectByIndex(1);
//		Thread.sleep(3000);
//		courseNameDropdown.selectByValue("net");
//		Thread.sleep(3000);
//		courseNameDropdown.selectByVisibleText("Javascript");
//		Thread.sleep(3000);
//        String selectedText=courseNameDropdown.getFirstSelectedOption().getText();
//        System.out.println("selected visible text-"+selectedText);
//         driver.close();
		WebElement ideElement = driver.findElement(By.id("ide"));
		Select ideNamedropdown=new Select(ideElement);
		List<WebElement>ideNameDropDownOptions=ideNamedropdown.getOptions();
		for(WebElement option:ideNameDropDownOptions)
		{
			System.out.println(option.getText());
		}
		ideNamedropdown.selectByIndex(0);
		Thread.sleep(3000);
		ideNamedropdown.selectByValue("ij");
		Thread.sleep(3000);
		ideNamedropdown.selectByVisibleText("Visual Studio");
		Thread.sleep(3000);
      String selectedText=ideNamedropdown.getFirstSelectedOption().getText();
       System.out.println("selected visible text-"+selectedText);
		List<WebElement>selectedoptions=ideNamedropdown.getAllSelectedOptions();
		for(WebElement selectedoption:selectedoptions)
		{
			System.out.println("selected visible text-"+selectedoption.getText());
		}
        driver.close();	
        
		
	}

}
