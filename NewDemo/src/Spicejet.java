import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;





public class Spicejet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium file\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Select s = new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");
		s.selectByIndex(5);
		s.selectByVisibleText("7");
		System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		

	}

}
