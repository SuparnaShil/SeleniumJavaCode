import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium file\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//driver.get("https://yahoo.com");
		//driver.navigate().back();
		//driver.close();//close current window
		//driver.quit();//close all windows
		/*driver.get("https://facebook.com");
		driver.findElement(By.id("email" )).sendKeys("This is my frist code"); 
		driver.findElement(By.name("pass")).sendKeys("1233");
		driver.findElement(By.linkText("Forgotten password?")).click();*/

	}
	
}
