package com.vikram.selenium.chrome;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class Demo {

	public static void main(String[] args) throws IOException {
		
		String os = System.getProperty("os.name");
		String osType = os.split(" ")[0];
		System.out.println(osType);
		String windowsPath = "drivers/v121/chromedriver-win64/chromedriver.exe";
		
		ResourceLoader resourceLoader = new DefaultResourceLoader();
		Resource resource = resourceLoader.getResource("classpath:"+windowsPath);
		String path = resource.getFile().getAbsolutePath();
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("vikramdpaulakh@gmail.com");
		driver.findElement(By.className("whsOnd")).click();
		String at = driver.getTitle();
		String et = "gmail";
		driver.close();
		if (at.equalsIgnoreCase(et)) {
			System.out.println("Test successful");
		} else {
			System.out.println("Test Failure");

		}
	}
}
