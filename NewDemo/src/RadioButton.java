import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium file\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		//Customize
		//driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		//dynamic
		int count =driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		for(int i=0; i<count; i++)
		{
			String s = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
		
		//if(s=="Butter")
		if(s.equals("Butter"))driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			
		
		}

	}

}
