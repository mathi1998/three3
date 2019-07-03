package mathi1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hi {

	public static void main(String[] args) 
		{
			System.setProperty("webdriver.gecko.driver","C:\\selenium\\deiver\\geckodriver.exe");
			FirefoxDriver c =new FirefoxDriver();
			c.get("http://www.newtours.demoaut.com/");
			c.findElement(By.xpath("//tr/td[2]/input[@name='userName']")).sendKeys("mathi");
//			/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("mathi");
		
	}

}
