package mathi1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {
	public void ChromeDriver()
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\deiver\\chormedriver.exe");
		WebDriver c =new ChromeDriver();
		c.get("http://www.newtours.demoaut.com/");
		c.findElement(By.xpath("//input[@name='userName']")).sendKeys("mathi");
		
	}

}
