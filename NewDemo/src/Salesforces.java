import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium file\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("Hello");
		driver.findElement(By.name("pw")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		
		//driver.get("https://facebook.com/");
		//driver.findElement(By.cssSelector("#email")).sendKeys("email address");
		//driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("1234");
		//driver.findElement(By.cssSelector("#Login")).click();
		//driver.wait(timeoutMillis);
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
	}
 
}
