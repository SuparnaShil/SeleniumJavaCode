import javax.xml.datatype.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SuggestedSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		//Thread.sleep(2000);
		//Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,60 );
		
		WebElement source = driver.findElement(By.xpath("//input[@id='fromCity']"));
		//WebElement source = driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']"));
		
		//input[@class='react-autosuggest__input react-autosuggest__input--open']
		wait.until(ExpectedConditions.elementToBeClickable(source));
		//Thread.sleep(2000);
		//Thread.sleep(2000);
		
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("arguments[0].click()", source);
		
		wait.until(ExpectedConditions.elementToBeClickable(source));
		
		
		//System.out.println(source.getText());
		
		System.out.println("ufygvug");
		

		
		//source.clear();
		Thread.sleep(10000);
		
		wait.until(ExpectedConditions.elementToBeClickable(source));
		
		source.sendKeys("Mumbai");
		Thread.sleep(2000);
		//source.getText();
		
		//source.click();

		wait.until(ExpectedConditions.elementToBeClickable(source));
		Thread.sleep(10000);
	   
		//driver.findElement(By.xpath("//div[@id='react-autowhatever-1']")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys(Keys.ARROW_DOWN);
		//source.sendKeys(Keys.ARROW_DOWN);
		
	    int count=driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']")).size();
		
		for(int i=0; i<count; i++)
		{
			driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']")).get(0).click();
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(source));
		Thread.sleep(10000);
		//source.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//System.out.println(source.getText());
		
		driver.close();
		
		
		
	}

}
