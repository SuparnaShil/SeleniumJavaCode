import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium file\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver ();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("")).sendKeys("This is email");
		
		 
		

	}

}
