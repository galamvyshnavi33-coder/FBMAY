package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Allpakages.Loginpage;

public class Class1  extends BaseC{

	public static void main(String[] args)throws InterruptedException
	{
		BaseC.launch();
		application_launch(url);
		driver.findElement(By.name("email")).sendKeys("testing@gmailcom");
		driver.findElement(By.name("pass")).sendKeys("p233");
		WebElement username=driver.findElement(By.name("cusid"));
		WebElement submit=driver.findElement(By.name("submit"));
		// submit=driver.findElement(By.name("pass"));
		username.sendKeys("1232234");
		submit.click();
		Loginpage.Entercustomerid("1232");
		Loginpage.submitbutton();
	}
}

