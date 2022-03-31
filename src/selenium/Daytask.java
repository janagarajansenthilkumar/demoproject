package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Daytask {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		
		WebElement name1 = driver.findElement(By.xpath("//input[@type='text'][1]"));
		name1.sendKeys("jana");
		
		
		WebElement name2 = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		name2.sendKeys("raju");
		
		
		WebElement addr = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		addr.sendKeys("dubai");
		
		WebElement emai = driver.findElement(By.xpath("//input[@type='email']"));
		emai.sendKeys("janaga583401@gmail.com");
		
		WebElement tel = driver.findElement(By.xpath("//input[@type='tel']"));
		tel.sendKeys("23445567890");
		

		WebElement telp = driver.findElement(By.xpath("//input[text()='tel']"));
		telp.sendKeys("23445567890");
		
		WebElement btnf = driver.findElement(By.xpath("//input[@value='FeMale']"));
		btnf.click();
		
		
		
		driver.close();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
