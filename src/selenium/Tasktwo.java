package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tasktwo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.manage().window().maximize();
		
	       WebElement firna = driver.findElement(By.name("firstName"));
	       firna.sendKeys("java");
		
	       WebElement lasna = driver.findElement(By.name("lastName"));
	       lasna.sendKeys("selenium");
		
	       WebElement gmail = driver.findElement(By.name("Username"));
	       gmail.sendKeys("janaga5767");
		
		

	       WebElement pwd = driver.findElement(By.name("Passwd"));
	       pwd.sendKeys("jana8u898");

	       WebElement conf = driver.findElement(By.name("ConfirmPasswd"));
	       conf.sendKeys("jana8u898");
		
		

	       WebElement savbt = driver.findElement(By.id("i3"));
	       savbt.click();
            Thread.sleep(2000);
	       WebElement nxtbtn = driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']"));
	       nxtbtn.click();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
