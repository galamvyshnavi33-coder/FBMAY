package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(3000);
        List<WebElement>values=driver.findElements(By.xpath("//input[@type='radio']"));
		Thread.sleep(3000);
        for(int i=0;i<=values.size()-1;i++)
        {
        	if("option2".equals(values.get(i).getAttribute("value")))
        	{
        		Thread.sleep(3000);

        		if(values.get(i).isSelected())
        		{
        			System.out.println("already selected");
        		}
        		else
        		{
        			values.get(i).click();
        		}
				System.out.println(values.get(i).getAttribute("value"));

        	}
        }
	}
}
