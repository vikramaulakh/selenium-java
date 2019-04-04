# selenium-java 
/* the source code follows */
package co.vik.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\New folder (2)\\zip_jar_exe\\exe files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("vikramdpaulakh@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		String at = driver.getTitle();
		String et = "gmail";
		driver.close();
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Test successful");
		}
		else
		{
			System.out.println("Test Failure");
			
		}
	}
}
