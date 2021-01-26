import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaPopupAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium file\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("//input[contains(@onclick,'Are you sure')]")).click();
		//driver swicth to java alert
		System.out.println(driver.switchTo().alert().getText());//get text
		driver.switchTo().alert().accept();//positive scenario ok,done,yes
		//driver.switchTo().alert().dismiss(); for negative case

	}

}
