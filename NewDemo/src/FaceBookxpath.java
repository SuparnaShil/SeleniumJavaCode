import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium file\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rediff.com/");
		
		/*driver.findElement(By.xpath("//input[@id='email']")).sendKeys("email");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pass");
		driver.findElement(By.xpath("//button[@name='login']")).click();*/
		
		/*driver.findElement(By.cssSelector("input[name='email']")).sendKeys("args");
		driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy")).sendKeys("args");
		driver.findElement(By.cssSelector("button[name='login']")).click();*/
		
	    driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
	    driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("jgfjwf");
	    driver.findElement(By.cssSelector("input#password")).sendKeys("jhh");
	    driver.findElement(By.xpath("//input[contains(@name,'ceed')]")).click();  
	    driver.close(); 
		

	}

}
