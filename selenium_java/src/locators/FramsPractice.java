package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramsPractice {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","D:\\selenium\\\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
    driver.findElement(By.id("name")).sendKeys("text1");
    Thread.sleep(3000);
    driver.switchTo().frame("frm1");
    Select courseName_dd=new Select(driver.findElement(By.id("course")));
    courseName_dd.selectByVisibleText("Java");
    Thread.sleep(3000);

    driver.switchTo().defaultContent();
    driver.findElement(By.id("name")).clear();
    driver.findElement(By.id("name")).sendKeys("text2");
    driver.switchTo().frame("frm2");
    driver.findElement(By.id("firstName")).sendKeys("galamvyshnavi");
    Thread.sleep(3000);

    driver.switchTo().defaultContent();
    driver.switchTo().frame("frm1");
    courseName_dd.selectByVisibleText("Dot Net");
    Thread.sleep(3000);
    driver.switchTo().defaultContent();
    driver.findElement(By.id("name")).clear();
    driver.findElement(By.id("name")).sendKeys("text2");
	}
}

