package vyshnavi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
//		WebElement coursename = driver.findElement(By.id("course"));
//		ISelect coursenamedropdown=new Select(coursename);
//		List<WebElement>coursenamedropdownoptions=coursenamedropdown.getOptions();
//		for(WebElement option:coursenamedropdownoptions)
//		{
//			System.out.println(option.getText());
//		}
//		coursenamedropdown.selectByIndex(1);
//		Thread.sleep(3000);
//		coursenamedropdown.selectByValue("net");
//		Thread.sleep(3000);
//		coursenamedropdown.selectByVisibleText("Javascript");
//		Thread.sleep(3000);
		
		WebElement IdeName = driver.findElement(By.id("ide"));
		Select IdeNameDropdown=new Select(IdeName);
		List<WebElement>IdeNameDropdownOptions=IdeNameDropdown.getOptions();
		for(WebElement option:IdeNameDropdownOptions)
		{
			System.out.println(option.getText());
		}
		IdeNameDropdown.selectByIndex(0);
		Thread.sleep(3000);
		IdeNameDropdown.selectByValue("ij");
		Thread.sleep(3000);
		IdeNameDropdown.selectByVisibleText("Visual Studio");
		Thread.sleep(3000);
		IdeNameDropdown.deSelectByContainsVisibleText("IntelliJ IDEA");
		List<WebElement>selectedoptions=IdeNameDropdown.getAllSelectedOptions();
		for(WebElement selectedoption:selectedoptions)
		{
		   System.out.println("selected visible text-"+selectedoption.getText());
		}

	}

}
