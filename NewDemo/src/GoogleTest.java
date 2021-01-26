import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium file\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		/*driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys("Suparna Shil");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']/center/input[1]")).click();
		driver.findElement(By.xpath("//div[@class='dRYYxd']/div[1]/span[1]")).click();
		 */
		
		driver.findElement(By.xpath("//body/div[@id='viewport']/div[@id='searchform']/form[@id='tsf']/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Suparna Shil");
		driver.findElement(By.xpath("//body/div[@id='viewport']/div[@id='searchform']/form[@id='tsf']/div[2]/div[1]/div[3]/center[1]/input[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='searchform']/form[@id='tsf']/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/span[1]/*[1]")).click();
		 
		

	}

}
