import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertTestInShort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Read me
		 * download testng jar https://mvnrepository.com/artifact/org.testng/testng/6.7
		 * Insert in project java build path 
		 * 
		 * 
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium file\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_friendsandfamily")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		//total count of check box
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(),6);
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));  // check style before click  display: block; opacity: 0.5;
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());  output will true because it is active and opacity is low thats why it looks inactive
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());  also true
		//driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));   // check style after click   display: block; opacity: 1;
		
		if (driver.findElement(By.id("Div1")).getAttribute("Style").contains("1")) Assert.assertTrue(true);
		else Assert.assertFalse(false);

	}

}
