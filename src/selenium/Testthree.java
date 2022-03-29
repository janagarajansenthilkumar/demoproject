package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testthree {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com");
		
		driver.manage().window().maximize();
		
		
		WebElement greenname = driver.findElement(By.xpath("//u[text()='Greens Technologys Software Training Centers in Chennai']"));
		
		
		String text = greenname.getText();
		System.out.println(text);
		
		
		driver.get(" http://greenstech.in/selenium-course-content.html");
		 
		
driver.manage().window().maximize();
		
		
		WebElement velsir = driver.findElement(By.xpath("//b[text()='Velmurugan is a Test Manager at Hexaware.']"));
		
		
		String text2 = velsir.getText();
		System.out.println(text2);
		
		
		WebElement addres2 = driver.findElement(By.xpath("(//div[@class='col-md-3 short-desc-with-logo widget widget_text'])[2]"));
		
		String text3 = addres2.getText();
		
		System.out.println(text3);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
